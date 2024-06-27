// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMarkPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeMarkPageResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

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
        @NameInMap("fieldName")
        public String fieldName;

        @NameInMap("fieldValue")
        public String fieldValue;

        @NameInMap("id")
        public Long id;

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
