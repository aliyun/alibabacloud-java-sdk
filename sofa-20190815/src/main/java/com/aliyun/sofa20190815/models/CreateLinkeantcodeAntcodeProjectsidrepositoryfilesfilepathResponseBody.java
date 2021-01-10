// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody extends TeaModel {
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("BranchCreated")
    public Boolean branchCreated;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody self = new CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody setBranchCreated(Boolean branchCreated) {
        this.branchCreated = branchCreated;
        return this;
    }
    public Boolean getBranchCreated() {
        return this.branchCreated;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
