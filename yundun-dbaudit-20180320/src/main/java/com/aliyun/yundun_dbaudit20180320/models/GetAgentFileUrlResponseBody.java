// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAgentFileUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LinuxFileUrl")
    public String linuxFileUrl;

    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("WinFileUrl")
    public String winFileUrl;

    public static GetAgentFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentFileUrlResponseBody self = new GetAgentFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentFileUrlResponseBody setLinuxFileUrl(String linuxFileUrl) {
        this.linuxFileUrl = linuxFileUrl;
        return this;
    }
    public String getLinuxFileUrl() {
        return this.linuxFileUrl;
    }

    public GetAgentFileUrlResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetAgentFileUrlResponseBody setWinFileUrl(String winFileUrl) {
        this.winFileUrl = winFileUrl;
        return this;
    }
    public String getWinFileUrl() {
        return this.winFileUrl;
    }

}
