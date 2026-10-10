// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetGroupSourceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The pipeline description.</p>
     * 
     * <strong>example:</strong>
     * <p>recorder function</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The time when the resource was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-26T10:00:00+08:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the resource was last modified, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-20T14:00:00+08:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The project group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleName.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The permission scope.</p>
     * 
     * <strong>example:</strong>
     * <p>GROUP</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The knowledge base ownership type. Valid values:</p>
     * <ul>
     * <li>aliding_kb_doc: DingTalk knowledge base document.</li>
     * <li>normal: Common knowledge.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceKind")
    public String sourceKind;

    /**
     * <p>The resource tags. This parameter is optional. The value is a JSON string list, such as [&quot;tagA&quot;,&quot;tagB&quot;].</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Important&quot;,&quot;Document&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The type of the resource source. Valid values:</p>
     * <ul>
     * <li>ExportTaskId: The resource export ID.</li>
     * <li>TaskId: The module execution task ID.</li>
     * <li>StatePath: The OSS path where the resource state is stored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The resource status. The initial status during the creation process is typically PENDING. If the on_create operation fails, the status is FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    public static GetGroupSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupSourceResponseBody self = new GetGroupSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGroupSourceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetGroupSourceResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetGroupSourceResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetGroupSourceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetGroupSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGroupSourceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetGroupSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGroupSourceResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetGroupSourceResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetGroupSourceResponseBody setSourceKind(String sourceKind) {
        this.sourceKind = sourceKind;
        return this;
    }
    public String getSourceKind() {
        return this.sourceKind;
    }

    public GetGroupSourceResponseBody setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public GetGroupSourceResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetGroupSourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
