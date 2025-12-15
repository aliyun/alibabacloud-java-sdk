// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class MasterNodeShutDownFailOverRequest extends TeaModel {
    /**
     * <p>The resource category. Set the value to instance.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <ul>
     * <li>Specify: This mode allows you to specify a database node to use.</li>
     * <li>Random: In this mode, a random database node is selected when no database node is specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Random</p>
     */
    @NameInMap("DBFaultMode")
    public String DBFaultMode;

    /**
     * <p>The IDs of the database nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>r-rdsdavinx01003-db-0,r-rdsdavinx01003-db-1</p>
     */
    @NameInMap("DBNodes")
    public String DBNodes;

    /**
     * <ul>
     * <li><strong>Hard</strong>: stimulates a hardware failure that cannot be recovered. In this case, a high-availability switchover is triggered.</li>
     * <li><strong>Soft</strong> (default): stimulates a hardware failure that can be recovered. In this case, the system first attempts to recover the faulty node. If the attempt fails, a high-availability switchover is triggered.</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>Safe</li>
     * <li>UnSafe</li>
     * <li>Hard</li>
     * <li>Soft</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Safe</p>
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
     * <li>Specify: This mode allows you to specify a proxy node to use.</li>
     * <li>Random: In this mode, a random proxy node is selected when no proxy node is specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Specify</p>
     */
    @NameInMap("ProxyFaultMode")
    public String proxyFaultMode;

    /**
     * <p>The IDs of the proxy nodes.</p>
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
