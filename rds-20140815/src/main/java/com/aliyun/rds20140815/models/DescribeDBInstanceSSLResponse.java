// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ConnectionString")
    @Validation(required = true)
    public String connectionString;

    @NameInMap("SSLExpireTime")
    @Validation(required = true)
    public String SSLExpireTime;

    @NameInMap("RequireUpdate")
    @Validation(required = true)
    public String requireUpdate;

    @NameInMap("RequireUpdateReason")
    @Validation(required = true)
    public String requireUpdateReason;

    public static DescribeDBInstanceSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSSLResponse self = new DescribeDBInstanceSSLResponse();
        return TeaModel.build(map, self);
    }

}
