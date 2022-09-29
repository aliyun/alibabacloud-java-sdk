// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpLogsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpConfigPageResult result;

    public static ListPdpLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPdpLogsResponseBody self = new ListPdpLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPdpLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPdpLogsResponseBody setResult(PdpConfigPageResult result) {
        this.result = result;
        return this;
    }
    public PdpConfigPageResult getResult() {
        return this.result;
    }

}
