// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectObjectResponseData data;

    public static DetectObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectObjectResponse self = new DetectObjectResponse();
        return TeaModel.build(map, self);
    }

    public static class DetectObjectResponseDataElements extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Integer> boxes;

        public static DetectObjectResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectObjectResponseDataElements self = new DetectObjectResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class DetectObjectResponseData extends TeaModel {
        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectObjectResponseDataElements> elements;

        public static DetectObjectResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectObjectResponseData self = new DetectObjectResponseData();
            return TeaModel.build(map, self);
        }

    }

}
