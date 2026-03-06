// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ListApiMcpServersRequest extends TeaModel {
    /**
     * <p>The time when the API MCP server was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-30T02:10:13Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description of the API MCP service.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个API MCP服务器。</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the API MCP service.</p>
     * 
     * <strong>example:</strong>
     * <p>v6ZZ7ftCzEILW***</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The search keyword. Supports fuzzy search by API name and exact search by API ID.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The language of the API reference for the API MCP service. The language of the prompt can affect the response from the AI. Valid values: \<code>ZH_CN\\</code>, \<code>EN_US\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ZH_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The maximum number of entries to return on each page for a paged query. The maximum value is 100. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to start the next query. Set this parameter to the \<code>nextToken\\</code> value that was returned from the previous API call.</p>
     * <blockquote>
     * <p>This parameter is not required for the first query. If a query does not return all results, pass the \<code>nextToken\\</code> value from the previous query to continue.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAZjtYxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The number of data entries to skip.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("skip")
    public Integer skip;

    /**
     * <p>The type of the API MCP service.</p>
     * <ul>
     * <li><p>custom: a custom service</p>
     * </li>
     * <li><p>system: a system service</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The time when the API MCP server was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-05T02:27:39Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static ListApiMcpServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiMcpServersRequest self = new ListApiMcpServersRequest();
        return TeaModel.build(map, self);
    }

    public ListApiMcpServersRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ListApiMcpServersRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListApiMcpServersRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListApiMcpServersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListApiMcpServersRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListApiMcpServersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiMcpServersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiMcpServersRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListApiMcpServersRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListApiMcpServersRequest setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
