// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSBuildConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DeleteImage")
    public Boolean deleteImage;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteAKSBuildConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSBuildConfigRequest self = new DeleteAKSBuildConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSBuildConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAKSBuildConfigRequest setDeleteImage(Boolean deleteImage) {
        this.deleteImage = deleteImage;
        return this;
    }
    public Boolean getDeleteImage() {
        return this.deleteImage;
    }

    public DeleteAKSBuildConfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
