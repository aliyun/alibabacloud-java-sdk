// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListVariablePageListResponseBody extends TeaModel {
    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeNameListVariablePageListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeNameListVariablePageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListVariablePageListResponseBody self = new DescribeNameListVariablePageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNameListVariablePageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNameListVariablePageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNameListVariablePageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNameListVariablePageListResponseBody setResultObject(java.util.List<DescribeNameListVariablePageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeNameListVariablePageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeNameListVariablePageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeNameListVariablePageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeNameListVariablePageListResponseBodyResultObject extends TeaModel {
        @NameInMap("capacity")
        public Long capacity;

        @NameInMap("description")
        public String description;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("leftCapacity")
        public Long leftCapacity;

        @NameInMap("name")
        public String name;

        @NameInMap("nameListType")
        public String nameListType;

        @NameInMap("refObjId")
        public String refObjId;

        @NameInMap("refObjType")
        public Long refObjType;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("userId")
        public Long userId;

        public static DescribeNameListVariablePageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeNameListVariablePageListResponseBodyResultObject self = new DescribeNameListVariablePageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setLeftCapacity(Long leftCapacity) {
            this.leftCapacity = leftCapacity;
            return this;
        }
        public Long getLeftCapacity() {
            return this.leftCapacity;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setNameListType(String nameListType) {
            this.nameListType = nameListType;
            return this;
        }
        public String getNameListType() {
            return this.nameListType;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setRefObjId(String refObjId) {
            this.refObjId = refObjId;
            return this;
        }
        public String getRefObjId() {
            return this.refObjId;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setRefObjType(Long refObjType) {
            this.refObjType = refObjType;
            return this;
        }
        public Long getRefObjType() {
            return this.refObjType;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNameListVariablePageListResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
