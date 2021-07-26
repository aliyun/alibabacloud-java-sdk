// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetImageRequest extends TeaModel {
    // 是否显示非必要信息：Labels
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageRequest self = new GetImageRequest();
        return TeaModel.build(map, self);
    }

    public GetImageRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
