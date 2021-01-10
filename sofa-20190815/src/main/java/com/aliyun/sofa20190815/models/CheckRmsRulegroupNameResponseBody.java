// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckRmsRulegroupNameResponseBody extends TeaModel {
    @NameInMap("Response")
    public CheckRmsRulegroupNameResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CheckRmsRulegroupNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckRmsRulegroupNameResponseBody self = new CheckRmsRulegroupNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckRmsRulegroupNameResponseBody setResponse(CheckRmsRulegroupNameResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public CheckRmsRulegroupNameResponseBodyResponse getResponse() {
        return this.response;
    }

    public CheckRmsRulegroupNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckRmsRulegroupNameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckRmsRulegroupNameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CheckRmsRulegroupNameResponseBodyResponseEntity extends TeaModel {
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

        public static CheckRmsRulegroupNameResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            CheckRmsRulegroupNameResponseBodyResponseEntity self = new CheckRmsRulegroupNameResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public CheckRmsRulegroupNameResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public CheckRmsRulegroupNameResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public CheckRmsRulegroupNameResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CheckRmsRulegroupNameResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public CheckRmsRulegroupNameResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CheckRmsRulegroupNameResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class CheckRmsRulegroupNameResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public CheckRmsRulegroupNameResponseBodyResponseEntity entity;

        public static CheckRmsRulegroupNameResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            CheckRmsRulegroupNameResponseBodyResponse self = new CheckRmsRulegroupNameResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public CheckRmsRulegroupNameResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public CheckRmsRulegroupNameResponseBodyResponse setEntity(CheckRmsRulegroupNameResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public CheckRmsRulegroupNameResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
