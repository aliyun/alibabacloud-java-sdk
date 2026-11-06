// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemAuditResponseBody extends TeaModel {
    /**
     * <p>公共业务状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>按事件时间倒序排列的完整工作项审计记录</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;eventId&quot;:&quot;evt_example&quot;,&quot;eventType&quot;:&quot;WORK_ITEM_UPDATED&quot;,&quot;occurredAt&quot;:&quot;2026-11-05T08:00:00Z&quot;,&quot;status&quot;:&quot;SUCCESS&quot;}]</p>
     */
    @NameInMap("items")
    public java.util.List<GetWorkItemAuditResponseBodyItems> items;

    /**
     * <p>公共错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetWorkItemAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemAuditResponseBody self = new GetWorkItemAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkItemAuditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkItemAuditResponseBody setItems(java.util.List<GetWorkItemAuditResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetWorkItemAuditResponseBodyItems> getItems() {
        return this.items;
    }

    public GetWorkItemAuditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkItemAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWorkItemAuditResponseBodyItems extends TeaModel {
        /**
         * <p>字段变更明细列表，每项包含变更字段与前后值</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;title&quot;,&quot;before&quot;:&quot;旧标题&quot;,&quot;after&quot;:&quot;新标题&quot;}]</p>
         */
        @NameInMap("changes")
        public Object changes;

        /**
         * <p>事件描述</p>
         * 
         * <strong>example:</strong>
         * <p>工作项标题调整为季度销售机会复盘</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>审计事件唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>evt_20261105_0001</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <p>审计事件类型，如 WORK_ITEM_UPDATED、TODO_COMPLETED</p>
         * 
         * <strong>example:</strong>
         * <p>WORK_ITEM_UPDATED</p>
         */
        @NameInMap("eventType")
        public String eventType;

        /**
         * <p>事件发生时间，ISO8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:00:00Z</p>
         */
        @NameInMap("occurredAt")
        public String occurredAt;

        /**
         * <p>操作人显示名</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("operatorName")
        public String operatorName;

        /**
         * <p>操作人用户 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("operatorUserId")
        public String operatorUserId;

        /**
         * <p>事件涉及的待确认问题列表</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;question&quot;:&quot;是否继续执行&quot;}]</p>
         */
        @NameInMap("questions")
        public java.util.List<?> questions;

        /**
         * <p>事件结果负载，JSON 对象；无结果时为空</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;result&quot;:&quot;ok&quot;}</p>
         */
        @NameInMap("resultPayload")
        public Object resultPayload;

        /**
         * <p>事件状态</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>事件标题</p>
         * 
         * <strong>example:</strong>
         * <p>调查销售机会</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>关联待办 ID；无关联时为空字符串</p>
         * 
         * <strong>example:</strong>
         * <p>todo_20261105_0007</p>
         */
        @NameInMap("todoId")
        public String todoId;

        public static GetWorkItemAuditResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemAuditResponseBodyItems self = new GetWorkItemAuditResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetWorkItemAuditResponseBodyItems setChanges(Object changes) {
            this.changes = changes;
            return this;
        }
        public Object getChanges() {
            return this.changes;
        }

        public GetWorkItemAuditResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkItemAuditResponseBodyItems setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetWorkItemAuditResponseBodyItems setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetWorkItemAuditResponseBodyItems setOccurredAt(String occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }
        public String getOccurredAt() {
            return this.occurredAt;
        }

        public GetWorkItemAuditResponseBodyItems setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetWorkItemAuditResponseBodyItems setOperatorUserId(String operatorUserId) {
            this.operatorUserId = operatorUserId;
            return this;
        }
        public String getOperatorUserId() {
            return this.operatorUserId;
        }

        public GetWorkItemAuditResponseBodyItems setQuestions(java.util.List<?> questions) {
            this.questions = questions;
            return this;
        }
        public java.util.List<?> getQuestions() {
            return this.questions;
        }

        public GetWorkItemAuditResponseBodyItems setResultPayload(Object resultPayload) {
            this.resultPayload = resultPayload;
            return this;
        }
        public Object getResultPayload() {
            return this.resultPayload;
        }

        public GetWorkItemAuditResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkItemAuditResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetWorkItemAuditResponseBodyItems setTodoId(String todoId) {
            this.todoId = todoId;
            return this;
        }
        public String getTodoId() {
            return this.todoId;
        }

    }

}
