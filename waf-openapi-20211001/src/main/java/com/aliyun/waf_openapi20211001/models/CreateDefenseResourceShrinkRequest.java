// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseResourceShrinkRequest extends TeaModel {
    @NameInMap("CustomHeaders")
    public String customHeadersShrink;

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
    public java.util.List<CreateDefenseResourceShrinkRequestTag> tag;

    /**
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
