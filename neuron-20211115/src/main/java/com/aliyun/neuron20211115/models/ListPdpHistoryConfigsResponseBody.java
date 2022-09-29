// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpHistoryConfigsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpHistoryConfigPageResult result;

    public static ListPdpHistoryConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPdpHistoryConfigsResponseBody self = new ListPdpHistoryConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPdpHistoryConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPdpHistoryConfigsResponseBody setResult(PdpHistoryConfigPageResult result) {
        this.result = result;
        return this;
    }
    public PdpHistoryConfigPageResult getResult() {
        return this.result;
    }

}
