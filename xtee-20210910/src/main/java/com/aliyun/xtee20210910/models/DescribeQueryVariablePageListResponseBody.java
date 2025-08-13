// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeQueryVariablePageListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Pagination parameter, current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Long currentPage;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeQueryVariablePageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total items</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalItem")
    public Long totalItem;

    /**
     * <p>Total pages</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalPage")
    public Long totalPage;

    public static DescribeQueryVariablePageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryVariablePageListResponseBody self = new DescribeQueryVariablePageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQueryVariablePageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQueryVariablePageListResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeQueryVariablePageListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeQueryVariablePageListResponseBody setResultObject(java.util.List<DescribeQueryVariablePageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeQueryVariablePageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeQueryVariablePageListResponseBody setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Long getTotalItem() {
        return this.totalItem;
    }

    public DescribeQueryVariablePageListResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeQueryVariablePageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Data source code.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_vcaoii1697</p>
         */
        @NameInMap("dataSourceCode")
        public Long dataSourceCode;

        /**
         * <p>Data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>姓名数据源</p>
         */
        @NameInMap("dataSourceName")
        public String dataSourceName;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Return value type</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("fieldType")
        public String fieldType;

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
         * <p>Query variable primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Query variable name</p>
         * 
         * <strong>example:</strong>
         * <p>查询变量名称</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("total")
        public Long total;

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Long version;

        public static DescribeQueryVariablePageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeQueryVariablePageListResponseBodyResultObject self = new DescribeQueryVariablePageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setDataSourceCode(Long dataSourceCode) {
            this.dataSourceCode = dataSourceCode;
            return this;
        }
        public Long getDataSourceCode() {
            return this.dataSourceCode;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeQueryVariablePageListResponseBodyResultObject setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
