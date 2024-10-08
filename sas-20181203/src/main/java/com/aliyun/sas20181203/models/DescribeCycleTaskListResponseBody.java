// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCycleTaskListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of periodic scan tasks.</p>
     */
    @NameInMap("CycleScheduleResponseList")
    public java.util.List<DescribeCycleTaskListResponseBodyCycleScheduleResponseList> cycleScheduleResponseList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeCycleTaskListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB393****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCycleTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCycleTaskListResponseBody self = new DescribeCycleTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCycleTaskListResponseBody setCycleScheduleResponseList(java.util.List<DescribeCycleTaskListResponseBodyCycleScheduleResponseList> cycleScheduleResponseList) {
        this.cycleScheduleResponseList = cycleScheduleResponseList;
        return this;
    }
    public java.util.List<DescribeCycleTaskListResponseBodyCycleScheduleResponseList> getCycleScheduleResponseList() {
        return this.cycleScheduleResponseList;
    }

    public DescribeCycleTaskListResponseBody setPageInfo(DescribeCycleTaskListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeCycleTaskListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeCycleTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCycleTaskListResponseBodyCycleScheduleResponseList extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2cdbdeba8dd70586d5814d4cbf21****</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>Indicates whether the configuration for the task interval was enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>0</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The time when the task first started.</p>
         * 
         * <strong>example:</strong>
         * <p>1667491200000</p>
         */
        @NameInMap("FirstDateStr")
        public Long firstDateStr;

        /**
         * <p>The interval between which two consecutive tasks are run.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IntervalPeriod")
        public Integer intervalPeriod;

        /**
         * <p>The ID of the last task.</p>
         * 
         * <strong>example:</strong>
         * <p>38730bb078f4a1461d4ed283994c****</p>
         */
        @NameInMap("LastTaskId")
        public String lastTaskId;

        /**
         * <p>The time when the next task starts. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1671184531000</p>
         */
        @NameInMap("NextStartTimeStr")
        public Long nextStartTimeStr;

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userAgreement&quot;:&quot;yes&quot;,&quot;lang&quot;:&quot;zh&quot;}</p>
         */
        @NameInMap("Param")
        public String param;

        /**
         * <p>The unit of the scan interval. Valid values:</p>
         * <ul>
         * <li><strong>day</strong></li>
         * <li><strong>hour</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The end time of the task. The time must be a time frame.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TargetEndTime")
        public Integer targetEndTime;

        /**
         * <p>The start time of the task. The start time must be a time frame.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TargetStartTime")
        public Integer targetStartTime;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_SCAN</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_SCAN</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeCycleTaskListResponseBodyCycleScheduleResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCycleTaskListResponseBodyCycleScheduleResponseList self = new DescribeCycleTaskListResponseBodyCycleScheduleResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setFirstDateStr(Long firstDateStr) {
            this.firstDateStr = firstDateStr;
            return this;
        }
        public Long getFirstDateStr() {
            return this.firstDateStr;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setIntervalPeriod(Integer intervalPeriod) {
            this.intervalPeriod = intervalPeriod;
            return this;
        }
        public Integer getIntervalPeriod() {
            return this.intervalPeriod;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setLastTaskId(String lastTaskId) {
            this.lastTaskId = lastTaskId;
            return this;
        }
        public String getLastTaskId() {
            return this.lastTaskId;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setNextStartTimeStr(Long nextStartTimeStr) {
            this.nextStartTimeStr = nextStartTimeStr;
            return this;
        }
        public Long getNextStartTimeStr() {
            return this.nextStartTimeStr;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setTargetEndTime(Integer targetEndTime) {
            this.targetEndTime = targetEndTime;
            return this;
        }
        public Integer getTargetEndTime() {
            return this.targetEndTime;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setTargetStartTime(Integer targetStartTime) {
            this.targetStartTime = targetStartTime;
            return this;
        }
        public Integer getTargetStartTime() {
            return this.targetStartTime;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeCycleTaskListResponseBodyCycleScheduleResponseList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class DescribeCycleTaskListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>149</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeCycleTaskListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCycleTaskListResponseBodyPageInfo self = new DescribeCycleTaskListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCycleTaskListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeCycleTaskListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCycleTaskListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCycleTaskListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
