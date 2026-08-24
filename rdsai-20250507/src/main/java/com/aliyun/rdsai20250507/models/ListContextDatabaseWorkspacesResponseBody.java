// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseWorkspacesResponseBody extends TeaModel {
    /**
     * <p>This field is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>(null)</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This field is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>(null)</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of workspaces.</p>
     */
    @NameInMap("Workspaces")
    public java.util.List<ListContextDatabaseWorkspacesResponseBodyWorkspaces> workspaces;

    public static ListContextDatabaseWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseWorkspacesResponseBody self = new ListContextDatabaseWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseWorkspacesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContextDatabaseWorkspacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListContextDatabaseWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseWorkspacesResponseBody setWorkspaces(java.util.List<ListContextDatabaseWorkspacesResponseBodyWorkspaces> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<ListContextDatabaseWorkspacesResponseBodyWorkspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static class ListContextDatabaseWorkspacesResponseBodyWorkspaces extends TeaModel {
        /**
         * <p>The time when the workspace was created, in ISO-8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The workspace status.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The workspace type.</p>
         * 
         * <strong>example:</strong>
         * <p>personal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-as1llqmkol****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-workspace</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListContextDatabaseWorkspacesResponseBodyWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseWorkspacesResponseBodyWorkspaces self = new ListContextDatabaseWorkspacesResponseBodyWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseWorkspacesResponseBodyWorkspaces setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListContextDatabaseWorkspacesResponseBodyWorkspaces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListContextDatabaseWorkspacesResponseBodyWorkspaces setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListContextDatabaseWorkspacesResponseBodyWorkspaces setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListContextDatabaseWorkspacesResponseBodyWorkspaces setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
