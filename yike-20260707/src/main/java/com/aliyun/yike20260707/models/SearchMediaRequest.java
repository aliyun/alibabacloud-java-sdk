// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    /**
     * <p>The business configuration. The value is a JSON string that can contain ProductionId (project ID).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProductionId&quot;:&quot;pd_abc1234567&quot;}</p>
     */
    @NameInMap("BizConfig")
    public String bizConfig;

    /**
     * <p>The category ID. You can obtain the category ID by using one of the following methods:</p>
     * <ul>
     * <li>When you create a category by calling the CreateAssetCategory operation, the category ID is the value of the CategoryId response parameter.</li>
     * <li>When you query categories by calling the ListAssetCategories operation, the category ID is the value of the CategoryId parameter in the corresponding returned entry.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The filter conditions. For the syntax rules, see <a href="https://www.alibabacloud.com/help/en/ims/developer-reference/media-asset-search-filter-description">Media asset search protocol</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>title = \&quot;China\&quot; and utcCreate = [\&quot;1693367158561\&quot;,\&quot;1693367158562\&quot;]</p>
     */
    @NameInMap("Match")
    public String match;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pagination token, which is a 32-character string. You do not need to specify this parameter when you send a search request for the first time. If the search request returns data, the server returns this parameter to record the position of the current search data. Record the returned value and specify this parameter in subsequent searches based on the following requirements or recommendations: This parameter is required if you need to traverse all data that matches the search conditions. If the value of the PageNo parameter exceeds 200, specify this parameter to optimize search performance. You can only page forward, and the maximum paging distance is 1,000 media assets.</p>
     * 
     * <strong>example:</strong>
     * <p>F8C4F642184DBDA5D93907A70AAE****</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>The sort fields and sort orders. Separate multiple values with commas (,). Format: field1:Desc,field2:Asc. The sort direction can only be Asc or Desc.</p>
     * 
     * <strong>example:</strong>
     * <p>utcCreate:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static SearchMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaRequest self = new SearchMediaRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaRequest setBizConfig(String bizConfig) {
        this.bizConfig = bizConfig;
        return this;
    }
    public String getBizConfig() {
        return this.bizConfig;
    }

    public SearchMediaRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public SearchMediaRequest setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public SearchMediaRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchMediaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMediaRequest setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public SearchMediaRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
