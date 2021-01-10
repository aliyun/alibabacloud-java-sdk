// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteRmsRuleGroupByNameResponseBody extends TeaModel {
    @NameInMap("Response")
    public DeleteRmsRuleGroupByNameResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteRmsRuleGroupByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsRuleGroupByNameResponseBody self = new DeleteRmsRuleGroupByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRmsRuleGroupByNameResponseBody setResponse(DeleteRmsRuleGroupByNameResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public DeleteRmsRuleGroupByNameResponseBodyResponse getResponse() {
        return this.response;
    }

    public DeleteRmsRuleGroupByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRmsRuleGroupByNameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteRmsRuleGroupByNameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DeleteRmsRuleGroupByNameResponseBodyResponseEntity extends TeaModel {
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

        public static DeleteRmsRuleGroupByNameResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsRuleGroupByNameResponseBodyResponseEntity self = new DeleteRmsRuleGroupByNameResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public DeleteRmsRuleGroupByNameResponseBodyResponseEntity setModule(Boolean module) {
            this.module = module;
            return this;
        }
        public Boolean getModule() {
            return this.module;
        }

        public DeleteRmsRuleGroupByNameResponseBodyResponseEntity setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public DeleteRmsRuleGroupByNameResponseBodyResponseEntity setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DeleteRmsRuleGroupByNameResponseBodyResponseEntity setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public DeleteRmsRuleGroupByNameResponseBodyResponseEntity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteRmsRuleGroupByNameResponseBodyResponseEntity setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class DeleteRmsRuleGroupByNameResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public DeleteRmsRuleGroupByNameResponseBodyResponseEntity entity;

        public static DeleteRmsRuleGroupByNameResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            DeleteRmsRuleGroupByNameResponseBodyResponse self = new DeleteRmsRuleGroupByNameResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public DeleteRmsRuleGroupByNameResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DeleteRmsRuleGroupByNameResponseBodyResponse setEntity(DeleteRmsRuleGroupByNameResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public DeleteRmsRuleGroupByNameResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
