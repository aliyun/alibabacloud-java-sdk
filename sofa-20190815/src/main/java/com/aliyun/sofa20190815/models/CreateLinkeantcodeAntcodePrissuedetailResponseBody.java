// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodePrissuedetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IssueTitle")
    public String issueTitle;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("IssueSite")
    public String issueSite;

    @NameInMap("IssueType")
    public String issueType;

    @NameInMap("IssueUrl")
    public String issueUrl;

    @NameInMap("IssueId")
    public String issueId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PullRequestId")
    public Long pullRequestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("IssueProvider")
    public String issueProvider;

    public static CreateLinkeantcodeAntcodePrissuedetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodePrissuedetailResponseBody self = new CreateLinkeantcodeAntcodePrissuedetailResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
        return this;
    }
    public String getIssueTitle() {
        return this.issueTitle;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setIssueSite(String issueSite) {
        this.issueSite = issueSite;
        return this;
    }
    public String getIssueSite() {
        return this.issueSite;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }
    public String getIssueType() {
        return this.issueType;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }
    public String getIssueUrl() {
        return this.issueUrl;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setPullRequestId(Long pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public Long getPullRequestId() {
        return this.pullRequestId;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeantcodeAntcodePrissuedetailResponseBody setIssueProvider(String issueProvider) {
        this.issueProvider = issueProvider;
        return this;
    }
    public String getIssueProvider() {
        return this.issueProvider;
    }

}
