// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>folder-12321313</p>
     */
    @NameInMap("DestFolderId")
    public String destFolderId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOwner")
    public Boolean isOwner;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("SourceExpId")
    public Long sourceExpId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UpdateIfExists")
    public Boolean updateIfExists;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
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
