// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchWorkitemWithTotalCountResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ToPage")
    public Integer toPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("Data")
    public java.util.List<SearchWorkitemWithTotalCountResponseBodyData> data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static SearchWorkitemWithTotalCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchWorkitemWithTotalCountResponseBody self = new SearchWorkitemWithTotalCountResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchWorkitemWithTotalCountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public SearchWorkitemWithTotalCountResponseBody setToPage(Integer toPage) {
        this.toPage = toPage;
        return this;
    }
    public Integer getToPage() {
        return this.toPage;
    }

    public SearchWorkitemWithTotalCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchWorkitemWithTotalCountResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchWorkitemWithTotalCountResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public SearchWorkitemWithTotalCountResponseBody setData(java.util.List<SearchWorkitemWithTotalCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchWorkitemWithTotalCountResponseBodyData> getData() {
        return this.data;
    }

    public SearchWorkitemWithTotalCountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchWorkitemWithTotalCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchWorkitemWithTotalCountResponseBodyData extends TeaModel {
        @NameInMap("FixedUserId")
        public Integer fixedUserId;

        @NameInMap("SendWangwang")
        public Boolean sendWangwang;

        @NameInMap("SkipCollab")
        public Boolean skipCollab;

        @NameInMap("VersionList")
        public String versionList;

        @NameInMap("AkProjectId")
        public Integer akProjectId;

        @NameInMap("ProjectId")
        public Integer projectId;

        @NameInMap("UserId")
        public Integer userId;

        @NameInMap("VersionId")
        public Integer versionId;

        @NameInMap("IdPath")
        public String idPath;

        @NameInMap("IgnoreIntegrate")
        public Boolean ignoreIntegrate;

        @NameInMap("AttachmentIds")
        public String attachmentIds;

        @NameInMap("CommitDate")
        public Long commitDate;

        @NameInMap("AkVersionIds")
        public String akVersionIds;

        @NameInMap("Region")
        public String region;

        @NameInMap("Trackers")
        public String trackers;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("Solution")
        public Integer solution;

        @NameInMap("AttachmentList")
        public String attachmentList;

        @NameInMap("UserStaffId")
        public String userStaffId;

        @NameInMap("IgnoreCheck")
        public Boolean ignoreCheck;

        @NameInMap("AkPaths")
        public String akPaths;

        @NameInMap("VerifierId")
        public Integer verifierId;

        @NameInMap("ModuleList")
        public String moduleList;

        @NameInMap("Attachmented")
        public Boolean attachmented;

        @NameInMap("SourceId")
        public Integer sourceId;

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

        @NameInMap("ClosedDuration")
        public Integer closedDuration;

        @NameInMap("PriorityId")
        public Integer priorityId;

        @NameInMap("RecordChangeLog")
        public Boolean recordChangeLog;

        @NameInMap("IssueRelations")
        public String issueRelations;

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

        @NameInMap("RelatedAKProjectGuids")
        public String relatedAKProjectGuids;

        @NameInMap("RelatedAKProjectIds")
        public String relatedAKProjectIds;

        @NameInMap("WatcherIdList")
        public String watcherIdList;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("AssignedToIdList")
        public String assignedToIdList;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("StatusStage")
        public Integer statusStage;

        @NameInMap("AssignedToStaffId")
        public String assignedToStaffId;

        @NameInMap("ParentId")
        public Integer parentId;

        @NameInMap("LogicalStatus")
        public String logicalStatus;

        @NameInMap("VersionIds")
        public String versionIds;

        @NameInMap("Scope")
        public Integer scope;

        @NameInMap("SeriousLevel")
        public String seriousLevel;

        @NameInMap("StatusId")
        public Integer statusId;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("User")
        public String user;

        @NameInMap("Source")
        public String source;

        @NameInMap("AssignedToId")
        public Integer assignedToId;

        @NameInMap("TrackerIds")
        public String trackerIds;

        @NameInMap("IssueTypeId")
        public Integer issueTypeId;

        @NameInMap("ChangeLogList")
        public String changeLogList;

        @NameInMap("FixedDuration")
        public Integer fixedDuration;

        @NameInMap("ScopeUserIds")
        public String scopeUserIds;

        @NameInMap("DevDuration")
        public Integer devDuration;

        @NameInMap("LinePath")
        public String linePath;

        @NameInMap("BlackListNotice")
        public String blackListNotice;

        @NameInMap("ProjectIds")
        public String projectIds;

        @NameInMap("TestsuiteId")
        public Integer testsuiteId;

        @NameInMap("ModuleUpdated")
        public Boolean moduleUpdated;

        @NameInMap("CommentList")
        public String commentList;

        @NameInMap("SprintId")
        public Integer sprintId;

        @NameInMap("RespondDuration")
        public Integer respondDuration;

        @NameInMap("ModuleIds")
        public String moduleIds;

        @NameInMap("VerifierStaffId")
        public String verifierStaffId;

        @NameInMap("Id")
        public Integer id;

        public static SearchWorkitemWithTotalCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchWorkitemWithTotalCountResponseBodyData self = new SearchWorkitemWithTotalCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchWorkitemWithTotalCountResponseBodyData setFixedUserId(Integer fixedUserId) {
            this.fixedUserId = fixedUserId;
            return this;
        }
        public Integer getFixedUserId() {
            return this.fixedUserId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setSendWangwang(Boolean sendWangwang) {
            this.sendWangwang = sendWangwang;
            return this;
        }
        public Boolean getSendWangwang() {
            return this.sendWangwang;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setSkipCollab(Boolean skipCollab) {
            this.skipCollab = skipCollab;
            return this;
        }
        public Boolean getSkipCollab() {
            return this.skipCollab;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setVersionList(String versionList) {
            this.versionList = versionList;
            return this;
        }
        public String getVersionList() {
            return this.versionList;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAkProjectId(Integer akProjectId) {
            this.akProjectId = akProjectId;
            return this;
        }
        public Integer getAkProjectId() {
            return this.akProjectId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setIdPath(String idPath) {
            this.idPath = idPath;
            return this;
        }
        public String getIdPath() {
            return this.idPath;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setIgnoreIntegrate(Boolean ignoreIntegrate) {
            this.ignoreIntegrate = ignoreIntegrate;
            return this;
        }
        public Boolean getIgnoreIntegrate() {
            return this.ignoreIntegrate;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAttachmentIds(String attachmentIds) {
            this.attachmentIds = attachmentIds;
            return this;
        }
        public String getAttachmentIds() {
            return this.attachmentIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setCommitDate(Long commitDate) {
            this.commitDate = commitDate;
            return this;
        }
        public Long getCommitDate() {
            return this.commitDate;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAkVersionIds(String akVersionIds) {
            this.akVersionIds = akVersionIds;
            return this;
        }
        public String getAkVersionIds() {
            return this.akVersionIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setTrackers(String trackers) {
            this.trackers = trackers;
            return this;
        }
        public String getTrackers() {
            return this.trackers;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setSolution(Integer solution) {
            this.solution = solution;
            return this;
        }
        public Integer getSolution() {
            return this.solution;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAttachmentList(String attachmentList) {
            this.attachmentList = attachmentList;
            return this;
        }
        public String getAttachmentList() {
            return this.attachmentList;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setUserStaffId(String userStaffId) {
            this.userStaffId = userStaffId;
            return this;
        }
        public String getUserStaffId() {
            return this.userStaffId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setIgnoreCheck(Boolean ignoreCheck) {
            this.ignoreCheck = ignoreCheck;
            return this;
        }
        public Boolean getIgnoreCheck() {
            return this.ignoreCheck;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAkPaths(String akPaths) {
            this.akPaths = akPaths;
            return this;
        }
        public String getAkPaths() {
            return this.akPaths;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setVerifierId(Integer verifierId) {
            this.verifierId = verifierId;
            return this;
        }
        public Integer getVerifierId() {
            return this.verifierId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setModuleList(String moduleList) {
            this.moduleList = moduleList;
            return this;
        }
        public String getModuleList() {
            return this.moduleList;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAttachmented(Boolean attachmented) {
            this.attachmented = attachmented;
            return this;
        }
        public Boolean getAttachmented() {
            return this.attachmented;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setSourceId(Integer sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Integer getSourceId() {
            return this.sourceId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setSeriousLevelId(Integer seriousLevelId) {
            this.seriousLevelId = seriousLevelId;
            return this;
        }
        public Integer getSeriousLevelId() {
            return this.seriousLevelId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setTagIdList(String tagIdList) {
            this.tagIdList = tagIdList;
            return this;
        }
        public String getTagIdList() {
            return this.tagIdList;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setWatched(Boolean watched) {
            this.watched = watched;
            return this;
        }
        public Boolean getWatched() {
            return this.watched;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAssignedToIds(String assignedToIds) {
            this.assignedToIds = assignedToIds;
            return this;
        }
        public String getAssignedToIds() {
            return this.assignedToIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setClosedDuration(Integer closedDuration) {
            this.closedDuration = closedDuration;
            return this;
        }
        public Integer getClosedDuration() {
            return this.closedDuration;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setRecordChangeLog(Boolean recordChangeLog) {
            this.recordChangeLog = recordChangeLog;
            return this;
        }
        public Boolean getRecordChangeLog() {
            return this.recordChangeLog;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setIssueRelations(String issueRelations) {
            this.issueRelations = issueRelations;
            return this;
        }
        public String getIssueRelations() {
            return this.issueRelations;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setVerifier(String verifier) {
            this.verifier = verifier;
            return this;
        }
        public String getVerifier() {
            return this.verifier;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setRelatedUserIds(String relatedUserIds) {
            this.relatedUserIds = relatedUserIds;
            return this;
        }
        public String getRelatedUserIds() {
            return this.relatedUserIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setRelatedAKProjectGuids(String relatedAKProjectGuids) {
            this.relatedAKProjectGuids = relatedAKProjectGuids;
            return this;
        }
        public String getRelatedAKProjectGuids() {
            return this.relatedAKProjectGuids;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setRelatedAKProjectIds(String relatedAKProjectIds) {
            this.relatedAKProjectIds = relatedAKProjectIds;
            return this;
        }
        public String getRelatedAKProjectIds() {
            return this.relatedAKProjectIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setWatcherIdList(String watcherIdList) {
            this.watcherIdList = watcherIdList;
            return this;
        }
        public String getWatcherIdList() {
            return this.watcherIdList;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAssignedToIdList(String assignedToIdList) {
            this.assignedToIdList = assignedToIdList;
            return this;
        }
        public String getAssignedToIdList() {
            return this.assignedToIdList;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setStatusStage(Integer statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public Integer getStatusStage() {
            return this.statusStage;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setParentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }
        public Integer getParentId() {
            return this.parentId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setVersionIds(String versionIds) {
            this.versionIds = versionIds;
            return this;
        }
        public String getVersionIds() {
            return this.versionIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setScope(Integer scope) {
            this.scope = scope;
            return this;
        }
        public Integer getScope() {
            return this.scope;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setSeriousLevel(String seriousLevel) {
            this.seriousLevel = seriousLevel;
            return this;
        }
        public String getSeriousLevel() {
            return this.seriousLevel;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setStatusId(Integer statusId) {
            this.statusId = statusId;
            return this;
        }
        public Integer getStatusId() {
            return this.statusId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setAssignedToId(Integer assignedToId) {
            this.assignedToId = assignedToId;
            return this;
        }
        public Integer getAssignedToId() {
            return this.assignedToId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setTrackerIds(String trackerIds) {
            this.trackerIds = trackerIds;
            return this;
        }
        public String getTrackerIds() {
            return this.trackerIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setIssueTypeId(Integer issueTypeId) {
            this.issueTypeId = issueTypeId;
            return this;
        }
        public Integer getIssueTypeId() {
            return this.issueTypeId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setChangeLogList(String changeLogList) {
            this.changeLogList = changeLogList;
            return this;
        }
        public String getChangeLogList() {
            return this.changeLogList;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setFixedDuration(Integer fixedDuration) {
            this.fixedDuration = fixedDuration;
            return this;
        }
        public Integer getFixedDuration() {
            return this.fixedDuration;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setScopeUserIds(String scopeUserIds) {
            this.scopeUserIds = scopeUserIds;
            return this;
        }
        public String getScopeUserIds() {
            return this.scopeUserIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setDevDuration(Integer devDuration) {
            this.devDuration = devDuration;
            return this;
        }
        public Integer getDevDuration() {
            return this.devDuration;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setLinePath(String linePath) {
            this.linePath = linePath;
            return this;
        }
        public String getLinePath() {
            return this.linePath;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setBlackListNotice(String blackListNotice) {
            this.blackListNotice = blackListNotice;
            return this;
        }
        public String getBlackListNotice() {
            return this.blackListNotice;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setProjectIds(String projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public String getProjectIds() {
            return this.projectIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setTestsuiteId(Integer testsuiteId) {
            this.testsuiteId = testsuiteId;
            return this;
        }
        public Integer getTestsuiteId() {
            return this.testsuiteId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setModuleUpdated(Boolean moduleUpdated) {
            this.moduleUpdated = moduleUpdated;
            return this;
        }
        public Boolean getModuleUpdated() {
            return this.moduleUpdated;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setCommentList(String commentList) {
            this.commentList = commentList;
            return this;
        }
        public String getCommentList() {
            return this.commentList;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setSprintId(Integer sprintId) {
            this.sprintId = sprintId;
            return this;
        }
        public Integer getSprintId() {
            return this.sprintId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setRespondDuration(Integer respondDuration) {
            this.respondDuration = respondDuration;
            return this;
        }
        public Integer getRespondDuration() {
            return this.respondDuration;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setModuleIds(String moduleIds) {
            this.moduleIds = moduleIds;
            return this;
        }
        public String getModuleIds() {
            return this.moduleIds;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setVerifierStaffId(String verifierStaffId) {
            this.verifierStaffId = verifierStaffId;
            return this;
        }
        public String getVerifierStaffId() {
            return this.verifierStaffId;
        }

        public SearchWorkitemWithTotalCountResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
