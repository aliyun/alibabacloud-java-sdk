// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppConversationsRequest extends TeaModel {
    /**
     * <p>The bot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Zero2</p>
     */
    @NameInMap("BotId")
    public String botId;

    /**
     * <p>The end modification time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>20201212</p>
     */
    @NameInMap("EndModifyTime")
    public String endModifyTime;

    /**
     * <p>The maximum number of entries to return per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. This parameter is empty if no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1168642640022064</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>The start modification time in ISO 8601 format.</p>
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
