// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddRmsAlarmBlacklistResponseBody extends TeaModel {
    @NameInMap("Response")
    public AddRmsAlarmBlacklistResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddRmsAlarmBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRmsAlarmBlacklistResponseBody self = new AddRmsAlarmBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRmsAlarmBlacklistResponseBody setResponse(AddRmsAlarmBlacklistResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public AddRmsAlarmBlacklistResponseBodyResponse getResponse() {
        return this.response;
    }

    public AddRmsAlarmBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRmsAlarmBlacklistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddRmsAlarmBlacklistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddRmsAlarmBlacklistResponseBodyResponseEntity extends TeaModel {
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

        public static AddRmsAlarmBlacklistResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            AddRmsAlarmBlacklistResponseBodyResponseEntity self = new AddRmsAlarmBlacklistResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public AddRmsAlarmBlacklistResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public AddRmsAlarmBlacklistResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public AddRmsAlarmBlacklistResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AddRmsAlarmBlacklistResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public AddRmsAlarmBlacklistResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddRmsAlarmBlacklistResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class AddRmsAlarmBlacklistResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public AddRmsAlarmBlacklistResponseBodyResponseEntity entity;

        public static AddRmsAlarmBlacklistResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            AddRmsAlarmBlacklistResponseBodyResponse self = new AddRmsAlarmBlacklistResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public AddRmsAlarmBlacklistResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public AddRmsAlarmBlacklistResponseBodyResponse setEntity(AddRmsAlarmBlacklistResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public AddRmsAlarmBlacklistResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
