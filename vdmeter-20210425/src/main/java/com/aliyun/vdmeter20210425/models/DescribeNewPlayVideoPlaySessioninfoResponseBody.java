// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeNewPlayVideoPlaySessioninfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeNewPlayVideoPlaySessioninfoResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNewPlayVideoPlaySessioninfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewPlayVideoPlaySessioninfoResponseBody self = new DescribeNewPlayVideoPlaySessioninfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNewPlayVideoPlaySessioninfoResponseBody setData(java.util.List<DescribeNewPlayVideoPlaySessioninfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeNewPlayVideoPlaySessioninfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeNewPlayVideoPlaySessioninfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNewPlayVideoPlaySessioninfoResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("OS")
        public String OS;

        @NameInMap("OV")
        public String OV;

        @NameInMap("TerminalType")
        public String terminalType;

        @NameInMap("VPS")
        public String VPS;

        public static DescribeNewPlayVideoPlaySessioninfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNewPlayVideoPlaySessioninfoResponseBodyData self = new DescribeNewPlayVideoPlaySessioninfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBodyData setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBodyData setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBodyData setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBodyData setOV(String OV) {
            this.OV = OV;
            return this;
        }
        public String getOV() {
            return this.OV;
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBodyData setTerminalType(String terminalType) {
            this.terminalType = terminalType;
            return this;
        }
        public String getTerminalType() {
            return this.terminalType;
        }

        public DescribeNewPlayVideoPlaySessioninfoResponseBodyData setVPS(String VPS) {
            this.VPS = VPS;
            return this;
        }
        public String getVPS() {
            return this.VPS;
        }

    }

}
