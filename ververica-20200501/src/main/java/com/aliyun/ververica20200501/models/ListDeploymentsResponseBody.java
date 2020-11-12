// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListDeploymentsResponseBody extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    public static ListDeploymentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsResponseBody self = new ListDeploymentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListDeploymentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
