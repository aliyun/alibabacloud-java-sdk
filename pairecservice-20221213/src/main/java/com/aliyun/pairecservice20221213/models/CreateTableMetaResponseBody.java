// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTableMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TableMetaId")
    public String tableMetaId;

    public static CreateTableMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTableMetaResponseBody self = new CreateTableMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTableMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTableMetaResponseBody setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

}
