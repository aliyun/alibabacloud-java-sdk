// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsObjectsShrinkRequest extends TeaModel {
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
    public String objectsToDeleteShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i7*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static DeletePolarFsObjectsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsObjectsShrinkRequest self = new DeletePolarFsObjectsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsObjectsShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeletePolarFsObjectsShrinkRequest setObjectsToDeleteShrink(String objectsToDeleteShrink) {
        this.objectsToDeleteShrink = objectsToDeleteShrink;
        return this;
    }
    public String getObjectsToDeleteShrink() {
        return this.objectsToDeleteShrink;
    }

    public DeletePolarFsObjectsShrinkRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

}
