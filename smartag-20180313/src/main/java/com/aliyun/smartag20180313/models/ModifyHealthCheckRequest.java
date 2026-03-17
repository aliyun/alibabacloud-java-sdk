// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckRequest extends TeaModel {
    /**
     * <p>The description of the health check.</p>
     * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
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
     * <p>The destination port of the health check.</p>
     * <blockquote>
     * <p> This parameter is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2233</p>
     */
    @NameInMap("DstPort")
    public Integer dstPort;

    /**
     * <p>The number of failed probes before a health check is declared failed.</p>
     * <p>Valid values: <strong>1</strong> to <strong>15</strong>.</p>
     * <p>Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FailCountThreshold")
    public Integer failCountThreshold;

    /**
     * <p>The ID of the health check.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hc-k9id4loo3lup57****</p>
     */
    @NameInMap("HcInstanceId")
    public String hcInstanceId;

    /**
     * <p>The name of the health check.</p>
     * <p>The name must be 2 to 100 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>sss333</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of probes that are performed per health check.</p>
     * <p>Valid values: <strong>1</strong> to <strong>20</strong>.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>Default value: <strong>3000</strong>.</p>
     * <p>Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("ProbeTimeout")
    public Integer probeTimeout;

    /**
     * <p>The region ID of the Smart Access Gateway (SAG) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
     * <p>Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>5000</strong>.</p>
     * <p>Default value: <strong>-1</strong>. This value indicates that the RTT threshold is not specified.</p>
     * <p>Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RttThreshold")
    public Integer rttThreshold;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-i0e85k06v1mzpo****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The source IP address of the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("SrcIpAddr")
    public String srcIpAddr;

    /**
     * <p>The source port of the health check.</p>
     * <blockquote>
     * <p> This parameter is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3333</p>
     */
    @NameInMap("SrcPort")
    public Integer srcPort;

    /**
     * <p>The type of packet used in the health check. Only <strong>ICMP_ECHO</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ICMP_ECHO</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyHealthCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckRequest self = new ModifyHealthCheckRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyHealthCheckRequest setDstIpAddr(String dstIpAddr) {
        this.dstIpAddr = dstIpAddr;
        return this;
    }
    public String getDstIpAddr() {
        return this.dstIpAddr;
    }

    public ModifyHealthCheckRequest setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public Integer getDstPort() {
        return this.dstPort;
    }

    public ModifyHealthCheckRequest setFailCountThreshold(Integer failCountThreshold) {
        this.failCountThreshold = failCountThreshold;
        return this;
    }
    public Integer getFailCountThreshold() {
        return this.failCountThreshold;
    }

    public ModifyHealthCheckRequest setHcInstanceId(String hcInstanceId) {
        this.hcInstanceId = hcInstanceId;
        return this;
    }
    public String getHcInstanceId() {
        return this.hcInstanceId;
    }

    public ModifyHealthCheckRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyHealthCheckRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyHealthCheckRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyHealthCheckRequest setProbeCount(Integer probeCount) {
        this.probeCount = probeCount;
        return this;
    }
    public Integer getProbeCount() {
        return this.probeCount;
    }

    public ModifyHealthCheckRequest setProbeInterval(Integer probeInterval) {
        this.probeInterval = probeInterval;
        return this;
    }
    public Integer getProbeInterval() {
        return this.probeInterval;
    }

    public ModifyHealthCheckRequest setProbeTimeout(Integer probeTimeout) {
        this.probeTimeout = probeTimeout;
        return this;
    }
    public Integer getProbeTimeout() {
        return this.probeTimeout;
    }

    public ModifyHealthCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHealthCheckRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyHealthCheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyHealthCheckRequest setRttFailThreshold(Integer rttFailThreshold) {
        this.rttFailThreshold = rttFailThreshold;
        return this;
    }
    public Integer getRttFailThreshold() {
        return this.rttFailThreshold;
    }

    public ModifyHealthCheckRequest setRttThreshold(Integer rttThreshold) {
        this.rttThreshold = rttThreshold;
        return this;
    }
    public Integer getRttThreshold() {
        return this.rttThreshold;
    }

    public ModifyHealthCheckRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifyHealthCheckRequest setSrcIpAddr(String srcIpAddr) {
        this.srcIpAddr = srcIpAddr;
        return this;
    }
    public String getSrcIpAddr() {
        return this.srcIpAddr;
    }

    public ModifyHealthCheckRequest setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }
    public Integer getSrcPort() {
        return this.srcPort;
    }

    public ModifyHealthCheckRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
