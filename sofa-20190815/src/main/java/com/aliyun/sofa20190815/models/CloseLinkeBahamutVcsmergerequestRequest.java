// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloseLinkeBahamutVcsmergerequestRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Assignee")
    public String assignee;

    @NameInMap("Description")
    public String description;

    @NameInMap("MergeRequestId")
    public String mergeRequestId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("StateEvent")
    public String stateEvent;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Title")
    public String title;

    public static CloseLinkeBahamutVcsmergerequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseLinkeBahamutVcsmergerequestRequest self = new CloseLinkeBahamutVcsmergerequestRequest();
        return TeaModel.build(map, self);
    }

    public CloseLinkeBahamutVcsmergerequestRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CloseLinkeBahamutVcsmergerequestRequest setAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }
    public String getAssignee() {
        return this.assignee;
    }

    public CloseLinkeBahamutVcsmergerequestRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CloseLinkeBahamutVcsmergerequestRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public CloseLinkeBahamutVcsmergerequestRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CloseLinkeBahamutVcsmergerequestRequest setStateEvent(String stateEvent) {
        this.stateEvent = stateEvent;
        return this;
    }
    public String getStateEvent() {
        return this.stateEvent;
    }

    public CloseLinkeBahamutVcsmergerequestRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CloseLinkeBahamutVcsmergerequestRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
