// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddRmsAlertruleResponseBody extends TeaModel {
    @NameInMap("Response")
    public AddRmsAlertruleResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddRmsAlertruleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRmsAlertruleResponseBody self = new AddRmsAlertruleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRmsAlertruleResponseBody setResponse(AddRmsAlertruleResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public AddRmsAlertruleResponseBodyResponse getResponse() {
        return this.response;
    }

    public AddRmsAlertruleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRmsAlertruleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddRmsAlertruleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddRmsAlertruleResponseBodyResponseEntity extends TeaModel {
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

        public static AddRmsAlertruleResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            AddRmsAlertruleResponseBodyResponseEntity self = new AddRmsAlertruleResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public AddRmsAlertruleResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public AddRmsAlertruleResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public AddRmsAlertruleResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AddRmsAlertruleResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public AddRmsAlertruleResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddRmsAlertruleResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class AddRmsAlertruleResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public AddRmsAlertruleResponseBodyResponseEntity entity;

        public static AddRmsAlertruleResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            AddRmsAlertruleResponseBodyResponse self = new AddRmsAlertruleResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public AddRmsAlertruleResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public AddRmsAlertruleResponseBodyResponse setEntity(AddRmsAlertruleResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public AddRmsAlertruleResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
