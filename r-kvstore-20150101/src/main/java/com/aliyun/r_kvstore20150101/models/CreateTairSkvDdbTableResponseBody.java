// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairSkvDdbTableResponseBody extends TeaModel {
    /**
     * <p>The bandwidth limit of the instance. Unit: MB/s.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The detailed configuration of the instance in JSON format. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/43885.html">Parameter settings</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EvictionPolicy\&quot;:\&quot;volatile-lru\&quot;,\&quot;hash-max-ziplist-entries\&quot;:512,\&quot;zset-max-ziplist-entries\&quot;:128,\&quot;zset-max-ziplist-value\&quot;:64,\&quot;set-max-intset-entries\&quot;:512,\&quot;hash-max-ziplist-value\&quot;:64}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The internal endpoint of the Redis instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx**.redis.rds.aliyuncs.com</p>
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
     * <p>The globally unique instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx*</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The current status of the instance. The value is fixed to Creating.</p>
     * 
     * <strong>example:</strong>
     * <p>Creating</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20741011111111</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The Redis service port.</p>
     * 
     * <strong>example:</strong>
     * <p>6379</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The queries per second (QPS). This value is the theoretical value for the current instance specification.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("QPS")
    public Long QPS;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D9F3768-EDA9-4811-943E-42C8006E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the task flow that is executed for the creation.</p>
     * 
     * <strong>example:</strong>
     * <p>11111****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The zone ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTairSkvDdbTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTairSkvDdbTableResponseBody self = new CreateTairSkvDdbTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTairSkvDdbTableResponseBody setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateTairSkvDdbTableResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTairSkvDdbTableResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateTairSkvDdbTableResponseBody setConnectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
        return this;
    }
    public String getConnectionDomain() {
        return this.connectionDomain;
    }

    public CreateTairSkvDdbTableResponseBody setConnections(Long connections) {
        this.connections = connections;
        return this;
    }
    public Long getConnections() {
        return this.connections;
    }

    public CreateTairSkvDdbTableResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTairSkvDdbTableResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public CreateTairSkvDdbTableResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateTairSkvDdbTableResponseBody setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateTairSkvDdbTableResponseBody setQPS(Long QPS) {
        this.QPS = QPS;
        return this;
    }
    public Long getQPS() {
        return this.QPS;
    }

    public CreateTairSkvDdbTableResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairSkvDdbTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTairSkvDdbTableResponseBody setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateTairSkvDdbTableResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateTairSkvDdbTableResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
