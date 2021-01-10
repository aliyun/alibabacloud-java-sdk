// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExistCASApplicationRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    public static ExistCASApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistCASApplicationRequest self = new ExistCASApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ExistCASApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
