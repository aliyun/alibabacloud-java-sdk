// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeantcodeAntcodeRedochecksuitesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AfterSha")
    public String afterSha;

    @NameInMap("BeforeSha")
    public String beforeSha;

    @NameInMap("Conclusion")
    public String conclusion;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("HeadBranch")
    public String headBranch;

    @NameInMap("HeadSha")
    public String headSha;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("PullRequestId")
    public Long pullRequestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("CheckRuns")
    public java.util.List<GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns> checkRuns;

    @NameInMap("Service")
    public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService service;

    public static GetLinkeantcodeAntcodeRedochecksuitesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeantcodeAntcodeRedochecksuitesResponseBody self = new GetLinkeantcodeAntcodeRedochecksuitesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setAfterSha(String afterSha) {
        this.afterSha = afterSha;
        return this;
    }
    public String getAfterSha() {
        return this.afterSha;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setBeforeSha(String beforeSha) {
        this.beforeSha = beforeSha;
        return this;
    }
    public String getBeforeSha() {
        return this.beforeSha;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setConclusion(String conclusion) {
        this.conclusion = conclusion;
        return this;
    }
    public String getConclusion() {
        return this.conclusion;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
        return this;
    }
    public String getHeadBranch() {
        return this.headBranch;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setHeadSha(String headSha) {
        this.headSha = headSha;
        return this;
    }
    public String getHeadSha() {
        return this.headSha;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setPullRequestId(Long pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public Long getPullRequestId() {
        return this.pullRequestId;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setCheckRuns(java.util.List<GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns> checkRuns) {
        this.checkRuns = checkRuns;
        return this;
    }
    public java.util.List<GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns> getCheckRuns() {
        return this.checkRuns;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesResponseBody setService(GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService service) {
        this.service = service;
        return this;
    }
    public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService getService() {
        return this.service;
    }

    public static class GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns extends TeaModel {
        @NameInMap("CompletedAt")
        public String completedAt;

        @NameInMap("Conclusion")
        public String conclusion;

        @NameInMap("Context")
        public String context;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DetailUrl")
        public String detailUrl;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("StartedAt")
        public String startedAt;

        @NameInMap("Status")
        public String status;

        @NameInMap("SuiteId")
        public Long suiteId;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        @NameInMap("UpdateAt")
        public String updateAt;

        @NameInMap("Annotations")
        public java.util.List<String> annotations;

        public static GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns self = new GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns();
            return TeaModel.build(map, self);
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setConclusion(String conclusion) {
            this.conclusion = conclusion;
            return this;
        }
        public String getConclusion() {
            return this.conclusion;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setSuiteId(Long suiteId) {
            this.suiteId = suiteId;
            return this;
        }
        public Long getSuiteId() {
            return this.suiteId;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setUpdateAt(String updateAt) {
            this.updateAt = updateAt;
            return this;
        }
        public String getUpdateAt() {
            return this.updateAt;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyCheckRuns setAnnotations(java.util.List<String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<String> getAnnotations() {
            return this.annotations;
        }

    }

    public static class GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService extends TeaModel {
        @NameInMap("AccessLevel")
        public String accessLevel;

        @NameInMap("AccessUserId")
        public Long accessUserId;

        @NameInMap("AutoCheckSuite")
        public Boolean autoCheckSuite;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("BuildEvent")
        public Boolean buildEvent;

        @NameInMap("CallUrl")
        public String callUrl;

        @NameInMap("Checks")
        public Boolean checks;

        @NameInMap("ChecksDependOn")
        public String checksDependOn;

        @NameInMap("CheckResultUrl")
        public String checkResultUrl;

        @NameInMap("CheckSite")
        public Long checkSite;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("Homepage")
        public String homepage;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IssueEvent")
        public Boolean issueEvent;

        @NameInMap("MergeRequestEvent")
        public Boolean mergeRequestEvent;

        @NameInMap("Name")
        public String name;

        @NameInMap("NoteEvent")
        public Boolean noteEvent;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("PushEvent")
        public Boolean pushEvent;

        @NameInMap("SourceId")
        public Long sourceId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("TagPushEvent")
        public Boolean tagPushEvent;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        public static GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService self = new GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService();
            return TeaModel.build(map, self);
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setAccessLevel(String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public String getAccessLevel() {
            return this.accessLevel;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setAccessUserId(Long accessUserId) {
            this.accessUserId = accessUserId;
            return this;
        }
        public Long getAccessUserId() {
            return this.accessUserId;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setAutoCheckSuite(Boolean autoCheckSuite) {
            this.autoCheckSuite = autoCheckSuite;
            return this;
        }
        public Boolean getAutoCheckSuite() {
            return this.autoCheckSuite;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setBuildEvent(Boolean buildEvent) {
            this.buildEvent = buildEvent;
            return this;
        }
        public Boolean getBuildEvent() {
            return this.buildEvent;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setCallUrl(String callUrl) {
            this.callUrl = callUrl;
            return this;
        }
        public String getCallUrl() {
            return this.callUrl;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setChecks(Boolean checks) {
            this.checks = checks;
            return this;
        }
        public Boolean getChecks() {
            return this.checks;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setChecksDependOn(String checksDependOn) {
            this.checksDependOn = checksDependOn;
            return this;
        }
        public String getChecksDependOn() {
            return this.checksDependOn;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setCheckResultUrl(String checkResultUrl) {
            this.checkResultUrl = checkResultUrl;
            return this;
        }
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setCheckSite(Long checkSite) {
            this.checkSite = checkSite;
            return this;
        }
        public Long getCheckSite() {
            return this.checkSite;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setIssueEvent(Boolean issueEvent) {
            this.issueEvent = issueEvent;
            return this;
        }
        public Boolean getIssueEvent() {
            return this.issueEvent;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setMergeRequestEvent(Boolean mergeRequestEvent) {
            this.mergeRequestEvent = mergeRequestEvent;
            return this;
        }
        public Boolean getMergeRequestEvent() {
            return this.mergeRequestEvent;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setNoteEvent(Boolean noteEvent) {
            this.noteEvent = noteEvent;
            return this;
        }
        public Boolean getNoteEvent() {
            return this.noteEvent;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setPushEvent(Boolean pushEvent) {
            this.pushEvent = pushEvent;
            return this;
        }
        public Boolean getPushEvent() {
            return this.pushEvent;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setTagPushEvent(Boolean tagPushEvent) {
            this.tagPushEvent = tagPushEvent;
            return this;
        }
        public Boolean getTagPushEvent() {
            return this.tagPushEvent;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeantcodeAntcodeRedochecksuitesResponseBodyService setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

    }

}
