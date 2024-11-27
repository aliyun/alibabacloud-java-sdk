// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class EnableInstancePublicAccessResponseBody extends TeaModel {
    /**
     * <p>The ID of the bastion host whose Internet access is enabled.</p>
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
     * <p>D47B5043-FDD6-4FBE-976E-5FC67A23578F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableInstancePublicAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableInstancePublicAccessResponseBody self = new EnableInstancePublicAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableInstancePublicAccessResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableInstancePublicAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
