// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsRequest extends TeaModel {
    /**
     * <p>The validity period of the snapshot URL. Default value: <strong>3600</strong>. Minimum value: <strong>3600</strong>. Unit: seconds.</p>
     * <ul>
     * <li>This parameter takes effect only when you enable URL signing. For more information, see <a href="https://help.aliyun.com/document_detail/57007.html">Configure URL signing</a>.</li>
     * <li>If you specify a value smaller than <strong>3,600 seconds</strong>, <strong>3600</strong> is used by default.</li>
     * <li>If the snapshot URL is an Object Storage Service (OSS) URL, the maximum value for this parameter is <strong>2592000</strong> (30 days). This reduces risks on the origin.</li>
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
     * <li><strong>CoverSnapshot</strong>: thumbnail snapshot</li>
     * <li><strong>NormalSnapshot</strong>: regular snapshot</li>
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
     * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Obtain the video ID from the response to the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation that you call to obtain the upload URL and credential.</li>
     * <li>Obtain the video ID from the response to the <a href="~~SearchMedia~~">SearchMedia</a> operation that you call to query videos.</li>
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
