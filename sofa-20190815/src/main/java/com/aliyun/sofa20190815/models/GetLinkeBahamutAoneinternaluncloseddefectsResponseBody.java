// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaluncloseddefectsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult result;

    public static GetLinkeBahamutAoneinternaluncloseddefectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaluncloseddefectsResponseBody self = new GetLinkeBahamutAoneinternaluncloseddefectsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBody setResult(GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Datas")
        public java.util.List<String> datas;

        public static GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult self = new GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetLinkeBahamutAoneinternaluncloseddefectsResponseBodyResult setDatas(java.util.List<String> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<String> getDatas() {
            return this.datas;
        }

    }

}
