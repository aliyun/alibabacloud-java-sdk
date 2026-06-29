// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListAgentStoragesRequest extends TeaModel {
    /**
     * <p>agent storage name</p>
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>The list of agent storage names, used to query multiple specified agent storages in a batch.</p>
     */
    @NameInMap("AgentStorageNameList")
    public java.util.List<String> agentStorageNameList;

    /**
     * <p>The maximum number of tag resources to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results when the total number of tag resources exceeds the value of MaxResults. This parameter has a value only when not all tag resources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESCG15aC1xxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource group ID. You can query this ID in the resource group console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxh4em5jncda</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the agent storage.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListAgentStoragesRequestTag> tag;

    public static ListAgentStoragesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStoragesRequest self = new ListAgentStoragesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentStoragesRequest setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public ListAgentStoragesRequest setAgentStorageNameList(java.util.List<String> agentStorageNameList) {
        this.agentStorageNameList = agentStorageNameList;
        return this;
    }
    public java.util.List<String> getAgentStorageNameList() {
        return this.agentStorageNameList;
    }

    public ListAgentStoragesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentStoragesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentStoragesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAgentStoragesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAgentStoragesRequest setTag(java.util.List<ListAgentStoragesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAgentStoragesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAgentStoragesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Owner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Tester</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAgentStoragesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAgentStoragesRequestTag self = new ListAgentStoragesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAgentStoragesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAgentStoragesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
