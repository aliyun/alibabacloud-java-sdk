// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetRangeScoreResponseBody extends TeaModel {
    /**
     * <p>Status code  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization succeeded.  </li>
     * <li>Other status codes indicate authorization failed. When authorization fails, view the <code>message</code> field to obtain detailed error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<GetRangeScoreResponseBodyData> data;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.  </li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>35F91AAB-5FDF-5A22-B211-C7C6B00817D0</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>Total data volume.</p>
     * 
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
         * <p>Time point</p>
         * 
         * <strong>example:</strong>
         * <p>1725797727754</p>
         */
        @NameInMap("time")
        public Long time;

        /**
         * <p>Metric type</p>
         * 
         * <strong>example:</strong>
         * <p>saturation</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Score</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("value")
        public Long value;

        public static GetRangeScoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRangeScoreResponseBodyData self = new GetRangeScoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRangeScoreResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetRangeScoreResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRangeScoreResponseBodyData setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
