// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowVariablesResponseBody extends TeaModel {
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
    public java.util.List<GetLinkelinkflowLinkflowVariablesResponseBodyData> data;

    public static GetLinkelinkflowLinkflowVariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowVariablesResponseBody self = new GetLinkelinkflowLinkflowVariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowVariablesResponseBody setData(java.util.List<GetLinkelinkflowLinkflowVariablesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLinkelinkflowLinkflowVariablesResponseBodyData> getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowVariablesResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetLinkelinkflowLinkflowVariablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowVariablesResponseBodyData self = new GetLinkelinkflowLinkflowVariablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowVariablesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkelinkflowLinkflowVariablesResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLinkelinkflowLinkflowVariablesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkelinkflowLinkflowVariablesResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
