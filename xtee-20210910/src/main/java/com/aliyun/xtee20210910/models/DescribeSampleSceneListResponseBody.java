// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleSceneListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeSampleSceneListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeSampleSceneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleSceneListResponseBody self = new DescribeSampleSceneListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleSceneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleSceneListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleSceneListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleSceneListResponseBody setResultObject(java.util.List<DescribeSampleSceneListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSampleSceneListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSampleSceneListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSampleSceneListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSampleSceneListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Business type.</p>
         * 
         * <strong>example:</strong>
         * <p>variable_scene</p>
         */
        @NameInMap("bizType")
        public String bizType;

        /**
         * <p>Configuration key.</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse_detection</p>
         */
        @NameInMap("configKey")
        public String configKey;

        /**
         * <p>Configuration value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("configValue")
        public String configValue;

        /**
         * <p>Creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3144</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Last modified by.</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("lastModifiedOperator")
        public String lastModifiedOperator;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeSampleSceneListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSampleSceneListResponseBodyResultObject self = new DescribeSampleSceneListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSampleSceneListResponseBodyResultObject setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeSampleSceneListResponseBodyResultObject setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public DescribeSampleSceneListResponseBodyResultObject setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public DescribeSampleSceneListResponseBodyResultObject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeSampleSceneListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSampleSceneListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSampleSceneListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSampleSceneListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSampleSceneListResponseBodyResultObject setLastModifiedOperator(String lastModifiedOperator) {
            this.lastModifiedOperator = lastModifiedOperator;
            return this;
        }
        public String getLastModifiedOperator() {
            return this.lastModifiedOperator;
        }

        public DescribeSampleSceneListResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
