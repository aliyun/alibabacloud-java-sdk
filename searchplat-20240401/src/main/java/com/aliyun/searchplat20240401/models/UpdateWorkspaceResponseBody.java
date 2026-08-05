// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B7C901ED-2BC1-5CFB-BE23-242DE5E3BA5C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public UpdateWorkspaceResponseBodyResult result;

    public static UpdateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResponseBody self = new UpdateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkspaceResponseBody setResult(UpdateWorkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateWorkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateWorkspaceResponseBodyResultQuota extends TeaModel {
        /**
         * <p>The compute resource.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("computeResource")
        public Integer computeResource;

        /**
         * <p>The storage capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("docSize")
        public Integer docSize;

        /**
         * <p>The specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>rag.share.common</p>
         */
        @NameInMap("spec")
        public String spec;

        public static UpdateWorkspaceResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceResponseBodyResultQuota self = new UpdateWorkspaceResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public UpdateWorkspaceResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public UpdateWorkspaceResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class UpdateWorkspaceResponseBodyResultTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static UpdateWorkspaceResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceResponseBodyResultTags self = new UpdateWorkspaceResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateWorkspaceResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateWorkspaceResponseBodyResult extends TeaModel {
        /**
         * <p>The billing type. Valid values:</p>
         * <ul>
         * <li>POSTPAY: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The custom domain name prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>default-xxx</p>
         */
        @NameInMap("domainName")
        public String domainName;

        /**
         * <p>The engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>rag</p>
         */
        @NameInMap("engineType")
        public String engineType;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1222212</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ops-cn-em93wcq0s001</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Indicates whether the production is complete. Valid values:</p>
         * <ul>
         * <li>0: In production.</li>
         * <li>1: Production complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("produced")
        public Integer produced;

        /**
         * <p>The quota.</p>
         */
        @NameInMap("quota")
        public UpdateWorkspaceResponseBodyResultQuota quota;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aeky6pyhbh6j3dy</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<UpdateWorkspaceResponseBodyResultTags> tags;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateWorkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceResponseBodyResult self = new UpdateWorkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public UpdateWorkspaceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateWorkspaceResponseBodyResult setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateWorkspaceResponseBodyResult setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public UpdateWorkspaceResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateWorkspaceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateWorkspaceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkspaceResponseBodyResult setProduced(Integer produced) {
            this.produced = produced;
            return this;
        }
        public Integer getProduced() {
            return this.produced;
        }

        public UpdateWorkspaceResponseBodyResult setQuota(UpdateWorkspaceResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public UpdateWorkspaceResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public UpdateWorkspaceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateWorkspaceResponseBodyResult setTags(java.util.List<UpdateWorkspaceResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<UpdateWorkspaceResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public UpdateWorkspaceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
