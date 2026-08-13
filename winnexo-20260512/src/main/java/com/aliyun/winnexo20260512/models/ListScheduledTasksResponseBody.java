// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListScheduledTasksResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>是否有更多数据</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    @NameInMap("items")
    public java.util.List<ListScheduledTasksResponseBodyItems> items;

    /**
     * <p>本次实际生效的单页最大返回数量</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>下一页翻页令牌，原样回传即可取下一页；无更多数据时为空字符串</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>当前页码（实际生效值）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页条数（实际生效值）</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>满足条件的总数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListScheduledTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledTasksResponseBody self = new ListScheduledTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduledTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScheduledTasksResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListScheduledTasksResponseBody setItems(java.util.List<ListScheduledTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListScheduledTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public ListScheduledTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListScheduledTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScheduledTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScheduledTasksResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListScheduledTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListScheduledTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduledTasksResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListScheduledTasksResponseBodyItems extends TeaModel {
        /**
         * <p>创建人</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>Cron 表达式</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("cronExpression")
        public String cronExpression;

        /**
         * <p>任务简述</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>累计执行次数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("executionCount")
        public Long executionCount;

        /**
         * <p>创建时间 ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>修改时间 ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>是否公开</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOpen")
        public Boolean isOpen;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>任务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTaskId</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>触发类型（manual/cron/event）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        public static ListScheduledTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListScheduledTasksResponseBodyItems self = new ListScheduledTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListScheduledTasksResponseBodyItems setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListScheduledTasksResponseBodyItems setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ListScheduledTasksResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScheduledTasksResponseBodyItems setExecutionCount(Long executionCount) {
            this.executionCount = executionCount;
            return this;
        }
        public Long getExecutionCount() {
            return this.executionCount;
        }

        public ListScheduledTasksResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListScheduledTasksResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListScheduledTasksResponseBodyItems setIsOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        public ListScheduledTasksResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScheduledTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListScheduledTasksResponseBodyItems setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
