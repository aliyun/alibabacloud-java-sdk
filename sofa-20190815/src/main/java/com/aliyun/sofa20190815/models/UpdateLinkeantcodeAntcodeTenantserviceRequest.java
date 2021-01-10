// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantserviceRequest extends TeaModel {
    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("UpdateDTOJsonStr")
    public String updateDTOJsonStr;

    public static UpdateLinkeantcodeAntcodeTenantserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantserviceRequest self = new UpdateLinkeantcodeAntcodeTenantserviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantserviceRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeTenantserviceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateLinkeantcodeAntcodeTenantserviceRequest setUpdateDTOJsonStr(String updateDTOJsonStr) {
        this.updateDTOJsonStr = updateDTOJsonStr;
        return this;
    }
    public String getUpdateDTOJsonStr() {
        return this.updateDTOJsonStr;
    }

}
