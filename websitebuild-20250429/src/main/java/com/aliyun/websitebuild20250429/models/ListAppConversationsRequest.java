// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppConversationsRequest extends TeaModel {
    /**
     * <p>Bot ID</p>
     * 
     * <strong>example:</strong>
     * <p>Zero2</p>
     */
    @NameInMap("BotId")
    public String botId;

    /**
     * <p>End modification time (ISO 8601 format)</p>
     * 
     * <strong>example:</strong>
     * <p>20201212</p>
     */
    @NameInMap("EndModifyTime")
    public String endModifyTime;

    /**
     * <p>The number of entries to return in each query result.  </p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token indicating the start of the next query. It is empty when there is no next query.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of entries per page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Site ID</p>
     * 
     * <strong>example:</strong>
     * <p>1168642640022064</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>Start modification time (ISO 8601 format)</p>
     * 
     * <strong>example:</strong>
     * <p>20200101</p>
     */
    @NameInMap("StartModifyTime")
    public String startModifyTime;

    public static ListAppConversationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppConversationsRequest self = new ListAppConversationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppConversationsRequest setBotId(String botId) {
        this.botId = botId;
        return this;
    }
    public String getBotId() {
        return this.botId;
    }

    public ListAppConversationsRequest setEndModifyTime(String endModifyTime) {
        this.endModifyTime = endModifyTime;
        return this;
    }
    public String getEndModifyTime() {
        return this.endModifyTime;
    }

    public ListAppConversationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppConversationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppConversationsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAppConversationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppConversationsRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public ListAppConversationsRequest setStartModifyTime(String startModifyTime) {
        this.startModifyTime = startModifyTime;
        return this;
    }
    public String getStartModifyTime() {
        return this.startModifyTime;
    }

}
