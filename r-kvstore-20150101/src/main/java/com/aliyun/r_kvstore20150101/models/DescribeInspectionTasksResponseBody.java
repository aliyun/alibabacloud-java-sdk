// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeInspectionTasksResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2D9F3768-EDA9-4811-943E-42C8006E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInspectionTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTasksResponseBody self = new DescribeInspectionTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTasksResponseBody setData(DescribeInspectionTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInspectionTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeInspectionTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInspectionTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInspectionTasksResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-07-01T02:06:34Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2025-09-23T00:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-01-09T02:13:01Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>PERFORMANCE_METRICS</p>
         */
        @NameInMap("InspectionItems")
        public String inspectionItems;

        /**
         * <strong>example:</strong>
         * <p>r-uf6ns8txov3mp9jxxx</p>
         */
        @NameInMap("InstanceIds")
        public String instanceIds;

        /**
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("ReportLanguage")
        public String reportLanguage;

        /**
         * <strong>example:</strong>
         * <p>sch-4dfb08ddf9f84855bacca35axxx</p>
         */
        @NameInMap("ScheduleId")
        public String scheduleId;

        /**
         * <strong>example:</strong>
         * <p>scheduler|</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>2026-05-30T02:11:01Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>tit-dca42f85c73644e0ab5c80ef641xxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeInspectionTasksResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionTasksResponseBodyDataItems self = new DescribeInspectionTasksResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionTasksResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInspectionTasksResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInspectionTasksResponseBodyDataItems setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeInspectionTasksResponseBodyDataItems setInspectionItems(String inspectionItems) {
            this.inspectionItems = inspectionItems;
            return this;
        }
        public String getInspectionItems() {
            return this.inspectionItems;
        }

        public DescribeInspectionTasksResponseBodyDataItems setInstanceIds(String instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public String getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeInspectionTasksResponseBodyDataItems setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public DescribeInspectionTasksResponseBodyDataItems setScheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public String getScheduleId() {
            return this.scheduleId;
        }

        public DescribeInspectionTasksResponseBodyDataItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeInspectionTasksResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInspectionTasksResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInspectionTasksResponseBodyDataItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeInspectionTasksResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DescribeInspectionTasksResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeInspectionTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionTasksResponseBodyData self = new DescribeInspectionTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionTasksResponseBodyData setItems(java.util.List<DescribeInspectionTasksResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeInspectionTasksResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeInspectionTasksResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeInspectionTasksResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeInspectionTasksResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
