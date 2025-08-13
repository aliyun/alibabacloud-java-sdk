// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDataPageResponseBody extends TeaModel {
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
     * <p>Number of items per page, default is 10.</p>
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
    public java.util.List<DescribeSampleDataPageResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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

    public static DescribeSampleDataPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataPageResponseBody self = new DescribeSampleDataPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleDataPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleDataPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleDataPageResponseBody setResultObject(java.util.List<DescribeSampleDataPageResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSampleDataPageResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSampleDataPageResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSampleDataPageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSampleDataPageResponseBodyResultObject extends TeaModel {
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
         * <p>Content of the list entered in the text box</p>
         * 
         * <strong>example:</strong>
         * <p>1770000000</p>
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
         * <p>Modifier</p>
         * 
         * <strong>example:</strong>
         * <p>1519714049632764</p>
         */
        @NameInMap("updator")
        public String updator;

        /**
         * <p>UUID of the sample batch</p>
         * 
         * <strong>example:</strong>
         * <p>48653f1372444c078f7b3d1c317d37dc</p>
         */
        @NameInMap("uuid")
        public String uuid;

        /**
         * <p>Version number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        public static DescribeSampleDataPageResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSampleDataPageResponseBodyResultObject self = new DescribeSampleDataPageResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSampleDataPageResponseBodyResultObject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeSampleDataPageResponseBodyResultObject setDataTagType(String dataTagType) {
            this.dataTagType = dataTagType;
            return this;
        }
        public String getDataTagType() {
            return this.dataTagType;
        }

        public DescribeSampleDataPageResponseBodyResultObject setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public DescribeSampleDataPageResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSampleDataPageResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSampleDataPageResponseBodyResultObject setLastSourceType(String lastSourceType) {
            this.lastSourceType = lastSourceType;
            return this;
        }
        public String getLastSourceType() {
            return this.lastSourceType;
        }

        public DescribeSampleDataPageResponseBodyResultObject setUpdator(String updator) {
            this.updator = updator;
            return this;
        }
        public String getUpdator() {
            return this.updator;
        }

        public DescribeSampleDataPageResponseBodyResultObject setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeSampleDataPageResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
