// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTakeoutOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeTakeoutOrderResponseData data;

    public static RecognizeTakeoutOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTakeoutOrderResponse self = new RecognizeTakeoutOrderResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeTakeoutOrderResponseDataElements extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Integer> boxes;

        public static RecognizeTakeoutOrderResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTakeoutOrderResponseDataElements self = new RecognizeTakeoutOrderResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeTakeoutOrderResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeTakeoutOrderResponseDataElements> elements;

        public static RecognizeTakeoutOrderResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTakeoutOrderResponseData self = new RecognizeTakeoutOrderResponseData();
            return TeaModel.build(map, self);
        }

    }

}
