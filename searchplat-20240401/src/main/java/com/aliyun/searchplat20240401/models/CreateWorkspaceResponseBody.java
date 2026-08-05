// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2BA0504F-B179-586D-8210-A7C7C09A9907</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Response result</p>
     */
    @NameInMap("result")
    public CreateWorkspaceResponseBodyResult result;

    public static CreateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponseBody self = new CreateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkspaceResponseBody setResult(CreateWorkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateWorkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateWorkspaceResponseBodyResultQuota extends TeaModel {
        /**
         * <p>Compute resource</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>Storage capacity</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>Specification</p>
         * 
         * <strong>example:</strong>
         * <p>rag.share.common</p>
         */
        @NameInMap("spec")
        public String spec;

        public static CreateWorkspaceResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyResultQuota self = new CreateWorkspaceResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public CreateWorkspaceResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public CreateWorkspaceResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class CreateWorkspaceResponseBodyResultTags extends TeaModel {
        /**
         * <p>Tag key</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>Tag value</p>
         * 
         * <strong>example:</strong>
         * <p>c</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static CreateWorkspaceResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyResultTags self = new CreateWorkspaceResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateWorkspaceResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateWorkspaceResponseBodyResult extends TeaModel {
        /**
         * <p>Billing type</p>
         * <ul>
         * <li>POSTPAY: Pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>Commodity code</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch_platform_public_cn</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>Workspace description</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Custom domain name prefix</p>
         * 
         * <strong>example:</strong>
         * <p>defalult-xxxx</p>
         */
        @NameInMap("domainName")
        public String domainName;

        /**
         * <p>Engine type</p>
         * 
         * <strong>example:</strong>
         * <p>rag</p>
         */
        @NameInMap("engineType")
        public String engineType;

        /**
         * <p>Workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>120142804</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Workspace instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>ops-xxxxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Workspace name</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Quota</p>
         */
        @NameInMap("quota")
        public CreateWorkspaceResponseBodyResultQuota quota;

        /**
         * <p>Resource group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxxx</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Tags</p>
         */
        @NameInMap("tags")
        public java.util.List<CreateWorkspaceResponseBodyResultTags> tags;

        /**
         * <p>Type</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateWorkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyResult self = new CreateWorkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateWorkspaceResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CreateWorkspaceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateWorkspaceResponseBodyResult setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateWorkspaceResponseBodyResult setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public CreateWorkspaceResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateWorkspaceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateWorkspaceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkspaceResponseBodyResult setQuota(CreateWorkspaceResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public CreateWorkspaceResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public CreateWorkspaceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateWorkspaceResponseBodyResult setTags(java.util.List<CreateWorkspaceResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateWorkspaceResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public CreateWorkspaceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
