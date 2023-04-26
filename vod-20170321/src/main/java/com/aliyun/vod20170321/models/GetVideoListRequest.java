// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoListRequest extends TeaModel {
    /**
     * <p>The category ID. You can use one of the following methods to obtain the category ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories** to view the category ID.</p>
     * <p>*   Obtain the value of CateId from the response to the [AddCategory](~~56401~~) operation.</p>
     * <p>*   Obtain the value of CateId from the response to the [GetCategories](~~56406~~) operation.</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Default value: **10**. Maximum value: **100**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sorting method of the results. Valid values:</p>
     * <br>
     * <p>*   **CreationTime:Desc** (default): The results are sorted in reverse chronological order based on the creation time.</p>
     * <p>*   **CreationTime:Asc**: The results are sorted in chronological order based on the creation time.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The video status. You can specify multiple video statuses and separate them with commas (,). Valid values:</p>
     * <br>
     * <p>*   **Uploading**: The video is being uploaded.</p>
     * <p>*   **UploadFail**: The video failed to be uploaded.</p>
     * <p>*   **UploadSucc**: The video has been uploaded.</p>
     * <p>*   **Transcoding**: The video is being transcoded.</p>
     * <p>*   **TranscodeFail**: The video failed to be transcoded.</p>
     * <p>*   **checking**: The video is being reviewed.</p>
     * <p>*   **Blocked**: The video is blocked.</p>
     * <p>*   **Normal**: The video is normal.</p>
     * <p>*   **ProduceFail**: The video failed to be produced.</p>
     * <br>
     * <p>For more information about each video status, see the "Status: the status of a video" section of the [Basic data types](~~52839#section-p7c-jgy-070~~) topic.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The storage address of the media file.</p>
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
