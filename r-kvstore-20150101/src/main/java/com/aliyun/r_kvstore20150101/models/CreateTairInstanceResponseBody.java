// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairInstanceResponseBody extends TeaModel {
    /**
     * <p>The maximum bandwidth of the instance. Unit: MB/s.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The detailed configurations of the instance. The value is a JSON string. For more information about the parameter description, see <a href="https://help.aliyun.com/document_detail/43885.html">Modify the parameters of an ApsaraDB for Redis instance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;EvictionPolicy\&quot;:\&quot;volatile-lru\&quot;,\&quot;hash-max-ziplist-entries\&quot;:512,\&quot;zset-max-ziplist-entries\&quot;:128,\&quot;list-max-ziplist-entries\&quot;:512,\&quot;list-max-ziplist-value\&quot;:64,\&quot;zset-max-ziplist-value\&quot;:64,\&quot;set-max-intset-entries\&quot;:512,\&quot;hash-max-ziplist-value\&quot;:64}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The internal endpoint of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp13ac3d047b****.tairpena.rds.aliyuncs.com</p>
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
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp13ac3d047b****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the instance.</p>
     * <p>**</p>
     * <p>This parameter is returned only if the <strong>InstanceName</strong> parameter is specified in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>redistest</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The state of the instance. The return value is <strong>Creating</strong>.</p>
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
     * <p>The maximum number of read and write operations that can be processed by the instance per second. The value is a theoretical value.</p>
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
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>12123216-4B00-4378-BE4B-08005BFC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>10****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The zone ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTairInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTairInstanceResponseBody self = new CreateTairInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTairInstanceResponseBody setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateTairInstanceResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTairInstanceResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateTairInstanceResponseBody setConnectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
        return this;
    }
    public String getConnectionDomain() {
        return this.connectionDomain;
    }

    public CreateTairInstanceResponseBody setConnections(Long connections) {
        this.connections = connections;
        return this;
    }
    public Long getConnections() {
        return this.connections;
    }

    public CreateTairInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTairInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateTairInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public CreateTairInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateTairInstanceResponseBody setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateTairInstanceResponseBody setQPS(Long QPS) {
        this.QPS = QPS;
        return this;
    }
    public Long getQPS() {
        return this.QPS;
    }

    public CreateTairInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTairInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateTairInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
