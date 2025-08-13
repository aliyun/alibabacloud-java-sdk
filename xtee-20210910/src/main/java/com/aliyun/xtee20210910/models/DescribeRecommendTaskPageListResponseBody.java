// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendTaskPageListResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Current page number</p>
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
    public java.util.List<DescribeRecommendTaskPageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>Impact indicators</p>
         */
        @NameInMap("expectVelocities")
        public java.util.List<String> expectVelocities;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Number of samples</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("normalCount")
        public Long normalCount;

        /**
         * <p>Number of normal samples</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("normalSize")
        public Long normalSize;

        /**
         * <p>Number of records displayed on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("riskCount")
        public Long riskCount;

        /**
         * <p>Number of risk samples</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("riskSize")
        public Long riskSize;

        /**
         * <p>Sample name</p>
         * 
         * <strong>example:</strong>
         * <p>白样本</p>
         */
        @NameInMap("sampleName")
        public String sampleName;

        /**
         * <p>Sample scenario</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse_detection</p>
         */
        @NameInMap("sampleScene")
        public String sampleScene;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>240c93ddffa74e38be3a00375eb3041d</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <p>Task name.</p>
         * 
         * <strong>example:</strong>
         * <p>策略推荐任务</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>Task status.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
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
