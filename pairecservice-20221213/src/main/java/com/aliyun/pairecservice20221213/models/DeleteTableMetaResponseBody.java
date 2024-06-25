// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTableMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTableMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableMetaResponseBody self = new DeleteTableMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTableMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
