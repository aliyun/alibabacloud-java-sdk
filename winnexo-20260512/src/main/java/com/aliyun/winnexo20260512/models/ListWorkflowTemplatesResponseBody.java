// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkflowTemplatesResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether more data exists.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The list of template summaries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;id\&quot;:\&quot;item_9401\&quot;}]</p>
     */
    @NameInMap("items")
    public java.util.List<ListWorkflowTemplatesResponseBodyItems> items;

    /**
     * <p>The effective maximum number of entries to return per page for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page. An empty string indicates that no more data exists.</p>
     * 
     * <strong>example:</strong>
     * <p>tok_9401</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The effective number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of visible items under the filter conditions.</p>
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
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard process for handling customer complaints</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The current effective version number. An empty value indicates that only a draft exists and the template cannot be used for work items.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("effectiveVersion")
        public String effectiveVersion;

        /**
         * <p>The time of the last modification. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:00:00Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The latest version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        /**
         * <p>The status of the latest version. Valid values:</p>
         * <ul>
         * <li>DRAFT: Draft. Unsubmitted edits exist.</li>
         * <li>SUBMITTED: Submitted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("latestVersionStatus")
        public String latestVersionStatus;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer complaint handling process</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of owners.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ownerCount")
        public Long ownerCount;

        /**
         * <p>The number of steps configured with reviewers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("reviewStepCount")
        public Long reviewStepCount;

        /**
         * <p>The number of steps.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stepCount")
        public Long stepCount;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl_9401</p>
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

        public ListWorkflowTemplatesResponseBodyItems setEffectiveVersion(String effectiveVersion) {
            this.effectiveVersion = effectiveVersion;
            return this;
        }
        public String getEffectiveVersion() {
            return this.effectiveVersion;
        }

        public ListWorkflowTemplatesResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListWorkflowTemplatesResponseBodyItems setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListWorkflowTemplatesResponseBodyItems setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
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
