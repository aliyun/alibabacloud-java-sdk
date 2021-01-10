// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAdminpipelineallunfinishedunitsRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("BahamutTenant")
    public String bahamutTenant;

    @NameInMap("Iteration")
    public String iteration;

    public static GetLinkeBahamutAdminpipelineallunfinishedunitsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAdminpipelineallunfinishedunitsRequest self = new GetLinkeBahamutAdminpipelineallunfinishedunitsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAdminpipelineallunfinishedunitsRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public GetLinkeBahamutAdminpipelineallunfinishedunitsRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public GetLinkeBahamutAdminpipelineallunfinishedunitsRequest setIteration(String iteration) {
        this.iteration = iteration;
        return this;
    }
    public String getIteration() {
        return this.iteration;
    }

}
