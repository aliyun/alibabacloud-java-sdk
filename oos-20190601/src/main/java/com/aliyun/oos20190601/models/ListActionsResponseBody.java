// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListActionsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Actions")
    public java.util.List<ListActionsResponseBodyActions> actions;

    public static ListActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActionsResponseBody self = new ListActionsResponseBody();
        return TeaModel.build(map, self);
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

    public ListActionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListActionsResponseBody setActions(java.util.List<ListActionsResponseBodyActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<ListActionsResponseBodyActions> getActions() {
        return this.actions;
    }

    public static class ListActionsResponseBodyActions extends TeaModel {
        @NameInMap("Popularity")
        public Integer popularity;

        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("OOSActionName")
        public String OOSActionName;

        @NameInMap("Properties")
        public String properties;

        public static ListActionsResponseBodyActions build(java.util.Map<String, ?> map) throws Exception {
            ListActionsResponseBodyActions self = new ListActionsResponseBodyActions();
            return TeaModel.build(map, self);
        }

        public ListActionsResponseBodyActions setPopularity(Integer popularity) {
            this.popularity = popularity;
            return this;
        }
        public Integer getPopularity() {
            return this.popularity;
        }

        public ListActionsResponseBodyActions setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ListActionsResponseBodyActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListActionsResponseBodyActions setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListActionsResponseBodyActions setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListActionsResponseBodyActions setOOSActionName(String OOSActionName) {
            this.OOSActionName = OOSActionName;
            return this;
        }
        public String getOOSActionName() {
            return this.OOSActionName;
        }

        public ListActionsResponseBodyActions setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

    }

}
