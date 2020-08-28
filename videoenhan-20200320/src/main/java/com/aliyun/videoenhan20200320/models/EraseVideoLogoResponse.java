// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public EraseVideoLogoResponseData data;

    public static EraseVideoLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoResponse self = new EraseVideoLogoResponse();
        return TeaModel.build(map, self);
    }

    public static class EraseVideoLogoResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static EraseVideoLogoResponseData build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoResponseData self = new EraseVideoLogoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
