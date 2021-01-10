// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeTenantusedserviceRequest extends TeaModel {
    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ServiceId")
    public String serviceId;

    public static DeleteLinkeantcodeAntcodeTenantusedserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeTenantusedserviceRequest self = new DeleteLinkeantcodeAntcodeTenantusedserviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeTenantusedserviceRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public DeleteLinkeantcodeAntcodeTenantusedserviceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
