// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DescribeCapabilityResponseBody extends TeaModel {
    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Long httpCode;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>0E3D5E2B-B63A-4445-B359-329CC07255EA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Response result</p>
     */
    @NameInMap("result")
    public DescribeCapabilityResponseBodyResult result;

    /**
     * <p>Request status</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("status")
    public String status;

    public static DescribeCapabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapabilityResponseBody self = new DescribeCapabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapabilityResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public DescribeCapabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCapabilityResponseBody setResult(DescribeCapabilityResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeCapabilityResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeCapabilityResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeCapabilityResponseBodyResult extends TeaModel {
        /**
         * <p>Timestamp of creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1745893195510</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>Whether it is the default configuration</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isDefault")
        public Boolean isDefault;

        /**
         * <p>Configuration category</p>
         * 
         * <strong>example:</strong>
         * <p>ai_search_agent</p>
         */
        @NameInMap("itemCategory")
        public String itemCategory;

        /**
         * <p>Configuration description</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("itemDesc")
        public String itemDesc;

        /**
         * <p>Configuration name</p>
         * 
         * <strong>example:</strong>
         * <p>es_knowledge_base</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <p>An object containing information such as endpoint and function, which describes the detailed configuration of the knowledge base.</p>
         */
        @NameInMap("itemValue")
        public java.util.Map<String, ?> itemValue;

        /**
         * <p>Status</p>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Update timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1729665694</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static DescribeCapabilityResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapabilityResponseBodyResult self = new DescribeCapabilityResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeCapabilityResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public DescribeCapabilityResponseBodyResult setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeCapabilityResponseBodyResult setItemCategory(String itemCategory) {
            this.itemCategory = itemCategory;
            return this;
        }
        public String getItemCategory() {
            return this.itemCategory;
        }

        public DescribeCapabilityResponseBodyResult setItemDesc(String itemDesc) {
            this.itemDesc = itemDesc;
            return this;
        }
        public String getItemDesc() {
            return this.itemDesc;
        }

        public DescribeCapabilityResponseBodyResult setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeCapabilityResponseBodyResult setItemValue(java.util.Map<String, ?> itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public java.util.Map<String, ?> getItemValue() {
            return this.itemValue;
        }

        public DescribeCapabilityResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCapabilityResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
