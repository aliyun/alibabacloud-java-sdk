// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static CopyDatabaseBetweenInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseBetweenInstancesResponse self = new CopyDatabaseBetweenInstancesResponse();
        return TeaModel.build(map, self);
    }

}
