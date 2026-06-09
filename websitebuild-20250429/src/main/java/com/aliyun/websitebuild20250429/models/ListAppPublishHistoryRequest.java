// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPublishHistoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DeployChannel")
    public String deployChannel;

    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EndTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("WebsiteDomain")
    public String websiteDomain;

    public static ListAppPublishHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppPublishHistoryRequest self = new ListAppPublishHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListAppPublishHistoryRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAppPublishHistoryRequest setDeployChannel(String deployChannel) {
        this.deployChannel = deployChannel;
        return this;
    }
    public String getDeployChannel() {
        return this.deployChannel;
    }

    public ListAppPublishHistoryRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAppPublishHistoryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppPublishHistoryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppPublishHistoryRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAppPublishHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppPublishHistoryRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListAppPublishHistoryRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAppPublishHistoryRequest setWebsiteDomain(String websiteDomain) {
        this.websiteDomain = websiteDomain;
        return this;
    }
    public String getWebsiteDomain() {
        return this.websiteDomain;
    }

}
