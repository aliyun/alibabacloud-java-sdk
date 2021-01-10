// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetlterationunitRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("IterationId")
    public String iterationId;

    public static GetLinkeBahamutOpengetlterationunitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetlterationunitRequest self = new GetLinkeBahamutOpengetlterationunitRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetlterationunitRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutOpengetlterationunitRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

}
