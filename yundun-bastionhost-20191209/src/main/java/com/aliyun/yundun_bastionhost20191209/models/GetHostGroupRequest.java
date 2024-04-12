// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostGroupRequest extends TeaModel {
    /**
     * <p>The ID of the host group.</p>
     * <br>
     * <p>> You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group.</p>
     */
    @NameInMap("HostGroupId")
    public String hostGroupId;

    /**
     * <p>The ID of the bastion host in which you want to query the details of the host group.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host in which you want to query the details of the host group.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHostGroupRequest self = new GetHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetHostGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public GetHostGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHostGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
