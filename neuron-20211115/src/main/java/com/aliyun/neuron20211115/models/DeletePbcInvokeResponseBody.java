// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePbcInvokeResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("reuslt")
    public CatalogCommonResult reuslt;

    public static DeletePbcInvokeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePbcInvokeResponseBody self = new DeletePbcInvokeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePbcInvokeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePbcInvokeResponseBody setReuslt(CatalogCommonResult reuslt) {
        this.reuslt = reuslt;
        return this;
    }
    public CatalogCommonResult getReuslt() {
        return this.reuslt;
    }

}
