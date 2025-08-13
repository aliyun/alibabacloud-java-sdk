// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAdvanceSearchPageListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
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
    public DescribeAdvanceSearchPageListResponseBodyResultObject resultObject;

    public static DescribeAdvanceSearchPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvanceSearchPageListResponseBody self = new DescribeAdvanceSearchPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvanceSearchPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdvanceSearchPageListResponseBody setResultObject(DescribeAdvanceSearchPageListResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeAdvanceSearchPageListResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeAdvanceSearchPageListResponseBodyResultObjectHeader extends TeaModel {
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

        public static DescribeAdvanceSearchPageListResponseBodyResultObjectHeader build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvanceSearchPageListResponseBodyResultObjectHeader self = new DescribeAdvanceSearchPageListResponseBodyResultObjectHeader();
            return TeaModel.build(map, self);
        }

        public DescribeAdvanceSearchPageListResponseBodyResultObjectHeader setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeAdvanceSearchPageListResponseBodyResultObjectHeader setFieldTitle(String fieldTitle) {
            this.fieldTitle = fieldTitle;
            return this;
        }
        public String getFieldTitle() {
            return this.fieldTitle;
        }

        public DescribeAdvanceSearchPageListResponseBodyResultObjectHeader setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

    public static class DescribeAdvanceSearchPageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Current page number.</p>
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
        public java.util.List<DescribeAdvanceSearchPageListResponseBodyResultObjectHeader> header;

        /**
         * <p>Number of items per page. Default value: 20, minimum value: 1, maximum value: 50.</p>
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
         * <p>37</p>
         */
        @NameInMap("totalItem")
        public Long totalItem;

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("totalPage")
        public Long totalPage;

        public static DescribeAdvanceSearchPageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvanceSearchPageListResponseBodyResultObject self = new DescribeAdvanceSearchPageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAdvanceSearchPageListResponseBodyResultObject setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAdvanceSearchPageListResponseBodyResultObject setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public DescribeAdvanceSearchPageListResponseBodyResultObject setHeader(java.util.List<DescribeAdvanceSearchPageListResponseBodyResultObjectHeader> header) {
            this.header = header;
            return this;
        }
        public java.util.List<DescribeAdvanceSearchPageListResponseBodyResultObjectHeader> getHeader() {
            return this.header;
        }

        public DescribeAdvanceSearchPageListResponseBodyResultObject setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAdvanceSearchPageListResponseBodyResultObject setTotalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Long getTotalItem() {
            return this.totalItem;
        }

        public DescribeAdvanceSearchPageListResponseBodyResultObject setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
