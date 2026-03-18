// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class CreateAgentResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateAgentResourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>B67D142D-D54E-184F-A306-22BDC01B2XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAgentResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentResourceResponseBody self = new CreateAgentResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentResourceResponseBody setData(CreateAgentResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgentResourceResponseBodyData getData() {
        return this.data;
    }

    public CreateAgentResourceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateAgentResourceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateAgentResourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAgentResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgentResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgentResourceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ng-5e2ba600fee3****</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <strong>example:</strong>
         * <p>241526000650XXX</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static CreateAgentResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentResourceResponseBodyData self = new CreateAgentResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgentResourceResponseBodyData setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public CreateAgentResourceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
