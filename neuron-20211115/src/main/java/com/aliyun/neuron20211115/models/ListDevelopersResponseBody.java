// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDevelopersResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeveloperPageResult result;

    public static ListDevelopersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevelopersResponseBody self = new ListDevelopersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevelopersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevelopersResponseBody setResult(DeveloperPageResult result) {
        this.result = result;
        return this;
    }
    public DeveloperPageResult getResult() {
        return this.result;
    }

}
