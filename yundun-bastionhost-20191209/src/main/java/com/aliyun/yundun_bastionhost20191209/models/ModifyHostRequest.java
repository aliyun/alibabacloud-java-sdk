// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostRequest extends TeaModel {
    /**
     * <p>The new description of the host. The value can be up to 500 characters in length.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the host.</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the ID of the host.</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The new name of the host. The name can be up to 128 characters.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The new internal endpoint of the host. You can set this parameter to a domain name or an IP address.</p>
     */
    @NameInMap("HostPrivateAddress")
    public String hostPrivateAddress;

    /**
     * <p>The new public endpoint of the host. You can set this parameter to a domain name or an IP address.</p>
     */
    @NameInMap("HostPublicAddress")
    public String hostPublicAddress;

    /**
     * <p>The ID of the Bastionhost instance where you want to modify the information of the host.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new operating system of the host. Valid values:</p>
     * <br>
     * <p>*   **Linux**</p>
     * <p>*   **Windows**</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>The region ID of the Bastionhost instance where you want to modify the information of the host.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostRequest self = new ModifyHostRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyHostRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ModifyHostRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyHostRequest setHostPrivateAddress(String hostPrivateAddress) {
        this.hostPrivateAddress = hostPrivateAddress;
        return this;
    }
    public String getHostPrivateAddress() {
        return this.hostPrivateAddress;
    }

    public ModifyHostRequest setHostPublicAddress(String hostPublicAddress) {
        this.hostPublicAddress = hostPublicAddress;
        return this;
    }
    public String getHostPublicAddress() {
        return this.hostPublicAddress;
    }

    public ModifyHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ModifyHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
