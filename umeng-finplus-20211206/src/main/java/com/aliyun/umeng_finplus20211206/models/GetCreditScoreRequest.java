// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211206.models;

import com.aliyun.tea.*;

public class GetCreditScoreRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("ClientInfo")
    public String clientInfo;

    @NameInMap("ExtendInfo")
    public String extendInfo;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("IdValue")
    public String idValue;

    @NameInMap("ReqId")
    public String reqId;

    @NameInMap("Sign")
    public String sign;

    public static GetCreditScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCreditScoreRequest self = new GetCreditScoreRequest();
        return TeaModel.build(map, self);
    }

    public GetCreditScoreRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public GetCreditScoreRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public GetCreditScoreRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public GetCreditScoreRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public GetCreditScoreRequest setIdValue(String idValue) {
        this.idValue = idValue;
        return this;
    }
    public String getIdValue() {
        return this.idValue;
    }

    public GetCreditScoreRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public GetCreditScoreRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

}
