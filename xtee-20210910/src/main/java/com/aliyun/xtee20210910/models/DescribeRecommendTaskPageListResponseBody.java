// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendTaskPageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeRecommendTaskPageListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeRecommendTaskPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendTaskPageListResponseBody self = new DescribeRecommendTaskPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendTaskPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecommendTaskPageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRecommendTaskPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRecommendTaskPageListResponseBody setResultObject(java.util.List<DescribeRecommendTaskPageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeRecommendTaskPageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeRecommendTaskPageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeRecommendTaskPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeRecommendTaskPageListResponseBodyResultObject extends TeaModel {
        @NameInMap("expectVelocities")
        public java.util.List<String> expectVelocities;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("normalCount")
        public Long normalCount;

        @NameInMap("normalSize")
        public Long normalSize;

        @NameInMap("riskCount")
        public Long riskCount;

        @NameInMap("riskSize")
        public Long riskSize;

        @NameInMap("sampleName")
        public String sampleName;

        @NameInMap("sampleScene")
        public String sampleScene;

        @NameInMap("taskId")
        public Long taskId;

        @NameInMap("taskName")
        public String taskName;

        @NameInMap("taskStatus")
        public String taskStatus;

        public static DescribeRecommendTaskPageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendTaskPageListResponseBodyResultObject self = new DescribeRecommendTaskPageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setExpectVelocities(java.util.List<String> expectVelocities) {
            this.expectVelocities = expectVelocities;
            return this;
        }
        public java.util.List<String> getExpectVelocities() {
            return this.expectVelocities;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setNormalCount(Long normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Long getNormalCount() {
            return this.normalCount;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setNormalSize(Long normalSize) {
            this.normalSize = normalSize;
            return this;
        }
        public Long getNormalSize() {
            return this.normalSize;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setRiskSize(Long riskSize) {
            this.riskSize = riskSize;
            return this;
        }
        public Long getRiskSize() {
            return this.riskSize;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setSampleScene(String sampleScene) {
            this.sampleScene = sampleScene;
            return this;
        }
        public String getSampleScene() {
            return this.sampleScene;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeRecommendTaskPageListResponseBodyResultObject setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
