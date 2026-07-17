// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListYikeWorkspacesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of workspaces.</p>
     * 
     * <strong>example:</strong>
     * <p>54</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of workspaces.</p>
     */
    @NameInMap("WorkspaceList")
    public java.util.List<ListYikeWorkspacesResponseBodyWorkspaceList> workspaceList;

    public static ListYikeWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListYikeWorkspacesResponseBody self = new ListYikeWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListYikeWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListYikeWorkspacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListYikeWorkspacesResponseBody setWorkspaceList(java.util.List<ListYikeWorkspacesResponseBodyWorkspaceList> workspaceList) {
        this.workspaceList = workspaceList;
        return this;
    }
    public java.util.List<ListYikeWorkspacesResponseBodyWorkspaceList> getWorkspaceList() {
        return this.workspaceList;
    }

    public static class ListYikeWorkspacesResponseBodyWorkspaceList extends TeaModel {
        /**
         * <p>The workspace code.</p>
         * 
         * <strong>example:</strong>
         * <p>ABCD12</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-29T10:22:44Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The default project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_1234***</p>
         */
        @NameInMap("DefaultProductionId")
        public String defaultProductionId;

        /**
         * <p>The workspace status.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The number of users in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserCount")
        public String userCount;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_1243****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListYikeWorkspacesResponseBodyWorkspaceList build(java.util.Map<String, ?> map) throws Exception {
            ListYikeWorkspacesResponseBodyWorkspaceList self = new ListYikeWorkspacesResponseBodyWorkspaceList();
            return TeaModel.build(map, self);
        }

        public ListYikeWorkspacesResponseBodyWorkspaceList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListYikeWorkspacesResponseBodyWorkspaceList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListYikeWorkspacesResponseBodyWorkspaceList setDefaultProductionId(String defaultProductionId) {
            this.defaultProductionId = defaultProductionId;
            return this;
        }
        public String getDefaultProductionId() {
            return this.defaultProductionId;
        }

        public ListYikeWorkspacesResponseBodyWorkspaceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListYikeWorkspacesResponseBodyWorkspaceList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListYikeWorkspacesResponseBodyWorkspaceList setUserCount(String userCount) {
            this.userCount = userCount;
            return this;
        }
        public String getUserCount() {
            return this.userCount;
        }

        public ListYikeWorkspacesResponseBodyWorkspaceList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
