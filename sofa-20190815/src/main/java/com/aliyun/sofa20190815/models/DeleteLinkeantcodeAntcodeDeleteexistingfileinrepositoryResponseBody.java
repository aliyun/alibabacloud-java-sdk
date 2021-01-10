// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("BranchCreated")
    public Boolean branchCreated;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody self = new DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody setBranchCreated(Boolean branchCreated) {
        this.branchCreated = branchCreated;
        return this;
    }
    public Boolean getBranchCreated() {
        return this.branchCreated;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
