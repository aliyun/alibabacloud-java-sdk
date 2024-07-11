// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListActionsResponseBody extends TeaModel {
    /**
     * <p>The details of the actions.</p>
     */
    @NameInMap("Actions")
    public java.util.List<ListActionsResponseBodyActions> actions;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F9154C02-F847-4563-BB6A-6DD01A4F0</p>
     */
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
        /**
         * <p>The type of the action.</p>
         * <ol>
         * <li><p>Atomic actions</p>
         * <ul>
         * <li>Atomic.API</li>
         * <li>Atomic.Trigger</li>
         * <li>Atomic.Control</li>
         * <li>Atomic.Embedded</li>
         * </ul>
         * </li>
         * <li><p>Cloud product actions</p>
         * <ul>
         * <li>Product.ECS</li>
         * <li>Product.RDS</li>
         * <li>Product.VPC</li>
         * <li>Product.FC</li>
         * <li>...</li>
         * </ul>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>ACS::Template</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The time when the action was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the action.</p>
         * 
         * <strong>example:</strong>
         * <p>ReplaceSystemDisk</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the action.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::ReplaceSystemDisk</p>
         */
        @NameInMap("OOSActionName")
        public String OOSActionName;

        /**
         * <p>The number of times that the action is used.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Popularity")
        public Integer popularity;

        /**
         * <p>The parameters of the action.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;ImageId&quot;: { &quot;Description&quot;: &quot;The mirror ID you will use when resetting the system&quot;, &quot;Type&quot;: &quot;String&quot; }, &quot;InstanceId&quot;: { &quot;Description&quot;: &quot;the instance id that you will handle .&quot;, &quot;Type&quot;: &quot;String&quot; } }</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The version of the template that corresponds to the action.</p>
         * <blockquote>
         * <p> For atomic actions, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

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

    }

}
