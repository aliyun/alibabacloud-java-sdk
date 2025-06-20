// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryCustomerRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("Product")
    public java.util.List<String> product;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    @NameInMap("Type")
    public String type;

    public static QueryCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerRequest self = new QueryCustomerRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public QueryCustomerRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public QueryCustomerRequest setProduct(java.util.List<String> product) {
        this.product = product;
        return this;
    }
    public java.util.List<String> getProduct() {
        return this.product;
    }

    public QueryCustomerRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public QueryCustomerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
