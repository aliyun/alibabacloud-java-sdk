// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchMediaRequest extends TeaModel {
    /**
     * <p>Details about media assets.</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <p>The preprocessing status. Only preprocessed videos can be used for live streaming in the production studio. Valid values:</p>
     * <br>
     * <p>*   **UnPreprocess**</p>
     * <p>*   **Preprocessing**</p>
     * <p>*   **PreprocessSucceed**</p>
     * <p>*   **PreprocessFailed**</p>
     */
    @NameInMap("Match")
    public String match;

    /**
     * <p>The ID of the media asset.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The type of the media asset that you want to query. Default value: video. Valid values:</p>
     * <br>
     * <p>*   **video**</p>
     * <p>*   **audio**</p>
     * <p>*   **image**</p>
     * <p>*   **attached**</p>
     * <br>
     * <p>> If this parameter is set to **video** or **audio** and you want to traverse all data that meets the filter criteria, you must set the ScrollToken parameter.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The tags of the image file.</p>
     */
    @NameInMap("ScrollToken")
    public String scrollToken;

    /**
     * <p>The list of sprite snapshots.</p>
     */
    @NameInMap("SearchType")
    public String searchType;

    /**
     * <p>The size of the video file.</p>
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
