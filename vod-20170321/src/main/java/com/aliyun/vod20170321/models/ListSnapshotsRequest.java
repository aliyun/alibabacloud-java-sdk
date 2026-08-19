// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsRequest extends TeaModel {
    /**
     * <p>The expiration time of the snapshot access URL. Default value: <strong>3600</strong>. Minimum value: <strong>3600</strong>. Unit: seconds.</p>
     * <ul>
     * <li>This parameter takes effect only if <a href="https://help.aliyun.com/document_detail/57007.html">URL authentication</a> is enabled.</li>
     * <li>If the specified value is less than <strong>3600 seconds</strong>, the default value of <strong>3600 seconds</strong> is used.</li>
     * <li>If the returned URL is an OSS URL, the maximum value is <strong>2592000</strong> (30 days) to reduce security risks to the origin server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AuthTimeout")
    public String authTimeout;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The type of snapshots to return. Valid values:</p>
     * <ul>
     * <li><strong>CoverSnapshot</strong> (default): thumbnail snapshots.</li>
     * <li><strong>NormalSnapshot</strong>: normal snapshots.</li>
     * <li><strong>SpriteSnapshot</strong>: sprites.</li>
     * <li><strong>SpriteOriginSnapshot</strong>: original images of sprites.</li>
     * <li><strong>WebVttSnapshot</strong>: WebVTT snapshots.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CoverSnapshot</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Obtain the video ID from the response of the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation that you call to obtain the upload URL and credential.</li>
     * <li>Obtain the video ID from the response of the <a href="~~SearchMedia~~">SearchMedia</a> operation that you call to query videos.</li>
     * </ul>
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
