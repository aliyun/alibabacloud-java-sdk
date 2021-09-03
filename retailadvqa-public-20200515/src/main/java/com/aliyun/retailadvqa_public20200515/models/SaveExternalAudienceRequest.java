// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SaveExternalAudienceRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("AudienceId")
    public String audienceId;

    @NameInMap("AudienceName")
    public String audienceName;

    @NameInMap("MappingType")
    public String mappingType;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SaveExternalAudienceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveExternalAudienceRequest self = new SaveExternalAudienceRequest();
        return TeaModel.build(map, self);
    }

    public SaveExternalAudienceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public SaveExternalAudienceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public SaveExternalAudienceRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

    public SaveExternalAudienceRequest setAudienceName(String audienceName) {
        this.audienceName = audienceName;
        return this;
    }
    public String getAudienceName() {
        return this.audienceName;
    }

    public SaveExternalAudienceRequest setMappingType(String mappingType) {
        this.mappingType = mappingType;
        return this;
    }
    public String getMappingType() {
        return this.mappingType;
    }

    public SaveExternalAudienceRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public SaveExternalAudienceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
