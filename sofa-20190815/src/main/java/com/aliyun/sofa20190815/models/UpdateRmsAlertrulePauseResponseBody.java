// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsAlertrulePauseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public UpdateRmsAlertrulePauseResponseBodyResponse response;

    public static UpdateRmsAlertrulePauseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsAlertrulePauseResponseBody self = new UpdateRmsAlertrulePauseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRmsAlertrulePauseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRmsAlertrulePauseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateRmsAlertrulePauseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateRmsAlertrulePauseResponseBody setResponse(UpdateRmsAlertrulePauseResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public UpdateRmsAlertrulePauseResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class UpdateRmsAlertrulePauseResponseBodyResponseEntity extends TeaModel {
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

        public static UpdateRmsAlertrulePauseResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            UpdateRmsAlertrulePauseResponseBodyResponseEntity self = new UpdateRmsAlertrulePauseResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public UpdateRmsAlertrulePauseResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public UpdateRmsAlertrulePauseResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public UpdateRmsAlertrulePauseResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public UpdateRmsAlertrulePauseResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateRmsAlertrulePauseResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public UpdateRmsAlertrulePauseResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UpdateRmsAlertrulePauseResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public UpdateRmsAlertrulePauseResponseBodyResponseEntity entity;

        public static UpdateRmsAlertrulePauseResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            UpdateRmsAlertrulePauseResponseBodyResponse self = new UpdateRmsAlertrulePauseResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public UpdateRmsAlertrulePauseResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public UpdateRmsAlertrulePauseResponseBodyResponse setEntity(UpdateRmsAlertrulePauseResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public UpdateRmsAlertrulePauseResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
