// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariablePageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeExpressionVariablePageResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeExpressionVariablePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariablePageResponseBody self = new DescribeExpressionVariablePageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariablePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressionVariablePageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeExpressionVariablePageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExpressionVariablePageResponseBody setResultObject(java.util.List<DescribeExpressionVariablePageResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeExpressionVariablePageResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeExpressionVariablePageResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeExpressionVariablePageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeExpressionVariablePageResponseBodyResultObject extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("outputs")
        public String outputs;

        @NameInMap("status")
        public String status;

        @NameInMap("title")
        public String title;

        @NameInMap("version")
        public Long version;

        public static DescribeExpressionVariablePageResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressionVariablePageResponseBodyResultObject self = new DescribeExpressionVariablePageResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
