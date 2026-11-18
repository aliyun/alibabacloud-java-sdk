// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <p>The project details.</p>
     */
    @NameInMap("Project")
    public GetProjectResponseBodyProject project;

    /**
     * <p>The request ID used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setProject(GetProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public GetProjectResponseBodyProject getProject() {
        return this.project;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectResponseBodyProject extends TeaModel {
        /**
         * <p>The permissions of the current caller on the project. For example, Manage indicates management permissions.</p>
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
         * <p>The time when the project was created, in UTC and ISO 8601 format, ending with Z.</p>
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

        public static GetProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyProject self = new GetProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyProject setAuth(String auth) {
            this.auth = auth;
            return this;
        }
        public String getAuth() {
            return this.auth;
        }

        public GetProjectResponseBodyProject setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public GetProjectResponseBodyProject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProjectResponseBodyProject setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public GetProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectResponseBodyProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetProjectResponseBodyProject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetProjectResponseBodyProject setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
