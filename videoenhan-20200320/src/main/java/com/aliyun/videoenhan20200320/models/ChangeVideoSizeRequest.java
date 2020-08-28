// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ChangeVideoSizeRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("Width")
    @Validation(required = true)
    public Integer width;

    @NameInMap("Height")
    @Validation(required = true)
    public Integer height;

    @NameInMap("CropType")
    public String cropType;

    @NameInMap("FillType")
    public String fillType;

    @NameInMap("Tightness")
    public Double tightness;

    @NameInMap("R")
    public Integer r;

    @NameInMap("G")
    public Integer g;

    @NameInMap("B")
    public Integer b;

    public static ChangeVideoSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeVideoSizeRequest self = new ChangeVideoSizeRequest();
        return TeaModel.build(map, self);
    }

}
