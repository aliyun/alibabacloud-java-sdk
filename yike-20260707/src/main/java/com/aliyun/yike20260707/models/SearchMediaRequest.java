// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    /**
     * <p>The category ID. You can obtain the ID by using the following methods:</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The filter condition. For syntax rules, see <a href="https://www.alibabacloud.com/help/en/ims/developer-reference/media-asset-search-filter-description">Media asset search protocol</a>.</p>
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
     * <p>The number of entries to return per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pagination token. A 32-character string. You do not need to set this parameter for the first search request. When the search request matches data, the server returns this parameter value to record the current position of the search data. Record the returned parameter value and set this parameter in the next search request based on the following requirements or suggestions: This parameter must be set if you want to traverse all data that matches the search conditions. If the PageNo parameter value exceeds 200, set this parameter to optimize search performance. You can only page forward, with a maximum paging distance of 1000 media assets.</p>
     * 
     * <strong>example:</strong>
     * <p>F8C4F642184DBDA5D93907A70AAE****</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>The sort fields and sort orders, separated by commas (,). Format: field1:Desc,field2:Asc. The direction can only be Asc or Desc.</p>
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
