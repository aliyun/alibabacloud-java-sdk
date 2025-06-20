// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryInnerProductInfoRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    public static QueryInnerProductInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerProductInfoRequest self = new QueryInnerProductInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerProductInfoRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public QueryInnerProductInfoRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public QueryInnerProductInfoRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryInnerProductInfoRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryInnerProductInfoRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryInnerProductInfoRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

}
