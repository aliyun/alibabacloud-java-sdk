// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAppupdatepullrequestsettingsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("MustPreview")
    public Boolean mustPreview;

    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateLinkeBahamutAppupdatepullrequestsettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAppupdatepullrequestsettingsRequest self = new UpdateLinkeBahamutAppupdatepullrequestsettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsRequest setMustPreview(Boolean mustPreview) {
        this.mustPreview = mustPreview;
        return this;
    }
    public Boolean getMustPreview() {
        return this.mustPreview;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
