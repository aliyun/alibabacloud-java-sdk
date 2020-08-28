// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Boxes")
    public java.util.List<EraseVideoLogoAdvanceRequestBoxes> boxes;

    public static EraseVideoLogoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoAdvanceRequest self = new EraseVideoLogoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public static class EraseVideoLogoAdvanceRequestBoxes extends TeaModel {
        @NameInMap("H")
        public Double h;

        @NameInMap("W")
        public Double w;

        @NameInMap("X")
        public Double x;

        @NameInMap("Y")
        public Double y;

        public static EraseVideoLogoAdvanceRequestBoxes build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoAdvanceRequestBoxes self = new EraseVideoLogoAdvanceRequestBoxes();
            return TeaModel.build(map, self);
        }

    }

}
