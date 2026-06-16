// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSQLEvaluateTaskRequest extends TeaModel {
    /**
     * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the target region, including instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-shr4idrgogti89</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The ID of the instance on which the target SQL statement is executed. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of the target SQL statement, including the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>transfer_for_st</p>
     */
    @NameInMap("DstDb")
    public String dstDb;

    /**
     * <p>The password of the target SQL statement. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of the target SQL statement, including the password.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DstPassword")
    public String dstPassword;

    /**
     * <p>The ID of the target SQL statement. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of the target SQL statement, including the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-zkrc1****l54rc</p>
     */
    @NameInMap("DstResId")
    public String dstResId;

    /**
     * <p>The username of the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>drds_test</p>
     */
    @NameInMap("DstUserName")
    public String dstUserName;

    /**
     * <p>The region ID of the instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the target SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>test-drds-&gt;auto</p>
     */
    @NameInMap("SlinkTaskDesc")
    public String slinkTaskDesc;

    /**
     * <p>The task ID for executing the target SQL statement. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeCloudCenterInstances</a> operation to query the IDs of target SQL statements supported by PolarDB-X.</p>
     * 
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    /**
     * <p>Specifies whether to enable the source ApsaraDB RDS instance. Valid values: *<strong>enable</strong>: enabled. *<strong>disabled</strong>: disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>transfer_test3</p>
     */
    @NameInMap("SrcDb")
    public String srcDb;

    /**
     * <p>The port number of the source instance. Valid values: 3200 to 3999. &gt; This parameter is available and required only when <strong>DBEndpointInstanceType</strong> is set to <strong>polardb-o</strong>.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcPassword")
    public String srcPassword;

    /**
     * <p>The ID of the source ApsaraDB RDS instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196836.html">DescribeDropSystemEventMetaList</a> operation to query the details of all source ApsaraDB RDS instances in the target region, including instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-shr****rgkh87z</p>
     */
    @NameInMap("SrcResId")
    public String srcResId;

    /**
     * <p>The type of the source instance. Valid values: RDS_MYSQL, POLARX1, POLARX2_STANDARD, POLARX2_ENTERPRISE, and POLARDB_M.</p>
     * 
     * <strong>example:</strong>
     * <p>POLARX2</p>
     */
    @NameInMap("SrcResType")
    public String srcResType;

    /**
     * <p>The username of the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>drds_test</p>
     */
    @NameInMap("SrcUserName")
    public String srcUserName;

    public static CreateSQLEvaluateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLEvaluateTaskRequest self = new CreateSQLEvaluateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSQLEvaluateTaskRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateSQLEvaluateTaskRequest setDstDb(String dstDb) {
        this.dstDb = dstDb;
        return this;
    }
    public String getDstDb() {
        return this.dstDb;
    }

    public CreateSQLEvaluateTaskRequest setDstPassword(String dstPassword) {
        this.dstPassword = dstPassword;
        return this;
    }
    public String getDstPassword() {
        return this.dstPassword;
    }

    public CreateSQLEvaluateTaskRequest setDstResId(String dstResId) {
        this.dstResId = dstResId;
        return this;
    }
    public String getDstResId() {
        return this.dstResId;
    }

    public CreateSQLEvaluateTaskRequest setDstUserName(String dstUserName) {
        this.dstUserName = dstUserName;
        return this;
    }
    public String getDstUserName() {
        return this.dstUserName;
    }

    public CreateSQLEvaluateTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSQLEvaluateTaskRequest setSlinkTaskDesc(String slinkTaskDesc) {
        this.slinkTaskDesc = slinkTaskDesc;
        return this;
    }
    public String getSlinkTaskDesc() {
        return this.slinkTaskDesc;
    }

    public CreateSQLEvaluateTaskRequest setSlinkTaskId(String slinkTaskId) {
        this.slinkTaskId = slinkTaskId;
        return this;
    }
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    public CreateSQLEvaluateTaskRequest setSrcDb(String srcDb) {
        this.srcDb = srcDb;
        return this;
    }
    public String getSrcDb() {
        return this.srcDb;
    }

    public CreateSQLEvaluateTaskRequest setSrcPassword(String srcPassword) {
        this.srcPassword = srcPassword;
        return this;
    }
    public String getSrcPassword() {
        return this.srcPassword;
    }

    public CreateSQLEvaluateTaskRequest setSrcResId(String srcResId) {
        this.srcResId = srcResId;
        return this;
    }
    public String getSrcResId() {
        return this.srcResId;
    }

    public CreateSQLEvaluateTaskRequest setSrcResType(String srcResType) {
        this.srcResType = srcResType;
        return this;
    }
    public String getSrcResType() {
        return this.srcResType;
    }

    public CreateSQLEvaluateTaskRequest setSrcUserName(String srcUserName) {
        this.srcUserName = srcUserName;
        return this;
    }
    public String getSrcUserName() {
        return this.srcUserName;
    }

}
