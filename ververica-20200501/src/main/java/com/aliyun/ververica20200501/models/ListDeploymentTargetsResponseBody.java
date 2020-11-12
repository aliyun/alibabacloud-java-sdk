// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListDeploymentTargetsResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static ListDeploymentTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentTargetsResponseBody self = new ListDeploymentTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeploymentTargetsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
