// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class MasterNodeShutDownFailOverRequest extends TeaModel {
    /**
     * <p>The resource type. Set the value to <code>instance</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <ul>
     * <li><strong>Specify</strong>: Specifies the data nodes.</li>
     * <li><strong>Random</strong>: The system randomly simulates a failure for one-fourth of the data nodes (rounded up to the nearest integer, with a minimum of 1). This parameter takes effect only when no data nodes are specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Random</p>
     */
    @NameInMap("DBFaultMode")
    public String DBFaultMode;

    /**
     * <p>The specified data nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>r-rdsdavinx01003-db-0,r-rdsdavinx01003-db-1</p>
     */
    @NameInMap("DBNodes")
    public String DBNodes;

    /**
     * <ul>
     * <li><strong>Hard</strong>: Simulates an unrecoverable hardware failure. A switchover (HA) is directly triggered.</li>
     * <li><strong>Soft</strong> (default): Simulates a recoverable hardware failure. The system preferentially attempts to recover the failed node. If the recovery fails, a switchover (HA) is triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hard</p>
     */
    @NameInMap("FailMode")
    public String failMode;

    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> operation to query the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <ul>
     * <li><strong>Specify</strong>: Specifies the proxy nodes.</li>
     * <li><strong>Random</strong>: The system randomly simulates a failure for one-fourth of the proxy nodes (rounded up to the nearest integer, with a minimum of 1). This parameter takes effect only when no proxy nodes are specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Specify</p>
     */
    @NameInMap("ProxyFaultMode")
    public String proxyFaultMode;

    /**
     * <p>The specified proxy nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>6981,6982</p>
     */
    @NameInMap("ProxyInstanceIds")
    public String proxyInstanceIds;

    public static MasterNodeShutDownFailOverRequest build(java.util.Map<String, ?> map) throws Exception {
        MasterNodeShutDownFailOverRequest self = new MasterNodeShutDownFailOverRequest();
        return TeaModel.build(map, self);
    }

    public MasterNodeShutDownFailOverRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public MasterNodeShutDownFailOverRequest setDBFaultMode(String DBFaultMode) {
        this.DBFaultMode = DBFaultMode;
        return this;
    }
    public String getDBFaultMode() {
        return this.DBFaultMode;
    }

    public MasterNodeShutDownFailOverRequest setDBNodes(String DBNodes) {
        this.DBNodes = DBNodes;
        return this;
    }
    public String getDBNodes() {
        return this.DBNodes;
    }

    public MasterNodeShutDownFailOverRequest setFailMode(String failMode) {
        this.failMode = failMode;
        return this;
    }
    public String getFailMode() {
        return this.failMode;
    }

    public MasterNodeShutDownFailOverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MasterNodeShutDownFailOverRequest setProxyFaultMode(String proxyFaultMode) {
        this.proxyFaultMode = proxyFaultMode;
        return this;
    }
    public String getProxyFaultMode() {
        return this.proxyFaultMode;
    }

    public MasterNodeShutDownFailOverRequest setProxyInstanceIds(String proxyInstanceIds) {
        this.proxyInstanceIds = proxyInstanceIds;
        return this;
    }
    public String getProxyInstanceIds() {
        return this.proxyInstanceIds;
    }

}
