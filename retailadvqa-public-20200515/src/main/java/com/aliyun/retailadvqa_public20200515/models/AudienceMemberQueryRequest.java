// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class AudienceMemberQueryRequest extends TeaModel {
    @NameInMap("AudienceId")
    public String audienceId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("MappingTypes")
    public String mappingTypes;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("Delimiter")
    public String delimiter;

    public static AudienceMemberQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        AudienceMemberQueryRequest self = new AudienceMemberQueryRequest();
        return TeaModel.build(map, self);
    }

    public AudienceMemberQueryRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

    public AudienceMemberQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AudienceMemberQueryRequest setMappingTypes(String mappingTypes) {
        this.mappingTypes = mappingTypes;
        return this;
    }
    public String getMappingTypes() {
        return this.mappingTypes;
    }

    public AudienceMemberQueryRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public AudienceMemberQueryRequest setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

}
