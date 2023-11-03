// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotNodeMetricListResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetHoneypotNodeMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotNodeMetricListResponseBody self = new GetHoneypotNodeMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotNodeMetricListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetHoneypotNodeMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
