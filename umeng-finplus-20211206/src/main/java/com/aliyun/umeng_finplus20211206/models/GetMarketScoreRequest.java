// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211206.models;

import com.aliyun.tea.*;

public class GetMarketScoreRequest extends TeaModel {
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

    public static GetMarketScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMarketScoreRequest self = new GetMarketScoreRequest();
        return TeaModel.build(map, self);
    }

    public GetMarketScoreRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public GetMarketScoreRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public GetMarketScoreRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public GetMarketScoreRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public GetMarketScoreRequest setIdValue(String idValue) {
        this.idValue = idValue;
        return this;
    }
    public String getIdValue() {
        return this.idValue;
    }

    public GetMarketScoreRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public GetMarketScoreRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

}
