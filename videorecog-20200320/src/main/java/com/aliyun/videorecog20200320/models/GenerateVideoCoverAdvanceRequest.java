// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("IsGif")
    @Validation(required = true)
    public Boolean isGif;

    public static GenerateVideoCoverAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoCoverAdvanceRequest self = new GenerateVideoCoverAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
