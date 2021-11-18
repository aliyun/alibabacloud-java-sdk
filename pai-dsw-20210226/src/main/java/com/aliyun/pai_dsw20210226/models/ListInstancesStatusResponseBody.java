// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstancesStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statuses")
    public java.util.List<InstanceStatus> statuses;

    public static ListInstancesStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesStatusResponseBody self = new ListInstancesStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesStatusResponseBody setStatuses(java.util.List<InstanceStatus> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<InstanceStatus> getStatuses() {
        return this.statuses;
    }

}
