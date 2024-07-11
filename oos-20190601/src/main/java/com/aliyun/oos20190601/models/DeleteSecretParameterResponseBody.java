// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteSecretParameterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C0D02BDF-77F6-49F2-95C9-8E87121D1944</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecretParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretParameterResponseBody self = new DeleteSecretParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecretParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
