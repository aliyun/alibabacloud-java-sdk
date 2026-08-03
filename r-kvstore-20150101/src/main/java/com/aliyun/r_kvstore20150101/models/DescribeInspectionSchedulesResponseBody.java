// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionSchedulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeInspectionSchedulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInspectionSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionSchedulesResponseBody self = new DescribeInspectionSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionSchedulesResponseBody setData(DescribeInspectionSchedulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInspectionSchedulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeInspectionSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInspectionSchedulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInspectionSchedulesResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-04-21T02:26:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>0 0 3 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Long enabled;

        /**
         * <strong>example:</strong>
         * <p>HOTKEY</p>
         */
        @NameInMap("InspectionItems")
        public String inspectionItems;

        /**
         * <strong>example:</strong>
         * <p>1h</p>
         */
        @NameInMap("InspectionWindow")
        public String inspectionWindow;

        /**
         * <strong>example:</strong>
         * <p>r-2zed6typz5j6djmb2x</p>
         */
        @NameInMap("InstanceIds")
        public String instanceIds;

        /**
         * <strong>example:</strong>
         * <p>2026-07-29T10:00:00Z</p>
         */
        @NameInMap("NextFireTime")
        public String nextFireTime;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("NotifyConfig")
        public String notifyConfig;

        /**
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("ReportLanguage")
        public String reportLanguage;

        /**
         * <strong>example:</strong>
         * <p>sch-b45811bf4bba46c8b6d233551da9xxxx</p>
         */
        @NameInMap("ScheduleId")
        public String scheduleId;

        /**
         * <strong>example:</strong>
         * <p>sch-test</p>
         */
        @NameInMap("ScheduleName")
        public String scheduleName;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <strong>example:</strong>
         * <p>2026-07-29T06:50:04Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeInspectionSchedulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionSchedulesResponseBodyDataItems self = new DescribeInspectionSchedulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setInspectionItems(String inspectionItems) {
            this.inspectionItems = inspectionItems;
            return this;
        }
        public String getInspectionItems() {
            return this.inspectionItems;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setInspectionWindow(String inspectionWindow) {
            this.inspectionWindow = inspectionWindow;
            return this;
        }
        public String getInspectionWindow() {
            return this.inspectionWindow;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setInstanceIds(String instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public String getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setNextFireTime(String nextFireTime) {
            this.nextFireTime = nextFireTime;
            return this;
        }
        public String getNextFireTime() {
            return this.nextFireTime;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setNotifyConfig(String notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }
        public String getNotifyConfig() {
            return this.notifyConfig;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setScheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public String getScheduleId() {
            return this.scheduleId;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setScheduleName(String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }
        public String getScheduleName() {
            return this.scheduleName;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeInspectionSchedulesResponseBodyDataItems setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeInspectionSchedulesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DescribeInspectionSchedulesResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeInspectionSchedulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionSchedulesResponseBodyData self = new DescribeInspectionSchedulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionSchedulesResponseBodyData setItems(java.util.List<DescribeInspectionSchedulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeInspectionSchedulesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeInspectionSchedulesResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeInspectionSchedulesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeInspectionSchedulesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
