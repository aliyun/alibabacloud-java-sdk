// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutVcscommitcommentRequest extends TeaModel {
    @NameInMap("CommentId")
    public String commentId;

    @NameInMap("CommentStr")
    public String commentStr;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("LineCode")
    public String lineCode;

    @NameInMap("MergeRequestId")
    public String mergeRequestId;

    @NameInMap("Path")
    public String path;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteLinkeBahamutVcscommitcommentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutVcscommitcommentRequest self = new DeleteLinkeBahamutVcscommitcommentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutVcscommitcommentRequest setCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }
    public String getCommentId() {
        return this.commentId;
    }

    public DeleteLinkeBahamutVcscommitcommentRequest setCommentStr(String commentStr) {
        this.commentStr = commentStr;
        return this;
    }
    public String getCommentStr() {
        return this.commentStr;
    }

    public DeleteLinkeBahamutVcscommitcommentRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public DeleteLinkeBahamutVcscommitcommentRequest setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public DeleteLinkeBahamutVcscommitcommentRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public DeleteLinkeBahamutVcscommitcommentRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DeleteLinkeBahamutVcscommitcommentRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteLinkeBahamutVcscommitcommentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
