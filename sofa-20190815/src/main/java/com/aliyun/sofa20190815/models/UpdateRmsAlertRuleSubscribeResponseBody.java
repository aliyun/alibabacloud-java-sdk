// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsAlertRuleSubscribeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public UpdateRmsAlertRuleSubscribeResponseBodyResponse response;

    public static UpdateRmsAlertRuleSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsAlertRuleSubscribeResponseBody self = new UpdateRmsAlertRuleSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRmsAlertRuleSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRmsAlertRuleSubscribeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateRmsAlertRuleSubscribeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateRmsAlertRuleSubscribeResponseBody setResponse(UpdateRmsAlertRuleSubscribeResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public UpdateRmsAlertRuleSubscribeResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity extends TeaModel {
        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrResolution")
        public String errResolution;

        @NameInMap("Message")
        public String message;

        @NameInMap("Module")
        public Boolean module;

        @NameInMap("Success")
        public Boolean success;

        public static UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity self = new UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UpdateRmsAlertRuleSubscribeResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity entity;

        public static UpdateRmsAlertRuleSubscribeResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            UpdateRmsAlertRuleSubscribeResponseBodyResponse self = new UpdateRmsAlertRuleSubscribeResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public UpdateRmsAlertRuleSubscribeResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public UpdateRmsAlertRuleSubscribeResponseBodyResponse setEntity(UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public UpdateRmsAlertRuleSubscribeResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
