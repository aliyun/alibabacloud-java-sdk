// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutIterationrecommendgrayResponseBody extends TeaModel {
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
    public java.util.List<SetLinkeBahamutIterationrecommendgrayResponseBodyResult> result;

    public static SetLinkeBahamutIterationrecommendgrayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutIterationrecommendgrayResponseBody self = new SetLinkeBahamutIterationrecommendgrayResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutIterationrecommendgrayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetLinkeBahamutIterationrecommendgrayResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetLinkeBahamutIterationrecommendgrayResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SetLinkeBahamutIterationrecommendgrayResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetLinkeBahamutIterationrecommendgrayResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public SetLinkeBahamutIterationrecommendgrayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetLinkeBahamutIterationrecommendgrayResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public SetLinkeBahamutIterationrecommendgrayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetLinkeBahamutIterationrecommendgrayResponseBody setResult(java.util.List<SetLinkeBahamutIterationrecommendgrayResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<SetLinkeBahamutIterationrecommendgrayResponseBodyResult> getResult() {
        return this.result;
    }

    public static class SetLinkeBahamutIterationrecommendgrayResponseBodyResult extends TeaModel {
        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("GrayAppNames")
        public java.util.List<String> grayAppNames;

        @NameInMap("GrayCodeNames")
        public java.util.List<String> grayCodeNames;

        @NameInMap("ReleaseIterationUnitList")
        public java.util.List<String> releaseIterationUnitList;

        @NameInMap("UnitsNotReady")
        public java.util.List<String> unitsNotReady;

        public static SetLinkeBahamutIterationrecommendgrayResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SetLinkeBahamutIterationrecommendgrayResponseBodyResult self = new SetLinkeBahamutIterationrecommendgrayResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SetLinkeBahamutIterationrecommendgrayResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public SetLinkeBahamutIterationrecommendgrayResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SetLinkeBahamutIterationrecommendgrayResponseBodyResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public SetLinkeBahamutIterationrecommendgrayResponseBodyResult setGrayAppNames(java.util.List<String> grayAppNames) {
            this.grayAppNames = grayAppNames;
            return this;
        }
        public java.util.List<String> getGrayAppNames() {
            return this.grayAppNames;
        }

        public SetLinkeBahamutIterationrecommendgrayResponseBodyResult setGrayCodeNames(java.util.List<String> grayCodeNames) {
            this.grayCodeNames = grayCodeNames;
            return this;
        }
        public java.util.List<String> getGrayCodeNames() {
            return this.grayCodeNames;
        }

        public SetLinkeBahamutIterationrecommendgrayResponseBodyResult setReleaseIterationUnitList(java.util.List<String> releaseIterationUnitList) {
            this.releaseIterationUnitList = releaseIterationUnitList;
            return this;
        }
        public java.util.List<String> getReleaseIterationUnitList() {
            return this.releaseIterationUnitList;
        }

        public SetLinkeBahamutIterationrecommendgrayResponseBodyResult setUnitsNotReady(java.util.List<String> unitsNotReady) {
            this.unitsNotReady = unitsNotReady;
            return this;
        }
        public java.util.List<String> getUnitsNotReady() {
            return this.unitsNotReady;
        }

    }

}
