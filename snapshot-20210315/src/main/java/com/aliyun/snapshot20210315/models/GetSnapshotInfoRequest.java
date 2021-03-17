// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class GetSnapshotInfoRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 待读取数据的快照名称
    @NameInMap("SnapshotId")
    public String snapshotId;

    // 是否返回详细信息，详细信息需要更多查询时间，默认为 False
    @NameInMap("ShowDetail")
    public Boolean showDetail;

    public static GetSnapshotInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotInfoRequest self = new GetSnapshotInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSnapshotInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetSnapshotInfoRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public GetSnapshotInfoRequest setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }
    public Boolean getShowDetail() {
        return this.showDetail;
    }

}
