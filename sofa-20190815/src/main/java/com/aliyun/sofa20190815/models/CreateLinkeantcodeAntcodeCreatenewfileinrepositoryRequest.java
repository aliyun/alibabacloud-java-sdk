// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("CommitMessage")
    public String commitMessage;

    @NameInMap("Content")
    public String content;

    @NameInMap("Encoding")
    public String encoding;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest self = new CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }
    public String getCommitMessage() {
        return this.commitMessage;
    }

    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreatenewfileinrepositoryRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
