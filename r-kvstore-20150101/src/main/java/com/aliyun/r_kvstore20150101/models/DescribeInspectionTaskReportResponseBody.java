// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionTaskReportResponseBody extends TeaModel {
    /**
     * <p>The task report.</p>
     */
    @NameInMap("Data")
    public DescribeInspectionTaskReportResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>561AFBF1-BE20-44DB-9BD1-6988B53E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInspectionTaskReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTaskReportResponseBody self = new DescribeInspectionTaskReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTaskReportResponseBody setData(DescribeInspectionTaskReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInspectionTaskReportResponseBodyData getData() {
        return this.data;
    }

    public DescribeInspectionTaskReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInspectionTaskReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInspectionTaskReportResponseBodyDataSummary extends TeaModel {
        /**
         * <p>The number of high-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Error")
        public Long error;

        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of normal items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Normal")
        public Long normal;

        /**
         * <p>The number of warning items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Warning")
        public Long warning;

        public static DescribeInspectionTaskReportResponseBodyDataSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionTaskReportResponseBodyDataSummary self = new DescribeInspectionTaskReportResponseBodyDataSummary();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionTaskReportResponseBodyDataSummary setError(Long error) {
            this.error = error;
            return this;
        }
        public Long getError() {
            return this.error;
        }

        public DescribeInspectionTaskReportResponseBodyDataSummary setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public DescribeInspectionTaskReportResponseBodyDataSummary setNormal(Long normal) {
            this.normal = normal;
            return this;
        }
        public Long getNormal() {
            return this.normal;
        }

        public DescribeInspectionTaskReportResponseBodyDataSummary setWarning(Long warning) {
            this.warning = warning;
            return this;
        }
        public Long getWarning() {
            return this.warning;
        }

    }

    public static class DescribeInspectionTaskReportResponseBodyData extends TeaModel {
        /**
         * <p>The list of associated instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The Markdown text of the report details.</p>
         * 
         * <strong>example:</strong>
         * <h1>Tair Intelligent Inspection Report\n\n## Overview..</h1>
         */
        @NameInMap("MarkdownText")
        public String markdownText;

        /**
         * <p>The report language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("ReportLanguage")
        public String reportLanguage;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The summary.</p>
         */
        @NameInMap("Summary")
        public DescribeInspectionTaskReportResponseBodyDataSummary summary;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tit-dca42f85c73644e0ab5c80ef6412xxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeInspectionTaskReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionTaskReportResponseBodyData self = new DescribeInspectionTaskReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionTaskReportResponseBodyData setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeInspectionTaskReportResponseBodyData setMarkdownText(String markdownText) {
            this.markdownText = markdownText;
            return this;
        }
        public String getMarkdownText() {
            return this.markdownText;
        }

        public DescribeInspectionTaskReportResponseBodyData setReportLanguage(String reportLanguage) {
            this.reportLanguage = reportLanguage;
            return this;
        }
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        public DescribeInspectionTaskReportResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInspectionTaskReportResponseBodyData setSummary(DescribeInspectionTaskReportResponseBodyDataSummary summary) {
            this.summary = summary;
            return this;
        }
        public DescribeInspectionTaskReportResponseBodyDataSummary getSummary() {
            return this.summary;
        }

        public DescribeInspectionTaskReportResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
