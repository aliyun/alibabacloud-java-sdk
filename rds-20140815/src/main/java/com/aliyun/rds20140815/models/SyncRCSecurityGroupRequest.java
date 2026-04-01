// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCSecurityGroupRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-i322y2t562oh7o******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp196e4d2ndjgy******</p>
     */
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
