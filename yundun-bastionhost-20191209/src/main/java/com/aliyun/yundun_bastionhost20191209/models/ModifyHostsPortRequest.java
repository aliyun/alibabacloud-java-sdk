// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsPortRequest extends TeaModel {
    /**
     * <p>The ID of the host for which you want to change the port. The value is a JSON string. You can add up to 100 host IDs. If you specify multiple IDs, separate the IDs with commas (,).</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the IDs of hosts.</p>
     */
    @NameInMap("HostIds")
    public String hostIds;

    /**
     * <p>The ID of the bastion host for which you want to change the port of the host.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new port of the host. The port number must be an integer. Valid values: 22 to 65535.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The protocol that is used to connect to the host. Valid values:</p>
     * <br>
     * <p>*   **SSH**</p>
     * <p>*   **RDP**</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <p>The region ID of the bastion host for which you want to change the port of the host.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostsPortRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsPortRequest self = new ModifyHostsPortRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostsPortRequest setHostIds(String hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public String getHostIds() {
        return this.hostIds;
    }

    public ModifyHostsPortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostsPortRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyHostsPortRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public ModifyHostsPortRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
