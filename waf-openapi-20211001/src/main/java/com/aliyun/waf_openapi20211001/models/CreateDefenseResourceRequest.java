// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseResourceRequest extends TeaModel {
    /**
     * <p>The list of specified header fields.</p>
     * <blockquote>
     * <p>When XffStatus is set to 1, the first IP in the specified header field is used as the client source IP to prevent XFF spoofing. When multiple headers are specified, the system attempts to obtain the source IP from each header in order. If the first header does not contain an IP, the system tries the second header, and so on. If no specified header contains an IP, the first IP in the X-Forwarded-For header is used. When XffStatus is set to 1, the IP is obtained from the first available header.</p>
     * </blockquote>
     */
    @NameInMap("CustomHeaders")
    public java.util.List<String> customHeaders;

    /**
     * <p>The description of the protected object.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceTest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The specific parameter information of the protected object, which is a string converted from a JSON object constructed with a series of parameters.</p>
     * <blockquote>
     * <p>The parameters vary depending on the specified <strong>cloud product</strong> (<strong>Product</strong>) and <strong>protection mode</strong> (<strong>Pattern</strong>). For more information, see <strong>Detail parameter description for protected objects</strong>.</p>
     * </blockquote>
     * <blockquote>
     * <p>Notice: When <strong>Product</strong> is set to <strong>ecs</strong>, <strong>clb4</strong>, <strong>clb7</strong>, or <strong>nlb</strong>, domain names connected to regions in the Chinese mainland must have completed ICP filing.</notice></p>
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
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-4xl*******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the account to which the protected object belongs in multi-account scenarios. By default, the protected object belongs to the WAF administrator account.</p>
     * 
     * <strong>example:</strong>
     * <p>123221XXX</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    /**
     * <p>The protection mode of the protected object. Valid values:</p>
     * <ul>
     * <li><p><strong>domain</strong>: domain name-based protection.</p>
     * </li>
     * <li><p><strong>multi_service</strong>: hybrid cloud service-based protection.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Currently, only the following combinations are supported: when <strong>Product</strong> is set to <strong>alb</strong>, <strong>ecs</strong>, <strong>clb4</strong>, <strong>clb7</strong>, or <strong>nlb</strong>, <strong>Pattern</strong> must be set to <strong>domain</strong>. When <strong>Product</strong> is set to <strong>waf</strong>, <strong>Pattern</strong> must be set to <strong>multi_service</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    /**
     * <p>The cloud product name. Valid values:</p>
     * <ul>
     * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
     * </li>
     * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS).</p>
     * </li>
     * <li><p><strong>clb4</strong>: Classic Load Balancer (CLB) Layer 4 access.</p>
     * </li>
     * <li><p><strong>clb7</strong>: Classic Load Balancer (CLB) Layer 7 access.</p>
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
     * <p>The name of the protected object.</p>
     * <blockquote>
     * <ul>
     * <li>Only protected objects in hybrid cloud service mode support custom protected object names.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abctest.com</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The name of the protection group to which the protected object is added. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>testGroup</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The source of the protected object. Valid values:</p>
     * <ul>
     * <li><strong>custom</strong>: user-defined.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ResourceOrigin")
    public String resourceOrigin;

    /**
     * <p>The tag list, which contains up to 20 items.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDefenseResourceRequestTag> tag;

    /**
     * <p>Specifies whether XFF proxy is enabled for the protected object. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disabled (default).</p>
     * </li>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("XffStatus")
    public Integer xffStatus;

    public static CreateDefenseResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseResourceRequest self = new CreateDefenseResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefenseResourceRequest setCustomHeaders(java.util.List<String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }
    public java.util.List<String> getCustomHeaders() {
        return this.customHeaders;
    }

    public CreateDefenseResourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDefenseResourceRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public CreateDefenseResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDefenseResourceRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public CreateDefenseResourceRequest setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public CreateDefenseResourceRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateDefenseResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDefenseResourceRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateDefenseResourceRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public CreateDefenseResourceRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateDefenseResourceRequest setResourceOrigin(String resourceOrigin) {
        this.resourceOrigin = resourceOrigin;
        return this;
    }
    public String getResourceOrigin() {
        return this.resourceOrigin;
    }

    public CreateDefenseResourceRequest setTag(java.util.List<CreateDefenseResourceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDefenseResourceRequestTag> getTag() {
        return this.tag;
    }

    public CreateDefenseResourceRequest setXffStatus(Integer xffStatus) {
        this.xffStatus = xffStatus;
        return this;
    }
    public Integer getXffStatus() {
        return this.xffStatus;
    }

    public static class CreateDefenseResourceRequestTag extends TeaModel {
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

        public static CreateDefenseResourceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDefenseResourceRequestTag self = new CreateDefenseResourceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDefenseResourceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDefenseResourceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
