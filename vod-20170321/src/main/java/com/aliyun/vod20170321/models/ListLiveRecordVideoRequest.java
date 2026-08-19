// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLiveRecordVideoRequest extends TeaModel {
    /**
     * <p>The name of the application used during recording.</p>
     * 
     * <strong>example:</strong>
     * <p>testApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The domain name used during recording.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time of the recording operation (when the live stream recording begins). The end time must be later than the start time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T13:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Maximum value: <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sorting method for results. Valid values:</p>
     * <ul>
     * <li><strong>CreationTime:Desc</strong> (default): sorted by creation time in descending order.</li>
     * <li><strong>CreationTime:Asc</strong>: sorted by creation time in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the recording operation (when the live stream recording begins). Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream used during recording.</p>
     * 
     * <strong>example:</strong>
     * <p>live-test</p>
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
