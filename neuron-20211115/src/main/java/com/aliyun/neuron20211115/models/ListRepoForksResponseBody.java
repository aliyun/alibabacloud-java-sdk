// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRepoForksResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcRepoForkListResult result;

    public static ListRepoForksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoForksResponseBody self = new ListRepoForksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoForksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoForksResponseBody setResult(PbcRepoForkListResult result) {
        this.result = result;
        return this;
    }
    public PbcRepoForkListResult getResult() {
        return this.result;
    }

}
