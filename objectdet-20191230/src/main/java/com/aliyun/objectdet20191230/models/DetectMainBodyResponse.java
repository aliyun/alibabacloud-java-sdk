// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectMainBodyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectMainBodyResponseData data;

    public static DetectMainBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectMainBodyResponse self = new DetectMainBodyResponse();
        return TeaModel.build(map, self);
    }

    public static class DetectMainBodyResponseDataLocation extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Integer x;

        @NameInMap("Y")
        @Validation(required = true)
        public Integer y;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        public static DetectMainBodyResponseDataLocation build(java.util.Map<String, ?> map) throws Exception {
            DetectMainBodyResponseDataLocation self = new DetectMainBodyResponseDataLocation();
            return TeaModel.build(map, self);
        }

    }

    public static class DetectMainBodyResponseData extends TeaModel {
        @NameInMap("Location")
        @Validation(required = true)
        public DetectMainBodyResponseDataLocation location;

        public static DetectMainBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectMainBodyResponseData self = new DetectMainBodyResponseData();
            return TeaModel.build(map, self);
        }

    }

}
