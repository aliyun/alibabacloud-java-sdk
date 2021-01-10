// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricOptdrmtaskRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DevTaskEnable")
    public Boolean devTaskEnable;

    @NameInMap("NetTaskEnable")
    public Boolean netTaskEnable;

    @NameInMap("PreTaskEnable")
    public Boolean preTaskEnable;

    @NameInMap("ProdTaskEnable")
    public Boolean prodTaskEnable;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SitTaskEnable")
    public Boolean sitTaskEnable;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("DevStageListRepeatList")
    public java.util.List<String> devStageListRepeatList;

    public static ExecLinkefabricFabricOptdrmtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricOptdrmtaskRequest self = new ExecLinkefabricFabricOptdrmtaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricOptdrmtaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExecLinkefabricFabricOptdrmtaskRequest setDevTaskEnable(Boolean devTaskEnable) {
        this.devTaskEnable = devTaskEnable;
        return this;
    }
    public Boolean getDevTaskEnable() {
        return this.devTaskEnable;
    }

    public ExecLinkefabricFabricOptdrmtaskRequest setNetTaskEnable(Boolean netTaskEnable) {
        this.netTaskEnable = netTaskEnable;
        return this;
    }
    public Boolean getNetTaskEnable() {
        return this.netTaskEnable;
    }

    public ExecLinkefabricFabricOptdrmtaskRequest setPreTaskEnable(Boolean preTaskEnable) {
        this.preTaskEnable = preTaskEnable;
        return this;
    }
    public Boolean getPreTaskEnable() {
        return this.preTaskEnable;
    }

    public ExecLinkefabricFabricOptdrmtaskRequest setProdTaskEnable(Boolean prodTaskEnable) {
        this.prodTaskEnable = prodTaskEnable;
        return this;
    }
    public Boolean getProdTaskEnable() {
        return this.prodTaskEnable;
    }

    public ExecLinkefabricFabricOptdrmtaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecLinkefabricFabricOptdrmtaskRequest setSitTaskEnable(Boolean sitTaskEnable) {
        this.sitTaskEnable = sitTaskEnable;
        return this;
    }
    public Boolean getSitTaskEnable() {
        return this.sitTaskEnable;
    }

    public ExecLinkefabricFabricOptdrmtaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public ExecLinkefabricFabricOptdrmtaskRequest setDevStageListRepeatList(java.util.List<String> devStageListRepeatList) {
        this.devStageListRepeatList = devStageListRepeatList;
        return this;
    }
    public java.util.List<String> getDevStageListRepeatList() {
        return this.devStageListRepeatList;
    }

}
