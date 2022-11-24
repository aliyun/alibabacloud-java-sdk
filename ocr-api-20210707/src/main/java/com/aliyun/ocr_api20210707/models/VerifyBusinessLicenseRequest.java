// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class VerifyBusinessLicenseRequest extends TeaModel {
    @NameInMap("CompanyName")
    public String companyName;

    @NameInMap("CreditCode")
    public String creditCode;

    @NameInMap("LegalPerson")
    public String legalPerson;

    public static VerifyBusinessLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyBusinessLicenseRequest self = new VerifyBusinessLicenseRequest();
        return TeaModel.build(map, self);
    }

    public VerifyBusinessLicenseRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public VerifyBusinessLicenseRequest setCreditCode(String creditCode) {
        this.creditCode = creditCode;
        return this;
    }
    public String getCreditCode() {
        return this.creditCode;
    }

    public VerifyBusinessLicenseRequest setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

}
