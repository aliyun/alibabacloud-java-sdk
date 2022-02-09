// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class GetOdcInfoResponseBody extends TeaModel {
    @NameInMap("Info")
    public GetOdcInfoResponseBodyInfo info;

    public static GetOdcInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOdcInfoResponseBody self = new GetOdcInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOdcInfoResponseBody setInfo(GetOdcInfoResponseBodyInfo info) {
        this.info = info;
        return this;
    }
    public GetOdcInfoResponseBodyInfo getInfo() {
        return this.info;
    }

    public static class GetOdcInfoResponseBodyInfoResult extends TeaModel {
        @NameInMap("BuildTime")
        public Float buildTime;

        @NameInMap("LoginUrl")
        public String loginUrl;

        @NameInMap("LogoutUrl")
        public String logoutUrl;

        @NameInMap("StartTime")
        public Float startTime;

        @NameInMap("Version")
        public String version;

        @NameInMap("WebResourceLocation")
        public String webResourceLocation;

        public static GetOdcInfoResponseBodyInfoResult build(java.util.Map<String, ?> map) throws Exception {
            GetOdcInfoResponseBodyInfoResult self = new GetOdcInfoResponseBodyInfoResult();
            return TeaModel.build(map, self);
        }

        public GetOdcInfoResponseBodyInfoResult setBuildTime(Float buildTime) {
            this.buildTime = buildTime;
            return this;
        }
        public Float getBuildTime() {
            return this.buildTime;
        }

        public GetOdcInfoResponseBodyInfoResult setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public GetOdcInfoResponseBodyInfoResult setLogoutUrl(String logoutUrl) {
            this.logoutUrl = logoutUrl;
            return this;
        }
        public String getLogoutUrl() {
            return this.logoutUrl;
        }

        public GetOdcInfoResponseBodyInfoResult setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public GetOdcInfoResponseBodyInfoResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetOdcInfoResponseBodyInfoResult setWebResourceLocation(String webResourceLocation) {
            this.webResourceLocation = webResourceLocation;
            return this;
        }
        public String getWebResourceLocation() {
            return this.webResourceLocation;
        }

    }

    public static class GetOdcInfoResponseBodyInfo extends TeaModel {
        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ImportantMsg")
        public Boolean importantMsg;

        @NameInMap("Result")
        public GetOdcInfoResponseBodyInfoResult result;

        public static GetOdcInfoResponseBodyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOdcInfoResponseBodyInfo self = new GetOdcInfoResponseBodyInfo();
            return TeaModel.build(map, self);
        }

        public GetOdcInfoResponseBodyInfo setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public GetOdcInfoResponseBodyInfo setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetOdcInfoResponseBodyInfo setImportantMsg(Boolean importantMsg) {
            this.importantMsg = importantMsg;
            return this;
        }
        public Boolean getImportantMsg() {
            return this.importantMsg;
        }

        public GetOdcInfoResponseBodyInfo setResult(GetOdcInfoResponseBodyInfoResult result) {
            this.result = result;
            return this;
        }
        public GetOdcInfoResponseBodyInfoResult getResult() {
            return this.result;
        }

    }

}
