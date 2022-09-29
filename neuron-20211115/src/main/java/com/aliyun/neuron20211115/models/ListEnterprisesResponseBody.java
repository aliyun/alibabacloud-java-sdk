// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListEnterprisesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public EnterprisePageResult result;

    public static ListEnterprisesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterprisesResponseBody self = new ListEnterprisesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterprisesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterprisesResponseBody setResult(EnterprisePageResult result) {
        this.result = result;
        return this;
    }
    public EnterprisePageResult getResult() {
        return this.result;
    }

}
