// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportDatabaseBetweenInstancesResponseBody extends TeaModel {
    @NameInMap("ImportId")
    public String importId;

    @NameInMap("RequestId")
    public String requestId;

    public static ImportDatabaseBetweenInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDatabaseBetweenInstancesResponseBody self = new ImportDatabaseBetweenInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDatabaseBetweenInstancesResponseBody setImportId(String importId) {
        this.importId = importId;
        return this;
    }
    public String getImportId() {
        return this.importId;
    }

    public ImportDatabaseBetweenInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
