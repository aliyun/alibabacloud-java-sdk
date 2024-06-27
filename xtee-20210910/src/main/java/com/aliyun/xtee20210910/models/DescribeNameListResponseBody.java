// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeNameListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListResponseBody self = new DescribeNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNameListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNameListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNameListResponseBody setResultObject(java.util.List<DescribeNameListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeNameListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeNameListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeNameListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeNameListResponseBodyResultObject extends TeaModel {
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("title")
        public String title;

        @NameInMap("value")
        public String value;

        @NameInMap("variableId")
        public Long variableId;

        public static DescribeNameListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeNameListResponseBodyResultObject self = new DescribeNameListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeNameListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeNameListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeNameListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeNameListResponseBodyResultObject setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeNameListResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeNameListResponseBodyResultObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeNameListResponseBodyResultObject setVariableId(Long variableId) {
            this.variableId = variableId;
            return this;
        }
        public Long getVariableId() {
            return this.variableId;
        }

    }

}
