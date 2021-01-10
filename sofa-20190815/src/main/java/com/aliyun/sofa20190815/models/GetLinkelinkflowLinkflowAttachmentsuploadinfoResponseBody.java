// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody extends TeaModel {
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
    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBodyData data;

    public static GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody self = new GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody setData(GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBodyData extends TeaModel {
        @NameInMap("RemoteUrl")
        public String remoteUrl;

        @NameInMap("SignedUploadUrl")
        public String signedUploadUrl;

        public static GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBodyData self = new GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBodyData setRemoteUrl(String remoteUrl) {
            this.remoteUrl = remoteUrl;
            return this;
        }
        public String getRemoteUrl() {
            return this.remoteUrl;
        }

        public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBodyData setSignedUploadUrl(String signedUploadUrl) {
            this.signedUploadUrl = signedUploadUrl;
            return this;
        }
        public String getSignedUploadUrl() {
            return this.signedUploadUrl;
        }

    }

}
