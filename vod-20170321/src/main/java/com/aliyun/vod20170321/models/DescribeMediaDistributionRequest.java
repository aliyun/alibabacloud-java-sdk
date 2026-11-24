// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeMediaDistributionRequest extends TeaModel {
    /**
     * <p>The end time of the creation time. The end time must be later than the start time. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The maximum time span between the start time and end time is six months.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The statistical interval. Default value: day. Valid values:</p>
     * <ul>
     * <li>hour: Hour. Statistics are collected based on the natural hours of the start time and end time.</li>
     * <li>day: Day. Statistics are collected based on the natural days of the start time and end time.</li>
     * <li>week: Week. Statistics are collected based on the natural weeks of the start time and end time.</li>
     * <li>month: Month. Statistics are collected based on the natural months of the start time and end time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The start time of the creation time. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The maximum time span between the start time and end time is six months.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The storage class. Valid values:</p>
     * <ul>
     * <li>Standard: Standard storage.</li>
     * <li>IA: Infrequent access.</li>
     * <li>Archive: Archive storage.</li>
     * <li>ColdArchive: Cold archive storage.</li>
     * <li>SourceIA: Infrequent access for source files.</li>
     * <li>SourceArchive: Archive storage for source files.</li>
     * <li>SourceColdArchive: Cold archive storage for source files.</li>
     * <li>Changing: The storage type of the media asset is being changed.</li>
     * <li>SourceChanging: The storage type of the source file is being changed.</li>
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
