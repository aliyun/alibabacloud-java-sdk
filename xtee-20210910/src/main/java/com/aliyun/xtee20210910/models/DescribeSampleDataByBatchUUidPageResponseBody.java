// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataByBatchUUidPageResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
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
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeSampleDataByBatchUUidPageResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
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

    public static DescribeSampleDataByBatchUUidPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataByBatchUUidPageResponseBody self = new DescribeSampleDataByBatchUUidPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataByBatchUUidPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleDataByBatchUUidPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleDataByBatchUUidPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleDataByBatchUUidPageResponseBody setResultObject(java.util.List<DescribeSampleDataByBatchUUidPageResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSampleDataByBatchUUidPageResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSampleDataByBatchUUidPageResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSampleDataByBatchUUidPageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSampleDataByBatchUUidPageResponseBodyResultObject extends TeaModel {
        /**
         * <p>Sample batch name</p>
         * 
         * <strong>example:</strong>
         * <p>白样本</p>
         */
        @NameInMap("batchName")
        public String batchName;

        /**
         * <p>Creator</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>Sample type</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("dataTagType")
        public String dataTagType;

        /**
         * <p>Data content</p>
         * 
         * <strong>example:</strong>
         * <p>177000001</p>
         */
        @NameInMap("dataValue")
        public String dataValue;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Last source</p>
         * 
         * <strong>example:</strong>
         * <p>Console-Text</p>
         */
        @NameInMap("lastSourceType")
        public String lastSourceType;

        /**
         * <p>Sample batch UUID</p>
         * 
         * <strong>example:</strong>
         * <p>203f1ae65c0a41a49dc4f8a47946caa2</p>
         */
        @NameInMap("uuid")
        public String uuid;

        /**
         * <p>Version</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        public static DescribeSampleDataByBatchUUidPageResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSampleDataByBatchUUidPageResponseBodyResultObject self = new DescribeSampleDataByBatchUUidPageResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSampleDataByBatchUUidPageResponseBodyResultObject setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }
        public String getBatchName() {
            return this.batchName;
        }

        public DescribeSampleDataByBatchUUidPageResponseBodyResultObject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeSampleDataByBatchUUidPageResponseBodyResultObject setDataTagType(String dataTagType) {
            this.dataTagType = dataTagType;
            return this;
        }
        public String getDataTagType() {
            return this.dataTagType;
        }

        public DescribeSampleDataByBatchUUidPageResponseBodyResultObject setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public DescribeSampleDataByBatchUUidPageResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSampleDataByBatchUUidPageResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSampleDataByBatchUUidPageResponseBodyResultObject setLastSourceType(String lastSourceType) {
            this.lastSourceType = lastSourceType;
            return this;
        }
        public String getLastSourceType() {
            return this.lastSourceType;
        }

        public DescribeSampleDataByBatchUUidPageResponseBodyResultObject setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeSampleDataByBatchUUidPageResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
