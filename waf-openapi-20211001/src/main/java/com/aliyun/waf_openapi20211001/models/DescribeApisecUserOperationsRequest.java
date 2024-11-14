// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecUserOperationsRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>For hybrid cloud scenarios only, you can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query the hybrid cloud clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-wwo36ksck1e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The object ID of the operation record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe8723e92e2037245014ab62161bbec8</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2ax2y5****pi</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of the operation record. Valid values:</p>
     * <ul>
     * <li><strong>abnormal</strong>: risk detection</li>
     * <li><strong>event</strong>: security event</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeApisecUserOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecUserOperationsRequest self = new DescribeApisecUserOperationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecUserOperationsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeApisecUserOperationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecUserOperationsRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public DescribeApisecUserOperationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecUserOperationsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeApisecUserOperationsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
