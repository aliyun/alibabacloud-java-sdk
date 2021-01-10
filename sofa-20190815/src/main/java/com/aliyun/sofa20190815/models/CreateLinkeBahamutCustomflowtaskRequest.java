// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCustomflowtaskRequest extends TeaModel {
    @NameInMap("ApprovalContext")
    public String approvalContext;

    @NameInMap("ApprovalTitle")
    public String approvalTitle;

    @NameInMap("Approver")
    public String approver;

    @NameInMap("AppList")
    public String appList;

    @NameInMap("CtuUrl")
    public String ctuUrl;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("Stage")
    public String stage;

    @NameInMap("StcManager")
    public String stcManager;

    @NameInMap("TaskType")
    public String taskType;

    public static CreateLinkeBahamutCustomflowtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCustomflowtaskRequest self = new CreateLinkeBahamutCustomflowtaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCustomflowtaskRequest setApprovalContext(String approvalContext) {
        this.approvalContext = approvalContext;
        return this;
    }
    public String getApprovalContext() {
        return this.approvalContext;
    }

    public CreateLinkeBahamutCustomflowtaskRequest setApprovalTitle(String approvalTitle) {
        this.approvalTitle = approvalTitle;
        return this;
    }
    public String getApprovalTitle() {
        return this.approvalTitle;
    }

    public CreateLinkeBahamutCustomflowtaskRequest setApprover(String approver) {
        this.approver = approver;
        return this;
    }
    public String getApprover() {
        return this.approver;
    }

    public CreateLinkeBahamutCustomflowtaskRequest setAppList(String appList) {
        this.appList = appList;
        return this;
    }
    public String getAppList() {
        return this.appList;
    }

    public CreateLinkeBahamutCustomflowtaskRequest setCtuUrl(String ctuUrl) {
        this.ctuUrl = ctuUrl;
        return this;
    }
    public String getCtuUrl() {
        return this.ctuUrl;
    }

    public CreateLinkeBahamutCustomflowtaskRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public CreateLinkeBahamutCustomflowtaskRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public CreateLinkeBahamutCustomflowtaskRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public CreateLinkeBahamutCustomflowtaskRequest setStcManager(String stcManager) {
        this.stcManager = stcManager;
        return this;
    }
    public String getStcManager() {
        return this.stcManager;
    }

    public CreateLinkeBahamutCustomflowtaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
