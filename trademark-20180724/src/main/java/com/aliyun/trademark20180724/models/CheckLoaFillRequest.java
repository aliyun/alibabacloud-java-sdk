// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckLoaFillRequest extends TeaModel {
    @NameInMap("ApplicantType")
    public String applicantType;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactNumber")
    public String contactNumber;

    @NameInMap("ContactZipcode")
    public String contactZipcode;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("PersonalType")
    public String personalType;

    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("Type")
    public String type;

    @NameInMap("WtrName")
    public String wtrName;

    public static CheckLoaFillRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLoaFillRequest self = new CheckLoaFillRequest();
        return TeaModel.build(map, self);
    }

    public CheckLoaFillRequest setApplicantType(String applicantType) {
        this.applicantType = applicantType;
        return this;
    }
    public String getApplicantType() {
        return this.applicantType;
    }

    public CheckLoaFillRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CheckLoaFillRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CheckLoaFillRequest setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

    public CheckLoaFillRequest setContactZipcode(String contactZipcode) {
        this.contactZipcode = contactZipcode;
        return this;
    }
    public String getContactZipcode() {
        return this.contactZipcode;
    }

    public CheckLoaFillRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public CheckLoaFillRequest setPersonalType(String personalType) {
        this.personalType = personalType;
        return this;
    }
    public String getPersonalType() {
        return this.personalType;
    }

    public CheckLoaFillRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public CheckLoaFillRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CheckLoaFillRequest setWtrName(String wtrName) {
        this.wtrName = wtrName;
        return this;
    }
    public String getWtrName() {
        return this.wtrName;
    }

}
