// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalTextResponseBody extends TeaModel {
    /**
     * <p>SUCCESS indicates success. In case of failure, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The folder ID.</p>
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
     * <p>2026-05-22 18:18:56</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance i-0jl6hlcbtuo4eqg7puni not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The updated filter view name.</p>
     * 
     * <strong>example:</strong>
     * <p>p-toolset-3dcef7ca-31b9-4d1c-8692-1ef03099cad3</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04EE99E6-A0D9-5B04-81D1-7BEC0CB0AFDF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The travel scale of the integration partner.</p>
     * 
     * <strong>example:</strong>
     * <p>read:user,read:repo,write:repo,read:org,read:group</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2000398</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The filter status.</p>
     * <ul>
     * <li><p>0: All</p>
     * </li>
     * <li><p>1: Unconfirmed</p>
     * </li>
     * <li><p>3: Ignored</p>
     * </li>
     * <li><p>4: Rejected</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;observedGeneration\&quot;: 4, \&quot;servicesInstances\&quot;: {}, \&quot;observedTime\&quot;: \&quot;2025-10-31T03:48:27Z\&quot;, \&quot;servicesWithPendingChanges\&quot;: [], \&quot;latestEnvironmentDeploymentName\&quot;: \&quot;manual-1761882507097-Eu1vIP\&quot;}</p>
     */
    @NameInMap("status")
    public String status;

    public static CreatePersonalTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalTextResponseBody self = new CreatePersonalTextResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersonalTextResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePersonalTextResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalTextResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreatePersonalTextResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePersonalTextResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePersonalTextResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreatePersonalTextResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreatePersonalTextResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
