// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsRequest extends TeaModel {
    // The validity period of the snapshot URL. Unit: seconds. Default value: **3600**. Minimum value: **3600**.
    // 
    // *   This parameter only takes effect when [URL authentication](~~57007~~) is enabled.
    // *   If the specified validity period is less than **3600** seconds, the default value is **3600**.
    // *   If an Object Storage Service (OSS) URL is returned, the maximum validity period is limited to **2592000** seconds (30 days) to reduce security risks of the origin.
    @NameInMap("AuthTimeout")
    public String authTimeout;

    // The number of the page to turn. Default value: **1**.
    @NameInMap("PageNo")
    public String pageNo;

    // The number of entries to return on each page. Default value: **20**. Maximum value: **100**.
    @NameInMap("PageSize")
    public String pageSize;

    // The type of snapshots that are returned. Valid values:
    // 
    // *   **CoverSnapshot**: thumbnail snapshot
    // *   **NormalSnapshot**: normal snapshot
    // *   **SpriteSnapshot**: sprite snapshot
    // *   **SpriteOriginSnapshot**: sprite source snapshot
    // *   **WebVttSnapshot**: WebVTT snapshot
    @NameInMap("SnapshotType")
    public String snapshotType;

    // The ID of the video.
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
