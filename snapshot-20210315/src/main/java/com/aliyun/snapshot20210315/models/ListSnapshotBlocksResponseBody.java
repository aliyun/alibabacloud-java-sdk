// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class ListSnapshotBlocksResponseBody extends TeaModel {
    // 返回下一个有效数据块 token，为空时代表无其他有效数据块，最大  256 字节
    @NameInMap("NextToken")
    public String nextToken;

    // 快照有效数据块信息列表，不包含空数据块
    @NameInMap("Blocks")
    public java.util.List<ListSnapshotBlocksResponseBodyBlocks> blocks;

    // BlockToken 过期时间戳
    @NameInMap("ExpiryTime")
    public Long expiryTime;

    // 快照大小，单位 GB，最小 1GB
    @NameInMap("VolumeSize")
    public Long volumeSize;

    // 数据块大小，单位 Byte
    @NameInMap("BlockSize")
    public Long blockSize;

    // 本次查询中快照有效数据块数量
    @NameInMap("BlockCount")
    public Long blockCount;

    // 快照有效数据块总数量
    @NameInMap("TotalBlockCount")
    public Long totalBlockCount;

    public static ListSnapshotBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotBlocksResponseBody self = new ListSnapshotBlocksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotBlocksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSnapshotBlocksResponseBody setBlocks(java.util.List<ListSnapshotBlocksResponseBodyBlocks> blocks) {
        this.blocks = blocks;
        return this;
    }
    public java.util.List<ListSnapshotBlocksResponseBodyBlocks> getBlocks() {
        return this.blocks;
    }

    public ListSnapshotBlocksResponseBody setExpiryTime(Long expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
    public Long getExpiryTime() {
        return this.expiryTime;
    }

    public ListSnapshotBlocksResponseBody setVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }
    public Long getVolumeSize() {
        return this.volumeSize;
    }

    public ListSnapshotBlocksResponseBody setBlockSize(Long blockSize) {
        this.blockSize = blockSize;
        return this;
    }
    public Long getBlockSize() {
        return this.blockSize;
    }

    public ListSnapshotBlocksResponseBody setBlockCount(Long blockCount) {
        this.blockCount = blockCount;
        return this;
    }
    public Long getBlockCount() {
        return this.blockCount;
    }

    public ListSnapshotBlocksResponseBody setTotalBlockCount(Long totalBlockCount) {
        this.totalBlockCount = totalBlockCount;
        return this;
    }
    public Long getTotalBlockCount() {
        return this.totalBlockCount;
    }

    public static class ListSnapshotBlocksResponseBodyBlocks extends TeaModel {
        // 数据块的索引值，从零开始
        @NameInMap("BlockIndex")
        public Long blockIndex;

        // 数据块的 Token，用于后续的数据读取。最大长度 256 字节
        @NameInMap("BlockToken")
        public String blockToken;

        public static ListSnapshotBlocksResponseBodyBlocks build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotBlocksResponseBodyBlocks self = new ListSnapshotBlocksResponseBodyBlocks();
            return TeaModel.build(map, self);
        }

        public ListSnapshotBlocksResponseBodyBlocks setBlockIndex(Long blockIndex) {
            this.blockIndex = blockIndex;
            return this;
        }
        public Long getBlockIndex() {
            return this.blockIndex;
        }

        public ListSnapshotBlocksResponseBodyBlocks setBlockToken(String blockToken) {
            this.blockToken = blockToken;
            return this;
        }
        public String getBlockToken() {
            return this.blockToken;
        }

    }

}
