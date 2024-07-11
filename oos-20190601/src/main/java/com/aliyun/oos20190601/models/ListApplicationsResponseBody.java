// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListApplicationsResponseBodyApplications> applications;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>12067D53-56A9-561B-ADD6-61429D207117</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setApplications(java.util.List<ListApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListApplicationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationsResponseBodyApplications extends TeaModel {
        /**
         * <p>The type of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T09:09:59Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Application</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>MyApplication</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags added to the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;: &quot;v1&quot;,&quot;k2&quot;: &quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The time when the application was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-07T09:09:59Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplications self = new ListApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplications setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListApplicationsResponseBodyApplications setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListApplicationsResponseBodyApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsResponseBodyApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationsResponseBodyApplications setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListApplicationsResponseBodyApplications setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListApplicationsResponseBodyApplications setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
