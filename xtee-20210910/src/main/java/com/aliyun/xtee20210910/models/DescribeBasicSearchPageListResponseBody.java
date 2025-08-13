// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeBasicSearchPageListResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public DescribeBasicSearchPageListResponseBodyResultObject resultObject;

    public static DescribeBasicSearchPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBasicSearchPageListResponseBody self = new DescribeBasicSearchPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBasicSearchPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBasicSearchPageListResponseBody setResultObject(DescribeBasicSearchPageListResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeBasicSearchPageListResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeBasicSearchPageListResponseBodyResultObjectHeader extends TeaModel {
        /**
         * <p>Field name</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("fieldName")
        public String fieldName;

        /**
         * <p>Field title.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("fieldTitle")
        public String fieldTitle;

        /**
         * <p>Whether it is a default display field (displayed in the response, not used as a parameter)</p>
         * <ul>
         * <li>true: Yes</li>
         * <li>false: No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDefault")
        public Boolean isDefault;

        public static DescribeBasicSearchPageListResponseBodyResultObjectHeader build(java.util.Map<String, ?> map) throws Exception {
            DescribeBasicSearchPageListResponseBodyResultObjectHeader self = new DescribeBasicSearchPageListResponseBodyResultObjectHeader();
            return TeaModel.build(map, self);
        }

        public DescribeBasicSearchPageListResponseBodyResultObjectHeader setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeBasicSearchPageListResponseBodyResultObjectHeader setFieldTitle(String fieldTitle) {
            this.fieldTitle = fieldTitle;
            return this;
        }
        public String getFieldTitle() {
            return this.fieldTitle;
        }

        public DescribeBasicSearchPageListResponseBodyResultObjectHeader setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

    public static class DescribeBasicSearchPageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Current page number in pagination queries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <p>Returned data object</p>
         */
        @NameInMap("data")
        public java.util.List<java.util.Map<String, ?>> data;

        /**
         * <p>Table header</p>
         */
        @NameInMap("header")
        public java.util.List<DescribeBasicSearchPageListResponseBodyResultObjectHeader> header;

        /**
         * <p>Page size, with a default value of 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("totalItem")
        public Long totalItem;

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalPage")
        public Long totalPage;

        public static DescribeBasicSearchPageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeBasicSearchPageListResponseBodyResultObject self = new DescribeBasicSearchPageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeBasicSearchPageListResponseBodyResultObject setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public DescribeBasicSearchPageListResponseBodyResultObject setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public DescribeBasicSearchPageListResponseBodyResultObject setHeader(java.util.List<DescribeBasicSearchPageListResponseBodyResultObjectHeader> header) {
            this.header = header;
            return this;
        }
        public java.util.List<DescribeBasicSearchPageListResponseBodyResultObjectHeader> getHeader() {
            return this.header;
        }

        public DescribeBasicSearchPageListResponseBodyResultObject setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeBasicSearchPageListResponseBodyResultObject setTotalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Long getTotalItem() {
            return this.totalItem;
        }

        public DescribeBasicSearchPageListResponseBodyResultObject setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
