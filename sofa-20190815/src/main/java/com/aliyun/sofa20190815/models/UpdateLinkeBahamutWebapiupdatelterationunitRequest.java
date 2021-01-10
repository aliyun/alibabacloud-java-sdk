// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutWebapiupdatelterationunitRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Iterationversion")
    public String iterationversion;

    public static UpdateLinkeBahamutWebapiupdatelterationunitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutWebapiupdatelterationunitRequest self = new UpdateLinkeBahamutWebapiupdatelterationunitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutWebapiupdatelterationunitRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeBahamutWebapiupdatelterationunitRequest setIterationversion(String iterationversion) {
        this.iterationversion = iterationversion;
        return this;
    }
    public String getIterationversion() {
        return this.iterationversion;
    }

}
