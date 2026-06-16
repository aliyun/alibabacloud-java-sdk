// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariablePageResponseBody extends TeaModel {
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
    public java.util.List<DescribeExpressionVariablePageResponseBodyResultObject> resultObject;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
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
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The primary key of the custom variable.</p>
         * 
         * <strong>example:</strong>
         * <p>2793</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>ex_OERlw0Zqfb23</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The variable return type.</p>
         * 
         * <strong>example:</strong>
         * <p>DOUBLE</p>
         */
        @NameInMap("outputs")
        public String outputs;

        /**
         * <p>The rule ID of the associated policy.</p>
         */
        @NameInMap("ruleList")
        public java.util.List<String> ruleList;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>获取手机号前7位自定义变量</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The version information.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public DescribeExpressionVariablePageResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public DescribeExpressionVariablePageResponseBodyResultObject setRuleList(java.util.List<String> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<String> getRuleList() {
            return this.ruleList;
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
