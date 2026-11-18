// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of workspaces that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of workspaces on the current page.</p>
     */
    @NameInMap("WorkspaceList")
    public java.util.List<ListWorkspacesResponseBodyWorkspaceList> workspaceList;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListWorkspacesResponseBody setWorkspaceList(java.util.List<ListWorkspacesResponseBodyWorkspaceList> workspaceList) {
        this.workspaceList = workspaceList;
        return this;
    }
    public java.util.List<ListWorkspacesResponseBodyWorkspaceList> getWorkspaceList() {
        return this.workspaceList;
    }

    public static class ListWorkspacesResponseBodyWorkspaceList extends TeaModel {
        /**
         * <p>The workspace code.</p>
         * 
         * <strong>example:</strong>
         * <p>c40***</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The creation time. The time follows the ISO 8601 standard and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-07T02:21:36Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the default project for the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_061716****</p>
         */
        @NameInMap("DefaultProjectId")
        public String defaultProjectId;

        /**
         * <p>The workspace status. Valid values: Online: enabled. Offline: disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>Video Production Workspace</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The current number of users in the workspace, returned as a string.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UserCount")
        public String userCount;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_zna577pdximv***</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListWorkspacesResponseBodyWorkspaceList build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspaceList self = new ListWorkspacesResponseBodyWorkspaceList();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspaceList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListWorkspacesResponseBodyWorkspaceList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWorkspacesResponseBodyWorkspaceList setDefaultProjectId(String defaultProjectId) {
            this.defaultProjectId = defaultProjectId;
            return this;
        }
        public String getDefaultProjectId() {
            return this.defaultProjectId;
        }

        public ListWorkspacesResponseBodyWorkspaceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkspacesResponseBodyWorkspaceList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListWorkspacesResponseBodyWorkspaceList setUserCount(String userCount) {
            this.userCount = userCount;
            return this;
        }
        public String getUserCount() {
            return this.userCount;
        }

        public ListWorkspacesResponseBodyWorkspaceList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
