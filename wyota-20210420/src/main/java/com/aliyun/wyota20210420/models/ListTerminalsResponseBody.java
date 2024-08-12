// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTerminalsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TERMINAL_NOT_FOUND</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTerminalsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>terminal not found</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdEdsXbwG2ZlbWCzN4wTTg6wQvfp7u1BJl4bxCAby41POSaYAlCvfULQpkAnb0ff****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>C5DCE54A-B266-522E-A6ED-468AF45F5AAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTerminalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalsResponseBody self = new ListTerminalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTerminalsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTerminalsResponseBody setData(java.util.List<ListTerminalsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTerminalsResponseBodyData> getData() {
        return this.data;
    }

    public ListTerminalsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTerminalsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTerminalsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTerminalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTerminalsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTerminalsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTerminalsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DemoDevice</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>7.0.2-RS-20240805.044924</p>
         */
        @NameInMap("BuildId")
        public String buildId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClientType")
        public Integer clientType;

        /**
         * <strong>example:</strong>
         * <p>ecd-drqmaogzbmbdf****</p>
         */
        @NameInMap("CurrentConnectDesktop")
        public String currentConnectDesktop;

        /**
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("CurrentLoginUser")
        public String currentLoginUser;

        /**
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Ipv4")
        public String ipv4;

        @NameInMap("LocationInfo")
        public String locationInfo;

        /**
         * <strong>example:</strong>
         * <p>US01</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("PasswordFreeLoginUser")
        public String passwordFreeLoginUser;

        /**
         * <strong>example:</strong>
         * <p>ODN49YQCPQYC****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <strong>example:</strong>
         * <p>tg-default</p>
         */
        @NameInMap("TerminalGroupId")
        public String terminalGroupId;

        /**
         * <strong>example:</strong>
         * <p>04873D3898B51A7DF2455C1E1DC9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListTerminalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTerminalsResponseBodyData self = new ListTerminalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTerminalsResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListTerminalsResponseBodyData setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public ListTerminalsResponseBodyData setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public ListTerminalsResponseBodyData setCurrentConnectDesktop(String currentConnectDesktop) {
            this.currentConnectDesktop = currentConnectDesktop;
            return this;
        }
        public String getCurrentConnectDesktop() {
            return this.currentConnectDesktop;
        }

        public ListTerminalsResponseBodyData setCurrentLoginUser(String currentLoginUser) {
            this.currentLoginUser = currentLoginUser;
            return this;
        }
        public String getCurrentLoginUser() {
            return this.currentLoginUser;
        }

        public ListTerminalsResponseBodyData setIpv4(String ipv4) {
            this.ipv4 = ipv4;
            return this;
        }
        public String getIpv4() {
            return this.ipv4;
        }

        public ListTerminalsResponseBodyData setLocationInfo(String locationInfo) {
            this.locationInfo = locationInfo;
            return this;
        }
        public String getLocationInfo() {
            return this.locationInfo;
        }

        public ListTerminalsResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListTerminalsResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListTerminalsResponseBodyData setPasswordFreeLoginUser(String passwordFreeLoginUser) {
            this.passwordFreeLoginUser = passwordFreeLoginUser;
            return this;
        }
        public String getPasswordFreeLoginUser() {
            return this.passwordFreeLoginUser;
        }

        public ListTerminalsResponseBodyData setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListTerminalsResponseBodyData setTerminalGroupId(String terminalGroupId) {
            this.terminalGroupId = terminalGroupId;
            return this;
        }
        public String getTerminalGroupId() {
            return this.terminalGroupId;
        }

        public ListTerminalsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
