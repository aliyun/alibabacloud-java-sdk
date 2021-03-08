// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("SnapshotType")
    public String snapshotType;

    @NameInMap("AuthTimeout")
    public String authTimeout;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNo")
    public String pageNo;

    public static ListSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsRequest self = new ListSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public ListSnapshotsRequest setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }
    public String getSnapshotType() {
        return this.snapshotType;
    }

    public ListSnapshotsRequest setAuthTimeout(String authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public String getAuthTimeout() {
        return this.authTimeout;
    }

    public ListSnapshotsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListSnapshotsRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

}
