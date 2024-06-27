// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAdvanceSearchPageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("fieldName")
        public String fieldName;

        @NameInMap("fieldTitle")
        public String fieldTitle;

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
        @NameInMap("currentPage")
        public Long currentPage;

        @NameInMap("data")
        public java.util.List<java.util.Map<String, ?>> data;

        @NameInMap("header")
        public java.util.List<DescribeAdvanceSearchPageListResponseBodyResultObjectHeader> header;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("totalItem")
        public Long totalItem;

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
