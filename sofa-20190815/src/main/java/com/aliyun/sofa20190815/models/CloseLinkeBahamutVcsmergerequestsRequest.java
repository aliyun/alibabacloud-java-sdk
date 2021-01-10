// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloseLinkeBahamutVcsmergerequestsRequest extends TeaModel {
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

    public static CloseLinkeBahamutVcsmergerequestsRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseLinkeBahamutVcsmergerequestsRequest self = new CloseLinkeBahamutVcsmergerequestsRequest();
        return TeaModel.build(map, self);
    }

    public CloseLinkeBahamutVcsmergerequestsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CloseLinkeBahamutVcsmergerequestsRequest setAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }
    public String getAssignee() {
        return this.assignee;
    }

    public CloseLinkeBahamutVcsmergerequestsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CloseLinkeBahamutVcsmergerequestsRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public CloseLinkeBahamutVcsmergerequestsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CloseLinkeBahamutVcsmergerequestsRequest setStateEvent(String stateEvent) {
        this.stateEvent = stateEvent;
        return this;
    }
    public String getStateEvent() {
        return this.stateEvent;
    }

    public CloseLinkeBahamutVcsmergerequestsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CloseLinkeBahamutVcsmergerequestsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
