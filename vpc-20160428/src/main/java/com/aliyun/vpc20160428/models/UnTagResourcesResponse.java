// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnTagResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesResponse self = new UnTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
