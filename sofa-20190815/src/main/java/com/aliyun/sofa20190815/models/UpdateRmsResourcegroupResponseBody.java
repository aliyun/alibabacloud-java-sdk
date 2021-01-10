// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRmsResourcegroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public UpdateRmsResourcegroupResponseBodyResponse response;

    public static UpdateRmsResourcegroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRmsResourcegroupResponseBody self = new UpdateRmsResourcegroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRmsResourcegroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRmsResourcegroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateRmsResourcegroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateRmsResourcegroupResponseBody setResponse(UpdateRmsResourcegroupResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public UpdateRmsResourcegroupResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class UpdateRmsResourcegroupResponseBodyResponseEntity extends TeaModel {
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

        public static UpdateRmsResourcegroupResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            UpdateRmsResourcegroupResponseBodyResponseEntity self = new UpdateRmsResourcegroupResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public UpdateRmsResourcegroupResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public UpdateRmsResourcegroupResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public UpdateRmsResourcegroupResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public UpdateRmsResourcegroupResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateRmsResourcegroupResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public UpdateRmsResourcegroupResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UpdateRmsResourcegroupResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public UpdateRmsResourcegroupResponseBodyResponseEntity entity;

        public static UpdateRmsResourcegroupResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            UpdateRmsResourcegroupResponseBodyResponse self = new UpdateRmsResourcegroupResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public UpdateRmsResourcegroupResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public UpdateRmsResourcegroupResponseBodyResponse setEntity(UpdateRmsResourcegroupResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public UpdateRmsResourcegroupResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
