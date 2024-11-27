// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("DatabaseAccountId")
    public String databaseAccountId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B07C465D-B09F-54DD-8FEC-90788BEABAFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatabaseAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseAccountResponseBody self = new CreateDatabaseAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseAccountResponseBody setDatabaseAccountId(String databaseAccountId) {
        this.databaseAccountId = databaseAccountId;
        return this;
    }
    public String getDatabaseAccountId() {
        return this.databaseAccountId;
    }

    public CreateDatabaseAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
