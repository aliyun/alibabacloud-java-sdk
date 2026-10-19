// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListTodosResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>是否还有更多数据</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>当前页待办列表</p>
     */
    @NameInMap("items")
    public java.util.List<ListTodosResponseBodyItems> items;

    /**
     * <p>本次生效的单页最大返回数量</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>下一页翻页令牌；无更多数据时为空字符串</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>当前页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>生效单页条数</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>筛选条件下可见总数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListTodosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTodosResponseBody self = new ListTodosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTodosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTodosResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListTodosResponseBody setItems(java.util.List<ListTodosResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListTodosResponseBodyItems> getItems() {
        return this.items;
    }

    public ListTodosResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTodosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTodosResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTodosResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListTodosResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTodosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTodosResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListTodosResponseBodyItems extends TeaModel {
        /**
         * <p>处理人数量</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("assigneeCount")
        public Long assigneeCount;

        /**
         * <p>完成时间（北京时间 YYYY-MM-DD HH:mm:ss）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        @NameInMap("completedAt")
        public String completedAt;

        /**
         * <p>完成人用户ID；未完成为空</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("completedByUserId")
        public String completedByUserId;

        /**
         * <p>完成人姓名；未完成为空</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("completedByUserName")
        public String completedByUserName;

        /**
         * <p>创建时间（北京时间 YYYY-MM-DD HH:mm:ss）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>最后修改时间（北京时间 YYYY-MM-DD HH:mm:ss）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>调用者是否已读</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isRead")
        public Boolean isRead;

        /**
         * <p>发出该待办的 assistant 消息ID；无会话来源为空</p>
         * 
         * <strong>example:</strong>
         * <p>msg-1</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>调用者的处理人行状态</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("myAssigneeStatus")
        public String myAssigneeStatus;

        /**
         * <p>调用者的列表展示状态</p>
         * 
         * <strong>example:</strong>
         * <p>TODO</p>
         */
        @NameInMap("myDisplayState")
        public String myDisplayState;

        /**
         * <p>优先级</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("priority")
        public String priority;

        /**
         * <p>问题数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("questionCount")
        public Long questionCount;

        /**
         * <p>问题摘要列表</p>
         */
        @NameInMap("questionSummaries")
        public java.util.List<String> questionSummaries;

        /**
         * <p>来源上下文（创建时原样透传）</p>
         * 
         * <strong>example:</strong>
         * <p>source=openapi</p>
         */
        @NameInMap("sourceContext")
        public java.util.Map<String, ?> sourceContext;

        /**
         * <p>待办来源类型</p>
         * 
         * <strong>example:</strong>
         * <p>WORKFLOW</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>待办主状态</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>待办标题</p>
         * 
         * <strong>example:</strong>
         * <p>治理审批</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>待办ID</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        @NameInMap("todoId")
        public String todoId;

        public static ListTodosResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListTodosResponseBodyItems self = new ListTodosResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListTodosResponseBodyItems setAssigneeCount(Long assigneeCount) {
            this.assigneeCount = assigneeCount;
            return this;
        }
        public Long getAssigneeCount() {
            return this.assigneeCount;
        }

        public ListTodosResponseBodyItems setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public ListTodosResponseBodyItems setCompletedByUserId(String completedByUserId) {
            this.completedByUserId = completedByUserId;
            return this;
        }
        public String getCompletedByUserId() {
            return this.completedByUserId;
        }

        public ListTodosResponseBodyItems setCompletedByUserName(String completedByUserName) {
            this.completedByUserName = completedByUserName;
            return this;
        }
        public String getCompletedByUserName() {
            return this.completedByUserName;
        }

        public ListTodosResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTodosResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListTodosResponseBodyItems setIsRead(Boolean isRead) {
            this.isRead = isRead;
            return this;
        }
        public Boolean getIsRead() {
            return this.isRead;
        }

        public ListTodosResponseBodyItems setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListTodosResponseBodyItems setMyAssigneeStatus(String myAssigneeStatus) {
            this.myAssigneeStatus = myAssigneeStatus;
            return this;
        }
        public String getMyAssigneeStatus() {
            return this.myAssigneeStatus;
        }

        public ListTodosResponseBodyItems setMyDisplayState(String myDisplayState) {
            this.myDisplayState = myDisplayState;
            return this;
        }
        public String getMyDisplayState() {
            return this.myDisplayState;
        }

        public ListTodosResponseBodyItems setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListTodosResponseBodyItems setQuestionCount(Long questionCount) {
            this.questionCount = questionCount;
            return this;
        }
        public Long getQuestionCount() {
            return this.questionCount;
        }

        public ListTodosResponseBodyItems setQuestionSummaries(java.util.List<String> questionSummaries) {
            this.questionSummaries = questionSummaries;
            return this;
        }
        public java.util.List<String> getQuestionSummaries() {
            return this.questionSummaries;
        }

        public ListTodosResponseBodyItems setSourceContext(java.util.Map<String, ?> sourceContext) {
            this.sourceContext = sourceContext;
            return this;
        }
        public java.util.Map<String, ?> getSourceContext() {
            return this.sourceContext;
        }

        public ListTodosResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListTodosResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTodosResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListTodosResponseBodyItems setTodoId(String todoId) {
            this.todoId = todoId;
            return this;
        }
        public String getTodoId() {
            return this.todoId;
        }

    }

}
