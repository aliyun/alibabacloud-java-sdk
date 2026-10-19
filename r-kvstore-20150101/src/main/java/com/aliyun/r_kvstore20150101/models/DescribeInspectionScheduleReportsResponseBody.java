// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionScheduleReportsResponseBody extends TeaModel {
    /**
     * <p>The task data.</p>
     */
    @NameInMap("Data")
    public DescribeInspectionScheduleReportsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A057C066-C3F5-4CC9-9FE4-A8D8B0DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInspectionScheduleReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionScheduleReportsResponseBody self = new DescribeInspectionScheduleReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionScheduleReportsResponseBody setData(DescribeInspectionScheduleReportsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInspectionScheduleReportsResponseBodyData getData() {
        return this.data;
    }

    public DescribeInspectionScheduleReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInspectionScheduleReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInspectionScheduleReportsResponseBodyDataItems extends TeaModel {
        /**
         * <p>The creation time of the task.</p>
         * <p>The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1773211755000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The end time of the task.</p>
         * <p>The time is displayed in the YYYY-MM-DDTHH:mm:ssZ format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-29T02:12:02Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The completion time of the task.</p>
         * <p>The time is displayed in the ISO 8601 format with an explicit time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-16T13:52:35+08:00</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The summary of risk levels in the inspection results.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Normal\&quot;:10,\&quot;Warning\&quot;:0,\&quot;Error\&quot;:0,\&quot;Failed\&quot;:0}</p>
         */
        @NameInMap("LevelSummary")
        public String levelSummary;

        /**
         * <p>The language of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        @NameInMap("ReportLanguage")
        public String reportLanguage;

        /**
         * <p>The start time of the task.</p>
         * <p>The time is displayed in the YYYY-MM-DDTHH:mmZ format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-26T21:10Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-0mqomahp4o4uf3aicu</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeInspectionScheduleReportsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionScheduleReportsResponseBodyDataItems self = new DescribeInspectionScheduleReportsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionScheduleReportsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInspectionScheduleReportsResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInspectionScheduleReportsResponseBodyDataItems setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeInspectionScheduleReportsResponseBodyDataItems setLevelSummary(String levelSummary) {
            this.levelSummary = levelSummary;
            return this;
        }
        public String getLevelSummary() {
            return this.levelSummary;
        }

        public DescribeInspectionScheduleReportsResponseBodyDataItems setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public DescribeInspectionScheduleReportsResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInspectionScheduleReportsResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInspectionScheduleReportsResponseBodyDataItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeInspectionScheduleReportsResponseBodyData extends TeaModel {
        /**
         * <p>The task items.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeInspectionScheduleReportsResponseBodyDataItems> items;

        /**
         * <p>The returned page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The page size. Default value: 25.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeInspectionScheduleReportsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionScheduleReportsResponseBodyData self = new DescribeInspectionScheduleReportsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionScheduleReportsResponseBodyData setItems(java.util.List<DescribeInspectionScheduleReportsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeInspectionScheduleReportsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeInspectionScheduleReportsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeInspectionScheduleReportsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeInspectionScheduleReportsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
