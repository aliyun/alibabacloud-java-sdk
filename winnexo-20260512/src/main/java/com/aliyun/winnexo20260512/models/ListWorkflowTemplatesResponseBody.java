// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkflowTemplatesResponseBody extends TeaModel {
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
     * <p>当前页模板摘要列表</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("items")
    public java.util.List<ListWorkflowTemplatesResponseBodyItems> items;

    /**
     * <p>本次生效的单页最大返回数量</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>1</p>
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

    public static ListWorkflowTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTemplatesResponseBody self = new ListWorkflowTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkflowTemplatesResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListWorkflowTemplatesResponseBody setItems(java.util.List<ListWorkflowTemplatesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListWorkflowTemplatesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListWorkflowTemplatesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListWorkflowTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkflowTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkflowTemplatesResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListWorkflowTemplatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWorkflowTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowTemplatesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListWorkflowTemplatesResponseBodyItems extends TeaModel {
        /**
         * <p>模板描述</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>最近修改时间(ISO8601)</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>模板名称</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>去重后的负责人数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ownerCount")
        public Long ownerCount;

        /**
         * <p>配置了审核人的步骤数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("reviewStepCount")
        public Long reviewStepCount;

        /**
         * <p>步骤数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stepCount")
        public Long stepCount;

        /**
         * <p>模板ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("templateId")
        public String templateId;

        public static ListWorkflowTemplatesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowTemplatesResponseBodyItems self = new ListWorkflowTemplatesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListWorkflowTemplatesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkflowTemplatesResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListWorkflowTemplatesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowTemplatesResponseBodyItems setOwnerCount(Long ownerCount) {
            this.ownerCount = ownerCount;
            return this;
        }
        public Long getOwnerCount() {
            return this.ownerCount;
        }

        public ListWorkflowTemplatesResponseBodyItems setReviewStepCount(Long reviewStepCount) {
            this.reviewStepCount = reviewStepCount;
            return this;
        }
        public Long getReviewStepCount() {
            return this.reviewStepCount;
        }

        public ListWorkflowTemplatesResponseBodyItems setStepCount(Long stepCount) {
            this.stepCount = stepCount;
            return this;
        }
        public Long getStepCount() {
            return this.stepCount;
        }

        public ListWorkflowTemplatesResponseBodyItems setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
