// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteLakebaseS3AccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLakebaseS3AccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLakebaseS3AccountResponseBody self = new DeleteLakebaseS3AccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLakebaseS3AccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
