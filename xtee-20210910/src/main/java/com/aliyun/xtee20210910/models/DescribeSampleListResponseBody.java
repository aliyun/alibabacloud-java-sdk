// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleListResponseBody extends TeaModel {
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
    public java.util.List<DescribeSampleListResponseBodyResultObject> resultObject;

    /**
     * <p>Total count.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total pages</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeSampleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleListResponseBody self = new DescribeSampleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleListResponseBody setResultObject(java.util.List<DescribeSampleListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSampleListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSampleListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSampleListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSampleListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Sample tags.</p>
         * 
         * <strong>example:</strong>
         * <p>rm0102</p>
         */
        @NameInMap("sampleTags")
        public String sampleTags;

        /**
         * <p>Sample type</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE</p>
         */
        @NameInMap("sampleType")
        public Integer sampleType;

        /**
         * <p>Sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>1770000000</p>
         */
        @NameInMap("sampleValue")
        public String sampleValue;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1699450018265</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        public static DescribeSampleListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSampleListResponseBodyResultObject self = new DescribeSampleListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSampleListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSampleListResponseBodyResultObject setSampleTags(String sampleTags) {
            this.sampleTags = sampleTags;
            return this;
        }
        public String getSampleTags() {
            return this.sampleTags;
        }

        public DescribeSampleListResponseBodyResultObject setSampleType(Integer sampleType) {
            this.sampleType = sampleType;
            return this;
        }
        public Integer getSampleType() {
            return this.sampleType;
        }

        public DescribeSampleListResponseBodyResultObject setSampleValue(String sampleValue) {
            this.sampleValue = sampleValue;
            return this;
        }
        public String getSampleValue() {
            return this.sampleValue;
        }

        public DescribeSampleListResponseBodyResultObject setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSampleListResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
