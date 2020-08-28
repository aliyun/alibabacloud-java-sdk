// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWhiteBaseImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectWhiteBaseImageResponseData data;

    public static DetectWhiteBaseImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectWhiteBaseImageResponse self = new DetectWhiteBaseImageResponse();
        return TeaModel.build(map, self);
    }

    public static class DetectWhiteBaseImageResponseDataElements extends TeaModel {
        @NameInMap("WhiteBase")
        @Validation(required = true)
        public Integer whiteBase;

        public static DetectWhiteBaseImageResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectWhiteBaseImageResponseDataElements self = new DetectWhiteBaseImageResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class DetectWhiteBaseImageResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectWhiteBaseImageResponseDataElements> elements;

        public static DetectWhiteBaseImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectWhiteBaseImageResponseData self = new DetectWhiteBaseImageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
