// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ConfigInstanceSecurityGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the bastion host for which security groups were configured.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigInstanceSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceSecurityGroupsResponseBody self = new ConfigInstanceSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceSecurityGroupsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigInstanceSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
