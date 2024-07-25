// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListAITaskEventsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Forbidden</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Events")
    public java.util.List<ListAITaskEventsResponseBodyEvents> events;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****w==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>t-asasas*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <strong>example:</strong>
     * <p>GenerateTemplate</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static ListAITaskEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAITaskEventsResponseBody self = new ListAITaskEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAITaskEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAITaskEventsResponseBody setEvents(java.util.List<ListAITaskEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<ListAITaskEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public ListAITaskEventsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAITaskEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAITaskEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAITaskEventsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListAITaskEventsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListAITaskEventsResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public ListAITaskEventsResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public static class ListAITaskEventsResponseBodyEvents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GenerateTemplateAgent</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <strong>example:</strong>
         * <p>2019-08-01T04:07:39</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("EstimatedProcessingTime")
        public String estimatedProcessingTime;

        /**
         * <strong>example:</strong>
         * <p>Document template generator started.</p>
         */
        @NameInMap("EventData")
        public String eventData;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("HandlerProcessStatus")
        public String handlerProcessStatus;

        /**
         * <strong>example:</strong>
         * <p>ROSTemplateGenerator</p>
         */
        @NameInMap("HandlerType")
        public String handlerType;

        public static ListAITaskEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            ListAITaskEventsResponseBodyEvents self = new ListAITaskEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public ListAITaskEventsResponseBodyEvents setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public ListAITaskEventsResponseBodyEvents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAITaskEventsResponseBodyEvents setEstimatedProcessingTime(String estimatedProcessingTime) {
            this.estimatedProcessingTime = estimatedProcessingTime;
            return this;
        }
        public String getEstimatedProcessingTime() {
            return this.estimatedProcessingTime;
        }

        public ListAITaskEventsResponseBodyEvents setEventData(String eventData) {
            this.eventData = eventData;
            return this;
        }
        public String getEventData() {
            return this.eventData;
        }

        public ListAITaskEventsResponseBodyEvents setHandlerProcessStatus(String handlerProcessStatus) {
            this.handlerProcessStatus = handlerProcessStatus;
            return this;
        }
        public String getHandlerProcessStatus() {
            return this.handlerProcessStatus;
        }

        public ListAITaskEventsResponseBodyEvents setHandlerType(String handlerType) {
            this.handlerType = handlerType;
            return this;
        }
        public String getHandlerType() {
            return this.handlerType;
        }

    }

}
