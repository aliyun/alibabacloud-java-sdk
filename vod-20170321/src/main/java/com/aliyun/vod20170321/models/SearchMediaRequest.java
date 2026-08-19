// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    /**
     * <p>The media asset fields to return in the search results.</p>
     * <p>By default, only basic media asset fields are returned. You can specify additional media asset fields to return. For more information, see <a href="https://help.aliyun.com/document_detail/99179.html">Usage examples</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Title,CoverURL</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <p>The filter conditions. For syntax rules, see <a href="https://help.aliyun.com/document_detail/86991.html">Search protocol syntax</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>field = value</p>
     */
    @NameInMap("Match")
    public String match;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>If this parameter exceeds <strong>200</strong>, set the ScrollToken parameter as well.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of records per page. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pagination token. The value is a 32-character string.
     * You do not need to set this parameter for the first search request. When the search request matches data, the server returns this parameter value, which records the current position of the search data. Record the returned value and set this parameter in the next search request based on the following requirements or recommendations:</p>
     * <ul>
     * <li>If SearchType is set to <strong>video</strong> or <strong>audio</strong> and you need to traverse all data that matches the search conditions, this parameter is required.</li>
     * <li>If PageNo exceeds <strong>200</strong>, set this parameter to optimize search performance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>24e0fba7188fae707e146esa54****</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>The type of media asset to search. Valid values:</p>
     * <ul>
     * <li><strong>video</strong> (default): video.</li>
     * <li><strong>audio</strong>: audio.</li>
     * <li><strong>image</strong>: image.</li>
     * <li><strong>attached</strong>: auxiliary media asset.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to <strong>video</strong> or <strong>audio</strong> and you need to traverse all data that matches the search conditions, you must set the ScrollToken parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("SearchType")
    public String searchType;

    /**
     * <p>The sort field and sort order. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>CreationTime:Desc</strong> (default): sorts by creation time in descending order.</li>
     * <li><strong>CreationTime:Asc</strong>: sorts by creation time in ascending order.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For sort field examples, see <a href="https://help.aliyun.com/document_detail/99179.html">Sort fields</a>.</li>
     * <li>When retrieving the first 5,000 records of search results, up to three sort fields are supported.</li>
     * <li>When retrieving all data that matches the search conditions, only one sort field is supported.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static SearchMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaRequest self = new SearchMediaRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
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

    public SearchMediaRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public SearchMediaRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
