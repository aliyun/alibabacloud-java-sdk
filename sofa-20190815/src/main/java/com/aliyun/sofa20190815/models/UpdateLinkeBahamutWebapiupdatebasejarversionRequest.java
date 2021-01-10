// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutWebapiupdatebasejarversionRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("Stringversion")
    public String stringversion;

    public static UpdateLinkeBahamutWebapiupdatebasejarversionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutWebapiupdatebasejarversionRequest self = new UpdateLinkeBahamutWebapiupdatebasejarversionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutWebapiupdatebasejarversionRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public UpdateLinkeBahamutWebapiupdatebasejarversionRequest setStringversion(String stringversion) {
        this.stringversion = stringversion;
        return this;
    }
    public String getStringversion() {
        return this.stringversion;
    }

}
