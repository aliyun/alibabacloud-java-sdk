// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class ListSnapshotBlocksRequest extends TeaModel {
    // 标记当前开始读取的位置，置空表示从 StartingBlockIndex 指定 Block 开始，最大长度 256 字节
    @NameInMap("NextToken")
    public String nextToken;

    // 本次读取的最大数据记录数量，最小 100， 最大 10000， 默认为 100
    @NameInMap("MaxResults")
    public Long maxResults;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 待列出数据块的快照名称，最大 256 字节
    @NameInMap("SnapshotId")
    public String snapshotId;

    // 列出快照中数据块起始索引值，从零开始，最大值为快照数据块总数减一。NextToken 不为空时忽略此参数
    @NameInMap("StartingBlockIndex")
    public Long startingBlockIndex;

    public static ListSnapshotBlocksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotBlocksRequest self = new ListSnapshotBlocksRequest();
        return TeaModel.build(map, self);
    }

    public ListSnapshotBlocksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSnapshotBlocksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListSnapshotBlocksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListSnapshotBlocksRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public ListSnapshotBlocksRequest setStartingBlockIndex(Long startingBlockIndex) {
        this.startingBlockIndex = startingBlockIndex;
        return this;
    }
    public Long getStartingBlockIndex() {
        return this.startingBlockIndex;
    }

}
