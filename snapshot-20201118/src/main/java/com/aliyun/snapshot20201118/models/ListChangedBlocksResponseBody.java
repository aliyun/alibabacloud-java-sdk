// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20201118.models;

import com.aliyun.tea.*;

public class ListChangedBlocksResponseBody extends TeaModel {
    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 下一页结果的 token，为空时代表无新增页
    @NameInMap("NextToken")
    public byte[] nextToken;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 两个快照差异的数据块列表
    @NameInMap("ChangedBlocks")
    public java.util.List<ListChangedBlocksResponseBodyChangedBlocks> changedBlocks;

    // 差异数据块 token 过期时间戳
    @NameInMap("ExpiryTime")
    public Long expiryTime;

    // 快照大小，单位 GB，最小 1GB
    @NameInMap("VolumeSize")
    public Integer volumeSize;

    // 数据块大小，单位 Byte
    @NameInMap("BlockSize")
    public Integer blockSize;

    public static ListChangedBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChangedBlocksResponseBody self = new ListChangedBlocksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChangedBlocksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListChangedBlocksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChangedBlocksResponseBody setNextToken(byte[] nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public byte[] getNextToken() {
        return this.nextToken;
    }

    public ListChangedBlocksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
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

    public ListChangedBlocksResponseBody setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }
    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    public ListChangedBlocksResponseBody setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
        return this;
    }
    public Integer getBlockSize() {
        return this.blockSize;
    }

    public static class ListChangedBlocksResponseBodyChangedBlocks extends TeaModel {
        // 数据块的索引值，从零开始
        @NameInMap("BlockIndex")
        public Long blockIndex;

        // 数据块的 Token，用于后续的数据读取
        @NameInMap("BlockToken")
        public byte[] blockToken;

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

        public ListChangedBlocksResponseBodyChangedBlocks setBlockToken(byte[] blockToken) {
            this.blockToken = blockToken;
            return this;
        }
        public byte[] getBlockToken() {
            return this.blockToken;
        }

    }

}
