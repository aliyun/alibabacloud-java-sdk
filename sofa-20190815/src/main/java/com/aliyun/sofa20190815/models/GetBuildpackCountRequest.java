// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetBuildpackCountRequest extends TeaModel {
    @NameInMap("BuildpackId")
    public String buildpackId;

    public static GetBuildpackCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBuildpackCountRequest self = new GetBuildpackCountRequest();
        return TeaModel.build(map, self);
    }

    public GetBuildpackCountRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

}
