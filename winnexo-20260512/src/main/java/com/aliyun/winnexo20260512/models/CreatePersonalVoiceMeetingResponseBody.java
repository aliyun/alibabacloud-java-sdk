// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalVoiceMeetingResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The bound directory ID. This value echoes the directoryId provided in the request body. If no directoryId is specified, the value is null because the default root directory is used.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The creation time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-22T08:15:28.000+00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The knowledge base name.</p>
     * 
     * <strong>example:</strong>
     * <p>p-toolset-e95d1287-3d40-487a-bcce-6e6252c7a793</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5241B90-8FF4-565C-977A-0CE1842AED72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource scope. The value is fixed to PERSONAL.</p>
     * 
     * <strong>example:</strong>
     * <p>user_info projects pull_requests hook gists emails</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The unique identifier on the business system side, that is, the business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The resource status. The initial status during the creation process is typically PENDING. If the on_create process fails, the status is FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;observedGeneration\&quot;: 4, \&quot;servicesInstances\&quot;: {}, \&quot;observedTime\&quot;: \&quot;2025-10-31T03:48:27Z\&quot;, \&quot;servicesWithPendingChanges\&quot;: [], \&quot;latestEnvironmentDeploymentName\&quot;: \&quot;manual-1761882507097-Eu1vIP\&quot;}</p>
     */
    @NameInMap("status")
    public String status;

    public static CreatePersonalVoiceMeetingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalVoiceMeetingResponseBody self = new CreatePersonalVoiceMeetingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersonalVoiceMeetingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePersonalVoiceMeetingResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalVoiceMeetingResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreatePersonalVoiceMeetingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePersonalVoiceMeetingResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalVoiceMeetingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePersonalVoiceMeetingResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreatePersonalVoiceMeetingResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreatePersonalVoiceMeetingResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
