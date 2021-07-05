// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIpHostnameResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpHostnameInfos")
    public String ipHostnameInfos;

    public static DescribeDBInstanceIpHostnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIpHostnameResponseBody self = new DescribeDBInstanceIpHostnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIpHostnameResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceIpHostnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceIpHostnameResponseBody setIpHostnameInfos(String ipHostnameInfos) {
        this.ipHostnameInfos = ipHostnameInfos;
        return this;
    }
    public String getIpHostnameInfos() {
        return this.ipHostnameInfos;
    }

}
