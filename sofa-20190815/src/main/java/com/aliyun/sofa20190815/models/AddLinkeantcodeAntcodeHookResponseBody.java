// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeHookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PushEvents")
    public Boolean pushEvents;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TagPushEvents")
    public Boolean tagPushEvents;

    @NameInMap("IssuesEvents")
    public Boolean issuesEvents;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("MergeRequestsEvents")
    public Boolean mergeRequestsEvents;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Url")
    public String url;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("Type")
    public String type;

    @NameInMap("BuildEvents")
    public Boolean buildEvents;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Id")
    public Long id;

    @NameInMap("EnableSslVerification")
    public Boolean enableSslVerification;

    @NameInMap("NoteEvents")
    public Boolean noteEvents;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddLinkeantcodeAntcodeHookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeHookResponseBody self = new AddLinkeantcodeAntcodeHookResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeHookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setPushEvents(Boolean pushEvents) {
        this.pushEvents = pushEvents;
        return this;
    }
    public Boolean getPushEvents() {
        return this.pushEvents;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setTagPushEvents(Boolean tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
        return this;
    }
    public Boolean getTagPushEvents() {
        return this.tagPushEvents;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setIssuesEvents(Boolean issuesEvents) {
        this.issuesEvents = issuesEvents;
        return this;
    }
    public Boolean getIssuesEvents() {
        return this.issuesEvents;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setMergeRequestsEvents(Boolean mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
        return this;
    }
    public Boolean getMergeRequestsEvents() {
        return this.mergeRequestsEvents;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setBuildEvents(Boolean buildEvents) {
        this.buildEvents = buildEvents;
        return this;
    }
    public Boolean getBuildEvents() {
        return this.buildEvents;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setEnableSslVerification(Boolean enableSslVerification) {
        this.enableSslVerification = enableSslVerification;
        return this;
    }
    public Boolean getEnableSslVerification() {
        return this.enableSslVerification;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setNoteEvents(Boolean noteEvents) {
        this.noteEvents = noteEvents;
        return this;
    }
    public Boolean getNoteEvents() {
        return this.noteEvents;
    }

    public AddLinkeantcodeAntcodeHookResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
