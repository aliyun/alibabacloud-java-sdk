// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class QueryProductInstanceListResponseBody extends TeaModel {
    @NameInMap("instanceList")
    public java.util.List<ProductInstance> instanceList;

    @NameInMap("requestId")
    public String requestId;

    public static QueryProductInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductInstanceListResponseBody self = new QueryProductInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductInstanceListResponseBody setInstanceList(java.util.List<ProductInstance> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<ProductInstance> getInstanceList() {
        return this.instanceList;
    }

    public QueryProductInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
