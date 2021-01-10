// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutVcsmergerequestmrcommentRequest extends TeaModel {
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

    public static UpdateLinkeBahamutVcsmergerequestmrcommentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutVcsmergerequestmrcommentRequest self = new UpdateLinkeBahamutVcsmergerequestmrcommentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentRequest setCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }
    public String getCommentId() {
        return this.commentId;
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentRequest setCommentStr(String commentStr) {
        this.commentStr = commentStr;
        return this;
    }
    public String getCommentStr() {
        return this.commentStr;
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentRequest setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeBahamutVcsmergerequestmrcommentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
