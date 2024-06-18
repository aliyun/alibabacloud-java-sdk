// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIpHostnameResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The internal IP addresses and hostnames of the ECS instances on which the primary and secondary instances reside. Format: <code>IP address 1,Hostname 1;IP address 2,Hostname 2</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.xx.xx,sdxxxxxxxxB;172.16.xx.xx,sdxxxxxxxxA</p>
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
