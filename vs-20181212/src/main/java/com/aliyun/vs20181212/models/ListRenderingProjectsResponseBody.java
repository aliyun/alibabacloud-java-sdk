// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingProjectsResponseBody extends TeaModel {
    /**
     * <p>The list of projects.</p>
     */
    @NameInMap("Projects")
    public java.util.List<ListRenderingProjectsResponseBodyProjects> projects;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of matched projects.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRenderingProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingProjectsResponseBody self = new ListRenderingProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRenderingProjectsResponseBody setProjects(java.util.List<ListRenderingProjectsResponseBodyProjects> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<ListRenderingProjectsResponseBodyProjects> getProjects() {
        return this.projects;
    }

    public ListRenderingProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRenderingProjectsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRenderingProjectsResponseBodyProjectsSessionAttribs extends TeaModel {
        /**
         * <p>The startup mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Sync</p>
         */
        @NameInMap("StartMode")
        public String startMode;

        public static ListRenderingProjectsResponseBodyProjectsSessionAttribs build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingProjectsResponseBodyProjectsSessionAttribs self = new ListRenderingProjectsResponseBodyProjectsSessionAttribs();
            return TeaModel.build(map, self);
        }

        public ListRenderingProjectsResponseBodyProjectsSessionAttribs setStartMode(String startMode) {
            this.startMode = startMode;
            return this;
        }
        public String getStartMode() {
            return this.startMode;
        }

    }

    public static class ListRenderingProjectsResponseBodyProjects extends TeaModel {
        /**
         * <p>The time when the project was created. The time follows the ISO 8601 standard and includes a time zone offset in the YYYY-MM-DDTHH:mm:ss+HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-09T18:44:49+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The project description.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The session attributes of the project.</p>
         */
        @NameInMap("SessionAttribs")
        public ListRenderingProjectsResponseBodyProjectsSessionAttribs sessionAttribs;

        /**
         * <p>The time when the project was updated. The time follows the ISO 8601 standard and includes a time zone offset in the YYYY-MM-DDTHH:mm:ss+HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-09T18:44:49+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListRenderingProjectsResponseBodyProjects build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingProjectsResponseBodyProjects self = new ListRenderingProjectsResponseBodyProjects();
            return TeaModel.build(map, self);
        }

        public ListRenderingProjectsResponseBodyProjects setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListRenderingProjectsResponseBodyProjects setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRenderingProjectsResponseBodyProjects setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListRenderingProjectsResponseBodyProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListRenderingProjectsResponseBodyProjects setSessionAttribs(ListRenderingProjectsResponseBodyProjectsSessionAttribs sessionAttribs) {
            this.sessionAttribs = sessionAttribs;
            return this;
        }
        public ListRenderingProjectsResponseBodyProjectsSessionAttribs getSessionAttribs() {
            return this.sessionAttribs;
        }

        public ListRenderingProjectsResponseBodyProjects setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
