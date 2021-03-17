// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("HostPrivateAddress")
    public String hostPrivateAddress;

    @NameInMap("HostPublicAddress")
    public String hostPublicAddress;

    @NameInMap("OSType")
    public String OSType;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Comment")
    public String comment;

    public static ModifyHostRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostRequest self = new ModifyHostRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHostRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
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

    public ModifyHostRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ModifyHostRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyHostRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
