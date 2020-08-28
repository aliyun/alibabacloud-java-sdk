// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("BX")
    public Double BX;

    @NameInMap("BY")
    public Double BY;

    @NameInMap("BW")
    public Double BW;

    @NameInMap("BH")
    public Double BH;

    public static EraseVideoSubtitlesRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoSubtitlesRequest self = new EraseVideoSubtitlesRequest();
        return TeaModel.build(map, self);
    }

}
