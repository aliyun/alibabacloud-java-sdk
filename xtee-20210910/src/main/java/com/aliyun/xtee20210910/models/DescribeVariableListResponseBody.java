// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeVariableListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
        /**
         * <p>Capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("capacity")
        public Long capacity;

        /**
         * <p>Variable definition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("defineId")
        public String defineId;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>暂无</p>
         */
        @NameInMap("extendInfo")
        public java.util.Map<String, ?> extendInfo;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Remaining capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("leftCapacity")
        public Long leftCapacity;

        /**
         * <p>Variable name</p>
         * 
         * <strong>example:</strong>
         * <p><strong>ipLocationCityCode</strong></p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Variable output type</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("outputsType")
        public String outputsType;

        /**
         * <p>Associated event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>de_agdxgz0246</p>
         */
        @NameInMap("refObjId")
        public String refObjId;

        /**
         * <p>Associated event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册事件</p>
         */
        @NameInMap("refObjName")
        public String refObjName;

        /**
         * <p>Associated object type of the variable</p>
         * 
         * <strong>example:</strong>
         * <p>EVENT</p>
         */
        @NameInMap("refObjType")
        public String refObjType;

        /**
         * <p>Source type.</p>
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
         * <p>设备风险识别_标签</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>User ID to which the data belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
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
