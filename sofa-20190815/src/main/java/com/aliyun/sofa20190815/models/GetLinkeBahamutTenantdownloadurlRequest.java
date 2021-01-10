// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTenantdownloadurlRequest extends TeaModel {
    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("FullUrl")
    public String fullUrl;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static GetLinkeBahamutTenantdownloadurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTenantdownloadurlRequest self = new GetLinkeBahamutTenantdownloadurlRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTenantdownloadurlRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetLinkeBahamutTenantdownloadurlRequest setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
        return this;
    }
    public String getFullUrl() {
        return this.fullUrl;
    }

    public GetLinkeBahamutTenantdownloadurlRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
