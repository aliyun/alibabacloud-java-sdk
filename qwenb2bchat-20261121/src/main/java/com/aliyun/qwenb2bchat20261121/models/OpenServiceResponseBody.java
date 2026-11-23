// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261121.models;

import com.aliyun.tea.*;

public class OpenServiceResponseBody extends TeaModel {
    /**
     * <p>网关拒绝或处理失败时返回。成功响应没有此对象；平台在抵达业务网关前产生的错误遵循 OpenAPI 公共错误结构。</p>
     */
    @NameInMap("error")
    public OpenServiceResponseBodyError error;

    /**
     * <p>OPENING 或 ACTIVE 时返回的订单号；其他状态省略，无默认值。</p>
     * 
     * <strong>example:</strong>
     * <p>order-example-001</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>ACTIVE 时返回的 SP 实例 ID；其他状态省略，无默认值。</p>
     * 
     * <strong>example:</strong>
     * <p>sp-example-001</p>
     */
    @NameInMap("spInstanceId")
    public String spInstanceId;

    /**
     * <p>正常响应必填。TEST_OK：接口验证通过，未发起实际开通；OPENING：已取得订单号，开通仍在处理中；ACTIVE：服务已开通，并返回订单号和实例 ID；ORDER_UNKNOWN：本次开通结果暂不能确认，不表示必定失败；REJECTED：本次因可用额度不足明确拒绝且未返回订单。HTTP 200 不等于已开通。</p>
     * 
     * <strong>example:</strong>
     * <p>TEST_OK</p>
     */
    @NameInMap("status")
    public String status;

    public static OpenServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceResponseBody self = new OpenServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenServiceResponseBody setError(OpenServiceResponseBodyError error) {
        this.error = error;
        return this;
    }
    public OpenServiceResponseBodyError getError() {
        return this.error;
    }

    public OpenServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenServiceResponseBody setSpInstanceId(String spInstanceId) {
        this.spInstanceId = spInstanceId;
        return this;
    }
    public String getSpInstanceId() {
        return this.spInstanceId;
    }

    public OpenServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class OpenServiceResponseBodyError extends TeaModel {
        /**
         * <p>错误码列表见接口说明。请求校验、鉴权、授权、配额及开通处理错误都使用此位置。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_REQUEST</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>对应错误的可读说明，不应依赖固定文案判断。开通处理错误可能返回 service activation failed。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid request</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>用于排查错误；通常对应 X-Request-Id。客户关联号缺失或非法时可返回服务端诊断号，不是订单号。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open-service-001</p>
         */
        @NameInMap("request_id")
        public String requestId;

        public static OpenServiceResponseBodyError build(java.util.Map<String, ?> map) throws Exception {
            OpenServiceResponseBodyError self = new OpenServiceResponseBodyError();
            return TeaModel.build(map, self);
        }

        public OpenServiceResponseBodyError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public OpenServiceResponseBodyError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public OpenServiceResponseBodyError setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
