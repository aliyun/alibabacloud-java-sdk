// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class ListChangedBlocksResponseBody extends TeaModel {
    // 下一个待比较的数据块 BlockToken，为空时代表无其他待比较数据块，最大长度 256 字节
    @NameInMap("NextToken")
    public String nextToken;

    // 两个快照差异的数据块列表
    @NameInMap("ChangedBlocks")
    public java.util.List<ListChangedBlocksResponseBodyChangedBlocks> changedBlocks;

    // 差异数据块 token 过期时间戳
    @NameInMap("ExpiryTime")
    public Long expiryTime;

    // 第二个快照大小，单位 GB，最小 1GB
    @NameInMap("VolumeSize")
    public Long volumeSize;

    // 数据块大小，单位 Byte
    @NameInMap("BlockSize")
    public Long blockSize;

    // 本次查询中变化数据块数量
    @NameInMap("BlockCount")
    public Long blockCount;

    // 第二个快照相对于第一个快照差异数据快总数
    @NameInMap("TotalBlockCount")
    public Long totalBlockCount;

    public static ListChangedBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChangedBlocksResponseBody self = new ListChangedBlocksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChangedBlocksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChangedBlocksResponseBody setChangedBlocks(java.util.List<ListChangedBlocksResponseBodyChangedBlocks> changedBlocks) {
        this.changedBlocks = changedBlocks;
        return this;
    }
    public java.util.List<ListChangedBlocksResponseBodyChangedBlocks> getChangedBlocks() {
        return this.changedBlocks;
    }

    public ListChangedBlocksResponseBody setExpiryTime(Long expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
    public Long getExpiryTime() {
        return this.expiryTime;
    }

    public ListChangedBlocksResponseBody setVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }
    public Long getVolumeSize() {
        return this.volumeSize;
    }

    public ListChangedBlocksResponseBody setBlockSize(Long blockSize) {
        this.blockSize = blockSize;
        return this;
    }
    public Long getBlockSize() {
        return this.blockSize;
    }

    public ListChangedBlocksResponseBody setBlockCount(Long blockCount) {
        this.blockCount = blockCount;
        return this;
    }
    public Long getBlockCount() {
        return this.blockCount;
    }

    public ListChangedBlocksResponseBody setTotalBlockCount(Long totalBlockCount) {
        this.totalBlockCount = totalBlockCount;
        return this;
    }
    public Long getTotalBlockCount() {
        return this.totalBlockCount;
    }

    public static class ListChangedBlocksResponseBodyChangedBlocks extends TeaModel {
        // 数据块的索引值，从零开始
        @NameInMap("BlockIndex")
        public Long blockIndex;

        // FirstSnapshotId 中数据块的 Token，用于后续的数据读取，第一个快照未变化时可省略。最大长度 256 字节
        @NameInMap("FirstBlockToken")
        public String firstBlockToken;

        // SecondBlockToken指定的快照中相对于 FirstBlockIndex 变化的数据块 Token，用于后续读取数据。最大长度 256 字节
        @NameInMap("SecondBlockToken")
        public String secondBlockToken;

        public static ListChangedBlocksResponseBodyChangedBlocks build(java.util.Map<String, ?> map) throws Exception {
            ListChangedBlocksResponseBodyChangedBlocks self = new ListChangedBlocksResponseBodyChangedBlocks();
            return TeaModel.build(map, self);
        }

        public ListChangedBlocksResponseBodyChangedBlocks setBlockIndex(Long blockIndex) {
            this.blockIndex = blockIndex;
            return this;
        }
        public Long getBlockIndex() {
            return this.blockIndex;
        }

        public ListChangedBlocksResponseBodyChangedBlocks setFirstBlockToken(String firstBlockToken) {
            this.firstBlockToken = firstBlockToken;
            return this;
        }
        public String getFirstBlockToken() {
            return this.firstBlockToken;
        }

        public ListChangedBlocksResponseBodyChangedBlocks setSecondBlockToken(String secondBlockToken) {
            this.secondBlockToken = secondBlockToken;
            return this;
        }
        public String getSecondBlockToken() {
            return this.secondBlockToken;
        }

    }

}
