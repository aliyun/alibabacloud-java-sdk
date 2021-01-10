// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetsamerepoapplnlterationRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("IterationExternalId")
    public String iterationExternalId;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static GetLinkeBahamutOpengetsamerepoapplnlterationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetsamerepoapplnlterationRequest self = new GetLinkeBahamutOpengetsamerepoapplnlterationRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetsamerepoapplnlterationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutOpengetsamerepoapplnlterationRequest setIterationExternalId(String iterationExternalId) {
        this.iterationExternalId = iterationExternalId;
        return this;
    }
    public String getIterationExternalId() {
        return this.iterationExternalId;
    }

    public GetLinkeBahamutOpengetsamerepoapplnlterationRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
