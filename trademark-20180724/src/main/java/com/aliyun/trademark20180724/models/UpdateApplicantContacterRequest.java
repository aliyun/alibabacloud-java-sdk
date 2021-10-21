// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateApplicantContacterRequest extends TeaModel {
    @NameInMap("ContactAddress")
    public String contactAddress;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactNumber")
    public String contactNumber;

    @NameInMap("ContactEmail")
    public String contactEmail;

    @NameInMap("ApplicantId")
    public Long applicantId;

    @NameInMap("ContactZipCode")
    public String contactZipCode;

    @NameInMap("BizId")
    public String bizId;

    public static UpdateApplicantContacterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicantContacterRequest self = new UpdateApplicantContacterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicantContacterRequest setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }
    public String getContactAddress() {
        return this.contactAddress;
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

    public UpdateApplicantContacterRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public UpdateApplicantContacterRequest setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public Long getApplicantId() {
        return this.applicantId;
    }

    public UpdateApplicantContacterRequest setContactZipCode(String contactZipCode) {
        this.contactZipCode = contactZipCode;
        return this;
    }
    public String getContactZipCode() {
        return this.contactZipCode;
    }

    public UpdateApplicantContacterRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
