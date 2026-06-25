// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetWorkflowResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public GetWorkflowResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request. This ID is unique to each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>27B1345D-5F71-5972-8E4C-AABA6C6232F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowResponseBody self = new GetWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWorkflowResponseBody setData(GetWorkflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkflowResponseBodyData getData() {
        return this.data;
    }

    public GetWorkflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkflowResponseBodyData extends TeaModel {
        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The custom calendar.</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        @NameInMap("Calendar")
        public String calendar;

        /**
         * <p>The user who created the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>18582193685027xx</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The workflow description.</p>
         * 
         * <strong>example:</strong>
         * <p>my first workflow</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <p>The workflow name.</p>
         * 
         * <strong>example:</strong>
         * <p>myWorkflow</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The workflow status.</p>
         * <ul>
         * <li><p>0: disabled</p>
         * </li>
         * <li><p>1: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The time expression. The value of this parameter depends on the schedule type.</p>
         * <ul>
         * <li><p><strong>None</strong>: No expression is required.</p>
         * </li>
         * <li><p><strong>cron</strong>: A standard cron expression.</p>
         * </li>
         * <li><p><strong>API</strong>: No expression is required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0 0 12 * * ?</p>
         */
        @NameInMap("TimeExpression")
        public String timeExpression;

        /**
         * <p>The schedule type.</p>
         * <ul>
         * <li><p>-1: None</p>
         * </li>
         * <li><p>1: cron</p>
         * </li>
         * <li><p>100: API</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        /**
         * <p>The time zone.</p>
         * <blockquote>
         * <p>If this parameter is omitted, the time zone of the server in the current region is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>GMT+8</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>The user who last updated the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>18582193685027xx</p>
         */
        @NameInMap("Updater")
        public String updater;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        /**
         * <p>The extended attributes.</p>
         * <blockquote>
         * <p>This parameter is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Xattrs")
        public String xattrs;

        public static GetWorkflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyData self = new GetWorkflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetWorkflowResponseBodyData setCalendar(String calendar) {
            this.calendar = calendar;
            return this;
        }
        public String getCalendar() {
            return this.calendar;
        }

        public GetWorkflowResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetWorkflowResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkflowResponseBodyData setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public GetWorkflowResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetWorkflowResponseBodyData setTimeExpression(String timeExpression) {
            this.timeExpression = timeExpression;
            return this;
        }
        public String getTimeExpression() {
            return this.timeExpression;
        }

        public GetWorkflowResponseBodyData setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

        public GetWorkflowResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public GetWorkflowResponseBodyData setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

        public GetWorkflowResponseBodyData setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public GetWorkflowResponseBodyData setXattrs(String xattrs) {
            this.xattrs = xattrs;
            return this;
        }
        public String getXattrs() {
            return this.xattrs;
        }

    }

}
