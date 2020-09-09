package Model;

import Interfaceses.ITariff;
import Language.ILanguage;

public class CompanyDTO {
    private String companyName;
    private ITariff companyOwnedTariffs;
    private ILanguage language;
    private float companyDebt;

    public ILanguage getLanguage() { return language; }

    public void setLanguage(ILanguage language) {
        this.language = language;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getCompanyDebt() {
        return companyDebt;
    }

    public void setCompanyDebt(float companyDebt) {
        this.companyDebt = companyDebt;
    }


    public ITariff getCompanyOwnedTariffs() {
        return companyOwnedTariffs;
    }

    public void setCompanyOwnedTariffs(ITariff companyOwnedTariffs) {
        this.companyOwnedTariffs = companyOwnedTariffs;
    }
}
