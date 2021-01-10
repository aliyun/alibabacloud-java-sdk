// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsAlertruleResponseBody extends TeaModel {
    @NameInMap("Response")
    public DeleteRmsAlertruleResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteRmsAlertruleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsAlertruleResponseBody self = new DeleteRmsAlertruleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRmsAlertruleResponseBody setResponse(DeleteRmsAlertruleResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public DeleteRmsAlertruleResponseBodyResponse getResponse() {
        return this.response;
    }

    public DeleteRmsAlertruleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRmsAlertruleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteRmsAlertruleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DeleteRmsAlertruleResponseBodyResponseEntity extends TeaModel {
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

        public static DeleteRmsAlertruleResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsAlertruleResponseBodyResponseEntity self = new DeleteRmsAlertruleResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public DeleteRmsAlertruleResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public DeleteRmsAlertruleResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public DeleteRmsAlertruleResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteRmsAlertruleResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public DeleteRmsAlertruleResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteRmsAlertruleResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class DeleteRmsAlertruleResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public DeleteRmsAlertruleResponseBodyResponseEntity entity;

        public static DeleteRmsAlertruleResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsAlertruleResponseBodyResponse self = new DeleteRmsAlertruleResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public DeleteRmsAlertruleResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DeleteRmsAlertruleResponseBodyResponse setEntity(DeleteRmsAlertruleResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public DeleteRmsAlertruleResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
