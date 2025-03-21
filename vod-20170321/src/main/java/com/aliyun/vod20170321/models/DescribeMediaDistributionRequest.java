// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeMediaDistributionRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The maximum time range to query is 6 months.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The statistical interval. Default value: day. Valid values:</p>
     * <ul>
     * <li>hour: natural hour of the start and end time.</li>
     * <li>day: natural day of the start and end time.</li>
     * <li>week: natural week of the start and end time.</li>
     * <li>month: natural month of the start and end time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The maximum time range to query is 6 months.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The hierarchical storage type. Valid values:</p>
     * <ul>
     * <li>Standard</li>
     * <li>IA</li>
     * <li>Archive</li>
     * <li>ColdArchive</li>
     * <li>SourceIA</li>
     * <li>SourceArchive</li>
     * <li>SourceColdArchive</li>
     * <li>Changing</li>
     * <li>SourceChanging</li>
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
