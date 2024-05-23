// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePromoteActivityResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>*   China site: 26842</p>
     * <p>*   International site: 26888</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/26232.html) operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The instance name.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The type of the database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **Oracle**</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The activity information about the instance. For more information, see [Instance activities](https://help.aliyun.com/document_detail/2391834.html).</p>
     */
    @NameInMap("IsActivity")
    public String isActivity;

    /**
     * <p>The request ID.</p>
     */
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
