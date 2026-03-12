// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetInspectionReportResponseBody extends TeaModel {
    /**
     * <p>The details of the result.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetInspectionReportResponseBodyData> data;

    /**
     * <p>The report text in the markdown format.</p>
     */
    @NameInMap("MarkdownText")
    public String markdownText;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The inspection report ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9d246af2-a0cd-4f69-857d-3785048f****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetInspectionReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionReportResponseBody self = new GetInspectionReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInspectionReportResponseBody setData(java.util.List<GetInspectionReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetInspectionReportResponseBodyData> getData() {
        return this.data;
    }

    public GetInspectionReportResponseBody setMarkdownText(String markdownText) {
        this.markdownText = markdownText;
        return this;
    }
    public String getMarkdownText() {
        return this.markdownText;
    }

    public GetInspectionReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInspectionReportResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class GetInspectionReportResponseBodyDataDataItemsData extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>DBInstanceStatus</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetInspectionReportResponseBodyDataDataItemsData build(java.util.Map<String, ?> map) throws Exception {
            GetInspectionReportResponseBodyDataDataItemsData self = new GetInspectionReportResponseBodyDataDataItemsData();
            return TeaModel.build(map, self);
        }

        public GetInspectionReportResponseBodyDataDataItemsData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInspectionReportResponseBodyDataDataItemsData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInspectionReportResponseBodyDataDataItems extends TeaModel {
        /**
         * <p>The returned results.</p>
         */
        @NameInMap("Data")
        public java.util.List<GetInspectionReportResponseBodyDataDataItemsData> data;

        /**
         * <p>The level of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The response message.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_runningstatus</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetInspectionReportResponseBodyDataDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetInspectionReportResponseBodyDataDataItems self = new GetInspectionReportResponseBodyDataDataItems();
            return TeaModel.build(map, self);
        }

        public GetInspectionReportResponseBodyDataDataItems setData(java.util.List<GetInspectionReportResponseBodyDataDataItemsData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetInspectionReportResponseBodyDataDataItemsData> getData() {
            return this.data;
        }

        public GetInspectionReportResponseBodyDataDataItems setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetInspectionReportResponseBodyDataDataItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetInspectionReportResponseBodyDataDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetInspectionReportResponseBodyDataData extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_info</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The items in the result.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetInspectionReportResponseBodyDataDataItems> items;

        public static GetInspectionReportResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            GetInspectionReportResponseBodyDataData self = new GetInspectionReportResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public GetInspectionReportResponseBodyDataData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetInspectionReportResponseBodyDataData setItems(java.util.List<GetInspectionReportResponseBodyDataDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetInspectionReportResponseBodyDataDataItems> getItems() {
            return this.items;
        }

    }

    public static class GetInspectionReportResponseBodyDataLevelSummary extends TeaModel {
        /**
         * <p>The number of errors in the report.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Error")
        public Long error;

        /**
         * <p>The number of failures in the report.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of normal records in the report.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Normal")
        public Long normal;

        /**
         * <p>The number of warnings in the report.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Warning")
        public Long warning;

        public static GetInspectionReportResponseBodyDataLevelSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInspectionReportResponseBodyDataLevelSummary self = new GetInspectionReportResponseBodyDataLevelSummary();
            return TeaModel.build(map, self);
        }

        public GetInspectionReportResponseBodyDataLevelSummary setError(Long error) {
            this.error = error;
            return this;
        }
        public Long getError() {
            return this.error;
        }

        public GetInspectionReportResponseBodyDataLevelSummary setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetInspectionReportResponseBodyDataLevelSummary setNormal(Long normal) {
            this.normal = normal;
            return this;
        }
        public Long getNormal() {
            return this.normal;
        }

        public GetInspectionReportResponseBodyDataLevelSummary setWarning(Long warning) {
            this.warning = warning;
            return this;
        }
        public Long getWarning() {
            return this.warning;
        }

    }

    public static class GetInspectionReportResponseBodyData extends TeaModel {
        /**
         * <p>The returned results.</p>
         */
        @NameInMap("Data")
        public java.util.List<GetInspectionReportResponseBodyDataData> data;

        /**
         * <p>The end time of the inspection. Specify the time in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-31T02:05:04Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("InstanceDesc")
        public String instanceDesc;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zep6e5u6l2yu****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The hierarchical summary of the report.</p>
         */
        @NameInMap("LevelSummary")
        public GetInspectionReportResponseBodyDataLevelSummary levelSummary;

        /**
         * <p>The report text in the markdown format.</p>
         * <ul>
         * <li>If the InstanceId parameter is not specified, all content of the inspection report is returned. However, the MarkdownText field is empty.</li>
         * <li>If the InstanceId parameter is specified, the content related to the instance is returned in the MarkdownText field.</li>
         * </ul>
         */
        @NameInMap("MarkdownText")
        public String markdownText;

        /**
         * <p>The region where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The start time of the inspection task. Specify the time in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-06T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetInspectionReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInspectionReportResponseBodyData self = new GetInspectionReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInspectionReportResponseBodyData setData(java.util.List<GetInspectionReportResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetInspectionReportResponseBodyDataData> getData() {
            return this.data;
        }

        public GetInspectionReportResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetInspectionReportResponseBodyData setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public GetInspectionReportResponseBodyData setInstanceDesc(String instanceDesc) {
            this.instanceDesc = instanceDesc;
            return this;
        }
        public String getInstanceDesc() {
            return this.instanceDesc;
        }

        public GetInspectionReportResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInspectionReportResponseBodyData setLevelSummary(GetInspectionReportResponseBodyDataLevelSummary levelSummary) {
            this.levelSummary = levelSummary;
            return this;
        }
        public GetInspectionReportResponseBodyDataLevelSummary getLevelSummary() {
            return this.levelSummary;
        }

        public GetInspectionReportResponseBodyData setMarkdownText(String markdownText) {
            this.markdownText = markdownText;
            return this;
        }
        public String getMarkdownText() {
            return this.markdownText;
        }

        public GetInspectionReportResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetInspectionReportResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
