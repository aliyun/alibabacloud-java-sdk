// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcVersionNumbersResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<PbcVersion> result;

    public static ListPbcVersionNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPbcVersionNumbersResponseBody self = new ListPbcVersionNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPbcVersionNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPbcVersionNumbersResponseBody setResult(java.util.List<PbcVersion> result) {
        this.result = result;
        return this;
    }
    public java.util.List<PbcVersion> getResult() {
        return this.result;
    }

}
