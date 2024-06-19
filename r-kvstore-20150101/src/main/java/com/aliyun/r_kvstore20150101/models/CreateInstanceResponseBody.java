// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    /**
     * <p>The maximum bandwidth of the instance. Unit: MB/s.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The storage capacity of the instance. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>16384</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The configurations of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EvictionPolicy\&quot;:\&quot;volatile-lru\&quot;,\&quot;hash-max-ziplist-entries\&quot;:512,\&quot;zset-max-ziplist-entries\&quot;:128,\&quot;zset-max-ziplist-value\&quot;:64,\&quot;set-max-intset-entries\&quot;:512,\&quot;hash-max-ziplist-value\&quot;:64}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The internal endpoint of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionDomain")
    public String connectionDomain;

    /**
     * <p>The maximum number of connections supported by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("Connections")
    public Long connections;

    /**
     * <p>The time when the subscription expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-18T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The GUID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The state of the instance. The return value is Creating.</p>
     * 
     * <strong>example:</strong>
     * <p>Creating</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>CLASSIC</strong>: classic network</li>
     * <li><strong>VPC</strong>: VPC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>STAND_ALONE</strong>: standalone</li>
     * <li><strong>MASTER_SLAVE</strong>: master-replica</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MASTER_SLAVE</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The ID of the order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2084452111111</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The port number that is used to connect to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>6379</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The private IP address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.10</p>
     */
    @NameInMap("PrivateIpAddr")
    public String privateIpAddr;

    /**
     * <p>The expected maximum queries per second (QPS).</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("QPS")
    public Long QPS;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5DEA3CC9-F81D-4387-8E97-CEA40F09****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The username that is used to connect to the instance. By default, ApsaraDB for Redis provides a username that is named after the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The ID of the vSwitch to which the instance is connected.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateInstanceResponseBody setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public CreateInstanceResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateInstanceResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateInstanceResponseBody setConnectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
        return this;
    }
    public String getConnectionDomain() {
        return this.connectionDomain;
    }

    public CreateInstanceResponseBody setConnections(Long connections) {
        this.connections = connections;
        return this;
    }
    public Long getConnections() {
        return this.connections;
    }

    public CreateInstanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public CreateInstanceResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateInstanceResponseBody setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CreateInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateInstanceResponseBody setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateInstanceResponseBody setPrivateIpAddr(String privateIpAddr) {
        this.privateIpAddr = privateIpAddr;
        return this;
    }
    public String getPrivateIpAddr() {
        return this.privateIpAddr;
    }

    public CreateInstanceResponseBody setQPS(Long QPS) {
        this.QPS = QPS;
        return this;
    }
    public Long getQPS() {
        return this.QPS;
    }

    public CreateInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateInstanceResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateInstanceResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
