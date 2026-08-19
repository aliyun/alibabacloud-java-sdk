// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTieringStorageRetrievalDataRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. The maximum time range is 31 days. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-02T11:20:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The storage region. By default, data of all regions is returned. You can specify multiple regions separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. The minimum data granularity is 5 minutes. If you leave this parameter empty, data of the last 24 hours is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-02T10:20:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The storage class. Valid values:</p>
     * <ul>
     * <li><strong>IA</strong>: Infrequent Access.</li>
     * <li><strong>Archive</strong>: Archive.</li>
     * <li><strong>ColdArchive</strong>: Cold Archive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IA</p>
     */
    @NameInMap("StorageClass")
    public String storageClass;

    public static DescribeVodTieringStorageRetrievalDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTieringStorageRetrievalDataRequest self = new DescribeVodTieringStorageRetrievalDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodTieringStorageRetrievalDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeVodTieringStorageRetrievalDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodTieringStorageRetrievalDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodTieringStorageRetrievalDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodTieringStorageRetrievalDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodTieringStorageRetrievalDataRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
