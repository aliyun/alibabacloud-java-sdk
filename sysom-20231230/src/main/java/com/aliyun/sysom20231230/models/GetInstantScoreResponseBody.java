// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetInstantScoreResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate authorization failure. Check the <code>message</code> field for detailed error information when authorization fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("data")
    public GetInstantScoreResponseBodyData data;

    /**
     * <p>Error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Query no data</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetInstantScoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstantScoreResponseBody self = new GetInstantScoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstantScoreResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstantScoreResponseBody setData(GetInstantScoreResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstantScoreResponseBodyData getData() {
        return this.data;
    }

    public GetInstantScoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstantScoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstantScoreResponseBodyData extends TeaModel {
        /**
         * <p>Error score.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("error")
        public Float error;

        /**
         * <p>Latency score.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("latency")
        public Float latency;

        /**
         * <p>Load score.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("load")
        public Float load;

        /**
         * <p>Saturation score.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("saturation")
        public Float saturation;

        /**
         * <p>Total score.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total")
        public Float total;

        public static GetInstantScoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstantScoreResponseBodyData self = new GetInstantScoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstantScoreResponseBodyData setError(Float error) {
            this.error = error;
            return this;
        }
        public Float getError() {
            return this.error;
        }

        public GetInstantScoreResponseBodyData setLatency(Float latency) {
            this.latency = latency;
            return this;
        }
        public Float getLatency() {
            return this.latency;
        }

        public GetInstantScoreResponseBodyData setLoad(Float load) {
            this.load = load;
            return this;
        }
        public Float getLoad() {
            return this.load;
        }

        public GetInstantScoreResponseBodyData setSaturation(Float saturation) {
            this.saturation = saturation;
            return this;
        }
        public Float getSaturation() {
            return this.saturation;
        }

        public GetInstantScoreResponseBodyData setTotal(Float total) {
            this.total = total;
            return this;
        }
        public Float getTotal() {
            return this.total;
        }

    }

}
