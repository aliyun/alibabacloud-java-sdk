// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetCanTrySasResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information.</p>
     */
    @NameInMap("Data")
    public GetCanTrySasResponseBodyData data;

    /**
     * <p>The message. The value is the same as the Code parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6B48613E-86DE-5411-BDBE-429C80B45F3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the current API call is successful. This does not indicate whether subsequent business operations are successful.</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCanTrySasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCanTrySasResponseBody self = new GetCanTrySasResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCanTrySasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCanTrySasResponseBody setData(GetCanTrySasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCanTrySasResponseBodyData getData() {
        return this.data;
    }

    public GetCanTrySasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCanTrySasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCanTrySasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCanTrySasResponseBodyDataBodyData extends TeaModel {
        /**
         * <p>Indicates whether the user is eligible for a free trial. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Eligible.</li>
         * <li><strong>0</strong>: Not eligible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CanTry")
        public Integer canTry;

        /**
         * <p>The list of editions available for trial.</p>
         */
        @NameInMap("CanTryVersions")
        public java.util.List<Integer> canTryVersions;

        /**
         * <p>The trial type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Trial is not allowed.</li>
         * <li><strong>1</strong>: First trial.</li>
         * <li><strong>2</strong>: Second trial.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TryType")
        public Integer tryType;

        public static GetCanTrySasResponseBodyDataBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCanTrySasResponseBodyDataBodyData self = new GetCanTrySasResponseBodyDataBodyData();
            return TeaModel.build(map, self);
        }

        public GetCanTrySasResponseBodyDataBodyData setCanTry(Integer canTry) {
            this.canTry = canTry;
            return this;
        }
        public Integer getCanTry() {
            return this.canTry;
        }

        public GetCanTrySasResponseBodyDataBodyData setCanTryVersions(java.util.List<Integer> canTryVersions) {
            this.canTryVersions = canTryVersions;
            return this;
        }
        public java.util.List<Integer> getCanTryVersions() {
            return this.canTryVersions;
        }

        public GetCanTrySasResponseBodyDataBodyData setTryType(Integer tryType) {
            this.tryType = tryType;
            return this;
        }
        public Integer getTryType() {
            return this.tryType;
        }

    }

    public static class GetCanTrySasResponseBodyDataBody extends TeaModel {
        /**
         * <p>The data.</p>
         */
        @NameInMap("Data")
        public GetCanTrySasResponseBodyDataBodyData data;

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0EBD97B8-65AD-52C8-94D5-A0F81E7D70D0</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static GetCanTrySasResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            GetCanTrySasResponseBodyDataBody self = new GetCanTrySasResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public GetCanTrySasResponseBodyDataBody setData(GetCanTrySasResponseBodyDataBodyData data) {
            this.data = data;
            return this;
        }
        public GetCanTrySasResponseBodyDataBodyData getData() {
            return this.data;
        }

        public GetCanTrySasResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class GetCanTrySasResponseBodyData extends TeaModel {
        /**
         * <p>The message body.</p>
         */
        @NameInMap("Body")
        public GetCanTrySasResponseBodyDataBody body;

        public static GetCanTrySasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCanTrySasResponseBodyData self = new GetCanTrySasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCanTrySasResponseBodyData setBody(GetCanTrySasResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public GetCanTrySasResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
