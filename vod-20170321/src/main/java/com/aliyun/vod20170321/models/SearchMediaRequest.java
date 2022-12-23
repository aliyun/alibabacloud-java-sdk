// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    // The media asset fields to return in the query results.
    // 
    // By default, only the basic media asset fields are returned. You can specify additional media asset fields that need to be returned in the request. For more information, see the "API examples" section of the [Search for media asset information](~~99179~~) topic.
    @NameInMap("Fields")
    public String fields;

    // The filter condition. For more information about the syntax, see [Protocol for media asset search](~~86991~~).
    @NameInMap("Match")
    public String match;

    // The number of the page to return. Default value: **1**.
    // 
    // > If the value of this parameter exceeds **200**, we recommend that you set the ScrollToken parameter as well.
    @NameInMap("PageNo")
    public Integer pageNo;

    // The number of entries to return on each page. Default value: **10**. Maximum value: **100**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The pagination identifier. The identifier can be up to 32 characters in length.
    // 
    // The first time you call this operation for each new search, you do not need to specify this parameter. The value of this parameter is returned each time data records that meet the specified filter criteria are found. The value is used to record the current position of queried data. Record the returned parameter value and set this parameter according to the following requirements during the next search:
    // 
    // *   If SearchType is set to **video** or **audio** and you need to traverse all data that meets the filter criteria, you must set the ScrollToken parameter.
    // *   If the value of the PageNo parameter exceeds **200**, we recommend that you set this parameter to optimize search performance.
    @NameInMap("ScrollToken")
    public String scrollToken;

    // The type of the media asset that you want to query. Default value: video. Valid values:
    // 
    // *   **video**
    // *   **audio**
    // *   **image**
    // *   **attached**
    // 
    // > If this parameter is set to **video** or **audio** and you want to traverse all data that meets the filter criteria, you must set the ScrollToken parameter.
    @NameInMap("SearchType")
    public String searchType;

    // The sort field and order. Separate multiple values with commas (,). Default value: CreationTime:Desc. Valid values:
    // 
    // *   **CreationTime:Desc**: The results are sorted in reverse chronological order based on the creation time.
    // *   **CreationTime:Asc**: The results are sorted in chronological order based on the creation time.
    // 
    // > * For more information about the sort field, see "Sort field" in the [Search for media asset information](~~99179~~) topic.
    // > * To obtain the first 5,000 data records that meet the specified filter criteria, you can specify a maximum of three sort fields.
    // > * To obtain all the data records that meet the specified filter criteria, you can specify only one sort field.
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
