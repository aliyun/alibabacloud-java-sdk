// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessvariablesResponseBody extends TeaModel {
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
    public java.util.List<GetLinkelinkflowLinkflowProcessvariablesResponseBodyData> data;

    public static GetLinkelinkflowLinkflowProcessvariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessvariablesResponseBody self = new GetLinkelinkflowLinkflowProcessvariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowProcessvariablesResponseBody setData(java.util.List<GetLinkelinkflowLinkflowProcessvariablesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLinkelinkflowLinkflowProcessvariablesResponseBodyData> getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowProcessvariablesResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetLinkelinkflowLinkflowProcessvariablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowProcessvariablesResponseBodyData self = new GetLinkelinkflowLinkflowProcessvariablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowProcessvariablesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkelinkflowLinkflowProcessvariablesResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLinkelinkflowLinkflowProcessvariablesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkelinkflowLinkflowProcessvariablesResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
