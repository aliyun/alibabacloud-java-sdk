// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitLinkeBahamutAppsipaytemplateRequest extends TeaModel {
    @NameInMap("AppNames")
    public String appNames;

    public static InitLinkeBahamutAppsipaytemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        InitLinkeBahamutAppsipaytemplateRequest self = new InitLinkeBahamutAppsipaytemplateRequest();
        return TeaModel.build(map, self);
    }

    public InitLinkeBahamutAppsipaytemplateRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

}
