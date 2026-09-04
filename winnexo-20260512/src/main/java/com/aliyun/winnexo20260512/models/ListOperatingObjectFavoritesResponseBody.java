// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListOperatingObjectFavoritesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The graph name. Call listGraphs to retrieve available graphs.</p>
     * 
     * <strong>example:</strong>
     * <p>crm</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>Indicates whether more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The MCP card list.</p>
     */
    @NameInMap("items")
    public java.util.List<ListOperatingObjectFavoritesResponseBodyItems> items;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination cursor.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ2IjoxLCJpZCI6OTAyfQ.c2lnbmF0dXJlX2V4YW1wbGU</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
     * 
     * <strong>example:</strong>
     * <p>contract</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>The digital employee name (operating object name).</p>
     * 
     * <strong>example:</strong>
     * <p>customer_assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListOperatingObjectFavoritesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperatingObjectFavoritesResponseBody self = new ListOperatingObjectFavoritesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperatingObjectFavoritesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOperatingObjectFavoritesResponseBody setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public ListOperatingObjectFavoritesResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListOperatingObjectFavoritesResponseBody setItems(java.util.List<ListOperatingObjectFavoritesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListOperatingObjectFavoritesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListOperatingObjectFavoritesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOperatingObjectFavoritesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOperatingObjectFavoritesResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ListOperatingObjectFavoritesResponseBody setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListOperatingObjectFavoritesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOperatingObjectFavoritesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperatingObjectFavoritesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListOperatingObjectFavoritesResponseBodyItems extends TeaModel {
        /**
         * <p>The to-do card type description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The follow time. The value is a Unix timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787822400</p>
         */
        @NameInMap("followedAt")
        public Long followedAt;

        /**
         * <p>The graph name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>The ID of the recommended item. The value can be a <strong>feedId</strong> or a micro-application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2676</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>469ac312-403c-41fb-aae3-de5260e30906</p>
         */
        @NameInMap("objectName")
        public String objectName;

        /**
         * <p>The bound object type, such as customer or project.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static ListOperatingObjectFavoritesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListOperatingObjectFavoritesResponseBodyItems self = new ListOperatingObjectFavoritesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListOperatingObjectFavoritesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOperatingObjectFavoritesResponseBodyItems setFollowedAt(Long followedAt) {
            this.followedAt = followedAt;
            return this;
        }
        public Long getFollowedAt() {
            return this.followedAt;
        }

        public ListOperatingObjectFavoritesResponseBodyItems setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public ListOperatingObjectFavoritesResponseBodyItems setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListOperatingObjectFavoritesResponseBodyItems setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListOperatingObjectFavoritesResponseBodyItems setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

}
