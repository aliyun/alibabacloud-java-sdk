// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportUserFbAcIssueShrinkRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("FileList")
    public String fileListShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("ReservedA")
    public String reservedA;

    @NameInMap("ReservedB")
    public String reservedB;

    @NameInMap("UserEmail")
    public String userEmail;

    public static ReportUserFbAcIssueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportUserFbAcIssueShrinkRequest self = new ReportUserFbAcIssueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReportUserFbAcIssueShrinkRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ReportUserFbAcIssueShrinkRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public ReportUserFbAcIssueShrinkRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ReportUserFbAcIssueShrinkRequest setFileListShrink(String fileListShrink) {
        this.fileListShrink = fileListShrink;
        return this;
    }
    public String getFileListShrink() {
        return this.fileListShrink;
    }

    public ReportUserFbAcIssueShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReportUserFbAcIssueShrinkRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ReportUserFbAcIssueShrinkRequest setReservedA(String reservedA) {
        this.reservedA = reservedA;
        return this;
    }
    public String getReservedA() {
        return this.reservedA;
    }

    public ReportUserFbAcIssueShrinkRequest setReservedB(String reservedB) {
        this.reservedB = reservedB;
        return this;
    }
    public String getReservedB() {
        return this.reservedB;
    }

    public ReportUserFbAcIssueShrinkRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

}
