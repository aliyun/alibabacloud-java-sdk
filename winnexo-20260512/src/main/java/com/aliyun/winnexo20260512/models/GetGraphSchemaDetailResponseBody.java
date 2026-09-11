// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetGraphSchemaDetailResponseBody extends TeaModel {
    /**
     * <p>The business description of the graph. An empty string is returned if this parameter is not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer domain semantic graph</p>
     */
    @NameInMap("businessProfile")
    public String businessProfile;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The hash fingerprint of the schema content.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3</p>
     */
    @NameInMap("contentHash")
    public String contentHash;

    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>u001</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>CRM Graph</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T10:00:00+00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The last update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T11:30:00+00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The name of the graph.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The status of the semantic graph.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLISHING: A publish task is in progress for this graph.
     * DEVELOPING: An active draft exists for this graph (being edited, not yet published).
     * PUBLISHED: Normal status</p>
     */
    @NameInMap("graphStatus")
    public String graphStatus;

    /**
     * <p>Indicates whether the graph contains a draft.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasDraft")
    public Boolean hasDraft;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0</p>
     */
    @NameInMap("schemaVersion")
    public String schemaVersion;

    /**
     * <p>The original YAML text of the graph schema trimmed by READ permission. The $ref references within the authorized subgraph are retained.</p>
     * 
     * <strong>example:</strong>
     * <p>name: crm_graph</p>
     */
    @NameInMap("yamlEdit")
    public String yamlEdit;

    public static GetGraphSchemaDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGraphSchemaDetailResponseBody self = new GetGraphSchemaDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGraphSchemaDetailResponseBody setBusinessProfile(String businessProfile) {
        this.businessProfile = businessProfile;
        return this;
    }
    public String getBusinessProfile() {
        return this.businessProfile;
    }

    public GetGraphSchemaDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGraphSchemaDetailResponseBody setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public GetGraphSchemaDetailResponseBody setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public GetGraphSchemaDetailResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetGraphSchemaDetailResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetGraphSchemaDetailResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetGraphSchemaDetailResponseBody setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public GetGraphSchemaDetailResponseBody setGraphStatus(String graphStatus) {
        this.graphStatus = graphStatus;
        return this;
    }
    public String getGraphStatus() {
        return this.graphStatus;
    }

    public GetGraphSchemaDetailResponseBody setHasDraft(Boolean hasDraft) {
        this.hasDraft = hasDraft;
        return this;
    }
    public Boolean getHasDraft() {
        return this.hasDraft;
    }

    public GetGraphSchemaDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGraphSchemaDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGraphSchemaDetailResponseBody setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public GetGraphSchemaDetailResponseBody setYamlEdit(String yamlEdit) {
        this.yamlEdit = yamlEdit;
        return this;
    }
    public String getYamlEdit() {
        return this.yamlEdit;
    }

}
