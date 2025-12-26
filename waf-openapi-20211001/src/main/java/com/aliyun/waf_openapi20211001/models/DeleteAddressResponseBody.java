// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A8****6A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAddressResponseBody self = new DeleteAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
