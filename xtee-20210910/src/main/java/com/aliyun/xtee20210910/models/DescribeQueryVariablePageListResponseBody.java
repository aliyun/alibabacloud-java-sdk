// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeQueryVariablePageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Long currentPage;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeQueryVariablePageListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Long totalItem;

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
        @NameInMap("dataSourceCode")
        public Long dataSourceCode;

        @NameInMap("dataSourceName")
        public String dataSourceName;

        @NameInMap("description")
        public String description;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("total")
        public Long total;

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
