// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trafficfxopen20240815.models;

import com.aliyun.tea.*;

public class ConvertUrlResponseBody extends TeaModel {
    @NameInMap("data")
    public ConvertUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorData")
    public ConvertUrlResponseBodyErrorData errorData;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6BD708D6-1A8C-5CF9-85B8-D620F314F1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ConvertUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertUrlResponseBody self = new ConvertUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertUrlResponseBody setData(ConvertUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConvertUrlResponseBodyData getData() {
        return this.data;
    }

    public ConvertUrlResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ConvertUrlResponseBody setErrorData(ConvertUrlResponseBodyErrorData errorData) {
        this.errorData = errorData;
        return this;
    }
    public ConvertUrlResponseBodyErrorData getErrorData() {
        return this.errorData;
    }

    public ConvertUrlResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ConvertUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConvertUrlResponseBodyDataStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public String code;

        @NameInMap("errorMsg")
        public String errorMsg;

        public static ConvertUrlResponseBodyDataStatus build(java.util.Map<String, ?> map) throws Exception {
            ConvertUrlResponseBodyDataStatus self = new ConvertUrlResponseBodyDataStatus();
            return TeaModel.build(map, self);
        }

        public ConvertUrlResponseBodyDataStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ConvertUrlResponseBodyDataStatus setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class ConvertUrlResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>wx6a96c49f29850eb5</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://fx.wapa.taobao.com/connect?return_url=https%3A%2F%2Fmarket.wapa.taobao.com%2Fapp%2Ftrip%2Frx-traffic%2Fpages%2Fota%3F_F_sht_sm%3D12345678%26leaveFlightNo%3DCZ6132%26arrCityCode%3DDLC%26arrCityName%3D%25E5%25A4%25A7%25E8%25BF%259E%26leaveCabinClass%3D0%26itemParams%3DmQZ4eyJhZHRQcmljZSI6MzEyLCJhZnRlclByb21vdGlvbgUamFNlYXJjaCI6dHJ1ZSwiYWdlbnRJZCI6IjUwNTUiLCJhdmVyYWdlUAFFdFNob3ciOmZhbHNlLCJjYWJpbiI6IloiLCJjaGlsZAVODWgUZmlyc3RDASJkQ2xhc3MiOiJBTExfQ0FCSU4iLCJpbmZhbnQNMMgxNDAsIml0ZW1JZCI6IjEyZDJhZTdiMzk0ZjQ5MWY5MjE2ZjQzMzBjYjdkY2E5XzY2IiwFL_BCVHlwZSI6MSwibGVhdmVGbGlnaHRObyI6IkNaNjEzMiIsInByZVF1ZXJ5VGltZXN0YW1wIjoxNzI1MzQyMzI0MDU3LAEiEFRyYWNlBXscMjEwM2EzNDAVJDQwNDM3MjEyNmQzZTY4IgFQLjgBFCI6MCwicyU9GFNlZ21lbnQB53hbe1wiYXJyQ2l0eUNvZGVcIjpcIkRMQ1wiLFwiZGVwMhgACEJKUxEYCERhdAksODIwMjQtMTAtMTRcIn1dIgFiDGxlY3QJ3xhIYXNTdG9wNYMAcwUcBGVkRoAAGEFpcnBvcnRCgwBqmwA-MwAIUEtYEZ6qtgAgIDA4OjMwOjAwBTwoam91cm5leVNlcVwhLyhcIm1hcmtldGluZwnRBE5vJSEpshHxFHVwcGx5QVWIFCxbNTQ0NyULBRoQT2ZmZXJRrx0TsExpbmtlZElkIjoiYTAzOTk4MzZkZGUzNDBhMTlhZGQ2NzU4ZDZkNjQ1YjEifQ%253D%253D%26depCityName%3D%25E5%258C%2597%25E4%25BA%25AC%26leaveDate%3D2024-10-14%26fpt%3Dta.fx%2528017595%2529017595%26_fli_webview%3Dfalse%26ttid%3Ddidi.000017598%26depCityCode%3DBJS&fliggy_scene=didi">https://fx.wapa.taobao.com/connect?return_url=https%3A%2F%2Fmarket.wapa.taobao.com%2Fapp%2Ftrip%2Frx-traffic%2Fpages%2Fota%3F_F_sht_sm%3D12345678%26leaveFlightNo%3DCZ6132%26arrCityCode%3DDLC%26arrCityName%3D%25E5%25A4%25A7%25E8%25BF%259E%26leaveCabinClass%3D0%26itemParams%3DmQZ4eyJhZHRQcmljZSI6MzEyLCJhZnRlclByb21vdGlvbgUamFNlYXJjaCI6dHJ1ZSwiYWdlbnRJZCI6IjUwNTUiLCJhdmVyYWdlUAFFdFNob3ciOmZhbHNlLCJjYWJpbiI6IloiLCJjaGlsZAVODWgUZmlyc3RDASJkQ2xhc3MiOiJBTExfQ0FCSU4iLCJpbmZhbnQNMMgxNDAsIml0ZW1JZCI6IjEyZDJhZTdiMzk0ZjQ5MWY5MjE2ZjQzMzBjYjdkY2E5XzY2IiwFL_BCVHlwZSI6MSwibGVhdmVGbGlnaHRObyI6IkNaNjEzMiIsInByZVF1ZXJ5VGltZXN0YW1wIjoxNzI1MzQyMzI0MDU3LAEiEFRyYWNlBXscMjEwM2EzNDAVJDQwNDM3MjEyNmQzZTY4IgFQLjgBFCI6MCwicyU9GFNlZ21lbnQB53hbe1wiYXJyQ2l0eUNvZGVcIjpcIkRMQ1wiLFwiZGVwMhgACEJKUxEYCERhdAksODIwMjQtMTAtMTRcIn1dIgFiDGxlY3QJ3xhIYXNTdG9wNYMAcwUcBGVkRoAAGEFpcnBvcnRCgwBqmwA-MwAIUEtYEZ6qtgAgIDA4OjMwOjAwBTwoam91cm5leVNlcVwhLyhcIm1hcmtldGluZwnRBE5vJSEpshHxFHVwcGx5QVWIFCxbNTQ0NyULBRoQT2ZmZXJRrx0TsExpbmtlZElkIjoiYTAzOTk4MzZkZGUzNDBhMTlhZGQ2NzU4ZDZkNjQ1YjEifQ%253D%253D%26depCityName%3D%25E5%258C%2597%25E4%25BA%25AC%26leaveDate%3D2024-10-14%26fpt%3Dta.fx%2528017595%2529017595%26_fli_webview%3Dfalse%26ttid%3Ddidi.000017598%26depCityCode%3DBJS&amp;fliggy_scene=didi</a></p>
         */
        @NameInMap("authUrl")
        public String authUrl;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("status")
        public ConvertUrlResponseBodyDataStatus status;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static ConvertUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConvertUrlResponseBodyData self = new ConvertUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConvertUrlResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ConvertUrlResponseBodyData setAuthUrl(String authUrl) {
            this.authUrl = authUrl;
            return this;
        }
        public String getAuthUrl() {
            return this.authUrl;
        }

        public ConvertUrlResponseBodyData setStatus(ConvertUrlResponseBodyDataStatus status) {
            this.status = status;
            return this;
        }
        public ConvertUrlResponseBodyDataStatus getStatus() {
            return this.status;
        }

        public ConvertUrlResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ConvertUrlResponseBodyErrorData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("rawErrorCode")
        public String rawErrorCode;

        @NameInMap("rawErrorMsg")
        public String rawErrorMsg;

        public static ConvertUrlResponseBodyErrorData build(java.util.Map<String, ?> map) throws Exception {
            ConvertUrlResponseBodyErrorData self = new ConvertUrlResponseBodyErrorData();
            return TeaModel.build(map, self);
        }

        public ConvertUrlResponseBodyErrorData setRawErrorCode(String rawErrorCode) {
            this.rawErrorCode = rawErrorCode;
            return this;
        }
        public String getRawErrorCode() {
            return this.rawErrorCode;
        }

        public ConvertUrlResponseBodyErrorData setRawErrorMsg(String rawErrorMsg) {
            this.rawErrorMsg = rawErrorMsg;
            return this;
        }
        public String getRawErrorMsg() {
            return this.rawErrorMsg;
        }

    }

}
