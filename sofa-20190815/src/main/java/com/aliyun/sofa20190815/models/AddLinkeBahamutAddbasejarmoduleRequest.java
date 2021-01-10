// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAddbasejarmoduleRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("JarJsonStr")
    public String jarJsonStr;

    public static AddLinkeBahamutAddbasejarmoduleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAddbasejarmoduleRequest self = new AddLinkeBahamutAddbasejarmoduleRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAddbasejarmoduleRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public AddLinkeBahamutAddbasejarmoduleRequest setJarJsonStr(String jarJsonStr) {
        this.jarJsonStr = jarJsonStr;
        return this;
    }
    public String getJarJsonStr() {
        return this.jarJsonStr;
    }

}
