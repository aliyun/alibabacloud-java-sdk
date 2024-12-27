// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHostCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetHostCountResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A910E9-A739-525E-855D-A32C257F1826</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("total")
    public Long total;

    public static GetHostCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHostCountResponseBody self = new GetHostCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHostCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHostCountResponseBody setData(java.util.List<GetHostCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetHostCountResponseBodyData> getData() {
        return this.data;
    }

    public GetHostCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHostCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHostCountResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetHostCountResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1725797727754</p>
         */
        @NameInMap("time")
        public Long time;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("value")
        public Integer value;

        public static GetHostCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHostCountResponseBodyData self = new GetHostCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHostCountResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetHostCountResponseBodyData setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

}
