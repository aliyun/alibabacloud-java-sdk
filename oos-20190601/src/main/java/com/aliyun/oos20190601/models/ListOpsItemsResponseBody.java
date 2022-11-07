// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListOpsItemsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OpsItems")
    public java.util.List<ListOpsItemsResponseBodyOpsItems> opsItems;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOpsItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOpsItemsResponseBody self = new ListOpsItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOpsItemsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOpsItemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOpsItemsResponseBody setOpsItems(java.util.List<ListOpsItemsResponseBodyOpsItems> opsItems) {
        this.opsItems = opsItems;
        return this;
    }
    public java.util.List<ListOpsItemsResponseBodyOpsItems> getOpsItems() {
        return this.opsItems;
    }

    public ListOpsItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpsItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOpsItemsResponseBodyOpsItems extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("OpsItemId")
        public String opsItemId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Resources")
        public java.util.List<String> resources;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("Title")
        public String title;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListOpsItemsResponseBodyOpsItems build(java.util.Map<String, ?> map) throws Exception {
            ListOpsItemsResponseBodyOpsItems self = new ListOpsItemsResponseBodyOpsItems();
            return TeaModel.build(map, self);
        }

        public ListOpsItemsResponseBodyOpsItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListOpsItemsResponseBodyOpsItems setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListOpsItemsResponseBodyOpsItems setOpsItemId(String opsItemId) {
            this.opsItemId = opsItemId;
            return this;
        }
        public String getOpsItemId() {
            return this.opsItemId;
        }

        public ListOpsItemsResponseBodyOpsItems setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListOpsItemsResponseBodyOpsItems setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<String> getResources() {
            return this.resources;
        }

        public ListOpsItemsResponseBodyOpsItems setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListOpsItemsResponseBodyOpsItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListOpsItemsResponseBodyOpsItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOpsItemsResponseBodyOpsItems setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListOpsItemsResponseBodyOpsItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListOpsItemsResponseBodyOpsItems setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
