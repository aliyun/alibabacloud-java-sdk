// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>58113A95-1858-5674-87E5-192AEE6FD9DD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public GetWorkspaceResponseBodyResult result;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceResponseBody setResult(GetWorkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetWorkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetWorkspaceResponseBodyResultQuota extends TeaModel {
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

        public static GetWorkspaceResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyResultQuota self = new GetWorkspaceResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public GetWorkspaceResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public GetWorkspaceResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class GetWorkspaceResponseBodyResultTags extends TeaModel {
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
         * <p>x</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static GetWorkspaceResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyResultTags self = new GetWorkspaceResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetWorkspaceResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetWorkspaceResponseBodyResult extends TeaModel {
        /**
         * <p>apiToken</p>
         * 
         * <strong>example:</strong>
         * <p>apiToken</p>
         */
        @NameInMap("apiToken")
        public String apiToken;

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
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>commodityCode</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

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
         * <p>The quota.</p>
         */
        @NameInMap("quota")
        public GetWorkspaceResponseBodyResultQuota quota;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzaowqymbb4ki</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<GetWorkspaceResponseBodyResultTags> tags;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("type")
        public String type;

        public static GetWorkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyResult self = new GetWorkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyResult setApiToken(String apiToken) {
            this.apiToken = apiToken;
            return this;
        }
        public String getApiToken() {
            return this.apiToken;
        }

        public GetWorkspaceResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetWorkspaceResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetWorkspaceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkspaceResponseBodyResult setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetWorkspaceResponseBodyResult setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public GetWorkspaceResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWorkspaceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetWorkspaceResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkspaceResponseBodyResult setQuota(GetWorkspaceResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public GetWorkspaceResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public GetWorkspaceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetWorkspaceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkspaceResponseBodyResult setTags(java.util.List<GetWorkspaceResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetWorkspaceResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public GetWorkspaceResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
