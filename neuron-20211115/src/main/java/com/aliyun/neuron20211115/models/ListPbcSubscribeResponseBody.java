// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcSubscribeResponseBody extends TeaModel {
    @NameInMap("pbcListResult")
    public PbcListResult pbcListResult;

    @NameInMap("requestId")
    public String requestId;

    public static ListPbcSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPbcSubscribeResponseBody self = new ListPbcSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPbcSubscribeResponseBody setPbcListResult(PbcListResult pbcListResult) {
        this.pbcListResult = pbcListResult;
        return this;
    }
    public PbcListResult getPbcListResult() {
        return this.pbcListResult;
    }

    public ListPbcSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
