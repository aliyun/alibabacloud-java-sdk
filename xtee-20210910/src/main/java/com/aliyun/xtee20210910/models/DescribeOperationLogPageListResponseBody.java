// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperationLogPageListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The returned object.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeOperationLogPageListResponseBodyResultObject> resultObject;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
        /**
         * <p>The client IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>100.68.***.166</p>
         */
        @NameInMap("clientIp")
        public String clientIp;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The content after the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>@selfvariable_02</p>
         */
        @NameInMap("newContent")
        public String newContent;

        /**
         * <p>The content before the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>@selfvariable_02 + 1001</p>
         */
        @NameInMap("oldContent")
        public String oldContent;

        /**
         * <p>The brief description of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>更新事件:决策引擎可观测性持续建设_事件A(de_afghcf6411)</p>
         */
        @NameInMap("operationSummary")
        public String operationSummary;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_EVENT</p>
         */
        @NameInMap("operationType")
        public String operationType;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
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
