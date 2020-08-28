// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("Boxes")
    public java.util.List<EraseVideoLogoRequestBoxes> boxes;

    public static EraseVideoLogoRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoRequest self = new EraseVideoLogoRequest();
        return TeaModel.build(map, self);
    }

    public static class EraseVideoLogoRequestBoxes extends TeaModel {
        @NameInMap("H")
        public Double h;

        @NameInMap("W")
        public Double w;

        @NameInMap("X")
        public Double x;

        @NameInMap("Y")
        public Double y;

        public static EraseVideoLogoRequestBoxes build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoRequestBoxes self = new EraseVideoLogoRequestBoxes();
            return TeaModel.build(map, self);
        }

    }

}
