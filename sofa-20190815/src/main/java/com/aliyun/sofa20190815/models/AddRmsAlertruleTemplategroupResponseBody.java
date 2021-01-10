// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddRmsAlertruleTemplategroupResponseBody extends TeaModel {
    @NameInMap("Response")
    public AddRmsAlertruleTemplategroupResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddRmsAlertruleTemplategroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRmsAlertruleTemplategroupResponseBody self = new AddRmsAlertruleTemplategroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRmsAlertruleTemplategroupResponseBody setResponse(AddRmsAlertruleTemplategroupResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public AddRmsAlertruleTemplategroupResponseBodyResponse getResponse() {
        return this.response;
    }

    public AddRmsAlertruleTemplategroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRmsAlertruleTemplategroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddRmsAlertruleTemplategroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddRmsAlertruleTemplategroupResponseBodyResponseEntity extends TeaModel {
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

        public static AddRmsAlertruleTemplategroupResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            AddRmsAlertruleTemplategroupResponseBodyResponseEntity self = new AddRmsAlertruleTemplategroupResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public AddRmsAlertruleTemplategroupResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public AddRmsAlertruleTemplategroupResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public AddRmsAlertruleTemplategroupResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AddRmsAlertruleTemplategroupResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public AddRmsAlertruleTemplategroupResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddRmsAlertruleTemplategroupResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class AddRmsAlertruleTemplategroupResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public AddRmsAlertruleTemplategroupResponseBodyResponseEntity entity;

        public static AddRmsAlertruleTemplategroupResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            AddRmsAlertruleTemplategroupResponseBodyResponse self = new AddRmsAlertruleTemplategroupResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public AddRmsAlertruleTemplategroupResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public AddRmsAlertruleTemplategroupResponseBodyResponse setEntity(AddRmsAlertruleTemplategroupResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public AddRmsAlertruleTemplategroupResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
