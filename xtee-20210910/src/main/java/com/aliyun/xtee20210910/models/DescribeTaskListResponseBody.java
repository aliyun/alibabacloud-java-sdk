// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTaskListResponseBody extends TeaModel {
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
     * <p>Page size, with a default value of 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeTaskListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
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

    public static DescribeTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskListResponseBody self = new DescribeTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTaskListResponseBody setResultObject(java.util.List<DescribeTaskListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeTaskListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeTaskListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeTaskListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeTaskListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Completion time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1753804800000</p>
         */
        @NameInMap("completionTime")
        public Long completionTime;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753804800000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Total number of mark information.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("mark")
        public Integer mark;

        /**
         * <p>Remark.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>Scene name</p>
         * 
         * <strong>example:</strong>
         * <p>样本调度</p>
         */
        @NameInMap("sceneName")
        public String sceneName;

        /**
         * <p>Data status.</p>
         * <p>-1: Failed
         * 0: Deleted
         * 1: Pending
         * 2: Success</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1102</p>
         */
        @NameInMap("taskLogId")
        public Long taskLogId;

        /**
         * <p>Task type
         * 1: Data upload
         * 2: Supplemental upload
         * 3: Labeling</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("taskType")
        public String taskType;

        public static DescribeTaskListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskListResponseBodyResultObject self = new DescribeTaskListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTaskListResponseBodyResultObject setCompletionTime(Long completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public Long getCompletionTime() {
            return this.completionTime;
        }

        public DescribeTaskListResponseBodyResultObject setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeTaskListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeTaskListResponseBodyResultObject setMark(Integer mark) {
            this.mark = mark;
            return this;
        }
        public Integer getMark() {
            return this.mark;
        }

        public DescribeTaskListResponseBodyResultObject setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeTaskListResponseBodyResultObject setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribeTaskListResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTaskListResponseBodyResultObject setTaskLogId(Long taskLogId) {
            this.taskLogId = taskLogId;
            return this;
        }
        public Long getTaskLogId() {
            return this.taskLogId;
        }

        public DescribeTaskListResponseBodyResultObject setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
