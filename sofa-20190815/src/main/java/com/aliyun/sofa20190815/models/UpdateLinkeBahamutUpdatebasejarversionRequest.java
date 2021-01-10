// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutUpdatebasejarversionRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("SrcJarJsonStr")
    public String srcJarJsonStr;

    public static UpdateLinkeBahamutUpdatebasejarversionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutUpdatebasejarversionRequest self = new UpdateLinkeBahamutUpdatebasejarversionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutUpdatebasejarversionRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public UpdateLinkeBahamutUpdatebasejarversionRequest setSrcJarJsonStr(String srcJarJsonStr) {
        this.srcJarJsonStr = srcJarJsonStr;
        return this;
    }
    public String getSrcJarJsonStr() {
        return this.srcJarJsonStr;
    }

}
