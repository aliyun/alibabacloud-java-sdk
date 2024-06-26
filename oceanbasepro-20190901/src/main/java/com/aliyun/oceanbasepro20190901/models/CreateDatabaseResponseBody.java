// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateDatabaseResponseBody extends TeaModel {
    /**
     * <p>CreateDatabase</p>
     * 
     * <strong>example:</strong>
     * <p>sms_pre</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseResponseBody self = new CreateDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseResponseBody setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
