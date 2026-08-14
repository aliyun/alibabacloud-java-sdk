// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Projects")
    public java.util.List<ListProjectsResponseBodyProjects> projects;

    /**
     * <strong>example:</strong>
     * <p>81500666-d7f5-4143-8329-0223cc738105</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public ListProjectsResponseBody setProjects(java.util.List<ListProjectsResponseBodyProjects> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<ListProjectsResponseBodyProjects> getProjects() {
        return this.projects;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectsResponseBodyProjects extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AppCount")
        public Long appCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatabaseCount")
        public Long databaseCount;

        /**
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("HostCount")
        public Long hostCount;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("MemberIds")
        public java.util.List<String> memberIds;

        /**
         * <strong>example:</strong>
         * <p>Project_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ListProjectsResponseBodyProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyProjects self = new ListProjectsResponseBodyProjects();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyProjects setAppCount(Long appCount) {
            this.appCount = appCount;
            return this;
        }
        public Long getAppCount() {
            return this.appCount;
        }

        public ListProjectsResponseBodyProjects setDatabaseCount(Long databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }
        public Long getDatabaseCount() {
            return this.databaseCount;
        }

        public ListProjectsResponseBodyProjects setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyProjects setHostCount(Long hostCount) {
            this.hostCount = hostCount;
            return this;
        }
        public Long getHostCount() {
            return this.hostCount;
        }

        public ListProjectsResponseBodyProjects setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProjectsResponseBodyProjects setMemberIds(java.util.List<String> memberIds) {
            this.memberIds = memberIds;
            return this;
        }
        public java.util.List<String> getMemberIds() {
            return this.memberIds;
        }

        public ListProjectsResponseBodyProjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyProjects setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
