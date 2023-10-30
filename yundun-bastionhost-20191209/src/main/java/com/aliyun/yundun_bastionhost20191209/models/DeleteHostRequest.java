// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostRequest extends TeaModel {
    /**
     * <p>The ID of the host that you want to delete.</p>
     * <br>
     * <p>> You can call the [ListHosts](~~200665~~) operation to query the ID of the host.</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The ID of the bastion host on which you want to delete the host.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host on which you want to delete the host.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteHostRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostRequest self = new DeleteHostRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHostRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public DeleteHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
