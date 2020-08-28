// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("IsGif")
    @Validation(required = true)
    public Boolean isGif;

    public static GenerateVideoCoverRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoCoverRequest self = new GenerateVideoCoverRequest();
        return TeaModel.build(map, self);
    }

}
