// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckAttributeResponseBody extends TeaModel {
    /**
     * <p>The time when the health check instance was created. This value is a UNIX timestamp.</p>
     * <p>Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1586759657000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The description of the health check instance.</p>
     * 
     * <strong>example:</strong>
     * <p>hc-123</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination IP address of the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("DstIpAddr")
    public String dstIpAddr;

    /**
     * <p>The destination port of the health check instance.</p>
     * <blockquote>
     * <p> This feature is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1223</p>
     */
    @NameInMap("DstPort")
    public Integer dstPort;

    /**
     * <p>The maximum number of failed probes before the health check is declared failed.</p>
     * <p>Valid values: <strong>1</strong> to <strong>15</strong>.</p>
     * <p>Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FailCountThreshold")
    public Integer failCountThreshold;

    /**
     * <p>The ID of the health check instance.</p>
     * 
     * <strong>example:</strong>
     * <p>hc-1k4ucuq77b56x4****</p>
     */
    @NameInMap("HcInstanceId")
    public String hcInstanceId;

    /**
     * <p>The name of the health check instance.</p>
     * 
     * <strong>example:</strong>
     * <p>bvt-test-03****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of probes performed per health check.</p>
     * <p>Valid values: <strong>1</strong> to <strong>20</strong>.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProbeCount")
    public Integer probeCount;

    /**
     * <p>The time interval at which probes are performed. The next probe does not start before the current one is complete.</p>
     * <p>Valid values: <strong>1000</strong> to <strong>60000</strong>.</p>
     * <p>Default value: <strong>2000</strong>.</p>
     * <p>Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("ProbeInterval")
    public Integer probeInterval;

    /**
     * <p>The timeout period of the probe.</p>
     * <p>Valid values: <strong>10</strong> to <strong>30000</strong>.</p>
     * <p>Default value: <strong>1000</strong>.</p>
     * <p>Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProbeTimeout")
    public Integer probeTimeout;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DDA08B78-5634-4A83-94E4-5C58FD7EBA19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of times that the maximum RTT is exceeded before an alert is triggered.</p>
     * <p>Valid values: <strong>1</strong> to <strong>15</strong>.</p>
     * <p>Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RttFailThreshold")
    public Integer rttFailThreshold;

    /**
     * <p>The maximum round-trip time (RTT).</p>
     * <p>Value values: <strong>-1</strong> and <strong>1</strong> to <strong>5000</strong>.</p>
     * <p>Default value: <strong>-1</strong>. This value indicates that the RTT threshold is not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("RttThreshold")
    public Integer rttThreshold;

    /**
     * <p>The ID of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-1um5x5nwhilymw****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The source IP address of the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>10.XX.XX.1</p>
     */
    @NameInMap("SrcIpAddr")
    public String srcIpAddr;

    /**
     * <p>The source port of the health check instance.</p>
     * <blockquote>
     * <p> This feature is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2334</p>
     */
    @NameInMap("SrcPort")
    public Integer srcPort;

    /**
     * <p>The type of packets used in the health check.</p>
     * <p>Only <strong>ICMP_ECHO</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ICMP_ECHO</p>
     */
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
