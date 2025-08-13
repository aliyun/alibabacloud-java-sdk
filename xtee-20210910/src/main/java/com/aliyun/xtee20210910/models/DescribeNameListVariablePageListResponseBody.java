// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListVariablePageListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeNameListVariablePageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>Used capacity</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("capacity")
        public Long capacity;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Name list ID</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Remaining capacity</p>
         * 
         * <strong>example:</strong>
         * <p>99997</p>
         */
        @NameInMap("leftCapacity")
        public Long leftCapacity;

        /**
         * <p>Parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>nl_UN8otElLb490</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Name list type</p>
         * 
         * <strong>example:</strong>
         * <p>手机号</p>
         */
        @NameInMap("nameListType")
        public String nameListType;

        /**
         * <p>Associated event eventCode</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("refObjId")
        public String refObjId;

        /**
         * <p>Association type</p>
         * 
         * <strong>example:</strong>
         * <p>EVENT</p>
         */
        @NameInMap("refObjType")
        public Long refObjType;

        /**
         * <p>Data source</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>白名单</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type</p>
         * 
         * <strong>example:</strong>
         * <p>NAME_LIST</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>User UID</p>
         * 
         * <strong>example:</strong>
         * <p>180650758xxxxxxx</p>
         */
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
