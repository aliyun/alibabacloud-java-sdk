// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CreateIntentionOrderGeneratingPayResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PayUrl")
    public String payUrl;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("OrderIds")
    public java.util.List<Long> orderIds;

    public static CreateIntentionOrderGeneratingPayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentionOrderGeneratingPayResponseBody self = new CreateIntentionOrderGeneratingPayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntentionOrderGeneratingPayResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateIntentionOrderGeneratingPayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIntentionOrderGeneratingPayResponseBody setPayUrl(String payUrl) {
        this.payUrl = payUrl;
        return this;
    }
    public String getPayUrl() {
        return this.payUrl;
    }

    public CreateIntentionOrderGeneratingPayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateIntentionOrderGeneratingPayResponseBody setOrderIds(java.util.List<Long> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<Long> getOrderIds() {
        return this.orderIds;
    }

}
