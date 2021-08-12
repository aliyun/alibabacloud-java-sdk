// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class GetSnapshotInfoResponseBody extends TeaModel {
    // 快照大小，单位 GB，最小 1GB
    @NameInMap("VolumeSize")
    public Long volumeSize;

    // 快照数据快大小，单位 Bytes
    @NameInMap("BlockSize")
    public Long blockSize;

    // 快照数据块总数量，包含空数据块
    @NameInMap("BlockCount")
    public Long blockCount;

    // 快照中非空数据块总数量，仅在 ShowDetail 为 True 时返回
    @NameInMap("ValidBlockCount")
    public Long validBlockCount;

    // 快照状态。    "SNAPSHOT_INVALID",     "SNAPSHOT_PENDING",     "SNAPSHOT_COMMITTED",     "SNAPSHOT_DELETED"
    @NameInMap("Status")
    public String status;

    // 快照创建时间戳
    @NameInMap("CreateTime")
    public Long createTime;

    // 快照是否为加密快照
    @NameInMap("Encrypted")
    public Boolean encrypted;

    // 快照格式。"FORMAT_VHD", "FORMAT_RAW", "FORMAT_INVALID"
    @NameInMap("Format")
    public String format;

    public static GetSnapshotInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotInfoResponseBody self = new GetSnapshotInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSnapshotInfoResponseBody setVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }
    public Long getVolumeSize() {
        return this.volumeSize;
    }

    public GetSnapshotInfoResponseBody setBlockSize(Long blockSize) {
        this.blockSize = blockSize;
        return this;
    }
    public Long getBlockSize() {
        return this.blockSize;
    }

    public GetSnapshotInfoResponseBody setBlockCount(Long blockCount) {
        this.blockCount = blockCount;
        return this;
    }
    public Long getBlockCount() {
        return this.blockCount;
    }

    public GetSnapshotInfoResponseBody setValidBlockCount(Long validBlockCount) {
        this.validBlockCount = validBlockCount;
        return this;
    }
    public Long getValidBlockCount() {
        return this.validBlockCount;
    }

    public GetSnapshotInfoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSnapshotInfoResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetSnapshotInfoResponseBody setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public GetSnapshotInfoResponseBody setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

}
