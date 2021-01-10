// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutAppdatastctenantidRequest extends TeaModel {
    @NameInMap("ModifyStc")
    public String modifyStc;

    @NameInMap("TenantId")
    public String tenantId;

    public static CheckLinkeBahamutAppdatastctenantidRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutAppdatastctenantidRequest self = new CheckLinkeBahamutAppdatastctenantidRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutAppdatastctenantidRequest setModifyStc(String modifyStc) {
        this.modifyStc = modifyStc;
        return this;
    }
    public String getModifyStc() {
        return this.modifyStc;
    }

    public CheckLinkeBahamutAppdatastctenantidRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
