// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateProbeTaskRequest extends TeaModel {
    /**
     * <p>The domain name that is probed by the task.</p>
     * <p>If the protocol of the probe task is ICMP or TCP, set the value to the IP address or domain name of the service that you want to probe. If the protocol of the probe task is HTTP, set the value to the URL of the service that you want to probe.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Specifies whether to enable the probe task. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The number of probe packets transmitted by the probe task per minute.</p>
     * <p>Valid values: <strong>1</strong> to <strong>60</strong>.</p>
     * <blockquote>
     * <p>This parameter is required if the protocol of the probe task is ICMP. Ignore this parameter if the protocol of the probe task is not ICMP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PacketNumber")
    public Integer packetNumber;

    /**
     * <p>The port that is probed by the task.</p>
     * <blockquote>
     * <p>This parameter is required if the protocol of the probe task is TCP. Ignore this parameter if the protocol of the probe task is not TCP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The ID of the probe task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>probe-****</p>
     */
    @NameInMap("ProbeTaskId")
    public String probeTaskId;

    /**
     * <p>The source address of the probe task.</p>
     * <blockquote>
     * <p>This parameter is required if the task probes private networks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1</p>
     */
    @NameInMap("ProbeTaskSourceAddress")
    public String probeTaskSourceAddress;

    /**
     * <p>The protocol of the probe task. Valid values:</p>
     * <ul>
     * <li><strong>ICMP</strong></li>
     * <li><strong>TCP</strong></li>
     * <li><strong>HTTP</strong></li>
     * </ul>
     * <blockquote>
     * <p>Tasks that probe private networks support only ICMP and TCP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ICMP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region ID of the SAG instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Smart Access Gateway (SAG) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-****</p>
     */
    @NameInMap("SagId")
    public String sagId;

    /**
     * <p>The serial number of the SAG device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag****</p>
     */
    @NameInMap("Sn")
    public String sn;

    /**
     * <p>The name of the probe task.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ping</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static UpdateProbeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProbeTaskRequest self = new UpdateProbeTaskRequest();
        return TeaModel.build(map, self);
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
