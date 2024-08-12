// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListUserFbIssuesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientModel")
    public String clientModel;

    @NameInMap("ClientSn")
    public String clientSn;

    @NameInMap("CustomerId")
    public String customerId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("FbType")
    public Integer fbType;

    @NameInMap("IssueId")
    public Integer issueId;

    @NameInMap("IssueLabel")
    public String issueLabel;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserEmail")
    public String userEmail;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WasRead")
    public Integer wasRead;

    public static ListUserFbIssuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserFbIssuesRequest self = new ListUserFbIssuesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserFbIssuesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListUserFbIssuesRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ListUserFbIssuesRequest setClientModel(String clientModel) {
        this.clientModel = clientModel;
        return this;
    }
    public String getClientModel() {
        return this.clientModel;
    }

    public ListUserFbIssuesRequest setClientSn(String clientSn) {
        this.clientSn = clientSn;
        return this;
    }
    public String getClientSn() {
        return this.clientSn;
    }

    public ListUserFbIssuesRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public ListUserFbIssuesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListUserFbIssuesRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ListUserFbIssuesRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUserFbIssuesRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListUserFbIssuesRequest setFbType(Integer fbType) {
        this.fbType = fbType;
        return this;
    }
    public Integer getFbType() {
        return this.fbType;
    }

    public ListUserFbIssuesRequest setIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }
    public Integer getIssueId() {
        return this.issueId;
    }

    public ListUserFbIssuesRequest setIssueLabel(String issueLabel) {
        this.issueLabel = issueLabel;
        return this;
    }
    public String getIssueLabel() {
        return this.issueLabel;
    }

    public ListUserFbIssuesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserFbIssuesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserFbIssuesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListUserFbIssuesRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ListUserFbIssuesRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public ListUserFbIssuesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListUserFbIssuesRequest setWasRead(Integer wasRead) {
        this.wasRead = wasRead;
        return this;
    }
    public Integer getWasRead() {
        return this.wasRead;
    }

}
