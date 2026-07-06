// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListAgentStoragesShrinkRequest extends TeaModel {
    /**
     * <p>The name of the agent storage.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>The list of agent storage names. Use this parameter to query multiple specified agent storages in a batch.</p>
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
     * <p>The pagination token for querying subsequent pages. This parameter has a value only when not all tag resources are returned. If the total number of expected tag resources exceeds the MaxResults value, use this token to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESCG15aC1xxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group. You can query the ID in the Resource Group console.</p>
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
