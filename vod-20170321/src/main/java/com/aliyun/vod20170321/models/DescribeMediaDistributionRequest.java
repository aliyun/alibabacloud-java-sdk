// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeMediaDistributionRequest extends TeaModel {
    /**
     * <p>The end time of CreationTime. The end time must be later than the start time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC). The maximum time span between the start time and end time is six months.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The statistical interval. Default value: day. Valid values:</p>
     * <ul>
     * <li>hour: by hour. Statistics are collected based on the calendar hours within the specified time range.</li>
     * <li>day: by day. Statistics are collected based on the calendar days within the specified time range.</li>
     * <li>week: by week. Statistics are collected based on the calendar weeks within the specified time range.</li>
     * <li>month: by month. Statistics are collected based on the calendar months within the specified time range.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The start time of CreationTime. Format: yyyy-MM-ddTHH:mm:ssZ (UTC). The maximum time span between the start time and end time is six months.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The storage class. Valid values:</p>
     * <ul>
     * <li>Standard: standard storage.</li>
     * <li>IA: Infrequent Access.</li>
     * <li>Archive: Archive storage.</li>
     * <li>ColdArchive: Cold Archive storage.</li>
     * <li>SourceIA: Infrequent Access for source files.</li>
     * <li>SourceArchive: Archive storage for source files.</li>
     * <li>SourceColdArchive: Cold Archive storage for source files.</li>
     * <li>Changing: the media asset storage class is being changed.</li>
     * <li>SourceChanging: the source file storage class is being changed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("StorageClass")
    public String storageClass;

    public static DescribeMediaDistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMediaDistributionRequest self = new DescribeMediaDistributionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMediaDistributionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMediaDistributionRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeMediaDistributionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeMediaDistributionRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
