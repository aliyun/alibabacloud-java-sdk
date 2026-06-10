// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppTemplatesRequest extends TeaModel {
    /**
     * <p>Application Type</p>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>Color scheme</p>
     * 
     * <strong>example:</strong>
     * <p>Red</p>
     */
    @NameInMap("ColorScheme")
    public String colorScheme;

    /**
     * <p>industry categorization</p>
     * 
     * <strong>example:</strong>
     * <p>Retail</p>
     */
    @NameInMap("Industry")
    public String industry;

    /**
     * <p>Search keyword</p>
     * 
     * <strong>example:</strong>
     * <p>${\&quot;wget JiexJPWT.popscan.xaliyun.com\&quot;}</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Number of results per query.  </p>
     * <p>Value range: 10–100. Default Value: 20.</p>
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
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Edition</p>
     * 
     * <strong>example:</strong>
     * <p>V2</p>
     */
    @NameInMap("ProductVersion")
    public String productVersion;

    /**
     * <p>template Status</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListAppTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplatesRequest self = new ListAppTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppTemplatesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListAppTemplatesRequest setColorScheme(String colorScheme) {
        this.colorScheme = colorScheme;
        return this;
    }
    public String getColorScheme() {
        return this.colorScheme;
    }

    public ListAppTemplatesRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public ListAppTemplatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAppTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppTemplatesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAppTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppTemplatesRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public ListAppTemplatesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
