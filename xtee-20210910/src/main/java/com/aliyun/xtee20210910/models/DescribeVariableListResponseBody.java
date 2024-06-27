// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeVariableListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeVariableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableListResponseBody self = new DescribeVariableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVariableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVariableListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVariableListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVariableListResponseBody setResultObject(java.util.List<DescribeVariableListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeVariableListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeVariableListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeVariableListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeVariableListResponseBodyResultObject extends TeaModel {
        @NameInMap("capacity")
        public Long capacity;

        @NameInMap("defineId")
        public String defineId;

        @NameInMap("description")
        public String description;

        @NameInMap("extendInfo")
        public java.util.Map<String, ?> extendInfo;

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

        @NameInMap("outputsType")
        public String outputsType;

        @NameInMap("refObjId")
        public String refObjId;

        @NameInMap("refObjName")
        public String refObjName;

        @NameInMap("refObjType")
        public String refObjType;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public String type;

        @NameInMap("userId")
        public Long userId;

        public static DescribeVariableListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVariableListResponseBodyResultObject self = new DescribeVariableListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVariableListResponseBodyResultObject setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeVariableListResponseBodyResultObject setDefineId(String defineId) {
            this.defineId = defineId;
            return this;
        }
        public String getDefineId() {
            return this.defineId;
        }

        public DescribeVariableListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVariableListResponseBodyResultObject setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public DescribeVariableListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeVariableListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVariableListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeVariableListResponseBodyResultObject setLeftCapacity(Long leftCapacity) {
            this.leftCapacity = leftCapacity;
            return this;
        }
        public Long getLeftCapacity() {
            return this.leftCapacity;
        }

        public DescribeVariableListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVariableListResponseBodyResultObject setOutputsType(String outputsType) {
            this.outputsType = outputsType;
            return this;
        }
        public String getOutputsType() {
            return this.outputsType;
        }

        public DescribeVariableListResponseBodyResultObject setRefObjId(String refObjId) {
            this.refObjId = refObjId;
            return this;
        }
        public String getRefObjId() {
            return this.refObjId;
        }

        public DescribeVariableListResponseBodyResultObject setRefObjName(String refObjName) {
            this.refObjName = refObjName;
            return this;
        }
        public String getRefObjName() {
            return this.refObjName;
        }

        public DescribeVariableListResponseBodyResultObject setRefObjType(String refObjType) {
            this.refObjType = refObjType;
            return this;
        }
        public String getRefObjType() {
            return this.refObjType;
        }

        public DescribeVariableListResponseBodyResultObject setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeVariableListResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeVariableListResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVariableListResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
