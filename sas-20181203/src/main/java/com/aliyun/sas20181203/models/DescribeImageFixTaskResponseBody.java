// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixTaskResponseBody extends TeaModel {
    /**
     * <p>The tasks returned.</p>
     */
    @NameInMap("BuildTasks")
    public java.util.List<DescribeImageFixTaskResponseBodyBuildTasks> buildTasks;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageFixTaskResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8AC52BBA-85D3-5F64-9B48-D08437CAF916</p>
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
         * 
         * <strong>example:</strong>
         * <p>ivf-939536b5-c3ca-427b-8183-91007756</p>
         */
        @NameInMap("BuildTaskId")
        public String buildTaskId;

        /**
         * <p>The timestamp when the task starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-14 20:34:07</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The timestamp when the task ends. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-14 20:32:05</p>
         */
        @NameInMap("FixTime")
        public String fixTime;

        /**
         * <p>The version of the image after image risks are fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>redhat8-vault</p>
         */
        @NameInMap("NewTag")
        public String newTag;

        /**
         * <p>The UUID of the image after image risks are fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>2fa731681911ae8d1b5f11893ace****</p>
         */
        @NameInMap("NewUuid")
        public String newUuid;

        /**
         * <p>The version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos8.1-ja</p>
         */
        @NameInMap("OldTag")
        public String oldTag;

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>2fa731681911ae8d1b5f11893ace****</p>
         */
        @NameInMap("OldUuid")
        public String oldUuid;

        /**
         * <p>The region of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test-redhat</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>name-002</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The task is running.</li>
         * <li><strong>2</strong>: The task is successful.</li>
         * <li><strong>3</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the task. The value is fixed as IMAGE_REPAIR. The value indicates a task that fixes image risks.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_REPAIR</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The alias of the fixed vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2007-5686:rpath_linux Information Disclosure</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page. Default value: <strong>1</strong></p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong></p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of tasks returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
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
