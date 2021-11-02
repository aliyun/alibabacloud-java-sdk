// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryPromotionResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("NoPromotionUrl")
    public String noPromotionUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("UnionAmount")
    public String unionAmount;

    @NameInMap("Url")
    public String url;

    public static QueryPromotionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPromotionResponseBody self = new QueryPromotionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPromotionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryPromotionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryPromotionResponseBody setNoPromotionUrl(String noPromotionUrl) {
        this.noPromotionUrl = noPromotionUrl;
        return this;
    }
    public String getNoPromotionUrl() {
        return this.noPromotionUrl;
    }

    public QueryPromotionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPromotionResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public QueryPromotionResponseBody setUnionAmount(String unionAmount) {
        this.unionAmount = unionAmount;
        return this;
    }
    public String getUnionAmount() {
        return this.unionAmount;
    }

    public QueryPromotionResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
