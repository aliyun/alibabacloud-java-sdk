// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCWorkspacegroupTopologyRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Region")
    public String region;

    public static GetLDCWorkspacegroupTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLDCWorkspacegroupTopologyRequest self = new GetLDCWorkspacegroupTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetLDCWorkspacegroupTopologyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLDCWorkspacegroupTopologyRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
