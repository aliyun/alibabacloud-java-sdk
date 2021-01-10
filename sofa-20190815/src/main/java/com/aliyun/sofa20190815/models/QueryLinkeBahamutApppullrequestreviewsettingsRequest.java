// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutApppullrequestreviewsettingsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutApppullrequestreviewsettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutApppullrequestreviewsettingsRequest self = new QueryLinkeBahamutApppullrequestreviewsettingsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
