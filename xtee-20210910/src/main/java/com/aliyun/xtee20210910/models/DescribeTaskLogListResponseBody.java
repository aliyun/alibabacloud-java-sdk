// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTaskLogListResponseBody extends TeaModel {
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
    public java.util.List<DescribeTaskLogListResponseBodyResultObject> resultObject;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeTaskLogListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskLogListResponseBody self = new DescribeTaskLogListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskLogListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskLogListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTaskLogListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTaskLogListResponseBody setResultObject(java.util.List<DescribeTaskLogListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeTaskLogListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeTaskLogListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeTaskLogListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeTaskLogListResponseBodyResultObject extends TeaModel {
        /**
         * <p>The completion time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1753804800000</p>
         */
        @NameInMap("completionTime")
        public Long completionTime;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1753804800000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The log ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2793</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>coupon_abuse_detection</p>
         */
        @NameInMap("sceneName")
        public String sceneName;

        /**
         * <p>The status. Valid values:</p>
         * <p>0: deleted
         * 1: Normal.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task type. Valid values:</p>
         * <p>1: data upload
         * 2: supplementary upload
         * 3: labeling.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("taskType")
        public String taskType;

        public static DescribeTaskLogListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskLogListResponseBodyResultObject self = new DescribeTaskLogListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTaskLogListResponseBodyResultObject setCompletionTime(Long completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public Long getCompletionTime() {
            return this.completionTime;
        }

        public DescribeTaskLogListResponseBodyResultObject setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeTaskLogListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeTaskLogListResponseBodyResultObject setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeTaskLogListResponseBodyResultObject setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribeTaskLogListResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTaskLogListResponseBodyResultObject setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
