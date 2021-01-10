// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddRmsResourcegroupResponseBody extends TeaModel {
    @NameInMap("Response")
    public AddRmsResourcegroupResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddRmsResourcegroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRmsResourcegroupResponseBody self = new AddRmsResourcegroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRmsResourcegroupResponseBody setResponse(AddRmsResourcegroupResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public AddRmsResourcegroupResponseBodyResponse getResponse() {
        return this.response;
    }

    public AddRmsResourcegroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRmsResourcegroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddRmsResourcegroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddRmsResourcegroupResponseBodyResponseEntity extends TeaModel {
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

        public static AddRmsResourcegroupResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            AddRmsResourcegroupResponseBodyResponseEntity self = new AddRmsResourcegroupResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public AddRmsResourcegroupResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public AddRmsResourcegroupResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public AddRmsResourcegroupResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AddRmsResourcegroupResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public AddRmsResourcegroupResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddRmsResourcegroupResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class AddRmsResourcegroupResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public AddRmsResourcegroupResponseBodyResponseEntity entity;

        public static AddRmsResourcegroupResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            AddRmsResourcegroupResponseBodyResponse self = new AddRmsResourcegroupResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public AddRmsResourcegroupResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public AddRmsResourcegroupResponseBodyResponse setEntity(AddRmsResourcegroupResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public AddRmsResourcegroupResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
