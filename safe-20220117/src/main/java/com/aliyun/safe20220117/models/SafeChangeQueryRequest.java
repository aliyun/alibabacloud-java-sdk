// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeQueryRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("NeedValidate")
    public Boolean needValidate;

    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("ReturnType")
    public Boolean returnType;

    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    public static SafeChangeQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeQueryRequest self = new SafeChangeQueryRequest();
        return TeaModel.build(map, self);
    }

    public SafeChangeQueryRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SafeChangeQueryRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public SafeChangeQueryRequest setNeedValidate(Boolean needValidate) {
        this.needValidate = needValidate;
        return this;
    }
    public Boolean getNeedValidate() {
        return this.needValidate;
    }

    public SafeChangeQueryRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public SafeChangeQueryRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public SafeChangeQueryRequest setReturnType(Boolean returnType) {
        this.returnType = returnType;
        return this;
    }
    public Boolean getReturnType() {
        return this.returnType;
    }

    public SafeChangeQueryRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

}
