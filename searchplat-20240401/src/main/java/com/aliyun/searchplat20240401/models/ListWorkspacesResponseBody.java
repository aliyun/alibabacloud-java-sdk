// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>33E4F0CA-F766-5803-B11C-70DC57A5A6E4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public java.util.List<ListWorkspacesResponseBodyResult> result;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setResult(java.util.List<ListWorkspacesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListWorkspacesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListWorkspacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkspacesResponseBodyResultQuota extends TeaModel {
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
         * <p>rag.share.compute</p>
         */
        @NameInMap("spec")
        public String spec;

        public static ListWorkspacesResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyResultQuota self = new ListWorkspacesResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyResultQuota setComputeResource(Integer computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public Integer getComputeResource() {
            return this.computeResource;
        }

        public ListWorkspacesResponseBodyResultQuota setDocSize(Integer docSize) {
            this.docSize = docSize;
            return this;
        }
        public Integer getDocSize() {
            return this.docSize;
        }

        public ListWorkspacesResponseBodyResultQuota setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListWorkspacesResponseBodyResultTags extends TeaModel {
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
         * <p>c</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static ListWorkspacesResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyResultTags self = new ListWorkspacesResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListWorkspacesResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListWorkspacesResponseBodyResult extends TeaModel {
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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>22222</p>
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
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The quota information.</p>
         */
        @NameInMap("quota")
        public ListWorkspacesResponseBodyResultQuota quota;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzvlxzgo5b4si</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListWorkspacesResponseBodyResultTags> tags;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("type")
        public String type;

        public static ListWorkspacesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyResult self = new ListWorkspacesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyResult setApiToken(String apiToken) {
            this.apiToken = apiToken;
            return this;
        }
        public String getApiToken() {
            return this.apiToken;
        }

        public ListWorkspacesResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListWorkspacesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspacesResponseBodyResult setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListWorkspacesResponseBodyResult setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ListWorkspacesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListWorkspacesResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListWorkspacesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkspacesResponseBodyResult setQuota(ListWorkspacesResponseBodyResultQuota quota) {
            this.quota = quota;
            return this;
        }
        public ListWorkspacesResponseBodyResultQuota getQuota() {
            return this.quota;
        }

        public ListWorkspacesResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListWorkspacesResponseBodyResult setTags(java.util.List<ListWorkspacesResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListWorkspacesResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public ListWorkspacesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
