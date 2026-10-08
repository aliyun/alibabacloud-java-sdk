// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIpHostnameResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The internal IP addresses and hostnames of the underlying ECS instances for the ApsaraDB RDS for SQL Server instance, including the primary and secondary instances. Format: <code>ip1,hostname1;ip2,hostname2</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.xx.xx,sd<strong><strong>B;172.16.xx.xx,sd</strong></strong>A</p>
     */
    @NameInMap("IpHostnameInfos")
    public String ipHostnameInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67CD4719-51E3-4A76-A38C-02F45FAE7E36</p>
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
