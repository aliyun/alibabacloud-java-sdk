// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateProbeTaskRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("PacketNumber")
    public Integer packetNumber;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("ProbeTaskId")
    public String probeTaskId;

    @NameInMap("ProbeTaskSourceAddress")
    public String probeTaskSourceAddress;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagId")
    public String sagId;

    @NameInMap("Sn")
    public String sn;

    @NameInMap("TaskName")
    public String taskName;

    public static UpdateProbeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProbeTaskRequest self = new UpdateProbeTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProbeTaskRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public UpdateProbeTaskRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateProbeTaskRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateProbeTaskRequest setPacketNumber(Integer packetNumber) {
        this.packetNumber = packetNumber;
        return this;
    }
    public Integer getPacketNumber() {
        return this.packetNumber;
    }

    public UpdateProbeTaskRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public UpdateProbeTaskRequest setProbeTaskId(String probeTaskId) {
        this.probeTaskId = probeTaskId;
        return this;
    }
    public String getProbeTaskId() {
        return this.probeTaskId;
    }

    public UpdateProbeTaskRequest setProbeTaskSourceAddress(String probeTaskSourceAddress) {
        this.probeTaskSourceAddress = probeTaskSourceAddress;
        return this;
    }
    public String getProbeTaskSourceAddress() {
        return this.probeTaskSourceAddress;
    }

    public UpdateProbeTaskRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateProbeTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateProbeTaskRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public UpdateProbeTaskRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public UpdateProbeTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
