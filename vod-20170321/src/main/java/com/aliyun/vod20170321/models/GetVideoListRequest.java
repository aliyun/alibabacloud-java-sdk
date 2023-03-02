// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoListRequest extends TeaModel {
    /**
     * <p>The ID of the video category.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The end of the time range for querying videos based on their creation time. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Optional. The number of entries to return on each page. Default value: **10**. Maximum value: **100**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The method for sorting the results. Valid values:</p>
     * <br>
     * <p>*   **CreationTime:Desc** (default): The results are sorted in reverse chronological order based on the creation time.</p>
     * <p>*   **CreationTime:Asc**: The results are sorted in chronological order based on the creation time.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range for querying videos based on their creation time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the video. By default, you can obtain videos in all states. Separate multiple states with commas (,). Valid values:</p>
     * <br>
     * <p>*   **Uploading**: The video is being uploaded.</p>
     * <p>*   **UploadFail**: The video fails to be uploaded.</p>
     * <p>*   **UploadSucc**: The video is uploaded.</p>
     * <p>*   **Transcoding**: The video is being transcoded.</p>
     * <p>*   **TranscodeFail**: The video fails to be transcoded.</p>
     * <p>*   **Blocked**: The video is blocked.</p>
     * <p>*   **Normal**: The video can be played.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The Object Storage Service (OSS) bucket where the video file is stored.</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    public static GetVideoListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoListRequest self = new GetVideoListRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoListRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public GetVideoListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetVideoListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetVideoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetVideoListRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public GetVideoListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetVideoListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetVideoListRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

}
