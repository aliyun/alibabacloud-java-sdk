// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGraphInfoResponseBody extends TeaModel {
    /**
     * <p>The business description of the knowledge graph. If not configured, the value is an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer domain knowledge graph</p>
     */
    @NameInMap("businessProfile")
    public String businessProfile;

    /**
     * <p>SUCCESS indicates success. In failure cases, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The display name of the knowledge graph.</p>
     * 
     * <strong>example:</strong>
     * <p>CRM Graph</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the knowledge graph.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The description of the status code.</p>
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
     * <p>The updated items.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("updated")
    public Boolean updated;

    public static UpdateGraphInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGraphInfoResponseBody self = new UpdateGraphInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGraphInfoResponseBody setBusinessProfile(String businessProfile) {
        this.businessProfile = businessProfile;
        return this;
    }
    public String getBusinessProfile() {
        return this.businessProfile;
    }

    public UpdateGraphInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGraphInfoResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateGraphInfoResponseBody setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public UpdateGraphInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGraphInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGraphInfoResponseBody setUpdated(Boolean updated) {
        this.updated = updated;
        return this;
    }
    public Boolean getUpdated() {
        return this.updated;
    }

}
