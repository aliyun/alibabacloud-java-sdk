// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditHistoryRequest extends TeaModel {
    /**
     * <p>The reason why the video failed the review. If the video failed the review, specify the reason.</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The ID of the video.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The review records.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The operation that you want to perform. Set the value to **GetAuditHistory**.</p>
     */
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
