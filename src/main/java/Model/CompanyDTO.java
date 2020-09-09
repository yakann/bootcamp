package Model;

import Language.ILanguage;

public class CompanyDTO {
    private String companyName;
    private TariffDTO companyOwnedTariffs;
    private ILanguage language;
    private Integer companyDebt;

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

    public TariffDTO getCompanyOwnedTariffs() {
        return companyOwnedTariffs;
    }

    public void setCompanyOwnedTariffs(TariffDTO companyOwnedTariffs) {
        this.companyOwnedTariffs = companyOwnedTariffs;
    }

    public Integer getCompanyDebt() {
        return companyDebt;
    }

    public void setCompanyDebt(Integer companyDebt) {
        this.companyDebt = companyDebt;
    }
}
