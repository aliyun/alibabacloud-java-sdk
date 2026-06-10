// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModifyMaterialDirectoryRequest extends TeaModel {
    /**
     * <p>Application instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Folder ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68157a0a-769a-4364-bbdc-a0e2cf3d5ad</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Modified folder name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>视频管理</p>
     */
    @NameInMap("Name")
    public String name;

    public static ModifyMaterialDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterialDirectoryRequest self = new ModifyMaterialDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMaterialDirectoryRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyMaterialDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ModifyMaterialDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
