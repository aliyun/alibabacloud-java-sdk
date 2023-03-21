// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixTaskResponseBody extends TeaModel {
    @NameInMap("BuildTasks")
    public java.util.List<DescribeImageFixTaskResponseBodyBuildTasks> buildTasks;

    @NameInMap("PageInfo")
    public DescribeImageFixTaskResponseBodyPageInfo pageInfo;

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
        @NameInMap("BuildTaskId")
        public String buildTaskId;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("FixTime")
        public String fixTime;

        @NameInMap("NewTag")
        public String newTag;

        @NameInMap("NewUuid")
        public String newUuid;

        @NameInMap("OldTag")
        public String oldTag;

        @NameInMap("OldUuid")
        public String oldUuid;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        @NameInMap("Status")
        public Integer status;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
