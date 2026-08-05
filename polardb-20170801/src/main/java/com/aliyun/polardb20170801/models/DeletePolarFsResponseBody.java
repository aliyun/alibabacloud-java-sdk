// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolarFsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsResponseBody self = new DeletePolarFsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
