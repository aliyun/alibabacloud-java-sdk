// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ListTaskGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public java.util.List<ListTaskGroupResponseBodyResultObject> resultObject;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItem")
    public Integer totalItem;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskGroupResponseBody self = new ListTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskGroupResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTaskGroupResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTaskGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskGroupResponseBody setResultObject(java.util.List<ListTaskGroupResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<ListTaskGroupResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public ListTaskGroupResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public ListTaskGroupResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListTaskGroupResponseBodyResultObjectSubTaskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-01-12 15:47:23</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <strong>example:</strong>
         * <p>pts-demo</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HideViewResultButton")
        public Boolean hideViewResultButton;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCharge")
        public Boolean isCharge;

        /**
         * <strong>example:</strong>
         * <p>rfs</p>
         */
        @NameInMap("ModelScene")
        public String modelScene;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("SampleId")
        public Integer sampleId;

        /**
         * <strong>example:</strong>
         * <p>fs</p>
         */
        @NameInMap("SampleName")
        public String sampleName;

        /**
         * <strong>example:</strong>
         * <p>anti_fraud_riskscreening</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SubTaskId")
        public Integer subTaskId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportCancel")
        public Boolean supportCancel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportDownload")
        public Boolean supportDownload;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportMergeSelect")
        public Boolean supportMergeSelect;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportView")
        public Boolean supportView;

        /**
         * <strong>example:</strong>
         * <p>FINANCE</p>
         */
        @NameInMap("Tab")
        public String tab;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TaskGroupId")
        public Integer taskGroupId;

        /**
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static ListTaskGroupResponseBodyResultObjectSubTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListTaskGroupResponseBodyResultObjectSubTaskList self = new ListTaskGroupResponseBodyResultObjectSubTaskList();
            return TeaModel.build(map, self);
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setHideViewResultButton(Boolean hideViewResultButton) {
            this.hideViewResultButton = hideViewResultButton;
            return this;
        }
        public Boolean getHideViewResultButton() {
            return this.hideViewResultButton;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setIsCharge(Boolean isCharge) {
            this.isCharge = isCharge;
            return this;
        }
        public Boolean getIsCharge() {
            return this.isCharge;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setModelScene(String modelScene) {
            this.modelScene = modelScene;
            return this;
        }
        public String getModelScene() {
            return this.modelScene;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setSampleId(Integer sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public Integer getSampleId() {
            return this.sampleId;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setSubTaskId(Integer subTaskId) {
            this.subTaskId = subTaskId;
            return this;
        }
        public Integer getSubTaskId() {
            return this.subTaskId;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setSupportCancel(Boolean supportCancel) {
            this.supportCancel = supportCancel;
            return this;
        }
        public Boolean getSupportCancel() {
            return this.supportCancel;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setSupportDownload(Boolean supportDownload) {
            this.supportDownload = supportDownload;
            return this;
        }
        public Boolean getSupportDownload() {
            return this.supportDownload;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setSupportMergeSelect(Boolean supportMergeSelect) {
            this.supportMergeSelect = supportMergeSelect;
            return this;
        }
        public Boolean getSupportMergeSelect() {
            return this.supportMergeSelect;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setSupportView(Boolean supportView) {
            this.supportView = supportView;
            return this;
        }
        public Boolean getSupportView() {
            return this.supportView;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setTaskGroupId(Integer taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }
        public Integer getTaskGroupId() {
            return this.taskGroupId;
        }

        public ListTaskGroupResponseBodyResultObjectSubTaskList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class ListTaskGroupResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1588820785212</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreatorUserId")
        public Long creatorUserId;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("GroupStatus")
        public String groupStatus;

        @NameInMap("SampleNames")
        public java.util.List<String> sampleNames;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("SubTaskCount")
        public Integer subTaskCount;

        @NameInMap("SubTaskList")
        public java.util.List<ListTaskGroupResponseBodyResultObjectSubTaskList> subTaskList;

        /**
         * <strong>example:</strong>
         * <p>FINANCE</p>
         */
        @NameInMap("Tab")
        public String tab;

        /**
         * <strong>example:</strong>
         * <p>g-uf62fwvw2f8dx88xo2lt</p>
         */
        @NameInMap("TaskGroupId")
        public Integer taskGroupId;

        /**
         * <strong>example:</strong>
         * <p>GroupTest</p>
         */
        @NameInMap("TaskGroupName")
        public String taskGroupName;

        public static ListTaskGroupResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ListTaskGroupResponseBodyResultObject self = new ListTaskGroupResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ListTaskGroupResponseBodyResultObject setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTaskGroupResponseBodyResultObject setCreatorUserId(Long creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public Long getCreatorUserId() {
            return this.creatorUserId;
        }

        public ListTaskGroupResponseBodyResultObject setGroupStatus(String groupStatus) {
            this.groupStatus = groupStatus;
            return this;
        }
        public String getGroupStatus() {
            return this.groupStatus;
        }

        public ListTaskGroupResponseBodyResultObject setSampleNames(java.util.List<String> sampleNames) {
            this.sampleNames = sampleNames;
            return this;
        }
        public java.util.List<String> getSampleNames() {
            return this.sampleNames;
        }

        public ListTaskGroupResponseBodyResultObject setSubTaskCount(Integer subTaskCount) {
            this.subTaskCount = subTaskCount;
            return this;
        }
        public Integer getSubTaskCount() {
            return this.subTaskCount;
        }

        public ListTaskGroupResponseBodyResultObject setSubTaskList(java.util.List<ListTaskGroupResponseBodyResultObjectSubTaskList> subTaskList) {
            this.subTaskList = subTaskList;
            return this;
        }
        public java.util.List<ListTaskGroupResponseBodyResultObjectSubTaskList> getSubTaskList() {
            return this.subTaskList;
        }

        public ListTaskGroupResponseBodyResultObject setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public ListTaskGroupResponseBodyResultObject setTaskGroupId(Integer taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }
        public Integer getTaskGroupId() {
            return this.taskGroupId;
        }

        public ListTaskGroupResponseBodyResultObject setTaskGroupName(String taskGroupName) {
            this.taskGroupName = taskGroupName;
            return this;
        }
        public String getTaskGroupName() {
            return this.taskGroupName;
        }

    }

}
