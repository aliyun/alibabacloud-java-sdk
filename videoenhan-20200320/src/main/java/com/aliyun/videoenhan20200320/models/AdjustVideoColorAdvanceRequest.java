// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("VideoBitrate")
    public String videoBitrate;

    @NameInMap("VideoCodec")
    public String videoCodec;

    @NameInMap("VideoFormat")
    public String videoFormat;

    @NameInMap("Mode")
    @Validation(required = true)
    public String mode;

    public static AdjustVideoColorAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorAdvanceRequest self = new AdjustVideoColorAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
