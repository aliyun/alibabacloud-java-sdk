// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.osssddp20240222.models;

import com.aliyun.tea.*;

public class UpgradeSddpVersionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OssVersion")
    public Integer ossVersion;

    public static UpgradeSddpVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSddpVersionRequest self = new UpgradeSddpVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeSddpVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeSddpVersionRequest setOssVersion(Integer ossVersion) {
        this.ossVersion = ossVersion;
        return this;
    }
    public Integer getOssVersion() {
        return this.ossVersion;
    }

}
