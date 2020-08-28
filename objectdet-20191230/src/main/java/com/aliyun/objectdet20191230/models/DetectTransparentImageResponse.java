// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectTransparentImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectTransparentImageResponseData data;

    public static DetectTransparentImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectTransparentImageResponse self = new DetectTransparentImageResponse();
        return TeaModel.build(map, self);
    }

    public static class DetectTransparentImageResponseDataElements extends TeaModel {
        @NameInMap("TransparentImage")
        @Validation(required = true)
        public Integer transparentImage;

        public static DetectTransparentImageResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectTransparentImageResponseDataElements self = new DetectTransparentImageResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class DetectTransparentImageResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectTransparentImageResponseDataElements> elements;

        public static DetectTransparentImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectTransparentImageResponseData self = new DetectTransparentImageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
