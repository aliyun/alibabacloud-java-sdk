// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessmodelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Current")
    public Long current;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public GetLinkelinkflowLinkflowProcessmodelResponseBodyData data;

    public static GetLinkelinkflowLinkflowProcessmodelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessmodelResponseBody self = new GetLinkelinkflowLinkflowProcessmodelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowProcessmodelResponseBody setData(GetLinkelinkflowLinkflowProcessmodelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkelinkflowLinkflowProcessmodelResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowProcessmodelResponseBodyData extends TeaModel {
        @NameInMap("CurrentElementKey")
        public String currentElementKey;

        @NameInMap("Status")
        public String status;

        @NameInMap("Elements")
        public java.util.List<String> elements;

        public static GetLinkelinkflowLinkflowProcessmodelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowProcessmodelResponseBodyData self = new GetLinkelinkflowLinkflowProcessmodelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowProcessmodelResponseBodyData setCurrentElementKey(String currentElementKey) {
            this.currentElementKey = currentElementKey;
            return this;
        }
        public String getCurrentElementKey() {
            return this.currentElementKey;
        }

        public GetLinkelinkflowLinkflowProcessmodelResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkelinkflowLinkflowProcessmodelResponseBodyData setElements(java.util.List<String> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<String> getElements() {
            return this.elements;
        }

    }

}
