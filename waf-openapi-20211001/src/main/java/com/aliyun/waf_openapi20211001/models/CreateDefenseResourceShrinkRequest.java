// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseResourceShrinkRequest extends TeaModel {
    /**
     * <p>A list of custom header fields.</p>
     * <blockquote>
     * <p>If you set XffStatus to 1, WAF uses the first IP address from the specified header field as the client IP address to prevent XFF forgery. If you specify multiple header fields, WAF tries to obtain the client IP address from the header fields in sequence. If WAF fails to obtain the client IP address from the specified header fields, it uses the first IP address in the X-Forwarded-For header field.</p>
     * </blockquote>
     */
    @NameInMap("CustomHeaders")
    public String customHeadersShrink;

    /**
     * <p>The description of the protected object.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The detailed parameters of the protected object. This parameter is a string that consists of a JSON struct.</p>
     * <blockquote>
     * <p>The parameters vary based on the values of <strong>Product</strong> and <strong>Pattern</strong>. For more information, see the &quot;<strong>Description of the Detail parameter</strong>&quot; section.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;domain\&quot;: \&quot;zhhclb4test096-05111.test.com\&quot;}</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-4xl*******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the account to which the protected object belongs. This parameter is used in multi-account scenarios. By default, the protected object belongs to the WAF administrator account.</p>
     * 
     * <strong>example:</strong>
     * <p>123221XXX</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    /**
     * <p>The protection mode of the protected object. Valid values:</p>
     * <ul>
     * <li><p><strong>domain</strong>: domain name.</p>
     * </li>
     * <li><p><strong>multi_service</strong>: hybrid cloud deployment.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    /**
     * <p>The name of the Alibaba Cloud service. Valid values:</p>
     * <ul>
     * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
     * </li>
     * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS).</p>
     * </li>
     * <li><p><strong>clb4</strong>: Layer 4 Classic Load Balancer (CLB).</p>
     * </li>
     * <li><p><strong>clb7</strong>: Layer 7 CLB.</p>
     * </li>
     * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
     * </li>
     * <li><p><strong>waf</strong>: Web Application Firewall (WAF).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
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
     * <p>The name of the protected object.</p>
     * <blockquote>
     * <ul>
     * <li>Only protected objects of hybrid cloud deployments support custom names.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abctest.com</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The name of the protection group to which you want to add the protected object. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>testGroup</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The source of the protected object. Only the following value is supported:</p>
     * <ul>
     * <li><strong>custom</strong>: a custom object.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ResourceOrigin")
    public String resourceOrigin;

    /**
     * <p>A list of tags. You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDefenseResourceShrinkRequestTag> tag;

    /**
     * <p>Specifies whether to enable the X-Forwarded-For (XFF) proxy. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: disabled. This is the default value.</p>
     * </li>
     * <li><p><strong>1</strong>: enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("XffStatus")
    public Integer xffStatus;

    public static CreateDefenseResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseResourceShrinkRequest self = new CreateDefenseResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefenseResourceShrinkRequest setCustomHeadersShrink(String customHeadersShrink) {
        this.customHeadersShrink = customHeadersShrink;
        return this;
    }
    public String getCustomHeadersShrink() {
        return this.customHeadersShrink;
    }

    public CreateDefenseResourceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDefenseResourceShrinkRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public CreateDefenseResourceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDefenseResourceShrinkRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public CreateDefenseResourceShrinkRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public CreateDefenseResourceShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateDefenseResourceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDefenseResourceShrinkRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateDefenseResourceShrinkRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public CreateDefenseResourceShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateDefenseResourceShrinkRequest setResourceOrigin(String resourceOrigin) {
        this.resourceOrigin = resourceOrigin;
        return this;
    }
    public String getResourceOrigin() {
        return this.resourceOrigin;
    }

    public CreateDefenseResourceShrinkRequest setTag(java.util.List<CreateDefenseResourceShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDefenseResourceShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateDefenseResourceShrinkRequest setXffStatus(Integer xffStatus) {
        this.xffStatus = xffStatus;
        return this;
    }
    public Integer getXffStatus() {
        return this.xffStatus;
    }

    public static class CreateDefenseResourceShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>demoTagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDefenseResourceShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDefenseResourceShrinkRequestTag self = new CreateDefenseResourceShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDefenseResourceShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDefenseResourceShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
