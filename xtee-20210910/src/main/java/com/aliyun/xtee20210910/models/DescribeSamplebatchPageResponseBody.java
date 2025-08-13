// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSamplebatchPageResponseBody extends TeaModel {
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
     * <p>Page size, with a default value of 10</p>
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
    public java.util.List<DescribeSamplebatchPageResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeSamplebatchPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSamplebatchPageResponseBody self = new DescribeSamplebatchPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSamplebatchPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSamplebatchPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSamplebatchPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSamplebatchPageResponseBody setResultObject(java.util.List<DescribeSamplebatchPageResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSamplebatchPageResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSamplebatchPageResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSamplebatchPageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSamplebatchPageResponseBodyResultObject extends TeaModel {
        /**
         * <p>Sample batch name</p>
         * 
         * <strong>example:</strong>
         * <p>白样本</p>
         */
        @NameInMap("batchName")
        public String batchName;

        /**
         * <p>Creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>Data type</p>
         * 
         * <strong>example:</strong>
         * <p>mobile</p>
         */
        @NameInMap("dataType")
        public String dataType;

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
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
         * <p>Modification time</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Valid sample content data</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("initValidFileRow")
        public Long initValidFileRow;

        /**
         * <p>Specific type of the sample list</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("sampleBatchType")
        public String sampleBatchType;

        /**
         * <p>Service ID</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse</p>
         */
        @NameInMap("services")
        public String services;

        /**
         * <p>Modifier</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("updator")
        public String updator;

        /**
         * <p>Sample batch UUID</p>
         * 
         * <strong>example:</strong>
         * <p>203f1ae65c0a41a49dc4f8a47946caa2</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static DescribeSamplebatchPageResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSamplebatchPageResponseBodyResultObject self = new DescribeSamplebatchPageResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSamplebatchPageResponseBodyResultObject setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }
        public String getBatchName() {
            return this.batchName;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setInitValidFileRow(Long initValidFileRow) {
            this.initValidFileRow = initValidFileRow;
            return this;
        }
        public Long getInitValidFileRow() {
            return this.initValidFileRow;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setSampleBatchType(String sampleBatchType) {
            this.sampleBatchType = sampleBatchType;
            return this;
        }
        public String getSampleBatchType() {
            return this.sampleBatchType;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setServices(String services) {
            this.services = services;
            return this;
        }
        public String getServices() {
            return this.services;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setUpdator(String updator) {
            this.updator = updator;
            return this;
        }
        public String getUpdator() {
            return this.updator;
        }

        public DescribeSamplebatchPageResponseBodyResultObject setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
