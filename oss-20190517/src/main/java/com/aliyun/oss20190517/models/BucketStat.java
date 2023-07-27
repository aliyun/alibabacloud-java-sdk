// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class BucketStat extends TeaModel {
    @NameInMap("ArchiveObjectCount")
    public Long archiveObjectCount;

    @NameInMap("ArchiveRealStorage")
    public Long archiveRealStorage;

    @NameInMap("ArchiveStorage")
    public Long archiveStorage;

    @NameInMap("ColdArchiveObjectCount")
    public Long coldArchiveObjectCount;

    @NameInMap("ColdArchiveRealStorage")
    public Long coldArchiveRealStorage;

    @NameInMap("ColdArchiveStorage")
    public Long coldArchiveStorage;

    @NameInMap("InfrequentAccessObjectCount")
    public Long infrequentAccessObjectCount;

    @NameInMap("InfrequentAccessRealStorage")
    public Long infrequentAccessRealStorage;

    @NameInMap("InfrequentAccessStorage")
    public Long infrequentAccessStorage;

    @NameInMap("LastModifiedTime")
    public Long lastModifiedTime;

    @NameInMap("LiveChannelCount")
    public Long liveChannelCount;

    @NameInMap("MultipartUploadCount")
    public Long multipartUploadCount;

    @NameInMap("ObjectCount")
    public Long objectCount;

    @NameInMap("StandardObjectCount")
    public Long standardObjectCount;

    @NameInMap("StandardStorage")
    public Long standardStorage;

    @NameInMap("Storage")
    public Long storage;

    public static BucketStat build(java.util.Map<String, ?> map) throws Exception {
        BucketStat self = new BucketStat();
        return TeaModel.build(map, self);
    }

    public BucketStat setArchiveObjectCount(Long archiveObjectCount) {
        this.archiveObjectCount = archiveObjectCount;
        return this;
    }
    public Long getArchiveObjectCount() {
        return this.archiveObjectCount;
    }

    public BucketStat setArchiveRealStorage(Long archiveRealStorage) {
        this.archiveRealStorage = archiveRealStorage;
        return this;
    }
    public Long getArchiveRealStorage() {
        return this.archiveRealStorage;
    }

    public BucketStat setArchiveStorage(Long archiveStorage) {
        this.archiveStorage = archiveStorage;
        return this;
    }
    public Long getArchiveStorage() {
        return this.archiveStorage;
    }

    public BucketStat setColdArchiveObjectCount(Long coldArchiveObjectCount) {
        this.coldArchiveObjectCount = coldArchiveObjectCount;
        return this;
    }
    public Long getColdArchiveObjectCount() {
        return this.coldArchiveObjectCount;
    }

    public BucketStat setColdArchiveRealStorage(Long coldArchiveRealStorage) {
        this.coldArchiveRealStorage = coldArchiveRealStorage;
        return this;
    }
    public Long getColdArchiveRealStorage() {
        return this.coldArchiveRealStorage;
    }

    public BucketStat setColdArchiveStorage(Long coldArchiveStorage) {
        this.coldArchiveStorage = coldArchiveStorage;
        return this;
    }
    public Long getColdArchiveStorage() {
        return this.coldArchiveStorage;
    }

    public BucketStat setInfrequentAccessObjectCount(Long infrequentAccessObjectCount) {
        this.infrequentAccessObjectCount = infrequentAccessObjectCount;
        return this;
    }
    public Long getInfrequentAccessObjectCount() {
        return this.infrequentAccessObjectCount;
    }

    public BucketStat setInfrequentAccessRealStorage(Long infrequentAccessRealStorage) {
        this.infrequentAccessRealStorage = infrequentAccessRealStorage;
        return this;
    }
    public Long getInfrequentAccessRealStorage() {
        return this.infrequentAccessRealStorage;
    }

    public BucketStat setInfrequentAccessStorage(Long infrequentAccessStorage) {
        this.infrequentAccessStorage = infrequentAccessStorage;
        return this;
    }
    public Long getInfrequentAccessStorage() {
        return this.infrequentAccessStorage;
    }

    public BucketStat setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public BucketStat setLiveChannelCount(Long liveChannelCount) {
        this.liveChannelCount = liveChannelCount;
        return this;
    }
    public Long getLiveChannelCount() {
        return this.liveChannelCount;
    }

    public BucketStat setMultipartUploadCount(Long multipartUploadCount) {
        this.multipartUploadCount = multipartUploadCount;
        return this;
    }
    public Long getMultipartUploadCount() {
        return this.multipartUploadCount;
    }

    public BucketStat setObjectCount(Long objectCount) {
        this.objectCount = objectCount;
        return this;
    }
    public Long getObjectCount() {
        return this.objectCount;
    }

    public BucketStat setStandardObjectCount(Long standardObjectCount) {
        this.standardObjectCount = standardObjectCount;
        return this;
    }
    public Long getStandardObjectCount() {
        return this.standardObjectCount;
    }

    public BucketStat setStandardStorage(Long standardStorage) {
        this.standardStorage = standardStorage;
        return this;
    }
    public Long getStandardStorage() {
        return this.standardStorage;
    }

    public BucketStat setStorage(Long storage) {
        this.storage = storage;
        return this;
    }
    public Long getStorage() {
        return this.storage;
    }

}
