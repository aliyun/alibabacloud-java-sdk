// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafStartStepsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeSafStartStepsResponseBodyResultObject> resultObject;

    public static DescribeSafStartStepsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafStartStepsResponseBody self = new DescribeSafStartStepsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSafStartStepsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSafStartStepsResponseBody setResultObject(java.util.List<DescribeSafStartStepsResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSafStartStepsResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSafStartStepsResponseBodyResultObject extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("id")
        public String id;

        @NameInMap("type")
        public String type;

        public static DescribeSafStartStepsResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSafStartStepsResponseBodyResultObject self = new DescribeSafStartStepsResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSafStartStepsResponseBodyResultObject setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeSafStartStepsResponseBodyResultObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeSafStartStepsResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
