// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphSchemasResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The location clustering.</p>
     */
    @NameInMap("items")
    public java.util.List<ListGraphSchemasResponseBodyItems> items;

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

    public static ListGraphSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGraphSchemasResponseBody self = new ListGraphSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGraphSchemasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGraphSchemasResponseBody setItems(java.util.List<ListGraphSchemasResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListGraphSchemasResponseBodyItems> getItems() {
        return this.items;
    }

    public ListGraphSchemasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGraphSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGraphSchemasResponseBodyItems extends TeaModel {
        /**
         * <p>The currently active schema version number. The value is 0.0.0 for a quick-created placeholder graph.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        @NameInMap("activeVersion")
        public String activeVersion;

        /**
         * <p>The business description of the graph. An empty string is returned if this parameter is not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer domain semantic graph</p>
         */
        @NameInMap("businessProfile")
        public String businessProfile;

        /**
         * <p>The display name of the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>CRM Graph</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The graph name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>The status of the semantic graph.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("graphStatus")
        public String graphStatus;

        /**
         * <p>Indicates whether the graph contains a draft.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasDraft")
        public Boolean hasDraft;

        /**
         * <p>Indicates whether this is the default group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isDefault")
        public Boolean isDefault;

        /**
         * <p>The number of object types. The value falls back to 0 if parsing fails.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("objectTypeCount")
        public Long objectTypeCount;

        /**
         * <p>The number of relations. The value falls back to 0 if parsing fails.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("relationCount")
        public Long relationCount;

        /**
         * <p>The list of semantic tags. An empty array [] is returned if this parameter is not configured.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("semanticTags")
        public java.util.List<String> semanticTags;

        public static ListGraphSchemasResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListGraphSchemasResponseBodyItems self = new ListGraphSchemasResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListGraphSchemasResponseBodyItems setActiveVersion(String activeVersion) {
            this.activeVersion = activeVersion;
            return this;
        }
        public String getActiveVersion() {
            return this.activeVersion;
        }

        public ListGraphSchemasResponseBodyItems setBusinessProfile(String businessProfile) {
            this.businessProfile = businessProfile;
            return this;
        }
        public String getBusinessProfile() {
            return this.businessProfile;
        }

        public ListGraphSchemasResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListGraphSchemasResponseBodyItems setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ListGraphSchemasResponseBodyItems setGraphStatus(String graphStatus) {
            this.graphStatus = graphStatus;
            return this;
        }
        public String getGraphStatus() {
            return this.graphStatus;
        }

        public ListGraphSchemasResponseBodyItems setHasDraft(Boolean hasDraft) {
            this.hasDraft = hasDraft;
            return this;
        }
        public Boolean getHasDraft() {
            return this.hasDraft;
        }

        public ListGraphSchemasResponseBodyItems setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListGraphSchemasResponseBodyItems setObjectTypeCount(Long objectTypeCount) {
            this.objectTypeCount = objectTypeCount;
            return this;
        }
        public Long getObjectTypeCount() {
            return this.objectTypeCount;
        }

        public ListGraphSchemasResponseBodyItems setRelationCount(Long relationCount) {
            this.relationCount = relationCount;
            return this;
        }
        public Long getRelationCount() {
            return this.relationCount;
        }

        public ListGraphSchemasResponseBodyItems setSemanticTags(java.util.List<String> semanticTags) {
            this.semanticTags = semanticTags;
            return this;
        }
        public java.util.List<String> getSemanticTags() {
            return this.semanticTags;
        }

    }

}
