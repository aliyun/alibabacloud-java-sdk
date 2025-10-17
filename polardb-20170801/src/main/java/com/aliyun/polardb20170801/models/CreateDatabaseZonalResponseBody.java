// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDatabaseZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>93E98F25-BE02-40DA-83E3-F77F8D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatabaseZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseZonalResponseBody self = new CreateDatabaseZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
