// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateApplicantContacterRequest extends TeaModel {
    @NameInMap("ApplicantId")
    public Long applicantId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ContactAddress")
    public String contactAddress;

    @NameInMap("ContactCity")
    public String contactCity;

    @NameInMap("ContactDistrict")
    public String contactDistrict;

    @NameInMap("ContactEmail")
    public String contactEmail;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactNumber")
    public String contactNumber;

    @NameInMap("ContactProvince")
    public String contactProvince;

    @NameInMap("ContactZipCode")
    public String contactZipCode;

    public static UpdateApplicantContacterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicantContacterRequest self = new UpdateApplicantContacterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicantContacterRequest setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public Long getApplicantId() {
        return this.applicantId;
    }

    public UpdateApplicantContacterRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateApplicantContacterRequest setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }
    public String getContactAddress() {
        return this.contactAddress;
    }

    public UpdateApplicantContacterRequest setContactCity(String contactCity) {
        this.contactCity = contactCity;
        return this;
    }
    public String getContactCity() {
        return this.contactCity;
    }

    public UpdateApplicantContacterRequest setContactDistrict(String contactDistrict) {
        this.contactDistrict = contactDistrict;
        return this;
    }
    public String getContactDistrict() {
        return this.contactDistrict;
    }

    public UpdateApplicantContacterRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public UpdateApplicantContacterRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public UpdateApplicantContacterRequest setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

    public UpdateApplicantContacterRequest setContactProvince(String contactProvince) {
        this.contactProvince = contactProvince;
        return this;
    }
    public String getContactProvince() {
        return this.contactProvince;
    }

    public UpdateApplicantContacterRequest setContactZipCode(String contactZipCode) {
        this.contactZipCode = contactZipCode;
        return this;
    }
    public String getContactZipCode() {
        return this.contactZipCode;
    }

}
