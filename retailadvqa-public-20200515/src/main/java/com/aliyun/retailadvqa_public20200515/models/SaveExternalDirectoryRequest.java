// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SaveExternalDirectoryRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("ParentDirectoryId")
    public String parentDirectoryId;

    @NameInMap("DirectoryName")
    public String directoryName;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("AccessId")
    public String accessId;

    public static SaveExternalDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveExternalDirectoryRequest self = new SaveExternalDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public SaveExternalDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SaveExternalDirectoryRequest setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public SaveExternalDirectoryRequest setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }
    public String getDirectoryName() {
        return this.directoryName;
    }

    public SaveExternalDirectoryRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SaveExternalDirectoryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SaveExternalDirectoryRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

}
