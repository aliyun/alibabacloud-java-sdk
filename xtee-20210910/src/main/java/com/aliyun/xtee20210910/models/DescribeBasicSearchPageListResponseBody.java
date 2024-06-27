// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeBasicSearchPageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("fieldName")
        public String fieldName;

        @NameInMap("fieldTitle")
        public String fieldTitle;

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
        @NameInMap("currentPage")
        public Long currentPage;

        @NameInMap("data")
        public java.util.List<java.util.Map<String, ?>> data;

        @NameInMap("header")
        public java.util.List<DescribeBasicSearchPageListResponseBodyResultObjectHeader> header;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("totalItem")
        public Long totalItem;

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
