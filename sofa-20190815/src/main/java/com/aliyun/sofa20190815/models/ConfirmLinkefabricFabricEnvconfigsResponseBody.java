// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricEnvconfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public ConfirmLinkefabricFabricEnvconfigsResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ConfirmLinkefabricFabricEnvconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricEnvconfigsResponseBody self = new ConfirmLinkefabricFabricEnvconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricEnvconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmLinkefabricFabricEnvconfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfirmLinkefabricFabricEnvconfigsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ConfirmLinkefabricFabricEnvconfigsResponseBody setData(ConfirmLinkefabricFabricEnvconfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfirmLinkefabricFabricEnvconfigsResponseBodyData getData() {
        return this.data;
    }

    public ConfirmLinkefabricFabricEnvconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ConfirmLinkefabricFabricEnvconfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConfirmLinkefabricFabricEnvconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ConfirmLinkefabricFabricEnvconfigsResponseBodyData extends TeaModel {
        @NameInMap("AntxChangeJson")
        public String antxChangeJson;

        @NameInMap("AntxConflictInfo")
        public java.util.List<String> antxConflictInfo;

        @NameInMap("LinkeUrl")
        public String linkeUrl;

        @NameInMap("DelKeyList")
        public java.util.List<String> delKeyList;

        public static ConfirmLinkefabricFabricEnvconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfirmLinkefabricFabricEnvconfigsResponseBodyData self = new ConfirmLinkefabricFabricEnvconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfirmLinkefabricFabricEnvconfigsResponseBodyData setAntxChangeJson(String antxChangeJson) {
            this.antxChangeJson = antxChangeJson;
            return this;
        }
        public String getAntxChangeJson() {
            return this.antxChangeJson;
        }

        public ConfirmLinkefabricFabricEnvconfigsResponseBodyData setAntxConflictInfo(java.util.List<String> antxConflictInfo) {
            this.antxConflictInfo = antxConflictInfo;
            return this;
        }
        public java.util.List<String> getAntxConflictInfo() {
            return this.antxConflictInfo;
        }

        public ConfirmLinkefabricFabricEnvconfigsResponseBodyData setLinkeUrl(String linkeUrl) {
            this.linkeUrl = linkeUrl;
            return this;
        }
        public String getLinkeUrl() {
            return this.linkeUrl;
        }

        public ConfirmLinkefabricFabricEnvconfigsResponseBodyData setDelKeyList(java.util.List<String> delKeyList) {
            this.delKeyList = delKeyList;
            return this;
        }
        public java.util.List<String> getDelKeyList() {
            return this.delKeyList;
        }

    }

}
