// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateTaskGroupResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("ResultObject")
    public CreateTaskGroupResponseBodyResultObject resultObject;

    public static CreateTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskGroupResponseBody self = new CreateTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTaskGroupResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTaskGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskGroupResponseBody setResultObject(CreateTaskGroupResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CreateTaskGroupResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CreateTaskGroupResponseBodyResultObjectSubTaskList extends TeaModel {
        /**
         * <p>The reviewer.</p>
         * 
         * <strong>example:</strong>
         * <p>303872</p>
         */
        @NameInMap("Checker")
        public String checker;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>model_test_enorl_202606040953+10.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The number of rows in the file.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("FileRows")
        public String fileRows;

        /**
         * <p>The task end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-12 15:47:23</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The user group name.</p>
         * 
         * <strong>example:</strong>
         * <p>pts-demo</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Indicates whether the task is billed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCharge")
        public String isCharge;

        /**
         * <p>The model scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>rfs</p>
         */
        @NameInMap("ModelScene")
        public String modelScene;

        /**
         * <p>The sample IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("SampleId")
        public String sampleId;

        /**
         * <p>The sample name.</p>
         * 
         * <strong>example:</strong>
         * <p>fs</p>
         */
        @NameInMap("SampleName")
        public String sampleName;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>anti_fraud_customed</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>多头风险前筛</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The subtask ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SubTaskId")
        public Long subTaskId;

        /**
         * <p>The scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>FINANCE</p>
         */
        @NameInMap("Tab")
        public String tab;

        /**
         * <p>The task group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TaskGroupId")
        public String taskGroupId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里多头_68629_20260115</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The execution status of the import task. Valid values:</p>
         * <ul>
         * <li>DOING: Running.</li>
         * <li>FINISH: Completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static CreateTaskGroupResponseBodyResultObjectSubTaskList build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskGroupResponseBodyResultObjectSubTaskList self = new CreateTaskGroupResponseBodyResultObjectSubTaskList();
            return TeaModel.build(map, self);
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setChecker(String checker) {
            this.checker = checker;
            return this;
        }
        public String getChecker() {
            return this.checker;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setFileRows(String fileRows) {
            this.fileRows = fileRows;
            return this;
        }
        public String getFileRows() {
            return this.fileRows;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setIsCharge(String isCharge) {
            this.isCharge = isCharge;
            return this;
        }
        public String getIsCharge() {
            return this.isCharge;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setModelScene(String modelScene) {
            this.modelScene = modelScene;
            return this;
        }
        public String getModelScene() {
            return this.modelScene;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setSampleId(String sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public String getSampleId() {
            return this.sampleId;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setSubTaskId(Long subTaskId) {
            this.subTaskId = subTaskId;
            return this;
        }
        public Long getSubTaskId() {
            return this.subTaskId;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setTaskGroupId(String taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }
        public String getTaskGroupId() {
            return this.taskGroupId;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateTaskGroupResponseBodyResultObjectSubTaskList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class CreateTaskGroupResponseBodyResultObject extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1750645267000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>345298</p>
         */
        @NameInMap("CreatorUserId")
        public Integer creatorUserId;

        /**
         * <p>The group status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("GroupStatus")
        public String groupStatus;

        /**
         * <p>The task group name.</p>
         */
        @NameInMap("SampleNames")
        public java.util.List<String> sampleNames;

        /**
         * <p>The number of subtasks generated from task parsing and splitting.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SubTaskCount")
        public Integer subTaskCount;

        /**
         * <p>The subtask list.</p>
         */
        @NameInMap("SubTaskList")
        public java.util.List<CreateTaskGroupResponseBodyResultObjectSubTaskList> subTaskList;

        /**
         * <p>The scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>FINANCE</p>
         */
        @NameInMap("Tab")
        public String tab;

        /**
         * <p>The task group ID.</p>
         * <blockquote>
         * <p>This parameter is in invitational preview. When this parameter is used, other query conditions become invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>g-0jlcreertd0p471l6f72</p>
         */
        @NameInMap("TaskGroupId")
        public Integer taskGroupId;

        /**
         * <p>The task group name.</p>
         * 
         * <strong>example:</strong>
         * <p>GroupTest</p>
         */
        @NameInMap("TaskGroupName")
        public String taskGroupName;

        public static CreateTaskGroupResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskGroupResponseBodyResultObject self = new CreateTaskGroupResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CreateTaskGroupResponseBodyResultObject setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateTaskGroupResponseBodyResultObject setCreatorUserId(Integer creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public Integer getCreatorUserId() {
            return this.creatorUserId;
        }

        public CreateTaskGroupResponseBodyResultObject setGroupStatus(String groupStatus) {
            this.groupStatus = groupStatus;
            return this;
        }
        public String getGroupStatus() {
            return this.groupStatus;
        }

        public CreateTaskGroupResponseBodyResultObject setSampleNames(java.util.List<String> sampleNames) {
            this.sampleNames = sampleNames;
            return this;
        }
        public java.util.List<String> getSampleNames() {
            return this.sampleNames;
        }

        public CreateTaskGroupResponseBodyResultObject setSubTaskCount(Integer subTaskCount) {
            this.subTaskCount = subTaskCount;
            return this;
        }
        public Integer getSubTaskCount() {
            return this.subTaskCount;
        }

        public CreateTaskGroupResponseBodyResultObject setSubTaskList(java.util.List<CreateTaskGroupResponseBodyResultObjectSubTaskList> subTaskList) {
            this.subTaskList = subTaskList;
            return this;
        }
        public java.util.List<CreateTaskGroupResponseBodyResultObjectSubTaskList> getSubTaskList() {
            return this.subTaskList;
        }

        public CreateTaskGroupResponseBodyResultObject setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public CreateTaskGroupResponseBodyResultObject setTaskGroupId(Integer taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }
        public Integer getTaskGroupId() {
            return this.taskGroupId;
        }

        public CreateTaskGroupResponseBodyResultObject setTaskGroupName(String taskGroupName) {
            this.taskGroupName = taskGroupName;
            return this;
        }
        public String getTaskGroupName() {
            return this.taskGroupName;
        }

    }

}
