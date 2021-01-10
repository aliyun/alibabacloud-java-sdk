// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutZoneResponseBody extends TeaModel {
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
    public GetLinkeBahamutZoneResponseBodyResult result;

    public static GetLinkeBahamutZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutZoneResponseBody self = new GetLinkeBahamutZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutZoneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutZoneResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutZoneResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutZoneResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutZoneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutZoneResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutZoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutZoneResponseBody setResult(GetLinkeBahamutZoneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutZoneResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutZoneResponseBodyResult extends TeaModel {
        @NameInMap("Station")
        public String station;

        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static GetLinkeBahamutZoneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutZoneResponseBodyResult self = new GetLinkeBahamutZoneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutZoneResponseBodyResult setStation(String station) {
            this.station = station;
            return this;
        }
        public String getStation() {
            return this.station;
        }

        public GetLinkeBahamutZoneResponseBodyResult setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
