// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListDashboardResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardResponseBody self = new ListDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
