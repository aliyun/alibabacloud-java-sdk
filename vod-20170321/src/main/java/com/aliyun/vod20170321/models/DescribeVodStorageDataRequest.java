// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodStorageDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region in which you want to query storage data. If you leave this parameter empty, data in all regions is returned. Separate multiple regions with commas (,). Valid values:</p>
     * <br>
     * <p>*   **cn-shanghai**: China (Shanghai)</p>
     * <p>*   **cn-beijing**: China (Beijing)</p>
     * <p>*   **eu-central-1**: Germany (Frankfurt)</p>
     * <p>*   **ap-southeast-1**: Singapore</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket. If you leave this parameter empty, data of all buckets is returned. Separate multiple bucket names with commas (,).</p>
     */
    @NameInMap("Storage")
    public String storage;

    /**
     * <p>The storage type. Set the value to **OSS**.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static DescribeVodStorageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStorageDataRequest self = new DescribeVodStorageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodStorageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodStorageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodStorageDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodStorageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodStorageDataRequest setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public String getStorage() {
        return this.storage;
    }

    public DescribeVodStorageDataRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
