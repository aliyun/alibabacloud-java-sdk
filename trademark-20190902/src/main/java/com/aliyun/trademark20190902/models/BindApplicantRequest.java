// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class BindApplicantRequest extends TeaModel {
    @NameInMap("ApplicantId")
    public String applicantId;

    @NameInMap("AuthorizationOssKey")
    public String authorizationOssKey;

    @NameInMap("BizId")
    public String bizId;

    public static BindApplicantRequest build(java.util.Map<String, ?> map) throws Exception {
        BindApplicantRequest self = new BindApplicantRequest();
        return TeaModel.build(map, self);
    }

    public BindApplicantRequest setApplicantId(String applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public String getApplicantId() {
        return this.applicantId;
    }

    public BindApplicantRequest setAuthorizationOssKey(String authorizationOssKey) {
        this.authorizationOssKey = authorizationOssKey;
        return this;
    }
    public String getAuthorizationOssKey() {
        return this.authorizationOssKey;
    }

    public BindApplicantRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
