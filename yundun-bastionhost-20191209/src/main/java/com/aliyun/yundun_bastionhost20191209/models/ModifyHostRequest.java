// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("HostPrivateAddress")
    public String hostPrivateAddress;

    @NameInMap("HostPublicAddress")
    public String hostPublicAddress;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OSType")
    public String OSType;

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
