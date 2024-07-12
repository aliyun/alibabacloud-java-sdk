// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("OfflineDatasourceId")
    public String offlineDatasourceId;

    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("OfflineLifeCycle")
    public Integer offlineLifeCycle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OnlineDatasourceId")
    public String onlineDatasourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>324</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectRequest setOfflineDatasourceId(String offlineDatasourceId) {
        this.offlineDatasourceId = offlineDatasourceId;
        return this;
    }
    public String getOfflineDatasourceId() {
        return this.offlineDatasourceId;
    }

    public CreateProjectRequest setOfflineLifeCycle(Integer offlineLifeCycle) {
        this.offlineLifeCycle = offlineLifeCycle;
        return this;
    }
    public Integer getOfflineLifeCycle() {
        return this.offlineLifeCycle;
    }

    public CreateProjectRequest setOnlineDatasourceId(String onlineDatasourceId) {
        this.onlineDatasourceId = onlineDatasourceId;
        return this;
    }
    public String getOnlineDatasourceId() {
        return this.onlineDatasourceId;
    }

    public CreateProjectRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
