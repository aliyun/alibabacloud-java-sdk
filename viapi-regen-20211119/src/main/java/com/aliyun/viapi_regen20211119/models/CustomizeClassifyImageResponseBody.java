// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CustomizeClassifyImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public CustomizeClassifyImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CustomizeClassifyImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomizeClassifyImageResponseBody self = new CustomizeClassifyImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomizeClassifyImageResponseBody setData(CustomizeClassifyImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CustomizeClassifyImageResponseBodyData getData() {
        return this.data;
    }

    public CustomizeClassifyImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CustomizeClassifyImageResponseBodyData extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Score")
        public Float score;

        public static CustomizeClassifyImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CustomizeClassifyImageResponseBodyData self = new CustomizeClassifyImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CustomizeClassifyImageResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CustomizeClassifyImageResponseBodyData setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

}
