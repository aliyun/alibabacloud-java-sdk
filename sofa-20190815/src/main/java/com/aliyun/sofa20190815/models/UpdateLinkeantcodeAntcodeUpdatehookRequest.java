// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatehookRequest extends TeaModel {
    @NameInMap("EnableSslVerification")
    public String enableSslVerification;

    @NameInMap("HookId")
    public String hookId;

    @NameInMap("Id")
    public String id;

    @NameInMap("IssuesEvents")
    public String issuesEvents;

    @NameInMap("MergeRequestsEvents")
    public String mergeRequestsEvents;

    @NameInMap("NoteEvents")
    public String noteEvents;

    @NameInMap("PushEvents")
    public String pushEvents;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("TagPushEvents")
    public String tagPushEvents;

    @NameInMap("Url")
    public String url;

    public static UpdateLinkeantcodeAntcodeUpdatehookRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatehookRequest self = new UpdateLinkeantcodeAntcodeUpdatehookRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setEnableSslVerification(String enableSslVerification) {
        this.enableSslVerification = enableSslVerification;
        return this;
    }
    public String getEnableSslVerification() {
        return this.enableSslVerification;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setHookId(String hookId) {
        this.hookId = hookId;
        return this;
    }
    public String getHookId() {
        return this.hookId;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setIssuesEvents(String issuesEvents) {
        this.issuesEvents = issuesEvents;
        return this;
    }
    public String getIssuesEvents() {
        return this.issuesEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setMergeRequestsEvents(String mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
        return this;
    }
    public String getMergeRequestsEvents() {
        return this.mergeRequestsEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setNoteEvents(String noteEvents) {
        this.noteEvents = noteEvents;
        return this;
    }
    public String getNoteEvents() {
        return this.noteEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setPushEvents(String pushEvents) {
        this.pushEvents = pushEvents;
        return this;
    }
    public String getPushEvents() {
        return this.pushEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setTagPushEvents(String tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
        return this;
    }
    public String getTagPushEvents() {
        return this.tagPushEvents;
    }

    public UpdateLinkeantcodeAntcodeUpdatehookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
