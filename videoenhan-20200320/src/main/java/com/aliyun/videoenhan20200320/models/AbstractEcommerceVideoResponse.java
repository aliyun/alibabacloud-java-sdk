// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractEcommerceVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AbstractEcommerceVideoResponseData data;

    public static AbstractEcommerceVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        AbstractEcommerceVideoResponse self = new AbstractEcommerceVideoResponse();
        return TeaModel.build(map, self);
    }

    public static class AbstractEcommerceVideoResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        @NameInMap("VideoCoverUrl")
        @Validation(required = true)
        public String videoCoverUrl;

        public static AbstractEcommerceVideoResponseData build(java.util.Map<String, ?> map) throws Exception {
            AbstractEcommerceVideoResponseData self = new AbstractEcommerceVideoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
