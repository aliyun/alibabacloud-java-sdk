// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIpHostnameResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: 实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: RDS实例所在ECS实例的内网IP和ECS主机名，包含主备实例。格式：ip1,hostname1;ip2,hostname2。; 
    @NameInMap("IpHostnameInfos")
    @Validation(required = true)
    public String ipHostnameInfos;

    public static DescribeDBInstanceIpHostnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIpHostnameResponse self = new DescribeDBInstanceIpHostnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIpHostnameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceIpHostnameResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceIpHostnameResponse setIpHostnameInfos(String ipHostnameInfos) {
        this.ipHostnameInfos = ipHostnameInfos;
        return this;
    }
    public String getIpHostnameInfos() {
        return this.ipHostnameInfos;
    }

}
