// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMarkPageResponseBody extends TeaModel {
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
    public java.util.List<DescribeMarkPageResponseBodyResultObject> resultObject;

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

    public static DescribeMarkPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMarkPageResponseBody self = new DescribeMarkPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMarkPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMarkPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMarkPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMarkPageResponseBody setResultObject(java.util.List<DescribeMarkPageResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeMarkPageResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeMarkPageResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeMarkPageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeMarkPageResponseBodyResultObject extends TeaModel {
        /**
         * <p>Field name.</p>
         * 
         * <strong>example:</strong>
         * <p>mobile</p>
         */
        @NameInMap("fieldName")
        public String fieldName;

        /**
         * <p>Field value.</p>
         * 
         * <strong>example:</strong>
         * <p>18000000000</p>
         */
        @NameInMap("fieldValue")
        public String fieldValue;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2793</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Mark (0 No / 1 Yes).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("markType")
        public String markType;

        public static DescribeMarkPageResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeMarkPageResponseBodyResultObject self = new DescribeMarkPageResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeMarkPageResponseBodyResultObject setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeMarkPageResponseBodyResultObject setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public DescribeMarkPageResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeMarkPageResponseBodyResultObject setMarkType(String markType) {
            this.markType = markType;
            return this;
        }
        public String getMarkType() {
            return this.markType;
        }

    }

}
