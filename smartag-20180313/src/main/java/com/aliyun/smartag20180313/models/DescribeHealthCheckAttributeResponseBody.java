// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckAttributeResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DstIpAddr")
    public String dstIpAddr;

    @NameInMap("DstPort")
    public Integer dstPort;

    @NameInMap("FailCountThreshold")
    public Integer failCountThreshold;

    @NameInMap("HcInstanceId")
    public String hcInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProbeCount")
    public Integer probeCount;

    @NameInMap("ProbeInterval")
    public Integer probeInterval;

    @NameInMap("ProbeTimeout")
    public Integer probeTimeout;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RttFailThreshold")
    public Integer rttFailThreshold;

    @NameInMap("RttThreshold")
    public Integer rttThreshold;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("SrcIpAddr")
    public String srcIpAddr;

    @NameInMap("SrcPort")
    public Integer srcPort;

    @NameInMap("Type")
    public String type;

    public static DescribeHealthCheckAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckAttributeResponseBody self = new DescribeHealthCheckAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeHealthCheckAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeHealthCheckAttributeResponseBody setDstIpAddr(String dstIpAddr) {
        this.dstIpAddr = dstIpAddr;
        return this;
    }
    public String getDstIpAddr() {
        return this.dstIpAddr;
    }

    public DescribeHealthCheckAttributeResponseBody setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public Integer getDstPort() {
        return this.dstPort;
    }

    public DescribeHealthCheckAttributeResponseBody setFailCountThreshold(Integer failCountThreshold) {
        this.failCountThreshold = failCountThreshold;
        return this;
    }
    public Integer getFailCountThreshold() {
        return this.failCountThreshold;
    }

    public DescribeHealthCheckAttributeResponseBody setHcInstanceId(String hcInstanceId) {
        this.hcInstanceId = hcInstanceId;
        return this;
    }
    public String getHcInstanceId() {
        return this.hcInstanceId;
    }

    public DescribeHealthCheckAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeHealthCheckAttributeResponseBody setProbeCount(Integer probeCount) {
        this.probeCount = probeCount;
        return this;
    }
    public Integer getProbeCount() {
        return this.probeCount;
    }

    public DescribeHealthCheckAttributeResponseBody setProbeInterval(Integer probeInterval) {
        this.probeInterval = probeInterval;
        return this;
    }
    public Integer getProbeInterval() {
        return this.probeInterval;
    }

    public DescribeHealthCheckAttributeResponseBody setProbeTimeout(Integer probeTimeout) {
        this.probeTimeout = probeTimeout;
        return this;
    }
    public Integer getProbeTimeout() {
        return this.probeTimeout;
    }

    public DescribeHealthCheckAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHealthCheckAttributeResponseBody setRttFailThreshold(Integer rttFailThreshold) {
        this.rttFailThreshold = rttFailThreshold;
        return this;
    }
    public Integer getRttFailThreshold() {
        return this.rttFailThreshold;
    }

    public DescribeHealthCheckAttributeResponseBody setRttThreshold(Integer rttThreshold) {
        this.rttThreshold = rttThreshold;
        return this;
    }
    public Integer getRttThreshold() {
        return this.rttThreshold;
    }

    public DescribeHealthCheckAttributeResponseBody setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DescribeHealthCheckAttributeResponseBody setSrcIpAddr(String srcIpAddr) {
        this.srcIpAddr = srcIpAddr;
        return this;
    }
    public String getSrcIpAddr() {
        return this.srcIpAddr;
    }

    public DescribeHealthCheckAttributeResponseBody setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }
    public Integer getSrcPort() {
        return this.srcPort;
    }

    public DescribeHealthCheckAttributeResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
