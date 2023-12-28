// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListActionsResponseBody extends TeaModel {
    @NameInMap("Actions")
    public java.util.List<ListActionsResponseBodyActions> actions;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActionsResponseBody self = new ListActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActionsResponseBody setActions(java.util.List<ListActionsResponseBodyActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<ListActionsResponseBodyActions> getActions() {
        return this.actions;
    }

    public ListActionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListActionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListActionsResponseBodyActions extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("OOSActionName")
        public String OOSActionName;

        @NameInMap("Popularity")
        public Integer popularity;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListActionsResponseBodyActions build(java.util.Map<String, ?> map) throws Exception {
            ListActionsResponseBodyActions self = new ListActionsResponseBodyActions();
            return TeaModel.build(map, self);
        }

        public ListActionsResponseBodyActions setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ListActionsResponseBodyActions setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListActionsResponseBodyActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListActionsResponseBodyActions setOOSActionName(String OOSActionName) {
            this.OOSActionName = OOSActionName;
            return this;
        }
        public String getOOSActionName() {
            return this.OOSActionName;
        }

        public ListActionsResponseBodyActions setPopularity(Integer popularity) {
            this.popularity = popularity;
            return this;
        }
        public Integer getPopularity() {
            return this.popularity;
        }

        public ListActionsResponseBodyActions setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListActionsResponseBodyActions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListActionsResponseBodyActions setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
