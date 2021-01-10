// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReopenLinkeBahamutVcsmergerequestRequest extends TeaModel {
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

    public static ReopenLinkeBahamutVcsmergerequestRequest build(java.util.Map<String, ?> map) throws Exception {
        ReopenLinkeBahamutVcsmergerequestRequest self = new ReopenLinkeBahamutVcsmergerequestRequest();
        return TeaModel.build(map, self);
    }

    public ReopenLinkeBahamutVcsmergerequestRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ReopenLinkeBahamutVcsmergerequestRequest setAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }
    public String getAssignee() {
        return this.assignee;
    }

    public ReopenLinkeBahamutVcsmergerequestRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ReopenLinkeBahamutVcsmergerequestRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public ReopenLinkeBahamutVcsmergerequestRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ReopenLinkeBahamutVcsmergerequestRequest setStateEvent(String stateEvent) {
        this.stateEvent = stateEvent;
        return this;
    }
    public String getStateEvent() {
        return this.stateEvent;
    }

    public ReopenLinkeBahamutVcsmergerequestRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ReopenLinkeBahamutVcsmergerequestRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
