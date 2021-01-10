// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("CheckRuns")
    public java.util.List<CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns> checkRuns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Service")
    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService service;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PullRequestId")
    public Long pullRequestId;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("AfterSha")
    public String afterSha;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("HeadSha")
    public String headSha;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("BeforeSha")
    public String beforeSha;

    @NameInMap("Id")
    public Long id;

    @NameInMap("HeadBranch")
    public String headBranch;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Conclusion")
    public String conclusion;

    public static CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody self = new CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setCheckRuns(java.util.List<CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns> checkRuns) {
        this.checkRuns = checkRuns;
        return this;
    }
    public java.util.List<CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns> getCheckRuns() {
        return this.checkRuns;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setService(CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService service) {
        this.service = service;
        return this;
    }
    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService getService() {
        return this.service;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setPullRequestId(Long pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public Long getPullRequestId() {
        return this.pullRequestId;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setAfterSha(String afterSha) {
        this.afterSha = afterSha;
        return this;
    }
    public String getAfterSha() {
        return this.afterSha;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setHeadSha(String headSha) {
        this.headSha = headSha;
        return this;
    }
    public String getHeadSha() {
        return this.headSha;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setBeforeSha(String beforeSha) {
        this.beforeSha = beforeSha;
        return this;
    }
    public String getBeforeSha() {
        return this.beforeSha;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
        return this;
    }
    public String getHeadBranch() {
        return this.headBranch;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBody setConclusion(String conclusion) {
        this.conclusion = conclusion;
        return this;
    }
    public String getConclusion() {
        return this.conclusion;
    }

    public static class CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("SuiteId")
        public Long suiteId;

        @NameInMap("Annotations")
        public java.util.List<String> annotations;

        @NameInMap("CompletedAt")
        public String completedAt;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("UpdateAt")
        public String updateAt;

        @NameInMap("Conclusion")
        public String conclusion;

        @NameInMap("Context")
        public String context;

        @NameInMap("StartedAt")
        public String startedAt;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Title")
        public String title;

        @NameInMap("DetailUrl")
        public String detailUrl;

        @NameInMap("Id")
        public Long id;

        public static CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns self = new CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setSuiteId(Long suiteId) {
            this.suiteId = suiteId;
            return this;
        }
        public Long getSuiteId() {
            return this.suiteId;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setAnnotations(java.util.List<String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<String> getAnnotations() {
            return this.annotations;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setUpdateAt(String updateAt) {
            this.updateAt = updateAt;
            return this;
        }
        public String getUpdateAt() {
            return this.updateAt;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setConclusion(String conclusion) {
            this.conclusion = conclusion;
            return this;
        }
        public String getConclusion() {
            return this.conclusion;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyCheckRuns setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService extends TeaModel {
        @NameInMap("ChecksDependOn")
        public String checksDependOn;

        @NameInMap("Homepage")
        public String homepage;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("AutoCheckSuite")
        public Boolean autoCheckSuite;

        @NameInMap("CallUrl")
        public String callUrl;

        @NameInMap("IssueEvent")
        public Boolean issueEvent;

        @NameInMap("Description")
        public String description;

        @NameInMap("PushEvent")
        public Boolean pushEvent;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("CheckResultUrl")
        public String checkResultUrl;

        @NameInMap("Checks")
        public Boolean checks;

        @NameInMap("BuildEvent")
        public Boolean buildEvent;

        @NameInMap("Name")
        public String name;

        @NameInMap("AccessUserId")
        public Long accessUserId;

        @NameInMap("TagPushEvent")
        public Boolean tagPushEvent;

        @NameInMap("MergeRequestEvent")
        public Boolean mergeRequestEvent;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CheckSite")
        public Long checkSite;

        @NameInMap("SourceId")
        public Long sourceId;

        @NameInMap("NoteEvent")
        public Boolean noteEvent;

        @NameInMap("AccessLevel")
        public String accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Properties")
        public String properties;

        public static CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService self = new CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setChecksDependOn(String checksDependOn) {
            this.checksDependOn = checksDependOn;
            return this;
        }
        public String getChecksDependOn() {
            return this.checksDependOn;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setAutoCheckSuite(Boolean autoCheckSuite) {
            this.autoCheckSuite = autoCheckSuite;
            return this;
        }
        public Boolean getAutoCheckSuite() {
            return this.autoCheckSuite;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setCallUrl(String callUrl) {
            this.callUrl = callUrl;
            return this;
        }
        public String getCallUrl() {
            return this.callUrl;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setIssueEvent(Boolean issueEvent) {
            this.issueEvent = issueEvent;
            return this;
        }
        public Boolean getIssueEvent() {
            return this.issueEvent;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setPushEvent(Boolean pushEvent) {
            this.pushEvent = pushEvent;
            return this;
        }
        public Boolean getPushEvent() {
            return this.pushEvent;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setCheckResultUrl(String checkResultUrl) {
            this.checkResultUrl = checkResultUrl;
            return this;
        }
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setChecks(Boolean checks) {
            this.checks = checks;
            return this;
        }
        public Boolean getChecks() {
            return this.checks;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setBuildEvent(Boolean buildEvent) {
            this.buildEvent = buildEvent;
            return this;
        }
        public Boolean getBuildEvent() {
            return this.buildEvent;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setAccessUserId(Long accessUserId) {
            this.accessUserId = accessUserId;
            return this;
        }
        public Long getAccessUserId() {
            return this.accessUserId;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setTagPushEvent(Boolean tagPushEvent) {
            this.tagPushEvent = tagPushEvent;
            return this;
        }
        public Boolean getTagPushEvent() {
            return this.tagPushEvent;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setMergeRequestEvent(Boolean mergeRequestEvent) {
            this.mergeRequestEvent = mergeRequestEvent;
            return this;
        }
        public Boolean getMergeRequestEvent() {
            return this.mergeRequestEvent;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setCheckSite(Long checkSite) {
            this.checkSite = checkSite;
            return this;
        }
        public Long getCheckSite() {
            return this.checkSite;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setNoteEvent(Boolean noteEvent) {
            this.noteEvent = noteEvent;
            return this;
        }
        public Boolean getNoteEvent() {
            return this.noteEvent;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setAccessLevel(String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public String getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseBodyService setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

    }

}
