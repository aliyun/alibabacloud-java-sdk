// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutIpaytemplateRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    public static InitLinkeBahamutIpaytemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutIpaytemplateRequest self = new InitLinkeBahamutIpaytemplateRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutIpaytemplateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
