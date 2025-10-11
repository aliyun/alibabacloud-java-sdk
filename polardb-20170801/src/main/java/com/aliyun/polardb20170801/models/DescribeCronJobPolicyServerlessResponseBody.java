// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCronJobPolicyServerlessResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeCronJobPolicyServerlessResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeCronJobPolicyServerlessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCronJobPolicyServerlessResponseBody self = new DescribeCronJobPolicyServerlessResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCronJobPolicyServerlessResponseBody setItems(java.util.List<DescribeCronJobPolicyServerlessResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCronJobPolicyServerlessResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeCronJobPolicyServerlessResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCronJobPolicyServerlessResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCronJobPolicyServerlessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCronJobPolicyServerlessResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeCronJobPolicyServerlessResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ModifyDBClusterServerlessConf</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowShutDown")
        public String allowShutDown;

        /**
         * <strong>example:</strong>
         * <p>0 0 8 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>2024-12-04T02:25:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>12eee3eb-60bd-40ac-a403-218e02eb99c7</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>254752088000354</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScaleApRoNumMax")
        public String scaleApRoNumMax;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScaleApRoNumMin")
        public String scaleApRoNumMin;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("ScaleMax")
        public String scaleMax;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScaleMin")
        public String scaleMin;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScaleRoNumMax")
        public String scaleRoNumMax;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScaleRoNumMin")
        public String scaleRoNumMin;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("SecondsUntilAutoPause")
        public String secondsUntilAutoPause;

        /**
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("ServerlessRuleCpuEnlargeThreshold")
        public String serverlessRuleCpuEnlargeThreshold;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("ServerlessRuleCpuShrinkThreshold")
        public String serverlessRuleCpuShrinkThreshold;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("ServerlessRuleMode")
        public String serverlessRuleMode;

        /**
         * <strong>example:</strong>
         * <p>2020-06-09T18:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCronJobPolicyServerlessResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCronJobPolicyServerlessResponseBodyItems self = new DescribeCronJobPolicyServerlessResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setAllowShutDown(String allowShutDown) {
            this.allowShutDown = allowShutDown;
            return this;
        }
        public String getAllowShutDown() {
            return this.allowShutDown;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setScaleApRoNumMax(String scaleApRoNumMax) {
            this.scaleApRoNumMax = scaleApRoNumMax;
            return this;
        }
        public String getScaleApRoNumMax() {
            return this.scaleApRoNumMax;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setScaleApRoNumMin(String scaleApRoNumMin) {
            this.scaleApRoNumMin = scaleApRoNumMin;
            return this;
        }
        public String getScaleApRoNumMin() {
            return this.scaleApRoNumMin;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setScaleMax(String scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public String getScaleMax() {
            return this.scaleMax;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setScaleMin(String scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public String getScaleMin() {
            return this.scaleMin;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setScaleRoNumMax(String scaleRoNumMax) {
            this.scaleRoNumMax = scaleRoNumMax;
            return this;
        }
        public String getScaleRoNumMax() {
            return this.scaleRoNumMax;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setScaleRoNumMin(String scaleRoNumMin) {
            this.scaleRoNumMin = scaleRoNumMin;
            return this;
        }
        public String getScaleRoNumMin() {
            return this.scaleRoNumMin;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setSecondsUntilAutoPause(String secondsUntilAutoPause) {
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }
        public String getSecondsUntilAutoPause() {
            return this.secondsUntilAutoPause;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setServerlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
            this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
            return this;
        }
        public String getServerlessRuleCpuEnlargeThreshold() {
            return this.serverlessRuleCpuEnlargeThreshold;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setServerlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
            this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
            return this;
        }
        public String getServerlessRuleCpuShrinkThreshold() {
            return this.serverlessRuleCpuShrinkThreshold;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setServerlessRuleMode(String serverlessRuleMode) {
            this.serverlessRuleMode = serverlessRuleMode;
            return this;
        }
        public String getServerlessRuleMode() {
            return this.serverlessRuleMode;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeCronJobPolicyServerlessResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
