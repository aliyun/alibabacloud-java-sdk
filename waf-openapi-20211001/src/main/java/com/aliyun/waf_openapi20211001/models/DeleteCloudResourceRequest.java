// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteCloudResourceRequest extends TeaModel {
    /**
     * <p>The ID of the protected resource. WAF automatically generates this ID when you add the cloud service to WAF.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/2839876.html">CreateCloudResource</a> to add a resource and then view the resource ID in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-****py9kcm2n6nuesiu2a-80-clb4</p>
     */
    @NameInMap("CloudResourceId")
    public String cloudResourceId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to view the ID of your WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The port of the cloud service that is added to WAF.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("Port")
    @Deprecated
    public Integer port;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the cloud service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1*****jqnnqk5uj2p</p>
     */
    @NameInMap("ResourceInstanceId")
    @Deprecated
    public String resourceInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of the cloud service. Valid values:</p>
     * <ul>
     * <li><p><strong>clb4</strong>: Layer 4 CLB.</p>
     * </li>
     * <li><p><strong>clb7</strong>: Layer 7 CLB.</p>
     * </li>
     * <li><p><strong>ecs</strong>: ECS.</p>
     * </li>
     * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clb7</p>
     */
    @NameInMap("ResourceProduct")
    @Deprecated
    public String resourceProduct;

    public static DeleteCloudResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudResourceRequest self = new DeleteCloudResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudResourceRequest setCloudResourceId(String cloudResourceId) {
        this.cloudResourceId = cloudResourceId;
        return this;
    }
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    public DeleteCloudResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    @Deprecated
    public DeleteCloudResourceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DeleteCloudResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    @Deprecated
    public DeleteCloudResourceRequest setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public DeleteCloudResourceRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    @Deprecated
    public DeleteCloudResourceRequest setResourceProduct(String resourceProduct) {
        this.resourceProduct = resourceProduct;
        return this;
    }
    public String getResourceProduct() {
        return this.resourceProduct;
    }

}
