// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutVcsmrcommentRequest extends TeaModel {
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

    public static CreateLinkeBahamutVcsmrcommentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutVcsmrcommentRequest self = new CreateLinkeBahamutVcsmrcommentRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutVcsmrcommentRequest setCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }
    public String getCommentId() {
        return this.commentId;
    }

    public CreateLinkeBahamutVcsmrcommentRequest setCommentStr(String commentStr) {
        this.commentStr = commentStr;
        return this;
    }
    public String getCommentStr() {
        return this.commentStr;
    }

    public CreateLinkeBahamutVcsmrcommentRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public CreateLinkeBahamutVcsmrcommentRequest setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public CreateLinkeBahamutVcsmrcommentRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public CreateLinkeBahamutVcsmrcommentRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateLinkeBahamutVcsmrcommentRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateLinkeBahamutVcsmrcommentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
