// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddHostsToGroupRequest extends TeaModel {
    /**
     * <p>The ID of the host group to which you want to add hosts.</p>
     * <br>
     * <p>>  You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group.</p>
     */
    @NameInMap("HostGroupId")
    public String hostGroupId;

    /**
     * <p>The ID of the host that you want to add to the host group. The value is a JSON string. You can add up to 100 host IDs.</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the IDs of hosts.</p>
     */
    @NameInMap("HostIds")
    public String hostIds;

    /**
     * <p>The ID of the bastion host for which you want to add hosts to the host group.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host for which you want to add hosts to the host group.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddHostsToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHostsToGroupRequest self = new AddHostsToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddHostsToGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public AddHostsToGroupRequest setHostIds(String hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public String getHostIds() {
        return this.hostIds;
    }

    public AddHostsToGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddHostsToGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
