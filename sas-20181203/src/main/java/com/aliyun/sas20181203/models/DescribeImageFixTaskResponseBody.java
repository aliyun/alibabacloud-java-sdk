// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixTaskResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the tasks returned.</p>
     */
    @NameInMap("BuildTasks")
    public java.util.List<DescribeImageFixTaskResponseBodyBuildTasks> buildTasks;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageFixTaskResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageFixTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFixTaskResponseBody self = new DescribeImageFixTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageFixTaskResponseBody setBuildTasks(java.util.List<DescribeImageFixTaskResponseBodyBuildTasks> buildTasks) {
        this.buildTasks = buildTasks;
        return this;
    }
    public java.util.List<DescribeImageFixTaskResponseBodyBuildTasks> getBuildTasks() {
        return this.buildTasks;
    }

    public DescribeImageFixTaskResponseBody setPageInfo(DescribeImageFixTaskResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageFixTaskResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageFixTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageFixTaskResponseBodyBuildTasks extends TeaModel {
        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("BuildTaskId")
        public String buildTaskId;

        /**
         * <p>The timestamp when the task starts. Unit: milliseconds.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The timestamp when the task ends. Unit: milliseconds.</p>
         */
        @NameInMap("FixTime")
        public String fixTime;

        /**
         * <p>The version of the image after image risks are fixed.</p>
         */
        @NameInMap("NewTag")
        public String newTag;

        /**
         * <p>The UUID of the image after image risks are fixed.</p>
         */
        @NameInMap("NewUuid")
        public String newUuid;

        /**
         * <p>The version of the image.</p>
         */
        @NameInMap("OldTag")
        public String oldTag;

        /**
         * <p>The UUID of the image.</p>
         */
        @NameInMap("OldUuid")
        public String oldUuid;

        /**
         * <p>The region of the image.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the image repository.</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace of the image.</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **1**: The task is running.</p>
         * <p>*   **2**: The task is successful.</p>
         * <p>*   **3**: The task failed.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the task. The value is fixed as IMAGE_REPAIR, which indicates a task that fixes image risks.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("VulAlias")
        public String vulAlias;

        public static DescribeImageFixTaskResponseBodyBuildTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFixTaskResponseBodyBuildTasks self = new DescribeImageFixTaskResponseBodyBuildTasks();
            return TeaModel.build(map, self);
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setBuildTaskId(String buildTaskId) {
            this.buildTaskId = buildTaskId;
            return this;
        }
        public String getBuildTaskId() {
            return this.buildTaskId;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setFixTime(String fixTime) {
            this.fixTime = fixTime;
            return this;
        }
        public String getFixTime() {
            return this.fixTime;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setNewTag(String newTag) {
            this.newTag = newTag;
            return this;
        }
        public String getNewTag() {
            return this.newTag;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setNewUuid(String newUuid) {
            this.newUuid = newUuid;
            return this;
        }
        public String getNewUuid() {
            return this.newUuid;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setOldTag(String oldTag) {
            this.oldTag = oldTag;
            return this;
        }
        public String getOldTag() {
            return this.oldTag;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setOldUuid(String oldUuid) {
            this.oldUuid = oldUuid;
            return this;
        }
        public String getOldUuid() {
            return this.oldUuid;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeImageFixTaskResponseBodyBuildTasks setVulAlias(String vulAlias) {
            this.vulAlias = vulAlias;
            return this;
        }
        public String getVulAlias() {
            return this.vulAlias;
        }

    }

    public static class DescribeImageFixTaskResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of tasks returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page. Default value: **1**.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: **20**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of tasks returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageFixTaskResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFixTaskResponseBodyPageInfo self = new DescribeImageFixTaskResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageFixTaskResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageFixTaskResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageFixTaskResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageFixTaskResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
