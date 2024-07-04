// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListTensorboardsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tensorboards")
    public java.util.List<Tensorboard> tensorboards;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTensorboardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTensorboardsResponseBody self = new ListTensorboardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTensorboardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
