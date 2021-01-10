// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppcreateorimporttaskRequest extends TeaModel {
    @NameInMap("CreateRequestJsonStr")
    public String createRequestJsonStr;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static CreateLinkeBahamutAppcreateorimporttaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppcreateorimporttaskRequest self = new CreateLinkeBahamutAppcreateorimporttaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppcreateorimporttaskRequest setCreateRequestJsonStr(String createRequestJsonStr) {
        this.createRequestJsonStr = createRequestJsonStr;
        return this;
    }
    public String getCreateRequestJsonStr() {
        return this.createRequestJsonStr;
    }

    public CreateLinkeBahamutAppcreateorimporttaskRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
