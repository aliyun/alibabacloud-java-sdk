// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatehookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("BuildEvents")
    public Boolean buildEvents;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("EnableSslVerification")
    public Boolean enableSslVerification;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IssuesEvents")
    public Boolean issuesEvents;

    @NameInMap("MergeRequestsEvents")
    public Boolean mergeRequestsEvents;

    @NameInMap("NoteEvents")
    public Boolean noteEvents;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("PushEvents")
    public Boolean pushEvents;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("TagPushEvents")
    public Boolean tagPushEvents;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Url")
    public String url;

    public static UpdateLinkeantcodeAntcodeUpdatehookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatehookResponseBody self = new UpdateLinkeantcodeAntcodeUpdatehookResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setBuildEvents(Boolean buildEvents) {
        this.buildEvents = buildEvents;
        return this;
    }
    public Boolean getBuildEvents() {
        return this.buildEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setEnableSslVerification(Boolean enableSslVerification) {
        this.enableSslVerification = enableSslVerification;
        return this;
    }
    public Boolean getEnableSslVerification() {
        return this.enableSslVerification;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setIssuesEvents(Boolean issuesEvents) {
        this.issuesEvents = issuesEvents;
        return this;
    }
    public Boolean getIssuesEvents() {
        return this.issuesEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setMergeRequestsEvents(Boolean mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
        return this;
    }
    public Boolean getMergeRequestsEvents() {
        return this.mergeRequestsEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setNoteEvents(Boolean noteEvents) {
        this.noteEvents = noteEvents;
        return this;
    }
    public Boolean getNoteEvents() {
        return this.noteEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setPushEvents(Boolean pushEvents) {
        this.pushEvents = pushEvents;
        return this;
    }
    public Boolean getPushEvents() {
        return this.pushEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setTagPushEvents(Boolean tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
        return this;
    }
    public Boolean getTagPushEvents() {
        return this.tagPushEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
