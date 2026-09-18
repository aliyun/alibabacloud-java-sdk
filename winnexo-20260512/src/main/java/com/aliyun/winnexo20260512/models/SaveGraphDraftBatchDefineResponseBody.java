// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGraphDraftBatchDefineResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The graph name.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The list of MCP cards.</p>
     */
    @NameInMap("items")
    public java.util.List<SaveGraphDraftBatchDefineResponseBodyItems> items;

    /**
     * <p>The status code description.</p>
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

    /**
     * <p>The save mode.</p>
     * 
     * <strong>example:</strong>
     * <p>FULL_YAML</p>
     */
    @NameInMap("saveMode")
    public String saveMode;

    /**
     * <p>The number of saved items.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("savedCount")
    public Integer savedCount;

    public static SaveGraphDraftBatchDefineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveGraphDraftBatchDefineResponseBody self = new SaveGraphDraftBatchDefineResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveGraphDraftBatchDefineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveGraphDraftBatchDefineResponseBody setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public SaveGraphDraftBatchDefineResponseBody setItems(java.util.List<SaveGraphDraftBatchDefineResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<SaveGraphDraftBatchDefineResponseBodyItems> getItems() {
        return this.items;
    }

    public SaveGraphDraftBatchDefineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveGraphDraftBatchDefineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveGraphDraftBatchDefineResponseBody setSaveMode(String saveMode) {
        this.saveMode = saveMode;
        return this;
    }
    public String getSaveMode() {
        return this.saveMode;
    }

    public SaveGraphDraftBatchDefineResponseBody setSavedCount(Integer savedCount) {
        this.savedCount = savedCount;
        return this;
    }
    public Integer getSavedCount() {
        return this.savedCount;
    }

    public static class SaveGraphDraftBatchDefineResponseBodyItems extends TeaModel {
        /**
         * <p>The hash of the draft content itself, a 64-character SHA-256 hexadecimal string.</p>
         * 
         * <strong>example:</strong>
         * <p>a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e</p>
         */
        @NameInMap("baseContentHash")
        public String baseContentHash;

        /**
         * <p>The active schema version number on which the draft is based.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.3</p>
         */
        @NameInMap("baseSchemaVersion")
        public String baseSchemaVersion;

        /**
         * <p>The unique draft change ID, referenced when revoking drafts or publishing.</p>
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
         * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
         */
        @NameInMap("draftContentHash")
        public String draftContentHash;

        /**
         * <p>The element type. Currently, only text is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>object_type</p>
         */
        @NameInMap("elementType")
        public String elementType;

        /**
         * <p>The update time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-11T10:30:00+00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("operationType")
        public String operationType;

        /**
         * <p>The resource name of the agent runtime.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("resourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>object</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>BATCH_DEFINE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static SaveGraphDraftBatchDefineResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            SaveGraphDraftBatchDefineResponseBodyItems self = new SaveGraphDraftBatchDefineResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setBaseContentHash(String baseContentHash) {
            this.baseContentHash = baseContentHash;
            return this;
        }
        public String getBaseContentHash() {
            return this.baseContentHash;
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setBaseSchemaVersion(String baseSchemaVersion) {
            this.baseSchemaVersion = baseSchemaVersion;
            return this;
        }
        public String getBaseSchemaVersion() {
            return this.baseSchemaVersion;
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setDraftChangeId(Long draftChangeId) {
            this.draftChangeId = draftChangeId;
            return this;
        }
        public Long getDraftChangeId() {
            return this.draftChangeId;
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setDraftContentHash(String draftContentHash) {
            this.draftContentHash = draftContentHash;
            return this;
        }
        public String getDraftContentHash() {
            return this.draftContentHash;
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public SaveGraphDraftBatchDefineResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
