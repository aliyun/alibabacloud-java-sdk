// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("CommitMessage")
    public String commitMessage;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest self = new DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }
    public String getCommitMessage() {
        return this.commitMessage;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
