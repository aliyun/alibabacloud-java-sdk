// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListAgentStoragesShrinkRequest extends TeaModel {
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
    public String agentStorageNameListShrink;

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
    public String tagShrink;

    public static ListAgentStoragesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStoragesShrinkRequest self = new ListAgentStoragesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentStoragesShrinkRequest setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public ListAgentStoragesShrinkRequest setAgentStorageNameListShrink(String agentStorageNameListShrink) {
        this.agentStorageNameListShrink = agentStorageNameListShrink;
        return this;
    }
    public String getAgentStorageNameListShrink() {
        return this.agentStorageNameListShrink;
    }

    public ListAgentStoragesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgentStoragesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgentStoragesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAgentStoragesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAgentStoragesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
