// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGraphDraftResourceResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* / InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The draft change ID (the draftChangeId returned by listGraphDraftResources).</p>
     * 
     * <strong>example:</strong>
     * <p>401001</p>
     */
    @NameInMap("draftChangeId")
    public Long draftChangeId;

    /**
     * <p>The online content hash on which the draft save is based (draft starting point), a 64-character SHA-256 hexadecimal string.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:abc123</p>
     */
    @NameInMap("draftContentHash")
    public String draftContentHash;

    /**
     * <p>The element type. Currently, only text is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>object_type</p>
     */
    @NameInMap("elementType")
    public String elementType;

    /**
     * <p>The last modified time in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T10:30:00+00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The graph name.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The operation type.</p>
     * 
     * <strong>example:</strong>
     * <p>UPDATE</p>
     */
    @NameInMap("operationType")
    public String operationType;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource name.</p>
     * 
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>object</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static SaveGraphDraftResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveGraphDraftResourceResponseBody self = new SaveGraphDraftResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveGraphDraftResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveGraphDraftResourceResponseBody setDraftChangeId(Long draftChangeId) {
        this.draftChangeId = draftChangeId;
        return this;
    }
    public Long getDraftChangeId() {
        return this.draftChangeId;
    }

    public SaveGraphDraftResourceResponseBody setDraftContentHash(String draftContentHash) {
        this.draftContentHash = draftContentHash;
        return this;
    }
    public String getDraftContentHash() {
        return this.draftContentHash;
    }

    public SaveGraphDraftResourceResponseBody setElementType(String elementType) {
        this.elementType = elementType;
        return this;
    }
    public String getElementType() {
        return this.elementType;
    }

    public SaveGraphDraftResourceResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SaveGraphDraftResourceResponseBody setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public SaveGraphDraftResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveGraphDraftResourceResponseBody setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SaveGraphDraftResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveGraphDraftResourceResponseBody setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public SaveGraphDraftResourceResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
