// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminpipelineRequest extends TeaModel {
    @NameInMap("Dest")
    public String dest;

    @NameInMap("Src")
    public String src;

    public static UpdateLinkeBahamutAdminpipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminpipelineRequest self = new UpdateLinkeBahamutAdminpipelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminpipelineRequest setDest(String dest) {
        this.dest = dest;
        return this;
    }
    public String getDest() {
        return this.dest;
    }

    public UpdateLinkeBahamutAdminpipelineRequest setSrc(String src) {
        this.src = src;
        return this;
    }
    public String getSrc() {
        return this.src;
    }

}
