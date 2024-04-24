// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreatePostpaidInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePostpaidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePostpaidInstanceResponseBody self = new CreatePostpaidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePostpaidInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreatePostpaidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
