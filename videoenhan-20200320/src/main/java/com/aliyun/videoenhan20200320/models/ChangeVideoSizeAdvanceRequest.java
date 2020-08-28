// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ChangeVideoSizeAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

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

    public static ChangeVideoSizeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeVideoSizeAdvanceRequest self = new ChangeVideoSizeAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
