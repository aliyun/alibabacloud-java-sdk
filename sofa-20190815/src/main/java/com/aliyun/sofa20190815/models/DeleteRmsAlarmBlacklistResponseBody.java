// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsAlarmBlacklistResponseBody extends TeaModel {
    @NameInMap("Response")
    public DeleteRmsAlarmBlacklistResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteRmsAlarmBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsAlarmBlacklistResponseBody self = new DeleteRmsAlarmBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRmsAlarmBlacklistResponseBody setResponse(DeleteRmsAlarmBlacklistResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public DeleteRmsAlarmBlacklistResponseBodyResponse getResponse() {
        return this.response;
    }

    public DeleteRmsAlarmBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRmsAlarmBlacklistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteRmsAlarmBlacklistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DeleteRmsAlarmBlacklistResponseBodyResponseEntity extends TeaModel {
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

        public static DeleteRmsAlarmBlacklistResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsAlarmBlacklistResponseBodyResponseEntity self = new DeleteRmsAlarmBlacklistResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public DeleteRmsAlarmBlacklistResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public DeleteRmsAlarmBlacklistResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public DeleteRmsAlarmBlacklistResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteRmsAlarmBlacklistResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public DeleteRmsAlarmBlacklistResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteRmsAlarmBlacklistResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class DeleteRmsAlarmBlacklistResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public DeleteRmsAlarmBlacklistResponseBodyResponseEntity entity;

        public static DeleteRmsAlarmBlacklistResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsAlarmBlacklistResponseBodyResponse self = new DeleteRmsAlarmBlacklistResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public DeleteRmsAlarmBlacklistResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DeleteRmsAlarmBlacklistResponseBodyResponse setEntity(DeleteRmsAlarmBlacklistResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public DeleteRmsAlarmBlacklistResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
