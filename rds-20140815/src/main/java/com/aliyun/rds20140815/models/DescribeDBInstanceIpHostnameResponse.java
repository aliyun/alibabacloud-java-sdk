// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIpHostnameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("IpHostnameInfos")
    @Validation(required = true)
    public String ipHostnameInfos;

    public static DescribeDBInstanceIpHostnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIpHostnameResponse self = new DescribeDBInstanceIpHostnameResponse();
        return TeaModel.build(map, self);
    }

}
