// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGraphsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of MCP cards.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<ListGraphsResponseBodyItems> items;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
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

    public static ListGraphsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGraphsResponseBody self = new ListGraphsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGraphsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGraphsResponseBody setItems(java.util.List<ListGraphsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListGraphsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListGraphsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGraphsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGraphsResponseBodyItems extends TeaModel {
        /**
         * <p>The business description of the knowledge graph. An empty string is returned if not configured.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("businessProfile")
        public String businessProfile;

        /**
         * <p>The tool display name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The knowledge graph name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>Indicates whether this is the default group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDefault")
        public Boolean isDefault;

        public static ListGraphsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListGraphsResponseBodyItems self = new ListGraphsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListGraphsResponseBodyItems setBusinessProfile(String businessProfile) {
            this.businessProfile = businessProfile;
            return this;
        }
        public String getBusinessProfile() {
            return this.businessProfile;
        }

        public ListGraphsResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListGraphsResponseBodyItems setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ListGraphsResponseBodyItems setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

}
