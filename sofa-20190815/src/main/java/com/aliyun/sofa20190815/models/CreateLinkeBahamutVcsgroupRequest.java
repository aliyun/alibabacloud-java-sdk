// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutVcsgroupRequest extends TeaModel {
    @NameInMap("GroupInfoJsonStr")
    public String groupInfoJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static CreateLinkeBahamutVcsgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutVcsgroupRequest self = new CreateLinkeBahamutVcsgroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutVcsgroupRequest setGroupInfoJsonStr(String groupInfoJsonStr) {
        this.groupInfoJsonStr = groupInfoJsonStr;
        return this;
    }
    public String getGroupInfoJsonStr() {
        return this.groupInfoJsonStr;
    }

    public CreateLinkeBahamutVcsgroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
