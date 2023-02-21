// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIpHostnameResponseBody extends TeaModel {
    /**
     * <p>The ID of the RDS instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The private IP addresses and hostnames of the primary and standby RDS instances. Format: IP address 1,Hostname 1;IP address 2,Hostname 2.</p>
     */
    @NameInMap("IpHostnameInfos")
    public String ipHostnameInfos;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeDBInstanceIpHostnameResponseBody setIpHostnameInfos(String ipHostnameInfos) {
        this.ipHostnameInfos = ipHostnameInfos;
        return this;
    }
    public String getIpHostnameInfos() {
        return this.ipHostnameInfos;
    }

    public DescribeDBInstanceIpHostnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
