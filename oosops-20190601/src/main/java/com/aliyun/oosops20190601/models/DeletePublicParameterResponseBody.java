// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeletePublicParameterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePublicParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicParameterResponseBody self = new DeletePublicParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePublicParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
