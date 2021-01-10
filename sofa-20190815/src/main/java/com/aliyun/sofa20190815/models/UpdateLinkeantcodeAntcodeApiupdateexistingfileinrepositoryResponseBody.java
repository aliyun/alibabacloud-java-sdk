// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("BranchCreated")
    public Boolean branchCreated;

    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    public static UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody self = new UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody setBranchCreated(Boolean branchCreated) {
        this.branchCreated = branchCreated;
        return this;
    }
    public Boolean getBranchCreated() {
        return this.branchCreated;
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

}
