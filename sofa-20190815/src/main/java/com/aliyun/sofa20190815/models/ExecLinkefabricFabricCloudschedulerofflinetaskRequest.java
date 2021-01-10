// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricCloudschedulerofflinetaskRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DevTaskEnable")
    public Boolean devTaskEnable;

    @NameInMap("NetTaskEnable")
    public Boolean netTaskEnable;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ShareOpenAPI")
    public Boolean shareOpenAPI;

    @NameInMap("SitTaskEnable")
    public Boolean sitTaskEnable;

    @NameInMap("SynacCheckedEnvZones")
    public String synacCheckedEnvZones;

    @NameInMap("SynacCheckedEnvZoneNames")
    public String synacCheckedEnvZoneNames;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("DevStageListRepeatList")
    public java.util.List<String> devStageListRepeatList;

    @NameInMap("SchedulerConfigsRepeatList")
    public java.util.List<String> schedulerConfigsRepeatList;

    public static ExecLinkefabricFabricCloudschedulerofflinetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricCloudschedulerofflinetaskRequest self = new ExecLinkefabricFabricCloudschedulerofflinetaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setDevTaskEnable(Boolean devTaskEnable) {
        this.devTaskEnable = devTaskEnable;
        return this;
    }
    public Boolean getDevTaskEnable() {
        return this.devTaskEnable;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setNetTaskEnable(Boolean netTaskEnable) {
        this.netTaskEnable = netTaskEnable;
        return this;
    }
    public Boolean getNetTaskEnable() {
        return this.netTaskEnable;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setShareOpenAPI(Boolean shareOpenAPI) {
        this.shareOpenAPI = shareOpenAPI;
        return this;
    }
    public Boolean getShareOpenAPI() {
        return this.shareOpenAPI;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setSitTaskEnable(Boolean sitTaskEnable) {
        this.sitTaskEnable = sitTaskEnable;
        return this;
    }
    public Boolean getSitTaskEnable() {
        return this.sitTaskEnable;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setSynacCheckedEnvZones(String synacCheckedEnvZones) {
        this.synacCheckedEnvZones = synacCheckedEnvZones;
        return this;
    }
    public String getSynacCheckedEnvZones() {
        return this.synacCheckedEnvZones;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setSynacCheckedEnvZoneNames(String synacCheckedEnvZoneNames) {
        this.synacCheckedEnvZoneNames = synacCheckedEnvZoneNames;
        return this;
    }
    public String getSynacCheckedEnvZoneNames() {
        return this.synacCheckedEnvZoneNames;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setDevStageListRepeatList(java.util.List<String> devStageListRepeatList) {
        this.devStageListRepeatList = devStageListRepeatList;
        return this;
    }
    public java.util.List<String> getDevStageListRepeatList() {
        return this.devStageListRepeatList;
    }

    public ExecLinkefabricFabricCloudschedulerofflinetaskRequest setSchedulerConfigsRepeatList(java.util.List<String> schedulerConfigsRepeatList) {
        this.schedulerConfigsRepeatList = schedulerConfigsRepeatList;
        return this;
    }
    public java.util.List<String> getSchedulerConfigsRepeatList() {
        return this.schedulerConfigsRepeatList;
    }

}
