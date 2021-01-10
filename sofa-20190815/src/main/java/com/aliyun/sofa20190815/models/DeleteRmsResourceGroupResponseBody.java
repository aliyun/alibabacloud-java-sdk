// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsResourceGroupResponseBody extends TeaModel {
    @NameInMap("Response")
    public DeleteRmsResourceGroupResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteRmsResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsResourceGroupResponseBody self = new DeleteRmsResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRmsResourceGroupResponseBody setResponse(DeleteRmsResourceGroupResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public DeleteRmsResourceGroupResponseBodyResponse getResponse() {
        return this.response;
    }

    public DeleteRmsResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRmsResourceGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteRmsResourceGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DeleteRmsResourceGroupResponseBodyResponseEntity extends TeaModel {
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

        public static DeleteRmsResourceGroupResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsResourceGroupResponseBodyResponseEntity self = new DeleteRmsResourceGroupResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public DeleteRmsResourceGroupResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public DeleteRmsResourceGroupResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public DeleteRmsResourceGroupResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteRmsResourceGroupResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public DeleteRmsResourceGroupResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteRmsResourceGroupResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class DeleteRmsResourceGroupResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public DeleteRmsResourceGroupResponseBodyResponseEntity entity;

        public static DeleteRmsResourceGroupResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsResourceGroupResponseBodyResponse self = new DeleteRmsResourceGroupResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public DeleteRmsResourceGroupResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DeleteRmsResourceGroupResponseBodyResponse setEntity(DeleteRmsResourceGroupResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public DeleteRmsResourceGroupResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
