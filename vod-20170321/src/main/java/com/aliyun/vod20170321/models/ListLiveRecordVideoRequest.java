// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLiveRecordVideoRequest extends TeaModel {
    /**
     * <p>The sorting rule of results. Valid values:</p>
     * <br>
     * <p>*   **CreationTime:Desc**: sorts the results based on the creation time in descending order. This is the default value.</p>
     * <p>*   **CreationTime:Asc**: sorts the results based on the creation time in ascending order.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The operation that you want to perform. Set the value to **ListLiveRecordVideo**.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the recorded live stream.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The ID of the transcoding template group.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The duration of the video. Unit: seconds.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The name of the video category.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the video. Valid values:</p>
     * <br>
     * <p>*   **Uploading:**: indicates that the video is being uploaded.</p>
     * <p>*   **UploadFail**: indicates that the video failed to be uploaded.</p>
     * <p>*   **UploadSucces**: indicates that the video was uploaded.</p>
     * <p>*   **Transcoding**: indicates that the video is being transcoded.</p>
     * <p>*   **TranscodeFail**: indicates that the video failed to be transcoded.</p>
     * <p>*   **Blocked**: indicates that the video is blocked.</p>
     * <p>*   **Normal**: indicates that the video is in a normal state.</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static ListLiveRecordVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordVideoRequest self = new ListLiveRecordVideoRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordVideoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListLiveRecordVideoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ListLiveRecordVideoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListLiveRecordVideoRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListLiveRecordVideoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveRecordVideoRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveRecordVideoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListLiveRecordVideoRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
