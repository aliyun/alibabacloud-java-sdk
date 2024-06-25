// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDatabaseResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>93E98F25-BE02-40DA-83E3-F77F8D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseResponseBody self = new CreateDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
