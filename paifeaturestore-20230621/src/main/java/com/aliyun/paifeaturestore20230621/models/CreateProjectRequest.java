// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <p>The description of the project. This description is displayed in the PAI console.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the project. The name must be unique within the instance. It must be 2 to 18 characters long, begin with a letter, and contain only letters, digits, and underscores (<em>). Regex: ^[a-zA-Z][a-zA-Z0-9</em>]+$.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the offline data source, which must be of the <strong>MaxCompute</strong> type. You can call the ListDatasources operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("OfflineDatasourceId")
    public String offlineDatasourceId;

    /**
     * <p>The retention period in days for offline tables created by FeatureStore. This setting does not affect existing tables registered with the RegisterTable operation. A default value of 0 means the tables are never automatically deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("OfflineLifeCycle")
    public Integer offlineLifeCycle;

    /**
     * <p>The ID of the online data source. The data source type must be <strong>Hologres</strong>, <strong>Tablestore</strong>, or <strong>FeatureDB</strong>. You can call the ListDatasources operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OnlineDatasourceId")
    public String onlineDatasourceId;

    /**
     * <p>The ID of the PAI workspace. You can call the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation to obtain this ID.</p>
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
