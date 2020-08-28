// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("VideoBitrate")
    public String videoBitrate;

    @NameInMap("VideoCodec")
    public String videoCodec;

    @NameInMap("VideoFormat")
    public String videoFormat;

    @NameInMap("Mode")
    @Validation(required = true)
    public String mode;

    public static AdjustVideoColorRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorRequest self = new AdjustVideoColorRequest();
        return TeaModel.build(map, self);
    }

}
