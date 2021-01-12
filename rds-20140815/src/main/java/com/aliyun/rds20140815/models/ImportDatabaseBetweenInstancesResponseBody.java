// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportDatabaseBetweenInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImportId")
    public String importId;

    public static ImportDatabaseBetweenInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDatabaseBetweenInstancesResponseBody self = new ImportDatabaseBetweenInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDatabaseBetweenInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDatabaseBetweenInstancesResponseBody setImportId(String importId) {
        this.importId = importId;
        return this;
    }
    public String getImportId() {
        return this.importId;
    }

}
