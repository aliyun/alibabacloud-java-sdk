// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <p>A response field retained for backward compatibility. This field is not used for pagination. Do not rely on this field.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A response field retained for backward compatibility. This field is not used for pagination. Do not rely on this field.</p>
     * 
     * <strong>example:</strong>
     * <p>Token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of projects on the current page.</p>
     */
    @NameInMap("ProjectList")
    public java.util.List<ListProjectsResponseBodyProjectList> projectList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProjectsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProjectsResponseBody setProjectList(java.util.List<ListProjectsResponseBodyProjectList> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<ListProjectsResponseBodyProjectList> getProjectList() {
        return this.projectList;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectsResponseBodyProjectList extends TeaModel {
        /**
         * <p>The permissions of the current caller in the project. For example, Manage indicates management permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>Manage</p>
         */
        @NameInMap("Auth")
        public String auth;

        /**
         * <p>The URL of the cover image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/cover.png">https://example.com/cover.png</a></p>
         */
        @NameInMap("CoverUrl")
        public String coverUrl;

        /**
         * <p>The creation time. The time is in UTC and follows the ISO 8601 standard, ending with Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-07T02:21:36Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The username of the user who created the project.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_183320****</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The description of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>Product demo project</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_061716****</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>Product Demo</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_zna577pdximv***</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListProjectsResponseBodyProjectList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyProjectList self = new ListProjectsResponseBodyProjectList();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyProjectList setAuth(String auth) {
            this.auth = auth;
            return this;
        }
        public String getAuth() {
            return this.auth;
        }

        public ListProjectsResponseBodyProjectList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListProjectsResponseBodyProjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectsResponseBodyProjectList setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListProjectsResponseBodyProjectList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyProjectList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListProjectsResponseBodyProjectList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListProjectsResponseBodyProjectList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
