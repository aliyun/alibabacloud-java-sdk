// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutLogsinsertlogRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static AddLinkeBahamutLogsinsertlogRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutLogsinsertlogRequest self = new AddLinkeBahamutLogsinsertlogRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutLogsinsertlogRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
