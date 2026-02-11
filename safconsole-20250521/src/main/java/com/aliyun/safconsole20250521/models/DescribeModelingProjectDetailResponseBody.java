// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelingProjectDetailResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result.</p>
     */
    @NameInMap("ResultObject")
    public DescribeModelingProjectDetailResponseBodyResultObject resultObject;

    /**
     * <p>Whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: Call succeeded.</li>
     * <li><strong>false</strong>: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeModelingProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelingProjectDetailResponseBody self = new DescribeModelingProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelingProjectDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeModelingProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelingProjectDetailResponseBody setResultObject(DescribeModelingProjectDetailResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeModelingProjectDetailResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeModelingProjectDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeModelingProjectDetailResponseBodyResultObjectPocTasks extends TeaModel {
        /**
         * <p>Retrospective file name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Service code</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>File synchronization status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Retrospective task name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static DescribeModelingProjectDetailResponseBodyResultObjectPocTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelingProjectDetailResponseBodyResultObjectPocTasks self = new DescribeModelingProjectDetailResponseBodyResultObjectPocTasks();
            return TeaModel.build(map, self);
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectPocTasks setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectPocTasks setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectPocTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectPocTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles extends TeaModel {
        /**
         * <p>Whether it is downloadable.</p>
         */
        @NameInMap("Downloadable")
        public Boolean downloadable;

        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>376920</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>融山-个贷-精催-演示-0625.json</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Visibility:</p>
         * <p><strong>true</strong>: Visible</p>
         * <p><strong>false</strong>: Not visible</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Visible")
        public Boolean visible;

        public static DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles self = new DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles();
            return TeaModel.build(map, self);
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles setDownloadable(Boolean downloadable) {
            this.downloadable = downloadable;
            return this;
        }
        public Boolean getDownloadable() {
            return this.downloadable;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

    public static class DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles extends TeaModel {
        /**
         * <p>Whether deployment is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Deployable")
        public Boolean deployable;

        /**
         * <p>Files generated by modeling.</p>
         */
        @NameInMap("Files")
        public java.util.List<DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles> files;

        /**
         * <p>Application group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>56790766</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>File group name.</p>
         * 
         * <strong>example:</strong>
         * <p>am</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Synchronization time.</p>
         * 
         * <strong>example:</strong>
         * <p>1770607862000</p>
         */
        @NameInMap("SyncedTime")
        public String syncedTime;

        public static DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles self = new DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles();
            return TeaModel.build(map, self);
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles setDeployable(Boolean deployable) {
            this.deployable = deployable;
            return this;
        }
        public Boolean getDeployable() {
            return this.deployable;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles setFiles(java.util.List<DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<DescribeModelingProjectDetailResponseBodyResultObjectSyncedFilesFiles> getFiles() {
            return this.files;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles setSyncedTime(String syncedTime) {
            this.syncedTime = syncedTime;
            return this;
        }
        public String getSyncedTime() {
            return this.syncedTime;
        }

    }

    public static class DescribeModelingProjectDetailResponseBodyResultObject extends TeaModel {
        /**
         * <p>End time of the security modeling project.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-07T02:22:30Z</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Security environment status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("EnvStatus")
        public String envStatus;

        /**
         * <p>Login account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("LoginAccount")
        public String loginAccount;

        /**
         * <p>Machine specification.</p>
         * 
         * <strong>example:</strong>
         * <p>SECURE_ENV_LITE</p>
         */
        @NameInMap("MachineSpec")
        public String machineSpec;

        /**
         * <p>Manual operation phase.</p>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("ManualPhase")
        public String manualPhase;

        /**
         * <p>Modeling project status.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPARING</p>
         */
        @NameInMap("ModelingStatus")
        public String modelingStatus;

        /**
         * <p>Associated POC tasks.</p>
         */
        @NameInMap("PocTasks")
        public java.util.List<DescribeModelingProjectDetailResponseBodyResultObjectPocTasks> pocTasks;

        /**
         * <p>Project ID</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>Project name.</p>
         * 
         * <strong>example:</strong>
         * <p>project_01</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>Remark information.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Start time of the security modeling project.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-13T01:09:00Z</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Synchronized files.</p>
         */
        @NameInMap("SyncedFiles")
        public java.util.List<DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles> syncedFiles;

        public static DescribeModelingProjectDetailResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelingProjectDetailResponseBodyResultObject self = new DescribeModelingProjectDetailResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setEnvStatus(String envStatus) {
            this.envStatus = envStatus;
            return this;
        }
        public String getEnvStatus() {
            return this.envStatus;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setLoginAccount(String loginAccount) {
            this.loginAccount = loginAccount;
            return this;
        }
        public String getLoginAccount() {
            return this.loginAccount;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setMachineSpec(String machineSpec) {
            this.machineSpec = machineSpec;
            return this;
        }
        public String getMachineSpec() {
            return this.machineSpec;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setManualPhase(String manualPhase) {
            this.manualPhase = manualPhase;
            return this;
        }
        public String getManualPhase() {
            return this.manualPhase;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setModelingStatus(String modelingStatus) {
            this.modelingStatus = modelingStatus;
            return this;
        }
        public String getModelingStatus() {
            return this.modelingStatus;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setPocTasks(java.util.List<DescribeModelingProjectDetailResponseBodyResultObjectPocTasks> pocTasks) {
            this.pocTasks = pocTasks;
            return this;
        }
        public java.util.List<DescribeModelingProjectDetailResponseBodyResultObjectPocTasks> getPocTasks() {
            return this.pocTasks;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeModelingProjectDetailResponseBodyResultObject setSyncedFiles(java.util.List<DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles> syncedFiles) {
            this.syncedFiles = syncedFiles;
            return this;
        }
        public java.util.List<DescribeModelingProjectDetailResponseBodyResultObjectSyncedFiles> getSyncedFiles() {
            return this.syncedFiles;
        }

    }

}
