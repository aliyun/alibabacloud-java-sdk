// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeSnippetnoteRequest extends TeaModel {
    @NameInMap("DiscussionId")
    public String discussionId;

    @NameInMap("Id")
    public String id;

    @NameInMap("IsAward")
    public String isAward;

    @NameInMap("Note")
    public String note;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeSnippetnoteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeSnippetnoteRequest self = new CreateLinkeantcodeAntcodeSnippetnoteRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeSnippetnoteRequest setDiscussionId(String discussionId) {
        this.discussionId = discussionId;
        return this;
    }
    public String getDiscussionId() {
        return this.discussionId;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteRequest setIsAward(String isAward) {
        this.isAward = isAward;
        return this;
    }
    public String getIsAward() {
        return this.isAward;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
