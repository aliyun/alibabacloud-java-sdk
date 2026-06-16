// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDataImportTaskRequest extends TeaModel {
    /**
     * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The execution status of the target SQL import. Valid values: * <strong>importing</strong>: importing. * <strong>success</strong>: import succeeded. * <strong>fail</strong>: import failed.</p>
     * 
     * <strong>example:</strong>
     * <p>transfer_test3</p>
     */
    @NameInMap("DstDb")
    public String dstDb;

    /**
     * <p>The password of the privileged account for the target ApsaraDB RDS instance. &gt; * You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the privileged account information of the target instance, including the password. * This parameter takes effect only when DstPassword is set to true.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DstPassword")
    public String dstPassword;

    /**
     * <p>The migration task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-shr8****k36vrn</p>
     */
    @NameInMap("DstResId")
    public String dstResId;

    /**
     * <p>The username of the target.</p>
     * 
     * <strong>example:</strong>
     * <p>bbt_cms_prod</p>
     */
    @NameInMap("DstUserName")
    public String dstUserName;

    /**
     * <p>The region in which the instance resides. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The import task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    /**
     * <p>The database information of the source when the source database is ApsaraDB RDS for MySQL. &gt; The source database must be consistent with the target database.</p>
     * 
     * <strong>example:</strong>
     * <p>transfer_for_st</p>
     */
    @NameInMap("SrcDb")
    public String srcDb;

    /**
     * <p>The read/write mode for executing the import task on the source. Valid values: * <strong>rw</strong>: read and write. * <strong>ro</strong>: read-only.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcPassword")
    public String srcPassword;

    /**
     * <p>The ID of the source ApsaraDB RDS instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDrivingAccess</a> operation to query the details of all source ApsaraDB RDS instances in the specified region, including instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-shrnv****kh87z</p>
     */
    @NameInMap("SrcResId")
    public String srcResId;

    /**
     * <p>The username of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>drds_test</p>
     */
    @NameInMap("SrcUserName")
    public String srcUserName;

    public static CreateDataImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataImportTaskRequest self = new CreateDataImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataImportTaskRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateDataImportTaskRequest setDstDb(String dstDb) {
        this.dstDb = dstDb;
        return this;
    }
    public String getDstDb() {
        return this.dstDb;
    }

    public CreateDataImportTaskRequest setDstPassword(String dstPassword) {
        this.dstPassword = dstPassword;
        return this;
    }
    public String getDstPassword() {
        return this.dstPassword;
    }

    public CreateDataImportTaskRequest setDstResId(String dstResId) {
        this.dstResId = dstResId;
        return this;
    }
    public String getDstResId() {
        return this.dstResId;
    }

    public CreateDataImportTaskRequest setDstUserName(String dstUserName) {
        this.dstUserName = dstUserName;
        return this;
    }
    public String getDstUserName() {
        return this.dstUserName;
    }

    public CreateDataImportTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataImportTaskRequest setSlinkTaskId(String slinkTaskId) {
        this.slinkTaskId = slinkTaskId;
        return this;
    }
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    public CreateDataImportTaskRequest setSrcDb(String srcDb) {
        this.srcDb = srcDb;
        return this;
    }
    public String getSrcDb() {
        return this.srcDb;
    }

    public CreateDataImportTaskRequest setSrcPassword(String srcPassword) {
        this.srcPassword = srcPassword;
        return this;
    }
    public String getSrcPassword() {
        return this.srcPassword;
    }

    public CreateDataImportTaskRequest setSrcResId(String srcResId) {
        this.srcResId = srcResId;
        return this;
    }
    public String getSrcResId() {
        return this.srcResId;
    }

    public CreateDataImportTaskRequest setSrcUserName(String srcUserName) {
        this.srcUserName = srcUserName;
        return this;
    }
    public String getSrcUserName() {
        return this.srcUserName;
    }

}
