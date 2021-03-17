// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class GetSnapshotBlockRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 待读取的数据块索引，从零开始。从 ListChangedBlocks 或者 ListSnapshotBlocks 返回。最大为快照数据块数量减一
    @NameInMap("BlockIndex")
    public Long blockIndex;

    // 待读取的数据块Token，从 ListChangedBlocks 或者 ListSnapshotBlocks 返回，最大长度 256 字节
    @NameInMap("BlockToken")
    public String blockToken;

    // 待读取数据的快照名称，最大 256 字节
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static GetSnapshotBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotBlockRequest self = new GetSnapshotBlockRequest();
        return TeaModel.build(map, self);
    }

    public GetSnapshotBlockRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetSnapshotBlockRequest setBlockIndex(Long blockIndex) {
        this.blockIndex = blockIndex;
        return this;
    }
    public Long getBlockIndex() {
        return this.blockIndex;
    }

    public GetSnapshotBlockRequest setBlockToken(String blockToken) {
        this.blockToken = blockToken;
        return this;
    }
    public String getBlockToken() {
        return this.blockToken;
    }

    public GetSnapshotBlockRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
