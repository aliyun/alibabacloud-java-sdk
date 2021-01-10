// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeCommentofsnippetRequest extends TeaModel {
    @NameInMap("CommentId")
    public String commentId;

    @NameInMap("Page")
    public String page;

    @NameInMap("PerPage")
    public String perPage;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeCommentofsnippetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeCommentofsnippetRequest self = new DeleteLinkeantcodeAntcodeCommentofsnippetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeCommentofsnippetRequest setCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }
    public String getCommentId() {
        return this.commentId;
    }

    public DeleteLinkeantcodeAntcodeCommentofsnippetRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public DeleteLinkeantcodeAntcodeCommentofsnippetRequest setPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }
    public String getPerPage() {
        return this.perPage;
    }

    public DeleteLinkeantcodeAntcodeCommentofsnippetRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteLinkeantcodeAntcodeCommentofsnippetRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
