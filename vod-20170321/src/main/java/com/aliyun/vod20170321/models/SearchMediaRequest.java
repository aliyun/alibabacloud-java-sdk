// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    /**
     * <p>The media asset fields to return in the query results.</p>
     * <p>By default, only the basic media asset fields are returned. You can specify additional media asset fields that need to be returned in the request. For more information, see the &quot;API examples&quot; section of the <a href="https://help.aliyun.com/document_detail/99179.html">Search for media asset information</a> topic.</p>
     * 
     * <strong>example:</strong>
     * <p>Title,CoverURL</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <p>The filter condition. For more information about the syntax, see <a href="https://help.aliyun.com/document_detail/86991.html">Protocol for media asset search</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>field = value</p>
     */
    @NameInMap("Match")
    public String match;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>If the value of this parameter exceeds <strong>200</strong>, we recommend that you set the ScrollToken parameter as well.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pagination identifier. The password must be 32 characters in length The first time you call this operation for each new search, you do not need to specify this parameter. The value of this parameter is returned each time data records that meet the specified filter condition are found. The value is used to record the current position of queried data. Record the returned parameter value and set this parameter according to the following requirements during the next search:</p>
     * <ul>
     * <li>If SearchType is set to <strong>video</strong> or <strong>audio</strong> and you need to traverse all data that meets the filter criteria, you must set the ScrollToken parameter.</li>
     * <li>If the value of the PageNo parameter exceeds <strong>200</strong>, we recommend that you set this parameter to optimize search performance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>24e0fba7188fae707e146esa54****</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>The type of the media asset that you want to query. Default value: video. Valid values:</p>
     * <ul>
     * <li><strong>video</strong></li>
     * <li><strong>audio</strong></li>
     * <li><strong>image</strong></li>
     * <li><strong>attached</strong></li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to <strong>video</strong> or <strong>audio</strong> and you want to traverse all data that meets the filter criteria, you must set the ScrollToken parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("SearchType")
    public String searchType;

    /**
     * <p>The sort field and order. Separate multiple values with commas (,). Default value: CreationTime:Desc. Valid values:</p>
     * <ul>
     * <li><strong>CreationTime:Desc</strong>: The results are sorted in reverse chronological order based on the creation time.</li>
     * <li><strong>CreationTime:Asc</strong>: The results are sorted in chronological order based on the creation time.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For more information about the sort field, see &quot;Sort field&quot; in the <a href="https://help.aliyun.com/document_detail/99179.html">Search for media asset information</a> topic.</li>
     * <li>To obtain the first 5,000 data records that meet the specified filter criteria, you can specify a maximum of three sort fields.</li>
     * <li>To obtain all the data records that meet the specified filter criteria, you can specify only one sort field.</li>
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
