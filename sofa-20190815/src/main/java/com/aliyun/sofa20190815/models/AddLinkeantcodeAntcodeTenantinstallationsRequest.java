// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeTenantinstallationsRequest extends TeaModel {
    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ServiceId")
    public String serviceId;

    public static AddLinkeantcodeAntcodeTenantinstallationsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeTenantinstallationsRequest self = new AddLinkeantcodeAntcodeTenantinstallationsRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeTenantinstallationsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeTenantinstallationsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
