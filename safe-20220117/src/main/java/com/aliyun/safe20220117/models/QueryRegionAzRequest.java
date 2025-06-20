// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryRegionAzRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Product")
    public String product;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    public static QueryRegionAzRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRegionAzRequest self = new QueryRegionAzRequest();
        return TeaModel.build(map, self);
    }

    public QueryRegionAzRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public QueryRegionAzRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public QueryRegionAzRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryRegionAzRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryRegionAzRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public QueryRegionAzRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

}
