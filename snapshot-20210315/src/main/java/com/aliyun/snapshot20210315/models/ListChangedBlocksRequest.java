// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class ListChangedBlocksRequest extends TeaModel {
    // 标记开始比较差异的位置，为空时代表从 StartingBlockIndex 指定数据块开始比较， 最大长度 256 字节
    @NameInMap("NextToken")
    public String nextToken;

    // 本次读取的最大数据记录数量，最小 100，最大 10000
    @NameInMap("MaxResults")
    public Long maxResults;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 待比较的第一个快照名称，最大 256 字节
    @NameInMap("FirstSnapshotId")
    public String firstSnapshotId;

    // 待比较的第二个快照名称，最大 256 字节
    @NameInMap("SecondSnapshotId")
    public String secondSnapshotId;

    // 两个快照比较的起始数据块 index，从零开始，最大值为第二快照的数据块总数量减一。当 NextToken 不为空时忽略该参数
    @NameInMap("StartingBlockIndex")
    public Long startingBlockIndex;

    public static ListChangedBlocksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangedBlocksRequest self = new ListChangedBlocksRequest();
        return TeaModel.build(map, self);
    }

    public ListChangedBlocksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChangedBlocksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListChangedBlocksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListChangedBlocksRequest setFirstSnapshotId(String firstSnapshotId) {
        this.firstSnapshotId = firstSnapshotId;
        return this;
    }
    public String getFirstSnapshotId() {
        return this.firstSnapshotId;
    }

    public ListChangedBlocksRequest setSecondSnapshotId(String secondSnapshotId) {
        this.secondSnapshotId = secondSnapshotId;
        return this;
    }
    public String getSecondSnapshotId() {
        return this.secondSnapshotId;
    }

    public ListChangedBlocksRequest setStartingBlockIndex(Long startingBlockIndex) {
        this.startingBlockIndex = startingBlockIndex;
        return this;
    }
    public Long getStartingBlockIndex() {
        return this.startingBlockIndex;
    }

}
