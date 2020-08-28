// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseResponse extends TeaModel {
    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("DBStatus")
    @Validation(required = true)
    public String DBStatus;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static CopyDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseResponse self = new CopyDatabaseResponse();
        return TeaModel.build(map, self);
    }

}
