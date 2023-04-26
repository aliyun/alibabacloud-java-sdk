// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsRequest extends TeaModel {
    /**
     * <p>The index of the snapshot.</p>
     */
    @NameInMap("AuthTimeout")
    public String authTimeout;

    /**
     * <p>The number of entries to return on each page. Default value: **20**. Maximum value: **100**.</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The ID of the video.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The number of the page to turn. Default value: **1**.</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The operation that you want to perform. Set the value to **ListSnapshots**.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static ListSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsRequest self = new ListSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsRequest setAuthTimeout(String authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public String getAuthTimeout() {
        return this.authTimeout;
    }

    public ListSnapshotsRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListSnapshotsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListSnapshotsRequest setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }
    public String getSnapshotType() {
        return this.snapshotType;
    }

    public ListSnapshotsRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
