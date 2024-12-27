// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetProblemPercentageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetProblemPercentageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>result: code=1 msg=(Request failed, status_code != 200)</p>
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
     * <p>19</p>
     */
    @NameInMap("total")
    public Long total;

    public static GetProblemPercentageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProblemPercentageResponseBody self = new GetProblemPercentageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProblemPercentageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProblemPercentageResponseBody setData(java.util.List<GetProblemPercentageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProblemPercentageResponseBodyData> getData() {
        return this.data;
    }

    public GetProblemPercentageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProblemPercentageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProblemPercentageResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetProblemPercentageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>saturation</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("value")
        public Long value;

        public static GetProblemPercentageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPercentageResponseBodyData self = new GetProblemPercentageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProblemPercentageResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetProblemPercentageResponseBodyData setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
