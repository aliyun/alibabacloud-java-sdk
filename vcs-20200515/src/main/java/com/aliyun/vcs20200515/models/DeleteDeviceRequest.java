// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDeviceRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    public static DeleteDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceRequest self = new DeleteDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public DeleteDeviceRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

}
