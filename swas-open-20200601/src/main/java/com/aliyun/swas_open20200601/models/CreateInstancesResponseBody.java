// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateInstancesResponseBody extends TeaModel {
    /**
     * <p>The IDs of the simple application servers.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E1FEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstancesResponseBody self = new CreateInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstancesResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
