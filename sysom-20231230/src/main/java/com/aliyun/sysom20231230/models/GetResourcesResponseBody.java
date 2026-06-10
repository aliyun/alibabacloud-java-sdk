// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetResourcesResponseBody extends TeaModel {
    /**
     * <p>Status code  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization succeeded.  </li>
     * <li>Other status codes indicate authorization failed. When authorization fails, view the <code>message</code> field to obtain detailed error message.</li>
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
    public GetResourcesResponseBodyData data;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.  </li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>result: code=1 msg=(Request failed, status_code != 200)</p>
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
         * <p>Total amount of resources</p>
         * 
         * <strong>example:</strong>
         * <p>2354</p>
         */
        @NameInMap("total")
        public Float total;

        /**
         * <p>Unit</p>
         * 
         * <strong>example:</strong>
         * <p>Kbytes</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>Resource usage</p>
         * 
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
