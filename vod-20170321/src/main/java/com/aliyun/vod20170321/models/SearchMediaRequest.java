// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    /**
     * <p>The level of the category.</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <p>The operation that you want to perform. Set the value to **SearchMedia**.</p>
     */
    @NameInMap("Match")
    public String match;

    /**
     * <p>Details about media assets.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The preprocessing status. Only preprocessed videos can be used for live streaming in the production studio. Valid values:</p>
     * <br>
     * <p>*   **UnPreprocess**</p>
     * <p>*   **Preprocessing**</p>
     * <p>*   **PreprocessSucceed**</p>
     * <p>*   **PreprocessFailed**</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The size of the video file.</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>The ID of the parent category.</p>
     */
    @NameInMap("SearchType")
    public String searchType;

    /**
     * <p>The list of sprite snapshots.</p>
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
