// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSQLEvaluateTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-shr4idrgogti89</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>transfer_for_st</p>
     */
    @NameInMap("DstDb")
    public String dstDb;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DstPassword")
    public String dstPassword;

    /**
     * <strong>example:</strong>
     * <p>pxc-zkrc1****l54rc</p>
     */
    @NameInMap("DstResId")
    public String dstResId;

    /**
     * <strong>example:</strong>
     * <p>drds_test</p>
     */
    @NameInMap("DstUserName")
    public String dstUserName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>test-drds-&gt;auto</p>
     */
    @NameInMap("SlinkTaskDesc")
    public String slinkTaskDesc;

    /**
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    /**
     * <strong>example:</strong>
     * <p>transfer_test3</p>
     */
    @NameInMap("SrcDb")
    public String srcDb;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcPassword")
    public String srcPassword;

    /**
     * <strong>example:</strong>
     * <p>pxc-shr****rgkh87z</p>
     */
    @NameInMap("SrcResId")
    public String srcResId;

    /**
     * <strong>example:</strong>
     * <p>POLARX2</p>
     */
    @NameInMap("SrcResType")
    public String srcResType;

    /**
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
