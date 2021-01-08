// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchWorkitemResponseBody extends TeaModel {
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
    public java.util.List<SearchWorkitemResponseBodyData> data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static SearchWorkitemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchWorkitemResponseBody self = new SearchWorkitemResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchWorkitemResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public SearchWorkitemResponseBody setToPage(Integer toPage) {
        this.toPage = toPage;
        return this;
    }
    public Integer getToPage() {
        return this.toPage;
    }

    public SearchWorkitemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchWorkitemResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchWorkitemResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public SearchWorkitemResponseBody setData(java.util.List<SearchWorkitemResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchWorkitemResponseBodyData> getData() {
        return this.data;
    }

    public SearchWorkitemResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchWorkitemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchWorkitemResponseBodyData extends TeaModel {
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

        public static SearchWorkitemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchWorkitemResponseBodyData self = new SearchWorkitemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchWorkitemResponseBodyData setFixedUserId(Integer fixedUserId) {
            this.fixedUserId = fixedUserId;
            return this;
        }
        public Integer getFixedUserId() {
            return this.fixedUserId;
        }

        public SearchWorkitemResponseBodyData setSendWangwang(Boolean sendWangwang) {
            this.sendWangwang = sendWangwang;
            return this;
        }
        public Boolean getSendWangwang() {
            return this.sendWangwang;
        }

        public SearchWorkitemResponseBodyData setSkipCollab(Boolean skipCollab) {
            this.skipCollab = skipCollab;
            return this;
        }
        public Boolean getSkipCollab() {
            return this.skipCollab;
        }

        public SearchWorkitemResponseBodyData setVersionList(String versionList) {
            this.versionList = versionList;
            return this;
        }
        public String getVersionList() {
            return this.versionList;
        }

        public SearchWorkitemResponseBodyData setAkProjectId(Integer akProjectId) {
            this.akProjectId = akProjectId;
            return this;
        }
        public Integer getAkProjectId() {
            return this.akProjectId;
        }

        public SearchWorkitemResponseBodyData setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public SearchWorkitemResponseBodyData setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public SearchWorkitemResponseBodyData setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

        public SearchWorkitemResponseBodyData setIdPath(String idPath) {
            this.idPath = idPath;
            return this;
        }
        public String getIdPath() {
            return this.idPath;
        }

        public SearchWorkitemResponseBodyData setIgnoreIntegrate(Boolean ignoreIntegrate) {
            this.ignoreIntegrate = ignoreIntegrate;
            return this;
        }
        public Boolean getIgnoreIntegrate() {
            return this.ignoreIntegrate;
        }

        public SearchWorkitemResponseBodyData setAttachmentIds(String attachmentIds) {
            this.attachmentIds = attachmentIds;
            return this;
        }
        public String getAttachmentIds() {
            return this.attachmentIds;
        }

        public SearchWorkitemResponseBodyData setCommitDate(Long commitDate) {
            this.commitDate = commitDate;
            return this;
        }
        public Long getCommitDate() {
            return this.commitDate;
        }

        public SearchWorkitemResponseBodyData setAkVersionIds(String akVersionIds) {
            this.akVersionIds = akVersionIds;
            return this;
        }
        public String getAkVersionIds() {
            return this.akVersionIds;
        }

        public SearchWorkitemResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public SearchWorkitemResponseBodyData setTrackers(String trackers) {
            this.trackers = trackers;
            return this;
        }
        public String getTrackers() {
            return this.trackers;
        }

        public SearchWorkitemResponseBodyData setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public SearchWorkitemResponseBodyData setSolution(Integer solution) {
            this.solution = solution;
            return this;
        }
        public Integer getSolution() {
            return this.solution;
        }

        public SearchWorkitemResponseBodyData setAttachmentList(String attachmentList) {
            this.attachmentList = attachmentList;
            return this;
        }
        public String getAttachmentList() {
            return this.attachmentList;
        }

        public SearchWorkitemResponseBodyData setUserStaffId(String userStaffId) {
            this.userStaffId = userStaffId;
            return this;
        }
        public String getUserStaffId() {
            return this.userStaffId;
        }

        public SearchWorkitemResponseBodyData setIgnoreCheck(Boolean ignoreCheck) {
            this.ignoreCheck = ignoreCheck;
            return this;
        }
        public Boolean getIgnoreCheck() {
            return this.ignoreCheck;
        }

        public SearchWorkitemResponseBodyData setAkPaths(String akPaths) {
            this.akPaths = akPaths;
            return this;
        }
        public String getAkPaths() {
            return this.akPaths;
        }

        public SearchWorkitemResponseBodyData setVerifierId(Integer verifierId) {
            this.verifierId = verifierId;
            return this;
        }
        public Integer getVerifierId() {
            return this.verifierId;
        }

        public SearchWorkitemResponseBodyData setModuleList(String moduleList) {
            this.moduleList = moduleList;
            return this;
        }
        public String getModuleList() {
            return this.moduleList;
        }

        public SearchWorkitemResponseBodyData setAttachmented(Boolean attachmented) {
            this.attachmented = attachmented;
            return this;
        }
        public Boolean getAttachmented() {
            return this.attachmented;
        }

        public SearchWorkitemResponseBodyData setSourceId(Integer sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Integer getSourceId() {
            return this.sourceId;
        }

        public SearchWorkitemResponseBodyData setSeriousLevelId(Integer seriousLevelId) {
            this.seriousLevelId = seriousLevelId;
            return this;
        }
        public Integer getSeriousLevelId() {
            return this.seriousLevelId;
        }

        public SearchWorkitemResponseBodyData setTagIdList(String tagIdList) {
            this.tagIdList = tagIdList;
            return this;
        }
        public String getTagIdList() {
            return this.tagIdList;
        }

        public SearchWorkitemResponseBodyData setWatched(Boolean watched) {
            this.watched = watched;
            return this;
        }
        public Boolean getWatched() {
            return this.watched;
        }

        public SearchWorkitemResponseBodyData setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public SearchWorkitemResponseBodyData setAssignedToIds(String assignedToIds) {
            this.assignedToIds = assignedToIds;
            return this;
        }
        public String getAssignedToIds() {
            return this.assignedToIds;
        }

        public SearchWorkitemResponseBodyData setClosedDuration(Integer closedDuration) {
            this.closedDuration = closedDuration;
            return this;
        }
        public Integer getClosedDuration() {
            return this.closedDuration;
        }

        public SearchWorkitemResponseBodyData setPriorityId(Integer priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public Integer getPriorityId() {
            return this.priorityId;
        }

        public SearchWorkitemResponseBodyData setRecordChangeLog(Boolean recordChangeLog) {
            this.recordChangeLog = recordChangeLog;
            return this;
        }
        public Boolean getRecordChangeLog() {
            return this.recordChangeLog;
        }

        public SearchWorkitemResponseBodyData setIssueRelations(String issueRelations) {
            this.issueRelations = issueRelations;
            return this;
        }
        public String getIssueRelations() {
            return this.issueRelations;
        }

        public SearchWorkitemResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public SearchWorkitemResponseBodyData setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public SearchWorkitemResponseBodyData setVerifier(String verifier) {
            this.verifier = verifier;
            return this;
        }
        public String getVerifier() {
            return this.verifier;
        }

        public SearchWorkitemResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchWorkitemResponseBodyData setRelatedUserIds(String relatedUserIds) {
            this.relatedUserIds = relatedUserIds;
            return this;
        }
        public String getRelatedUserIds() {
            return this.relatedUserIds;
        }

        public SearchWorkitemResponseBodyData setRelatedAKProjectGuids(String relatedAKProjectGuids) {
            this.relatedAKProjectGuids = relatedAKProjectGuids;
            return this;
        }
        public String getRelatedAKProjectGuids() {
            return this.relatedAKProjectGuids;
        }

        public SearchWorkitemResponseBodyData setRelatedAKProjectIds(String relatedAKProjectIds) {
            this.relatedAKProjectIds = relatedAKProjectIds;
            return this;
        }
        public String getRelatedAKProjectIds() {
            return this.relatedAKProjectIds;
        }

        public SearchWorkitemResponseBodyData setWatcherIdList(String watcherIdList) {
            this.watcherIdList = watcherIdList;
            return this;
        }
        public String getWatcherIdList() {
            return this.watcherIdList;
        }

        public SearchWorkitemResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public SearchWorkitemResponseBodyData setAssignedToIdList(String assignedToIdList) {
            this.assignedToIdList = assignedToIdList;
            return this;
        }
        public String getAssignedToIdList() {
            return this.assignedToIdList;
        }

        public SearchWorkitemResponseBodyData setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public SearchWorkitemResponseBodyData setStatusStage(Integer statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public Integer getStatusStage() {
            return this.statusStage;
        }

        public SearchWorkitemResponseBodyData setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public SearchWorkitemResponseBodyData setParentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }
        public Integer getParentId() {
            return this.parentId;
        }

        public SearchWorkitemResponseBodyData setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public SearchWorkitemResponseBodyData setVersionIds(String versionIds) {
            this.versionIds = versionIds;
            return this;
        }
        public String getVersionIds() {
            return this.versionIds;
        }

        public SearchWorkitemResponseBodyData setScope(Integer scope) {
            this.scope = scope;
            return this;
        }
        public Integer getScope() {
            return this.scope;
        }

        public SearchWorkitemResponseBodyData setSeriousLevel(String seriousLevel) {
            this.seriousLevel = seriousLevel;
            return this;
        }
        public String getSeriousLevel() {
            return this.seriousLevel;
        }

        public SearchWorkitemResponseBodyData setStatusId(Integer statusId) {
            this.statusId = statusId;
            return this;
        }
        public Integer getStatusId() {
            return this.statusId;
        }

        public SearchWorkitemResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public SearchWorkitemResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public SearchWorkitemResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchWorkitemResponseBodyData setAssignedToId(Integer assignedToId) {
            this.assignedToId = assignedToId;
            return this;
        }
        public Integer getAssignedToId() {
            return this.assignedToId;
        }

        public SearchWorkitemResponseBodyData setTrackerIds(String trackerIds) {
            this.trackerIds = trackerIds;
            return this;
        }
        public String getTrackerIds() {
            return this.trackerIds;
        }

        public SearchWorkitemResponseBodyData setIssueTypeId(Integer issueTypeId) {
            this.issueTypeId = issueTypeId;
            return this;
        }
        public Integer getIssueTypeId() {
            return this.issueTypeId;
        }

        public SearchWorkitemResponseBodyData setChangeLogList(String changeLogList) {
            this.changeLogList = changeLogList;
            return this;
        }
        public String getChangeLogList() {
            return this.changeLogList;
        }

        public SearchWorkitemResponseBodyData setFixedDuration(Integer fixedDuration) {
            this.fixedDuration = fixedDuration;
            return this;
        }
        public Integer getFixedDuration() {
            return this.fixedDuration;
        }

        public SearchWorkitemResponseBodyData setScopeUserIds(String scopeUserIds) {
            this.scopeUserIds = scopeUserIds;
            return this;
        }
        public String getScopeUserIds() {
            return this.scopeUserIds;
        }

        public SearchWorkitemResponseBodyData setDevDuration(Integer devDuration) {
            this.devDuration = devDuration;
            return this;
        }
        public Integer getDevDuration() {
            return this.devDuration;
        }

        public SearchWorkitemResponseBodyData setLinePath(String linePath) {
            this.linePath = linePath;
            return this;
        }
        public String getLinePath() {
            return this.linePath;
        }

        public SearchWorkitemResponseBodyData setBlackListNotice(String blackListNotice) {
            this.blackListNotice = blackListNotice;
            return this;
        }
        public String getBlackListNotice() {
            return this.blackListNotice;
        }

        public SearchWorkitemResponseBodyData setProjectIds(String projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public String getProjectIds() {
            return this.projectIds;
        }

        public SearchWorkitemResponseBodyData setTestsuiteId(Integer testsuiteId) {
            this.testsuiteId = testsuiteId;
            return this;
        }
        public Integer getTestsuiteId() {
            return this.testsuiteId;
        }

        public SearchWorkitemResponseBodyData setModuleUpdated(Boolean moduleUpdated) {
            this.moduleUpdated = moduleUpdated;
            return this;
        }
        public Boolean getModuleUpdated() {
            return this.moduleUpdated;
        }

        public SearchWorkitemResponseBodyData setCommentList(String commentList) {
            this.commentList = commentList;
            return this;
        }
        public String getCommentList() {
            return this.commentList;
        }

        public SearchWorkitemResponseBodyData setSprintId(Integer sprintId) {
            this.sprintId = sprintId;
            return this;
        }
        public Integer getSprintId() {
            return this.sprintId;
        }

        public SearchWorkitemResponseBodyData setRespondDuration(Integer respondDuration) {
            this.respondDuration = respondDuration;
            return this;
        }
        public Integer getRespondDuration() {
            return this.respondDuration;
        }

        public SearchWorkitemResponseBodyData setModuleIds(String moduleIds) {
            this.moduleIds = moduleIds;
            return this;
        }
        public String getModuleIds() {
            return this.moduleIds;
        }

        public SearchWorkitemResponseBodyData setVerifierStaffId(String verifierStaffId) {
            this.verifierStaffId = verifierStaffId;
            return this;
        }
        public String getVerifierStaffId() {
            return this.verifierStaffId;
        }

        public SearchWorkitemResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
