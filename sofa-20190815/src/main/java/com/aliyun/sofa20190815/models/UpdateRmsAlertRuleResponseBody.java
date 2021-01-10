// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsAlertRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public UpdateRmsAlertRuleResponseBodyResponse response;

    public static UpdateRmsAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsAlertRuleResponseBody self = new UpdateRmsAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRmsAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRmsAlertRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateRmsAlertRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateRmsAlertRuleResponseBody setResponse(UpdateRmsAlertRuleResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public UpdateRmsAlertRuleResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class UpdateRmsAlertRuleResponseBodyResponseEntity extends TeaModel {
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

        public static UpdateRmsAlertRuleResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            UpdateRmsAlertRuleResponseBodyResponseEntity self = new UpdateRmsAlertRuleResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public UpdateRmsAlertRuleResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public UpdateRmsAlertRuleResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public UpdateRmsAlertRuleResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public UpdateRmsAlertRuleResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateRmsAlertRuleResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public UpdateRmsAlertRuleResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UpdateRmsAlertRuleResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public UpdateRmsAlertRuleResponseBodyResponseEntity entity;

        public static UpdateRmsAlertRuleResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            UpdateRmsAlertRuleResponseBodyResponse self = new UpdateRmsAlertRuleResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public UpdateRmsAlertRuleResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public UpdateRmsAlertRuleResponseBodyResponse setEntity(UpdateRmsAlertRuleResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public UpdateRmsAlertRuleResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
