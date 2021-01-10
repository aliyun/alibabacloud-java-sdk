// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineNwapprovalprocessRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasBaselineNwapprovalprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineNwapprovalprocessRequest self = new QueryHasBaselineNwapprovalprocessRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineNwapprovalprocessRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public QueryHasBaselineNwapprovalprocessRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
