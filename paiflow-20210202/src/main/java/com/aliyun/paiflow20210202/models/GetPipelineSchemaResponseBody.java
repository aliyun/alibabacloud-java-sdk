// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetPipelineSchemaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("Version")
    public String version;

    @NameInMap("Manifest")
    public String manifest;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetPipelineSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineSchemaResponseBody self = new GetPipelineSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineSchemaResponseBody setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public GetPipelineSchemaResponseBody setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GetPipelineSchemaResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public GetPipelineSchemaResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetPipelineSchemaResponseBody setManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }
    public String getManifest() {
        return this.manifest;
    }

    public GetPipelineSchemaResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetPipelineSchemaResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetPipelineSchemaResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GetPipelineSchemaResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
