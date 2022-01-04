// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentsRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("DestFolderId")
    public String destFolderId;

    @NameInMap("IsOwner")
    public Boolean isOwner;

    @NameInMap("SourceExpId")
    public Long sourceExpId;

    @NameInMap("UpdateIfExists")
    public Boolean updateIfExists;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static MigrateExperimentsRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateExperimentsRequest self = new MigrateExperimentsRequest();
        return TeaModel.build(map, self);
    }

    public MigrateExperimentsRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public MigrateExperimentsRequest setDestFolderId(String destFolderId) {
        this.destFolderId = destFolderId;
        return this;
    }
    public String getDestFolderId() {
        return this.destFolderId;
    }

    public MigrateExperimentsRequest setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }
    public Boolean getIsOwner() {
        return this.isOwner;
    }

    public MigrateExperimentsRequest setSourceExpId(Long sourceExpId) {
        this.sourceExpId = sourceExpId;
        return this;
    }
    public Long getSourceExpId() {
        return this.sourceExpId;
    }

    public MigrateExperimentsRequest setUpdateIfExists(Boolean updateIfExists) {
        this.updateIfExists = updateIfExists;
        return this;
    }
    public Boolean getUpdateIfExists() {
        return this.updateIfExists;
    }

    public MigrateExperimentsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
