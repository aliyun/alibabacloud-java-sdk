// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateHealthCheckResponseBody extends TeaModel {
    /**
     * <p>The ID of the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>hc-rrqoucina3gmpn****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E38E950D-28A4-4C41-9428-A8908EC6AE5C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHealthCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHealthCheckResponseBody self = new CreateHealthCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHealthCheckResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateHealthCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
