// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListCapabilitiesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Long httpCode;

    /**
     * <p>The number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>G5FG/nXfNOQ=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5950143C-B8F0-5758-A08A-66F302FD587F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<ListCapabilitiesResponseBodyResult> result;

    /**
     * <p>The request status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListCapabilitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCapabilitiesResponseBody self = new ListCapabilitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCapabilitiesResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ListCapabilitiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCapabilitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCapabilitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCapabilitiesResponseBody setResult(java.util.List<ListCapabilitiesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCapabilitiesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListCapabilitiesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCapabilitiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCapabilitiesResponseBodyResult extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1729665694</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>Indicates whether the configuration is the default configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isDefault")
        public Boolean isDefault;

        /**
         * <p>The configuration category.</p>
         * 
         * <strong>example:</strong>
         * <p>ai_search_agent</p>
         */
        @NameInMap("itemCategory")
        public String itemCategory;

        /**
         * <p>The configuration description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("itemDesc")
        public String itemDesc;

        /**
         * <p>The configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>es_knowledge_base</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <p>itemValue</p>
         */
        @NameInMap("itemValue")
        public java.util.Map<String, ?> itemValue;

        /**
         * <p>status</p>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>updated</p>
         * 
         * <strong>example:</strong>
         * <p>1729665694</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static ListCapabilitiesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCapabilitiesResponseBodyResult self = new ListCapabilitiesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCapabilitiesResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListCapabilitiesResponseBodyResult setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListCapabilitiesResponseBodyResult setItemCategory(String itemCategory) {
            this.itemCategory = itemCategory;
            return this;
        }
        public String getItemCategory() {
            return this.itemCategory;
        }

        public ListCapabilitiesResponseBodyResult setItemDesc(String itemDesc) {
            this.itemDesc = itemDesc;
            return this;
        }
        public String getItemDesc() {
            return this.itemDesc;
        }

        public ListCapabilitiesResponseBodyResult setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public ListCapabilitiesResponseBodyResult setItemValue(java.util.Map<String, ?> itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public java.util.Map<String, ?> getItemValue() {
            return this.itemValue;
        }

        public ListCapabilitiesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCapabilitiesResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
