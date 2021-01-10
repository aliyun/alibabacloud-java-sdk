// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RollbackLinkeBahamutAdminpipelinerollbackexistedRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("BahamutTenant")
    public String bahamutTenant;

    @NameInMap("Iteration")
    public String iteration;

    public static RollbackLinkeBahamutAdminpipelinerollbackexistedRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackLinkeBahamutAdminpipelinerollbackexistedRequest self = new RollbackLinkeBahamutAdminpipelinerollbackexistedRequest();
        return TeaModel.build(map, self);
    }

    public RollbackLinkeBahamutAdminpipelinerollbackexistedRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public RollbackLinkeBahamutAdminpipelinerollbackexistedRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public RollbackLinkeBahamutAdminpipelinerollbackexistedRequest setIteration(String iteration) {
        this.iteration = iteration;
        return this;
    }
    public String getIteration() {
        return this.iteration;
    }

}
