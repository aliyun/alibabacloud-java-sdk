// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkItemAuditResponseBody extends TeaModel {
    /**
     * <p>The common business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The complete work item audit records sorted in descending order of event time.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;eventId&quot;:&quot;evt_example&quot;,&quot;eventType&quot;:&quot;WORK_ITEM_UPDATED&quot;,&quot;occurredAt&quot;:&quot;2026-11-05T08:00:00Z&quot;,&quot;status&quot;:&quot;SUCCESS&quot;}]</p>
     */
    @NameInMap("items")
    public java.util.List<GetWorkItemAuditResponseBodyItems> items;

    /**
     * <p>The common error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID.</p>
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
         * <p>The list of field change details. Each item includes the changed field and its values before and after the change.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;title&quot;,&quot;before&quot;:&quot;Old title&quot;,&quot;after&quot;:&quot;New title&quot;}]</p>
         */
        @NameInMap("changes")
        public Object changes;

        /**
         * <p>The event description.</p>
         * 
         * <strong>example:</strong>
         * <p>The work item title is changed to Quarterly Sales Opportunity Review</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The unique identifier of the audit event.</p>
         * 
         * <strong>example:</strong>
         * <p>evt_20261105_0001</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <p>The audit event type, such as WORK_ITEM_UPDATED or TODO_COMPLETED.</p>
         * 
         * <strong>example:</strong>
         * <p>WORK_ITEM_UPDATED</p>
         */
        @NameInMap("eventType")
        public String eventType;

        /**
         * <p>The time when the event occurred, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:00:00Z</p>
         */
        @NameInMap("occurredAt")
        public String occurredAt;

        /**
         * <p>The display name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("operatorName")
        public String operatorName;

        /**
         * <p>The user ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("operatorUserId")
        public String operatorUserId;

        /**
         * <p>The list of questions to be confirmed related to the event.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;question&quot;:&quot;Whether to continue execution&quot;}]</p>
         */
        @NameInMap("questions")
        public java.util.List<?> questions;

        /**
         * <p>The event result payload as a JSON object. If no result is available, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;result&quot;:&quot;ok&quot;}</p>
         */
        @NameInMap("resultPayload")
        public Object resultPayload;

        /**
         * <p>The event status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The event title.</p>
         * 
         * <strong>example:</strong>
         * <p>Investigate sales opportunities</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The ID of the associated to-do item. If no to-do item is associated, an empty string is returned.</p>
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
