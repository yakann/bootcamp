package Tariff;

import Interfaceses.ITariff;
import Model.CompanyDTO;
import Exception.CountExceedException;

public class MailTariff implements ITariff {
    private int emailQuota;
    private CompanyDTO companyReceivingTheTariff;
    private int debtCounter;

    public MailTariff(int emailQuota, CompanyDTO companyDTO) {
        this.emailQuota = emailQuota;
        this.companyReceivingTheTariff = companyDTO;
        companyDTO.setCompanyDebt(DebtCalculate(emailQuota));
    }
    @Override
    public void DebtCalculate(int quota) throws CountExceedException {
        //10 tl lik fatura.
        if (emailQuota==1000){
            return -10;
        }
        //7.5 tl lik fatura.
        else{
            companyReceivingTheTariff.setCompanyDebt(-7.5f);
        }
    }

    public int getEmailQuota() {
        return emailQuota;
    }

    public void setEmailQuota(int emailQuota) {
        MailTariff.emailQuota = emailQuota;
    }

    //Gönderim sonrası
    public boolean isExceedEmail(){
        return emailQuota>10000;
    }
    public void increaseEmailCount(){
        emailQuota++;
    }


}
