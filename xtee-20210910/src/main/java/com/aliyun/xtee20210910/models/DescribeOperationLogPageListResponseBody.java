// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperationLogPageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeOperationLogPageListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeOperationLogPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperationLogPageListResponseBody self = new DescribeOperationLogPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperationLogPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOperationLogPageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOperationLogPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOperationLogPageListResponseBody setResultObject(java.util.List<DescribeOperationLogPageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeOperationLogPageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeOperationLogPageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeOperationLogPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeOperationLogPageListResponseBodyResultObject extends TeaModel {
        @NameInMap("clientIp")
        public String clientIp;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("newContent")
        public String newContent;

        @NameInMap("oldContent")
        public String oldContent;

        @NameInMap("operationSummary")
        public String operationSummary;

        @NameInMap("operationType")
        public String operationType;

        @NameInMap("userName")
        public String userName;

        public static DescribeOperationLogPageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperationLogPageListResponseBodyResultObject self = new DescribeOperationLogPageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeOperationLogPageListResponseBodyResultObject setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeOperationLogPageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeOperationLogPageListResponseBodyResultObject setNewContent(String newContent) {
            this.newContent = newContent;
            return this;
        }
        public String getNewContent() {
            return this.newContent;
        }

        public DescribeOperationLogPageListResponseBodyResultObject setOldContent(String oldContent) {
            this.oldContent = oldContent;
            return this;
        }
        public String getOldContent() {
            return this.oldContent;
        }

        public DescribeOperationLogPageListResponseBodyResultObject setOperationSummary(String operationSummary) {
            this.operationSummary = operationSummary;
            return this;
        }
        public String getOperationSummary() {
            return this.operationSummary;
        }

        public DescribeOperationLogPageListResponseBodyResultObject setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeOperationLogPageListResponseBodyResultObject setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
