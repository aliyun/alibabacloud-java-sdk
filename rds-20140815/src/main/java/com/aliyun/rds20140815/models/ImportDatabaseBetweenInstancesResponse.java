// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportDatabaseBetweenInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImportId")
    @Validation(required = true)
    public String importId;

    public static ImportDatabaseBetweenInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDatabaseBetweenInstancesResponse self = new ImportDatabaseBetweenInstancesResponse();
        return TeaModel.build(map, self);
    }

}
