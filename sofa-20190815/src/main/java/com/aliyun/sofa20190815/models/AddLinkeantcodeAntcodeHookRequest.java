// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeHookRequest extends TeaModel {
    @NameInMap("BuildEvents")
    public String buildEvents;

    @NameInMap("EnableSslVerification")
    public String enableSslVerification;

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

    public static AddLinkeantcodeAntcodeHookRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeHookRequest self = new AddLinkeantcodeAntcodeHookRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeHookRequest setBuildEvents(String buildEvents) {
        this.buildEvents = buildEvents;
        return this;
    }
    public String getBuildEvents() {
        return this.buildEvents;
    }

    public AddLinkeantcodeAntcodeHookRequest setEnableSslVerification(String enableSslVerification) {
        this.enableSslVerification = enableSslVerification;
        return this;
    }
    public String getEnableSslVerification() {
        return this.enableSslVerification;
    }

    public AddLinkeantcodeAntcodeHookRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeHookRequest setIssuesEvents(String issuesEvents) {
        this.issuesEvents = issuesEvents;
        return this;
    }
    public String getIssuesEvents() {
        return this.issuesEvents;
    }

    public AddLinkeantcodeAntcodeHookRequest setMergeRequestsEvents(String mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
        return this;
    }
    public String getMergeRequestsEvents() {
        return this.mergeRequestsEvents;
    }

    public AddLinkeantcodeAntcodeHookRequest setNoteEvents(String noteEvents) {
        this.noteEvents = noteEvents;
        return this;
    }
    public String getNoteEvents() {
        return this.noteEvents;
    }

    public AddLinkeantcodeAntcodeHookRequest setPushEvents(String pushEvents) {
        this.pushEvents = pushEvents;
        return this;
    }
    public String getPushEvents() {
        return this.pushEvents;
    }

    public AddLinkeantcodeAntcodeHookRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeHookRequest setTagPushEvents(String tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
        return this;
    }
    public String getTagPushEvents() {
        return this.tagPushEvents;
    }

    public AddLinkeantcodeAntcodeHookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
