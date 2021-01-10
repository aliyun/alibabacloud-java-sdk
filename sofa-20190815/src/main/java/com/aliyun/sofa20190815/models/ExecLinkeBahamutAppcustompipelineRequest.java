// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutAppcustompipelineRequest extends TeaModel {
    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("FromTenant")
    public String fromTenant;

    @NameInMap("TargetApp")
    public String targetApp;

    @NameInMap("TargetTenant")
    public String targetTenant;

    @NameInMap("WithExclude")
    public String withExclude;

    public static ExecLinkeBahamutAppcustompipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutAppcustompipelineRequest self = new ExecLinkeBahamutAppcustompipelineRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutAppcustompipelineRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public ExecLinkeBahamutAppcustompipelineRequest setFromTenant(String fromTenant) {
        this.fromTenant = fromTenant;
        return this;
    }
    public String getFromTenant() {
        return this.fromTenant;
    }

    public ExecLinkeBahamutAppcustompipelineRequest setTargetApp(String targetApp) {
        this.targetApp = targetApp;
        return this;
    }
    public String getTargetApp() {
        return this.targetApp;
    }

    public ExecLinkeBahamutAppcustompipelineRequest setTargetTenant(String targetTenant) {
        this.targetTenant = targetTenant;
        return this;
    }
    public String getTargetTenant() {
        return this.targetTenant;
    }

    public ExecLinkeBahamutAppcustompipelineRequest setWithExclude(String withExclude) {
        this.withExclude = withExclude;
        return this;
    }
    public String getWithExclude() {
        return this.withExclude;
    }

}
