// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePromoteActivityResponseBody extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("IsActivity")
    public String isActivity;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstancePromoteActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePromoteActivityResponseBody self = new DescribeDBInstancePromoteActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePromoteActivityResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public DescribeDBInstancePromoteActivityResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeDBInstancePromoteActivityResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancePromoteActivityResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDBInstancePromoteActivityResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBInstancePromoteActivityResponseBody setIsActivity(String isActivity) {
        this.isActivity = isActivity;
        return this;
    }
    public String getIsActivity() {
        return this.isActivity;
    }

    public DescribeDBInstancePromoteActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
