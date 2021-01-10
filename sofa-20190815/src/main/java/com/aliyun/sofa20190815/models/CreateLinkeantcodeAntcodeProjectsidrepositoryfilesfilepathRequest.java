// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest extends TeaModel {
    @NameInMap("AuthorEmail")
    public String authorEmail;

    @NameInMap("AuthorName")
    public String authorName;

    @NameInMap("Branch")
    public String branch;

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

    @NameInMap("StartBranch")
    public String startBranch;

    public static CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest self = new CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
        return this;
    }
    public String getAuthorEmail() {
        return this.authorEmail;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }
    public String getCommitMessage() {
        return this.commitMessage;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathRequest setStartBranch(String startBranch) {
        this.startBranch = startBranch;
        return this;
    }
    public String getStartBranch() {
        return this.startBranch;
    }

}
