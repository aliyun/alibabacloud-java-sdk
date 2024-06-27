// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListPageListResponseBody extends TeaModel {
    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeNameListPageListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public String totalItem;

    @NameInMap("totalPage")
    public String totalPage;

    public static DescribeNameListPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListPageListResponseBody self = new DescribeNameListPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNameListPageListResponseBody setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNameListPageListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNameListPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNameListPageListResponseBody setResultObject(java.util.List<DescribeNameListPageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeNameListPageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeNameListPageListResponseBody setTotalItem(String totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public String getTotalItem() {
        return this.totalItem;
    }

    public DescribeNameListPageListResponseBody setTotalPage(String totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public String getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeNameListPageListResponseBodyResultObject extends TeaModel {
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("nameListType")
        public String nameListType;

        @NameInMap("title")
        public String title;

        @NameInMap("userId")
        public String userId;

        @NameInMap("value")
        public String value;

        @NameInMap("variableId")
        public Long variableId;

        public static DescribeNameListPageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeNameListPageListResponseBodyResultObject self = new DescribeNameListPageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeNameListPageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeNameListPageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeNameListPageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeNameListPageListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNameListPageListResponseBodyResultObject setNameListType(String nameListType) {
            this.nameListType = nameListType;
            return this;
        }
        public String getNameListType() {
            return this.nameListType;
        }

        public DescribeNameListPageListResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeNameListPageListResponseBodyResultObject setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeNameListPageListResponseBodyResultObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeNameListPageListResponseBodyResultObject setVariableId(Long variableId) {
            this.variableId = variableId;
            return this;
        }
        public Long getVariableId() {
            return this.variableId;
        }

    }

}
