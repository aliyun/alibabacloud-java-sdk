// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCSecurityGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static SyncRCSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRCSecurityGroupRequest self = new SyncRCSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public SyncRCSecurityGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SyncRCSecurityGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SyncRCSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
