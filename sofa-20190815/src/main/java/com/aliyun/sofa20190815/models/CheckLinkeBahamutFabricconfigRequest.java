// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutFabricconfigRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("FromDevStage")
    public String fromDevStage;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ToDevStage")
    public String toDevStage;

    public static CheckLinkeBahamutFabricconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutFabricconfigRequest self = new CheckLinkeBahamutFabricconfigRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutFabricconfigRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CheckLinkeBahamutFabricconfigRequest setFromDevStage(String fromDevStage) {
        this.fromDevStage = fromDevStage;
        return this;
    }
    public String getFromDevStage() {
        return this.fromDevStage;
    }

    public CheckLinkeBahamutFabricconfigRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CheckLinkeBahamutFabricconfigRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public CheckLinkeBahamutFabricconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckLinkeBahamutFabricconfigRequest setToDevStage(String toDevStage) {
        this.toDevStage = toDevStage;
        return this;
    }
    public String getToDevStage() {
        return this.toDevStage;
    }

}
