// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditHistoryRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("PageNo")
    public Long pageNo;

    // The number of entries to return on each page. Default value: **10**. Maximum value: **100**.
    @NameInMap("PageSize")
    public Long pageSize;

    // The sorting rule of the results. Valid values:
    // *   **CreationTime:Desc**: sorts the results based on the creation time in descending order. This is the default value.
    // *   **CreationTime:Asc**: sorts the results based on the creation time in ascending order.
    @NameInMap("SortBy")
    public String sortBy;

    // The ID of the video.
    @NameInMap("VideoId")
    public String videoId;

    public static GetAuditHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditHistoryRequest self = new GetAuditHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetAuditHistoryRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetAuditHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetAuditHistoryRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public GetAuditHistoryRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
