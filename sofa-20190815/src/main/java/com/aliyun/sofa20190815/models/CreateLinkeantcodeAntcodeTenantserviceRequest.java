// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeTenantserviceRequest extends TeaModel {
    @NameInMap("CreateDTOJsonStr")
    public String createDTOJsonStr;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeTenantserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeTenantserviceRequest self = new CreateLinkeantcodeAntcodeTenantserviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeTenantserviceRequest setCreateDTOJsonStr(String createDTOJsonStr) {
        this.createDTOJsonStr = createDTOJsonStr;
        return this;
    }
    public String getCreateDTOJsonStr() {
        return this.createDTOJsonStr;
    }

    public CreateLinkeantcodeAntcodeTenantserviceRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
