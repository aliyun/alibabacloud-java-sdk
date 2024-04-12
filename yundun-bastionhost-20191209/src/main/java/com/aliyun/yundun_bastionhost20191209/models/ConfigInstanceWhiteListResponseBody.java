// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceWhiteListResponseBody extends TeaModel {
    /**
     * <p>The ID of the bastion host for which a whitelist of public IP addresses is configured.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigInstanceWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceWhiteListResponseBody self = new ConfigInstanceWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceWhiteListResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigInstanceWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
