// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsRequest extends TeaModel {
    /**
     * <p>The validity period of the snapshot URL. Unit: seconds. Default value: <strong>3600</strong>. Minimum value: <strong>3600</strong>.</p>
     * <ul>
     * <li>This parameter only takes effect when <a href="https://help.aliyun.com/document_detail/57007.html">URL authentication</a> is enabled.</li>
     * <li>If the specified validity period is less than <strong>3600</strong> seconds, the default value is <strong>3600</strong>.</li>
     * <li>If an Object Storage Service (OSS) URL is returned, the maximum validity period is limited to <strong>2592000</strong> seconds (30 days) to reduce security risks of the origin.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AuthTimeout")
    public String authTimeout;

    /**
     * <p>The number of the page to turn. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The type of snapshots that are returned. Valid values:</p>
     * <ul>
     * <li><strong>CoverSnapshot</strong>: thumbnail snapshot</li>
     * <li><strong>NormalSnapshot</strong>: normal snapshot</li>
     * <li><strong>SpriteSnapshot</strong>: sprite snapshot</li>
     * <li><strong>SpriteOriginSnapshot</strong>: sprite source snapshot</li>
     * <li><strong>WebVttSnapshot</strong>: WebVTT snapshot</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CoverSnapshot</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The ID of the video.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d3e680e618708fbf2cae7cc931****</p>
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
