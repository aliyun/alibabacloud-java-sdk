// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetRangeScoreResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetRangeScoreResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>35F91AAB-5FDF-5A22-B211-C7C6B00817D0</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Float total;

    public static GetRangeScoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRangeScoreResponseBody self = new GetRangeScoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRangeScoreResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRangeScoreResponseBody setData(java.util.List<GetRangeScoreResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRangeScoreResponseBodyData> getData() {
        return this.data;
    }

    public GetRangeScoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRangeScoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRangeScoreResponseBody setTotal(Float total) {
        this.total = total;
        return this;
    }
    public Float getTotal() {
        return this.total;
    }

    public static class GetRangeScoreResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1725797727754</p>
         */
        @NameInMap("time")
        public Float time;

        /**
         * <strong>example:</strong>
         * <p>saturation</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("value")
        public Float value;

        public static GetRangeScoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRangeScoreResponseBodyData self = new GetRangeScoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRangeScoreResponseBodyData setTime(Float time) {
            this.time = time;
            return this;
        }
        public Float getTime() {
            return this.time;
        }

        public GetRangeScoreResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRangeScoreResponseBodyData setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

}
