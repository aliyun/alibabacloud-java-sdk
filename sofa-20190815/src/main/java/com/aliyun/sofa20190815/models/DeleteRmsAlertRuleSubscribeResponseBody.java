// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsAlertRuleSubscribeResponseBody extends TeaModel {
    @NameInMap("Response")
    public DeleteRmsAlertRuleSubscribeResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteRmsAlertRuleSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsAlertRuleSubscribeResponseBody self = new DeleteRmsAlertRuleSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRmsAlertRuleSubscribeResponseBody setResponse(DeleteRmsAlertRuleSubscribeResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public DeleteRmsAlertRuleSubscribeResponseBodyResponse getResponse() {
        return this.response;
    }

    public DeleteRmsAlertRuleSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRmsAlertRuleSubscribeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteRmsAlertRuleSubscribeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity extends TeaModel {
        @NameInMap("Module")
        public Boolean module;

        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("ErrResolution")
        public String errResolution;

        @NameInMap("Message")
        public String message;

        @NameInMap("ErrMsg")
        public String errMsg;

        public static DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity self = new DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class DeleteRmsAlertRuleSubscribeResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity entity;

        public static DeleteRmsAlertRuleSubscribeResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsAlertRuleSubscribeResponseBodyResponse self = new DeleteRmsAlertRuleSubscribeResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public DeleteRmsAlertRuleSubscribeResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DeleteRmsAlertRuleSubscribeResponseBodyResponse setEntity(DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public DeleteRmsAlertRuleSubscribeResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
