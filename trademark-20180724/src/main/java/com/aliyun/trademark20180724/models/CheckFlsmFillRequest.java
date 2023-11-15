// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckFlsmFillRequest extends TeaModel {
    @NameInMap("ApplicantType")
    public String applicantType;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("PersonalType")
    public String personalType;

    @NameInMap("WtrName")
    public String wtrName;

    public static CheckFlsmFillRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFlsmFillRequest self = new CheckFlsmFillRequest();
        return TeaModel.build(map, self);
    }

    public CheckFlsmFillRequest setApplicantType(String applicantType) {
        this.applicantType = applicantType;
        return this;
    }
    public String getApplicantType() {
        return this.applicantType;
    }

    public CheckFlsmFillRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public CheckFlsmFillRequest setPersonalType(String personalType) {
        this.personalType = personalType;
        return this;
    }
    public String getPersonalType() {
        return this.personalType;
    }

    public CheckFlsmFillRequest setWtrName(String wtrName) {
        this.wtrName = wtrName;
        return this;
    }
    public String getWtrName() {
        return this.wtrName;
    }

}
