// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDataImportTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>transfer_test3</p>
     */
    @NameInMap("DstDb")
    public String dstDb;

    @NameInMap("DstPassword")
    public String dstPassword;

    /**
     * <strong>example:</strong>
     * <p>pxc-shr8****k36vrn</p>
     */
    @NameInMap("DstResId")
    public String dstResId;

    @NameInMap("DstUserName")
    public String dstUserName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    /**
     * <strong>example:</strong>
     * <p>transfer_for_st</p>
     */
    @NameInMap("SrcDb")
    public String srcDb;

    @NameInMap("SrcPassword")
    public String srcPassword;

    /**
     * <strong>example:</strong>
     * <p>pxc-shrnv****kh87z</p>
     */
    @NameInMap("SrcResId")
    public String srcResId;

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
