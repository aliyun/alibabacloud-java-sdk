// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CancelPolarFsFileQuotaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/path1,/path2</p>
     */
    @NameInMap("FilePathIds")
    public String filePathIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static CancelPolarFsFileQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPolarFsFileQuotaRequest self = new CancelPolarFsFileQuotaRequest();
        return TeaModel.build(map, self);
    }

    public CancelPolarFsFileQuotaRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CancelPolarFsFileQuotaRequest setFilePathIds(String filePathIds) {
        this.filePathIds = filePathIds;
        return this;
    }
    public String getFilePathIds() {
        return this.filePathIds;
    }

    public CancelPolarFsFileQuotaRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

}
