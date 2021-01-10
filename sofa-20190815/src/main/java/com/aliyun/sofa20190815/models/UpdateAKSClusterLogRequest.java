// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSClusterLogRequest extends TeaModel {
    @NameInMap("AlsProjectHowCreate")
    public String alsProjectHowCreate;

    @NameInMap("AlsProjectName")
    public String alsProjectName;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSClusterLogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSClusterLogRequest self = new UpdateAKSClusterLogRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSClusterLogRequest setAlsProjectHowCreate(String alsProjectHowCreate) {
        this.alsProjectHowCreate = alsProjectHowCreate;
        return this;
    }
    public String getAlsProjectHowCreate() {
        return this.alsProjectHowCreate;
    }

    public UpdateAKSClusterLogRequest setAlsProjectName(String alsProjectName) {
        this.alsProjectName = alsProjectName;
        return this;
    }
    public String getAlsProjectName() {
        return this.alsProjectName;
    }

    public UpdateAKSClusterLogRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
