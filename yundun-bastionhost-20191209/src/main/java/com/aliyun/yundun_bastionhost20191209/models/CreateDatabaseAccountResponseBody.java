// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseAccountResponseBody extends TeaModel {
    @NameInMap("DatabaseAccountId")
    public String databaseAccountId;

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
