// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTaskListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeTaskListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

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
        @NameInMap("completionTime")
        public Long completionTime;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("id")
        public Long id;

        @NameInMap("mark")
        public Integer mark;

        @NameInMap("remark")
        public String remark;

        @NameInMap("sceneName")
        public String sceneName;

        @NameInMap("status")
        public String status;

        @NameInMap("taskLogId")
        public Long taskLogId;

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
