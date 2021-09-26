// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionDetailResponseBody extends TeaModel {
    @NameInMap("LoginTime")
    public String loginTime;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("LoginCode")
    public Integer loginCode;

    @NameInMap("ClientPort")
    public Integer clientPort;

    @NameInMap("LoginMessage")
    public String loginMessage;

    @NameInMap("DbUser")
    public String dbUser;

    @NameInMap("LogoutTime")
    public String logoutTime;

    @NameInMap("ServerPort")
    public Integer serverPort;

    @NameInMap("ClientOsUser")
    public String clientOsUser;

    @NameInMap("ServerMac")
    public String serverMac;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClientProgram")
    public String clientProgram;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("ServerIp")
    public String serverIp;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("ClientMac")
    public String clientMac;

    public static GetSessionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionDetailResponseBody self = new GetSessionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionDetailResponseBody setLoginTime(String loginTime) {
        this.loginTime = loginTime;
        return this;
    }
    public String getLoginTime() {
        return this.loginTime;
    }

    public GetSessionDetailResponseBody setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetSessionDetailResponseBody setLoginCode(Integer loginCode) {
        this.loginCode = loginCode;
        return this;
    }
    public Integer getLoginCode() {
        return this.loginCode;
    }

    public GetSessionDetailResponseBody setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }
    public Integer getClientPort() {
        return this.clientPort;
    }

    public GetSessionDetailResponseBody setLoginMessage(String loginMessage) {
        this.loginMessage = loginMessage;
        return this;
    }
    public String getLoginMessage() {
        return this.loginMessage;
    }

    public GetSessionDetailResponseBody setDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }
    public String getDbUser() {
        return this.dbUser;
    }

    public GetSessionDetailResponseBody setLogoutTime(String logoutTime) {
        this.logoutTime = logoutTime;
        return this;
    }
    public String getLogoutTime() {
        return this.logoutTime;
    }

    public GetSessionDetailResponseBody setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
        return this;
    }
    public Integer getServerPort() {
        return this.serverPort;
    }

    public GetSessionDetailResponseBody setClientOsUser(String clientOsUser) {
        this.clientOsUser = clientOsUser;
        return this;
    }
    public String getClientOsUser() {
        return this.clientOsUser;
    }

    public GetSessionDetailResponseBody setServerMac(String serverMac) {
        this.serverMac = serverMac;
        return this;
    }
    public String getServerMac() {
        return this.serverMac;
    }

    public GetSessionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionDetailResponseBody setClientProgram(String clientProgram) {
        this.clientProgram = clientProgram;
        return this;
    }
    public String getClientProgram() {
        return this.clientProgram;
    }

    public GetSessionDetailResponseBody setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public GetSessionDetailResponseBody setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public GetSessionDetailResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetSessionDetailResponseBody setClientMac(String clientMac) {
        this.clientMac = clientMac;
        return this;
    }
    public String getClientMac() {
        return this.clientMac;
    }

}
