// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetResourcesResponseBodyData data;

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

    public static GetResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourcesResponseBody self = new GetResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourcesResponseBody setData(GetResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourcesResponseBodyData getData() {
        return this.data;
    }

    public GetResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourcesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2354</p>
         */
        @NameInMap("total")
        public Float total;

        /**
         * <strong>example:</strong>
         * <p>Kbytes</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("usage")
        public Float usage;

        public static GetResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourcesResponseBodyData self = new GetResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourcesResponseBodyData setTotal(Float total) {
            this.total = total;
            return this;
        }
        public Float getTotal() {
            return this.total;
        }

        public GetResourcesResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public GetResourcesResponseBodyData setUsage(Float usage) {
            this.usage = usage;
            return this;
        }
        public Float getUsage() {
            return this.usage;
        }

    }

}
