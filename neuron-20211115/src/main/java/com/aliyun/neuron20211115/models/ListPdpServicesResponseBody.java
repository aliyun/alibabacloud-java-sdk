// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpServicesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PdpServicePageResult result;

    public static ListPdpServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPdpServicesResponseBody self = new ListPdpServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPdpServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPdpServicesResponseBody setResult(PdpServicePageResult result) {
        this.result = result;
        return this;
    }
    public PdpServicePageResult getResult() {
        return this.result;
    }

}
