// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportLinkeBahamutIterationimportmembersRequest extends TeaModel {
    @NameInMap("AppNames")
    public String appNames;

    @NameInMap("TenantId")
    public String tenantId;

    public static ImportLinkeBahamutIterationimportmembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportLinkeBahamutIterationimportmembersRequest self = new ImportLinkeBahamutIterationimportmembersRequest();
        return TeaModel.build(map, self);
    }

    public ImportLinkeBahamutIterationimportmembersRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public ImportLinkeBahamutIterationimportmembersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
