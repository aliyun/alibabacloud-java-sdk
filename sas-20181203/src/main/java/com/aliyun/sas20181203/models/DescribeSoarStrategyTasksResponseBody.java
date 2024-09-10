// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTasksResponseBody extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The policy tasks.</p>
     */
    @NameInMap("SoarStrategyTasks")
    public java.util.List<DescribeSoarStrategyTasksResponseBodySoarStrategyTasks> soarStrategyTasks;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSoarStrategyTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTasksResponseBody self = new DescribeSoarStrategyTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSoarStrategyTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSoarStrategyTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSoarStrategyTasksResponseBody setSoarStrategyTasks(java.util.List<DescribeSoarStrategyTasksResponseBodySoarStrategyTasks> soarStrategyTasks) {
        this.soarStrategyTasks = soarStrategyTasks;
        return this;
    }
    public java.util.List<DescribeSoarStrategyTasksResponseBodySoarStrategyTasks> getSoarStrategyTasks() {
        return this.soarStrategyTasks;
    }

    public DescribeSoarStrategyTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSoarStrategyTasksResponseBodySoarStrategyTasks extends TeaModel {
        /**
         * <p>The number of execution failures.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FailedNum")
        public Integer failedNum;

        /**
         * <p>The timestamp when the policy task was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1708481235000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The timestamp when the policy task was complete. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1586739841000</p>
         */
        @NameInMap("GmtFinish")
        public Long gmtFinish;

        /**
         * <p>The timestamp when the policy task was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1669869436000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the policy task.</p>
         * 
         * <strong>example:</strong>
         * <p>5374</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the policy task.</p>
         * 
         * <strong>example:</strong>
         * <p>strategy_name01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The execution mode. Valid values:</p>
         * <ul>
         * <li>runmode_TRIGGER_BY_USER: manually executed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>runmode_TRIGGER_BY_USER</p>
         */
        @NameInMap("RunMode")
        public String runMode;

        /**
         * <p>The status of the policy task. Valid values:</p>
         * <ul>
         * <li>\-1: waiting</li>
         * <li>0: starting</li>
         * <li>1: running</li>
         * <li>2: finished</li>
         * <li>3: schedule</li>
         * <li>4: pause</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        /**
         * <p>The number of successful executions.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SuccessNum")
        public Integer successNum;

        /**
         * <p>The total number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static DescribeSoarStrategyTasksResponseBodySoarStrategyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarStrategyTasksResponseBodySoarStrategyTasks self = new DescribeSoarStrategyTasksResponseBodySoarStrategyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setFailedNum(Integer failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Integer getFailedNum() {
            return this.failedNum;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setGmtFinish(Long gmtFinish) {
            this.gmtFinish = gmtFinish;
            return this;
        }
        public Long getGmtFinish() {
            return this.gmtFinish;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setSuccessNum(Integer successNum) {
            this.successNum = successNum;
            return this;
        }
        public Integer getSuccessNum() {
            return this.successNum;
        }

        public DescribeSoarStrategyTasksResponseBodySoarStrategyTasks setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
