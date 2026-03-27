// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsObjectsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectsToDelete")
    public java.util.List<String> objectsToDelete;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i7*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static DeletePolarFsObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsObjectsRequest self = new DeletePolarFsObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsObjectsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeletePolarFsObjectsRequest setObjectsToDelete(java.util.List<String> objectsToDelete) {
        this.objectsToDelete = objectsToDelete;
        return this;
    }
    public java.util.List<String> getObjectsToDelete() {
        return this.objectsToDelete;
    }

    public DeletePolarFsObjectsRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

}
