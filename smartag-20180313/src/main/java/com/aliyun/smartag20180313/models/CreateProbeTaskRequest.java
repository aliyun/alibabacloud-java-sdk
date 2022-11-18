// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateProbeTaskRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("PacketNumber")
    public Integer packetNumber;

    @NameInMap("Port")
    public Integer port;

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

    @NameInMap("Type")
    public String type;

    public static CreateProbeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProbeTaskRequest self = new CreateProbeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateProbeTaskRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateProbeTaskRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateProbeTaskRequest setPacketNumber(Integer packetNumber) {
        this.packetNumber = packetNumber;
        return this;
    }
    public Integer getPacketNumber() {
        return this.packetNumber;
    }

    public CreateProbeTaskRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateProbeTaskRequest setProbeTaskSourceAddress(String probeTaskSourceAddress) {
        this.probeTaskSourceAddress = probeTaskSourceAddress;
        return this;
    }
    public String getProbeTaskSourceAddress() {
        return this.probeTaskSourceAddress;
    }

    public CreateProbeTaskRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateProbeTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateProbeTaskRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public CreateProbeTaskRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public CreateProbeTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateProbeTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
