// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DisableInstancePublicAccessResponseBody extends TeaModel {
    /**
     * <p>The ID of the bastion host whose Internet access is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-78v1gh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>76FAAF15-D3A3-4099-9941-FC408D9FDB4C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableInstancePublicAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableInstancePublicAccessResponseBody self = new DisableInstancePublicAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableInstancePublicAccessResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableInstancePublicAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
