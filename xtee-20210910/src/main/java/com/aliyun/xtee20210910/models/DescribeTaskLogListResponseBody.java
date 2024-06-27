// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTaskLogListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeTaskLogListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

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
        @NameInMap("completionTime")
        public Long completionTime;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("id")
        public Long id;

        @NameInMap("remark")
        public String remark;

        @NameInMap("sceneName")
        public String sceneName;

        @NameInMap("status")
        public String status;

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
