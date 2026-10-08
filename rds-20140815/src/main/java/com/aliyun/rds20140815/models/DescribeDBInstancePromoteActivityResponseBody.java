// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePromoteActivityResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22973492**********</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <ul>
     * <li>Chinese site: 26842</li>
     * <li>International site: 26888</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>26888</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> to query the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5******</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The database engine type. Valid values: </p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The dynamic property of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/2391834.html">Instance dynamics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1 (indicates that the target instance is not participating in any promotions)</p>
     */
    @NameInMap("IsActivity")
    public String isActivity;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94CB8D93-017A-5AE7-A118-6E0F89D93C0A</p>
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
