// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasApprovalMyfinishedRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasApprovalMyfinishedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasApprovalMyfinishedRequest self = new QueryHasApprovalMyfinishedRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasApprovalMyfinishedRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public QueryHasApprovalMyfinishedRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
