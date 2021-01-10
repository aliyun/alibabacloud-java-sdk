// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmergerequestRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("MergeRequestId")
    public String mergeRequestId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsmergerequestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmergerequestRequest self = new GetLinkeBahamutVcsmergerequestRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmergerequestRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutVcsmergerequestRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public GetLinkeBahamutVcsmergerequestRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
