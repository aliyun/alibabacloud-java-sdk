// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListUserFbAcIssuesRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IssueId")
    public String issueId;

    @NameInMap("Label")
    public String label;

    @NameInMap("ReservedA")
    public String reservedA;

    @NameInMap("ReservedB")
    public String reservedB;

    @NameInMap("UserEmail")
    public String userEmail;

    public static ListUserFbAcIssuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserFbAcIssuesRequest self = new ListUserFbAcIssuesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserFbAcIssuesRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ListUserFbAcIssuesRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public ListUserFbAcIssuesRequest setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUserFbAcIssuesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUserFbAcIssuesRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public ListUserFbAcIssuesRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ListUserFbAcIssuesRequest setReservedA(String reservedA) {
        this.reservedA = reservedA;
        return this;
    }
    public String getReservedA() {
        return this.reservedA;
    }

    public ListUserFbAcIssuesRequest setReservedB(String reservedB) {
        this.reservedB = reservedB;
        return this;
    }
    public String getReservedB() {
        return this.reservedB;
    }

    public ListUserFbAcIssuesRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

}
