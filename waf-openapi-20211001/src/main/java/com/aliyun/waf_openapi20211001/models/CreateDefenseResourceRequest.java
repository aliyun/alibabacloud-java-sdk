// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseResourceRequest extends TeaModel {
    @NameInMap("CustomHeaders")
    public java.util.List<String> customHeaders;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;domain\&quot;: \&quot;zhhclb4test096-05111.test.com\&quot;}</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-4xl*******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>123221XXX</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("Pattern")
    public String pattern;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>abctest.com</p>
     */
    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ResourceOrigin")
    public String resourceOrigin;

    @NameInMap("Tag")
    public java.util.List<CreateDefenseResourceRequestTag> tag;

    /**
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
         * <strong>example:</strong>
         * <p>demoTagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
