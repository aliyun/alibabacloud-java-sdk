// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class ConsoleProxyRequest extends TeaModel {
    @NameInMap("appCode")
    public String appCode;

    @NameInMap("interfaceName")
    public String interfaceName;

    @NameInMap("paramJson")
    public String paramJson;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("teamHashId")
    public String teamHashId;

    public static ConsoleProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsoleProxyRequest self = new ConsoleProxyRequest();
        return TeaModel.build(map, self);
    }

    public ConsoleProxyRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ConsoleProxyRequest setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public ConsoleProxyRequest setParamJson(String paramJson) {
        this.paramJson = paramJson;
        return this;
    }
    public String getParamJson() {
        return this.paramJson;
    }

    public ConsoleProxyRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConsoleProxyRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
