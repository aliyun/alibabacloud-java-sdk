// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetWorkitemByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetWorkitemByIdResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public String success;

    public static GetWorkitemByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemByIdResponseBody self = new GetWorkitemByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkitemByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkitemByIdResponseBody setData(GetWorkitemByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkitemByIdResponseBodyData getData() {
        return this.data;
    }

    public GetWorkitemByIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWorkitemByIdResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetWorkitemByIdResponseBodyDataCfsList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetWorkitemByIdResponseBodyDataCfsList build(java.util.Map<String, ?> map) throws Exception {
            GetWorkitemByIdResponseBodyDataCfsList self = new GetWorkitemByIdResponseBodyDataCfsList();
            return TeaModel.build(map, self);
        }

        public GetWorkitemByIdResponseBodyDataCfsList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkitemByIdResponseBodyDataCfsList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetWorkitemByIdResponseBodyDataCfsList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkitemByIdResponseBodyDataCfsList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetWorkitemByIdResponseBodyData extends TeaModel {
        @NameInMap("SkipCollab")
        public Boolean skipCollab;

        @NameInMap("SendWangwang")
        public Boolean sendWangwang;

        @NameInMap("VersionList")
        public String versionList;

        @NameInMap("AkProjectId")
        public Integer akProjectId;

        @NameInMap("UserId")
        public Integer userId;

        @NameInMap("IdPath")
        public String idPath;

        @NameInMap("IgnoreIntegrate")
        public Boolean ignoreIntegrate;

        @NameInMap("AttachmentIds")
        public String attachmentIds;

        @NameInMap("CommitDate")
        public Long commitDate;

        @NameInMap("UpdateStatusAt")
        public Long updateStatusAt;

        @NameInMap("Trackers")
        public String trackers;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("UserStaffId")
        public String userStaffId;

        @NameInMap("AttachmentList")
        public String attachmentList;

        @NameInMap("VerifierId")
        public Integer verifierId;

        @NameInMap("IgnoreCheck")
        public Boolean ignoreCheck;

        @NameInMap("ModuleList")
        public String moduleList;

        @NameInMap("Attachmented")
        public Boolean attachmented;

        @NameInMap("SeriousLevelId")
        public Integer seriousLevelId;

        @NameInMap("TagIdList")
        public String tagIdList;

        @NameInMap("Watched")
        public Boolean watched;

        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("AssignedToIds")
        public String assignedToIds;

        @NameInMap("PriorityId")
        public Integer priorityId;

        @NameInMap("RecordChangeLog")
        public Boolean recordChangeLog;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("TemplateId")
        public Integer templateId;

        @NameInMap("Verifier")
        public String verifier;

        @NameInMap("Status")
        public String status;

        @NameInMap("RelatedUserIds")
        public String relatedUserIds;

        @NameInMap("RelatedAKProjectIds")
        public String relatedAKProjectIds;

        @NameInMap("RelatedAKProjectGuids")
        public String relatedAKProjectGuids;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("AssignedToIdList")
        public String assignedToIdList;

        @NameInMap("CfsList")
        public java.util.List<GetWorkitemByIdResponseBodyDataCfsList> cfsList;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("StatusStage")
        public Integer statusStage;

        @NameInMap("AssignedToStaffId")
        public String assignedToStaffId;

        @NameInMap("ParentId")
        public Integer parentId;

        @NameInMap("Description")
        public String description;

        @NameInMap("LogicalStatus")
        public String logicalStatus;

        @NameInMap("VersionIds")
        public String versionIds;

        @NameInMap("SeriousLevel")
        public String seriousLevel;

        @NameInMap("StatusId")
        public Integer statusId;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("User")
        public String user;

        @NameInMap("TrackerIds")
        public String trackerIds;

        @NameInMap("AssignedToId")
        public Integer assignedToId;

        @NameInMap("ChangeLogList")
        public String changeLogList;

        @NameInMap("IssueTypeId")
        public Integer issueTypeId;

        @NameInMap("RegionId")
        public Integer regionId;

        @NameInMap("Guid")
        public String guid;

        @NameInMap("AssignedToMaps")
        public String assignedToMaps;

        @NameInMap("BlackListNotice")
        public String blackListNotice;

        @NameInMap("ModuleUpdated")
        public Boolean moduleUpdated;

        @NameInMap("ProjectIds")
        public String projectIds;

        @NameInMap("CommentList")
        public String commentList;

        @NameInMap("VerifierStaffId")
        public String verifierStaffId;

        @NameInMap("ModuleIds")
        public String moduleIds;

        @NameInMap("Id")
        public Integer id;

        public static GetWorkitemByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkitemByIdResponseBodyData self = new GetWorkitemByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkitemByIdResponseBodyData setSkipCollab(Boolean skipCollab) {
            this.skipCollab = skipCollab;
            return this;
        }
        public Boolean getSkipCollab() {
            return this.skipCollab;
        }

        public GetWorkitemByIdResponseBodyData setSendWangwang(Boolean sendWangwang) {
            this.sendWangwang = sendWangwang;
            return this;
        }
        public Boolean getSendWangwang() {
            return this.sendWangwang;
        }

        public GetWorkitemByIdResponseBodyData setVersionList(String versionList) {
            this.versionList = versionList;
            return this;
        }
        public String getVersionList() {
            return this.versionList;
        }

        public GetWorkitemByIdResponseBodyData setAkProjectId(Integer akProjectId) {
            this.akProjectId = akProjectId;
            return this;
        }
        public Integer getAkProjectId() {
            return this.akProjectId;
        }

        public GetWorkitemByIdResponseBodyData setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public GetWorkitemByIdResponseBodyData setIdPath(String idPath) {
            this.idPath = idPath;
            return this;
        }
        public String getIdPath() {
            return this.idPath;
        }

        public GetWorkitemByIdResponseBodyData setIgnoreIntegrate(Boolean ignoreIntegrate) {
            this.ignoreIntegrate = ignoreIntegrate;
            return this;
        }
        public Boolean getIgnoreIntegrate() {
            return this.ignoreIntegrate;
        }

        public GetWorkitemByIdResponseBodyData setAttachmentIds(String attachmentIds) {
            this.attachmentIds = attachmentIds;
            return this;
        }
        public String getAttachmentIds() {
            return this.attachmentIds;
        }

        public GetWorkitemByIdResponseBodyData setCommitDate(Long commitDate) {
            this.commitDate = commitDate;
            return this;
        }
        public Long getCommitDate() {
            return this.commitDate;
        }

        public GetWorkitemByIdResponseBodyData setUpdateStatusAt(Long updateStatusAt) {
            this.updateStatusAt = updateStatusAt;
            return this;
        }
        public Long getUpdateStatusAt() {
            return this.updateStatusAt;
        }

        public GetWorkitemByIdResponseBodyData setTrackers(String trackers) {
            this.trackers = trackers;
            return this;
        }
        public String getTrackers() {
            return this.trackers;
        }

        public GetWorkitemByIdResponseBodyData setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetWorkitemByIdResponseBodyData setUserStaffId(String userStaffId) {
            this.userStaffId = userStaffId;
            return this;
        }
        public String getUserStaffId() {
            return this.userStaffId;
        }

        public GetWorkitemByIdResponseBodyData setAttachmentList(String attachmentList) {
            this.attachmentList = attachmentList;
            return this;
        }
        public String getAttachmentList() {
            return this.attachmentList;
        }

        public GetWorkitemByIdResponseBodyData setVerifierId(Integer verifierId) {
            this.verifierId = verifierId;
            return this;
        }
        public Integer getVerifierId() {
            return this.verifierId;
        }

        public GetWorkitemByIdResponseBodyData setIgnoreCheck(Boolean ignoreCheck) {
            this.ignoreCheck = ignoreCheck;
            return this;
        }
        public Boolean getIgnoreCheck() {
            return this.ignoreCheck;
        }

        public GetWorkitemByIdResponseBodyData setModuleList(String moduleList) {
            this.moduleList = moduleList;
            return this;
        }
        public String getModuleList() {
            return this.moduleList;
        }

        public GetWorkitemByIdResponseBodyData setAttachmented(Boolean attachmented) {
            this.attachmented = attachmented;
            return this;
        }
        public Boolean getAttachmented() {
            return this.attachmented;
        }

        public GetWorkitemByIdResponseBodyData setSeriousLevelId(Integer seriousLevelId) {
            this.seriousLevelId = seriousLevelId;
            return this;
        }
        public Integer getSeriousLevelId() {
            return this.seriousLevelId;
        }

        public GetWorkitemByIdResponseBodyData setTagIdList(String tagIdList) {
            this.tagIdList = tagIdList;
            return this;
        }
        public String getTagIdList() {
            return this.tagIdList;
        }

        public GetWorkitemByIdResponseBodyData setWatched(Boolean watched) {
            this.watched = watched;
            return this;
        }
        public Boolean getWatched() {
            return this.watched;
        }

        public GetWorkitemByIdResponseBodyData setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public GetWorkitemByIdResponseBodyData setAssignedToIds(String assignedToIds) {
            this.assignedToIds = assignedToIds;
            return this;
        }
        public String getAssignedToIds() {
            return this.assignedToIds;
        }

        public GetWorkitemByIdResponseBodyData setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public GetWorkitemByIdResponseBodyData setRecordChangeLog(Boolean recordChangeLog) {
            this.recordChangeLog = recordChangeLog;
            return this;
        }
        public Boolean getRecordChangeLog() {
            return this.recordChangeLog;
        }

        public GetWorkitemByIdResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetWorkitemByIdResponseBodyData setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public GetWorkitemByIdResponseBodyData setVerifier(String verifier) {
            this.verifier = verifier;
            return this;
        }
        public String getVerifier() {
            return this.verifier;
        }

        public GetWorkitemByIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkitemByIdResponseBodyData setRelatedUserIds(String relatedUserIds) {
            this.relatedUserIds = relatedUserIds;
            return this;
        }
        public String getRelatedUserIds() {
            return this.relatedUserIds;
        }

        public GetWorkitemByIdResponseBodyData setRelatedAKProjectIds(String relatedAKProjectIds) {
            this.relatedAKProjectIds = relatedAKProjectIds;
            return this;
        }
        public String getRelatedAKProjectIds() {
            return this.relatedAKProjectIds;
        }

        public GetWorkitemByIdResponseBodyData setRelatedAKProjectGuids(String relatedAKProjectGuids) {
            this.relatedAKProjectGuids = relatedAKProjectGuids;
            return this;
        }
        public String getRelatedAKProjectGuids() {
            return this.relatedAKProjectGuids;
        }

        public GetWorkitemByIdResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetWorkitemByIdResponseBodyData setAssignedToIdList(String assignedToIdList) {
            this.assignedToIdList = assignedToIdList;
            return this;
        }
        public String getAssignedToIdList() {
            return this.assignedToIdList;
        }

        public GetWorkitemByIdResponseBodyData setCfsList(java.util.List<GetWorkitemByIdResponseBodyDataCfsList> cfsList) {
            this.cfsList = cfsList;
            return this;
        }
        public java.util.List<GetWorkitemByIdResponseBodyDataCfsList> getCfsList() {
            return this.cfsList;
        }

        public GetWorkitemByIdResponseBodyData setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetWorkitemByIdResponseBodyData setStatusStage(Integer statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public Integer getStatusStage() {
            return this.statusStage;
        }

        public GetWorkitemByIdResponseBodyData setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public GetWorkitemByIdResponseBodyData setParentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }
        public Integer getParentId() {
            return this.parentId;
        }

        public GetWorkitemByIdResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkitemByIdResponseBodyData setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public GetWorkitemByIdResponseBodyData setVersionIds(String versionIds) {
            this.versionIds = versionIds;
            return this;
        }
        public String getVersionIds() {
            return this.versionIds;
        }

        public GetWorkitemByIdResponseBodyData setSeriousLevel(String seriousLevel) {
            this.seriousLevel = seriousLevel;
            return this;
        }
        public String getSeriousLevel() {
            return this.seriousLevel;
        }

        public GetWorkitemByIdResponseBodyData setStatusId(Integer statusId) {
            this.statusId = statusId;
            return this;
        }
        public Integer getStatusId() {
            return this.statusId;
        }

        public GetWorkitemByIdResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public GetWorkitemByIdResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public GetWorkitemByIdResponseBodyData setTrackerIds(String trackerIds) {
            this.trackerIds = trackerIds;
            return this;
        }
        public String getTrackerIds() {
            return this.trackerIds;
        }

        public GetWorkitemByIdResponseBodyData setAssignedToId(Integer assignedToId) {
            this.assignedToId = assignedToId;
            return this;
        }
        public Integer getAssignedToId() {
            return this.assignedToId;
        }

        public GetWorkitemByIdResponseBodyData setChangeLogList(String changeLogList) {
            this.changeLogList = changeLogList;
            return this;
        }
        public String getChangeLogList() {
            return this.changeLogList;
        }

        public GetWorkitemByIdResponseBodyData setIssueTypeId(Integer issueTypeId) {
            this.issueTypeId = issueTypeId;
            return this;
        }
        public Integer getIssueTypeId() {
            return this.issueTypeId;
        }

        public GetWorkitemByIdResponseBodyData setRegionId(Integer regionId) {
            this.regionId = regionId;
            return this;
        }
        public Integer getRegionId() {
            return this.regionId;
        }

        public GetWorkitemByIdResponseBodyData setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetWorkitemByIdResponseBodyData setAssignedToMaps(String assignedToMaps) {
            this.assignedToMaps = assignedToMaps;
            return this;
        }
        public String getAssignedToMaps() {
            return this.assignedToMaps;
        }

        public GetWorkitemByIdResponseBodyData setBlackListNotice(String blackListNotice) {
            this.blackListNotice = blackListNotice;
            return this;
        }
        public String getBlackListNotice() {
            return this.blackListNotice;
        }

        public GetWorkitemByIdResponseBodyData setModuleUpdated(Boolean moduleUpdated) {
            this.moduleUpdated = moduleUpdated;
            return this;
        }
        public Boolean getModuleUpdated() {
            return this.moduleUpdated;
        }

        public GetWorkitemByIdResponseBodyData setProjectIds(String projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public String getProjectIds() {
            return this.projectIds;
        }

        public GetWorkitemByIdResponseBodyData setCommentList(String commentList) {
            this.commentList = commentList;
            return this;
        }
        public String getCommentList() {
            return this.commentList;
        }

        public GetWorkitemByIdResponseBodyData setVerifierStaffId(String verifierStaffId) {
            this.verifierStaffId = verifierStaffId;
            return this;
        }
        public String getVerifierStaffId() {
            return this.verifierStaffId;
        }

        public GetWorkitemByIdResponseBodyData setModuleIds(String moduleIds) {
            this.moduleIds = moduleIds;
            return this;
        }
        public String getModuleIds() {
            return this.moduleIds;
        }

        public GetWorkitemByIdResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
