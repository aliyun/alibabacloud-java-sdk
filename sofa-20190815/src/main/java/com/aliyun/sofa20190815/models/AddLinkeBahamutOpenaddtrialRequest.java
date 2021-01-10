// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutOpenaddtrialRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Trial")
    public String trial;

    public static AddLinkeBahamutOpenaddtrialRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutOpenaddtrialRequest self = new AddLinkeBahamutOpenaddtrialRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutOpenaddtrialRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddLinkeBahamutOpenaddtrialRequest setTrial(String trial) {
        this.trial = trial;
        return this;
    }
    public String getTrial() {
        return this.trial;
    }

}
