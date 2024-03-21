// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckAuthorizationLetterRequest extends TeaModel {
    @NameInMap("ApplicantType")
    public String applicantType;

    @NameInMap("Color")
    public String color;

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

    @NameInMap("Type")
    public String type;

    public static CheckAuthorizationLetterRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAuthorizationLetterRequest self = new CheckAuthorizationLetterRequest();
        return TeaModel.build(map, self);
    }

    public CheckAuthorizationLetterRequest setApplicantType(String applicantType) {
        this.applicantType = applicantType;
        return this;
    }
    public String getApplicantType() {
        return this.applicantType;
    }

    public CheckAuthorizationLetterRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CheckAuthorizationLetterRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CheckAuthorizationLetterRequest setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

    public CheckAuthorizationLetterRequest setContactZipcode(String contactZipcode) {
        this.contactZipcode = contactZipcode;
        return this;
    }
    public String getContactZipcode() {
        return this.contactZipcode;
    }

    public CheckAuthorizationLetterRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public CheckAuthorizationLetterRequest setPersonalType(String personalType) {
        this.personalType = personalType;
        return this;
    }
    public String getPersonalType() {
        return this.personalType;
    }

    public CheckAuthorizationLetterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
