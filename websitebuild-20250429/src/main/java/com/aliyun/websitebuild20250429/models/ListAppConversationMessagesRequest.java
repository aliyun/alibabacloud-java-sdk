// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppConversationMessagesRequest extends TeaModel {
    /**
     * <p>Session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81bc5a34-1d8d-4ef7-a208-7401c51b054b</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>Number of results per query.</p>
     * <p>Valid values: 10 to 100. Default Value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token indicating the start of the next query. This value is empty if there is no subsequent query.</p>
     * 
     * <strong>example:</strong>
     * <p>FFh3Xqm+JgZ/U9Jyb7wdVr9LWk80Tghn5UZjbcWEVEderBcbVF+Y6PS0i8PpCL4PQZ3e0C9oEH0Asd4tJEuGtkl2WuKdiWZpEwadNydQdJPFM=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Number of entries per page (10–100).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>734600510965856</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>Creation Time of the last entry on the previous page (in ISO 8601 format).</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("StartCreateTime")
    public String startCreateTime;

    public static ListAppConversationMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppConversationMessagesRequest self = new ListAppConversationMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppConversationMessagesRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ListAppConversationMessagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppConversationMessagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppConversationMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppConversationMessagesRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public ListAppConversationMessagesRequest setStartCreateTime(String startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }
    public String getStartCreateTime() {
        return this.startCreateTime;
    }

}
