// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTieringStorageDataRequest extends TeaModel {
    /**
     * <p>The end time at which data is obtained. The end time must be later than the start time. The difference cannot exceed 31 days. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-29T02:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region in which you want to query data. If you leave this parameter empty, data in all regions is returned. Separate multiple regions with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If you leave this parameter empty, data in the last 24 hours is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-29T01:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The storage type. By default, all storage types are returned. Valid values:</p>
     * <ul>
     * <li><strong>IA</strong></li>
     * <li><strong>Archive</strong></li>
     * <li><strong>ColdArchive</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IA</p>
     */
    @NameInMap("StorageClass")
    public String storageClass;

    public static DescribeVodTieringStorageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTieringStorageDataRequest self = new DescribeVodTieringStorageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodTieringStorageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodTieringStorageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodTieringStorageDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodTieringStorageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodTieringStorageDataRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
