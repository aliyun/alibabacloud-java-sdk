// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public CreateClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>INVALID_PARAMETER</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B8733786-C045-59F1-8D79-99A52863F62D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponseBody self = new CreateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateClusterResponseBody setData(CreateClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateClusterResponseBodyData getData() {
        return this.data;
    }

    public CreateClusterResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxljob-b21969c2309</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>229317760970086</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static CreateClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterResponseBodyData self = new CreateClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateClusterResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateClusterResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
