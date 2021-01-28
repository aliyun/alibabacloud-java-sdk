// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateInstancePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionResponseBody self = new AllocateInstancePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
