// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("BX")
    public Double BX;

    @NameInMap("BY")
    public Double BY;

    @NameInMap("BW")
    public Double BW;

    @NameInMap("BH")
    public Double BH;

    public static EraseVideoSubtitlesAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoSubtitlesAdvanceRequest self = new EraseVideoSubtitlesAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
