// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceSupportRegionsRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzpks****kdjq</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The cloud product to which the resource belongs. By default, instances of ALB, MSE, FC, and SAE products are returned. Valid values:</p>
     * <ul>
     * <li><p><strong>alb</strong>: ALB.</p>
     * </li>
     * <li><p><strong>mse</strong>: MSE.</p>
     * </li>
     * <li><p><strong>fc</strong>: FC.</p>
     * </li>
     * <li><p><strong>sae</strong>: SAE.</p>
     * </li>
     * <li><p><strong>ecs</strong>: ECS.</p>
     * </li>
     * <li><p><strong>clb4</strong>: CLB (TCP).</p>
     * </li>
     * <li><p><strong>clb7</strong>: CLB (HTTP/HTTPS).</p>
     * </li>
     * <li><p><strong>apig</strong>: APIG.</p>
     * </li>
     * <li><p><strong>nlb</strong>: NLB.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Each product supports different regions. If you specify a product filter, refer to the regions supported by the product. Otherwise, the filtering may fail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>clb7</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    public static DescribeResourceSupportRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceSupportRegionsRequest self = new DescribeResourceSupportRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceSupportRegionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeResourceSupportRegionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceSupportRegionsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeResourceSupportRegionsRequest setResourceProduct(String resourceProduct) {
        this.resourceProduct = resourceProduct;
        return this;
    }
    public String getResourceProduct() {
        return this.resourceProduct;
    }

}
