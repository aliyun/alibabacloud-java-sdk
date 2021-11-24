// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211124.models;

import com.aliyun.tea.*;

public class CreditServiceRequest extends TeaModel {
    // param0
    @NameInMap("AppId")
    public Long appId;

    // param9
    @NameInMap("ClientInfo")
    public String clientInfo;

    @NameInMap("Date")
    public String date;

    // param8
    @NameInMap("ExtendInfo")
    public String extendInfo;

    // param3
    @NameInMap("IdType")
    public String idType;

    // param2
    @NameInMap("IdValue")
    public String idValue;

    // param7
    @NameInMap("LoanDate")
    public String loanDate;

    // param1
    @NameInMap("ReqId")
    public String reqId;

    // param4
    @NameInMap("Sign")
    public String sign;

    // param5
    @NameInMap("Token")
    public String token;

    public static CreditServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreditServiceRequest self = new CreditServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreditServiceRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreditServiceRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public CreditServiceRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public CreditServiceRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public CreditServiceRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public CreditServiceRequest setIdValue(String idValue) {
        this.idValue = idValue;
        return this;
    }
    public String getIdValue() {
        return this.idValue;
    }

    public CreditServiceRequest setLoanDate(String loanDate) {
        this.loanDate = loanDate;
        return this;
    }
    public String getLoanDate() {
        return this.loanDate;
    }

    public CreditServiceRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public CreditServiceRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public CreditServiceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
