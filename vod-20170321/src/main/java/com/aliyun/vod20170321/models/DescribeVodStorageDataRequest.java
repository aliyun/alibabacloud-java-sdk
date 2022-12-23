// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodStorageDataRequest extends TeaModel {
    // The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region where media assets are stored. If you do not set this parameter, the data in all regions is returned. You can specify multiple regions. Separate them with commas (,). Valid values:
    // 
    // *   **cn-shanghai**: China (Shanghai)
    // *   **cn-beijing**: China (Beijing)
    // *   **eu-central-1**: Germany (Frankfurt)
    // *   **ap-southeast-1**: Singapore
    @NameInMap("Region")
    public String region;

    // The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    // The name of the Object Storage Service (OSS) bucket. If you do not set this parameter, the data of all buckets is returned. You can specify multiple buckets. Separate them with commas (,).
    @NameInMap("Storage")
    public String storage;

    // The storage type. Set the value to **OSS**.
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
