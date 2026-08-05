// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateLakebaseS3AccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLakebaseS3AccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLakebaseS3AccountResponseBody self = new CreateLakebaseS3AccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLakebaseS3AccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
