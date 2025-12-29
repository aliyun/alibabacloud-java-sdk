// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupRequest extends TeaModel {
    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>POSTPAY: pay-as-you-go</li>
     * <li>PREPAY: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>jmbon_analyzer</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The quota.</p>
     */
    @NameInMap("quota")
    public CreateAppGroupRequestQuota quota;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2ij6pwxsvua</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<CreateAppGroupRequestTags> tags;

    /**
     * <p>The type of the application. Valid values:</p>
     * <ul>
     * <li>standard</li>
     * <li>enhanced</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enhanced</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupRequest self = new CreateAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateAppGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppGroupRequest setQuota(CreateAppGroupRequestQuota quota) {
        this.quota = quota;
        return this;
    }
    public CreateAppGroupRequestQuota getQuota() {
        return this.quota;
    }

    public CreateAppGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAppGroupRequest setTags(java.util.List<CreateAppGroupRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateAppGroupRequestTags> getTags() {
        return this.tags;
    }

    public CreateAppGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateAppGroupRequestQuota extends TeaModel {
        /**
         * <p>The computing resources. Unit: logical computing unit (LCU).</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The specifications. Valid values:</p>
         * <ul>
         * <li>opensearch.share.junior: basic</li>
         * <li>opensearch.share.common: shared general-purpose</li>
         * <li>opensearch.share.compute: shared computing</li>
         * <li>opensearch.share.storage: shared storage</li>
         * <li>opensearch.private.common: exclusive general-purpose</li>
         * <li>opensearch.private.compute: exclusive computing</li>
         * <li>opensearch.private.storage: exclusive storage</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opensearch.share.common</p>
         */
        @NameInMap("spec")
        public String spec;

        public static CreateAppGroupRequestQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateAppGroupRequestQuota self = new CreateAppGroupRequestQuota();
            return TeaModel.build(map, self);
        }

        public CreateAppGroupRequestQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public CreateAppGroupRequestQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public CreateAppGroupRequestQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class CreateAppGroupRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateAppGroupRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateAppGroupRequestTags self = new CreateAppGroupRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateAppGroupRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppGroupRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
