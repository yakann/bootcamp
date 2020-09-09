package Tariff;

import Interfaceses.ITariff;
import Exception.CountExceedException;

public class SmsTariff implements ITariff {
    private int smsQuota;
    private int debtCounter;

    public SmsTariff(int smsQuota) {
        this.smsQuota = smsQuota;
        try {
            setSmsQuota(DebtCalculate(smsQuota));
        } catch (Exception.CountExceedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void DebtCalculate() throws CountExceedException {
        //20 tl lik fatura.
        if (smsQuota==1000){
            tariffOwner.setCompanyDebt(-20);
        }
        //30 tl lik fatura.
        else{
            tariffOwner.setCompanyDebt(-30);
        }
    }

    public int getSmsQuota() {
        return smsQuota;
    }

    public void setSmsQuota(int smsQuota) {
        this.smsQuota = smsQuota;
    }

    public boolean isExceedSms(){
        return smsQuota>1000;
    }

    public void increaseSmsCount(){
        smsQuota++;
    }


}
