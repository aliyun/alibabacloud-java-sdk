// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListTensorboardsResponseBody extends TeaModel {
    // Tensorboard 列表
    @NameInMap("Tensorboards")
    public java.util.List<Tensorboard> tensorboards;

    // 符合条件的数据源总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static ListTensorboardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTensorboardsResponseBody self = new ListTensorboardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTensorboardsResponseBody setTensorboards(java.util.List<Tensorboard> tensorboards) {
        this.tensorboards = tensorboards;
        return this;
    }
    public java.util.List<Tensorboard> getTensorboards() {
        return this.tensorboards;
    }

    public ListTensorboardsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListTensorboardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
