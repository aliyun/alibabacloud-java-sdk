// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodePullrequestissueResponseBody extends TeaModel {
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

    public static CreateLinkeantcodeAntcodePullrequestissueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodePullrequestissueResponseBody self = new CreateLinkeantcodeAntcodePullrequestissueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
        return this;
    }
    public String getIssueTitle() {
        return this.issueTitle;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setIssueSite(String issueSite) {
        this.issueSite = issueSite;
        return this;
    }
    public String getIssueSite() {
        return this.issueSite;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }
    public String getIssueType() {
        return this.issueType;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }
    public String getIssueUrl() {
        return this.issueUrl;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setPullRequestId(Long pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public Long getPullRequestId() {
        return this.pullRequestId;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponseBody setIssueProvider(String issueProvider) {
        this.issueProvider = issueProvider;
        return this;
    }
    public String getIssueProvider() {
        return this.issueProvider;
    }

}
