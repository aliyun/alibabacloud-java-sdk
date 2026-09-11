// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphDraftResourcesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The MCP card list.</p>
     */
    @NameInMap("items")
    public java.util.List<ListGraphDraftResourcesResponseBodyItems> items;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGraphDraftResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGraphDraftResourcesResponseBody self = new ListGraphDraftResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGraphDraftResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGraphDraftResourcesResponseBody setItems(java.util.List<ListGraphDraftResourcesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListGraphDraftResourcesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListGraphDraftResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGraphDraftResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGraphDraftResourcesResponseBodyItems extends TeaModel {
        /**
         * <p>The hash of the draft content itself. The value is a 64-character SHA-256 hexadecimal string.</p>
         * 
         * <strong>example:</strong>
         * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
         */
        @NameInMap("baseContentHash")
        public String baseContentHash;

        /**
         * <p>The active schema version number on which the draft is based.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
         */
        @NameInMap("baseSchemaVersion")
        public String baseSchemaVersion;

        /**
         * <p>The unique ID of the draft change. This ID is referenced when you revoke a draft or publish changes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>401001</p>
         */
        @NameInMap("draftChangeId")
        public Long draftChangeId;

        /**
         * <p>The hash of the online content on which the draft was based when it was saved (draft starting point). The value is a 64-character SHA-256 hexadecimal string.</p>
         * 
         * <strong>example:</strong>
         * <p>a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e</p>
         */
        @NameInMap("draftContentHash")
        public String draftContentHash;

        /**
         * <p>The edit mode. In the current implementation, the value is always YAML, which corresponds to sourceType.</p>
         * 
         * <strong>example:</strong>
         * <p>ADVANCED</p>
         */
        @NameInMap("editMode")
        public String editMode;

        /**
         * <p>The actual publish effect relative to the current online state. After a draft is saved, the online graph may have changed, and the operation intent is adjusted based on the current online state.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("effectiveOperation")
        public String effectiveOperation;

        /**
         * <p>The element type. Currently, only text is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>indicator</p>
         */
        @NameInMap("elementType")
        public String elementType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T09:00:00+00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T10:30:00+00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the draft baseline has expired. The value is true if the hash of the online content at the time the draft was saved is inconsistent with the hash of the current active content. The ONLINE_CHANGED risk is prompted during publishing.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("hasOnlineChanged")
        public Boolean hasOnlineChanged;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("operationType")
        public String operationType;

        /**
         * <p>The resource name of the agent at runtime.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_contract_amount</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>element</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The online risk aggregation JSON text (risk_code / risk_message). The value is null if no risk exists.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;risk_code&quot;: &quot;ONLINE_CHANGED&quot;, &quot;risk_message&quot;: &quot;The online content has changed.&quot;}</p>
         */
        @NameInMap("risk")
        public String risk;

        /**
         * <p>The skill source type.</p>
         * 
         * <strong>example:</strong>
         * <p>YAML</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListGraphDraftResourcesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListGraphDraftResourcesResponseBodyItems self = new ListGraphDraftResourcesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListGraphDraftResourcesResponseBodyItems setBaseContentHash(String baseContentHash) {
            this.baseContentHash = baseContentHash;
            return this;
        }
        public String getBaseContentHash() {
            return this.baseContentHash;
        }

        public ListGraphDraftResourcesResponseBodyItems setBaseSchemaVersion(String baseSchemaVersion) {
            this.baseSchemaVersion = baseSchemaVersion;
            return this;
        }
        public String getBaseSchemaVersion() {
            return this.baseSchemaVersion;
        }

        public ListGraphDraftResourcesResponseBodyItems setDraftChangeId(Long draftChangeId) {
            this.draftChangeId = draftChangeId;
            return this;
        }
        public Long getDraftChangeId() {
            return this.draftChangeId;
        }

        public ListGraphDraftResourcesResponseBodyItems setDraftContentHash(String draftContentHash) {
            this.draftContentHash = draftContentHash;
            return this;
        }
        public String getDraftContentHash() {
            return this.draftContentHash;
        }

        public ListGraphDraftResourcesResponseBodyItems setEditMode(String editMode) {
            this.editMode = editMode;
            return this;
        }
        public String getEditMode() {
            return this.editMode;
        }

        public ListGraphDraftResourcesResponseBodyItems setEffectiveOperation(String effectiveOperation) {
            this.effectiveOperation = effectiveOperation;
            return this;
        }
        public String getEffectiveOperation() {
            return this.effectiveOperation;
        }

        public ListGraphDraftResourcesResponseBodyItems setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public ListGraphDraftResourcesResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGraphDraftResourcesResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGraphDraftResourcesResponseBodyItems setHasOnlineChanged(Boolean hasOnlineChanged) {
            this.hasOnlineChanged = hasOnlineChanged;
            return this;
        }
        public Boolean getHasOnlineChanged() {
            return this.hasOnlineChanged;
        }

        public ListGraphDraftResourcesResponseBodyItems setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListGraphDraftResourcesResponseBodyItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListGraphDraftResourcesResponseBodyItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListGraphDraftResourcesResponseBodyItems setRisk(String risk) {
            this.risk = risk;
            return this;
        }
        public String getRisk() {
            return this.risk;
        }

        public ListGraphDraftResourcesResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
