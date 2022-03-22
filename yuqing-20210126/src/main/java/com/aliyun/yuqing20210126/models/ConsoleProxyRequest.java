// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ConsoleProxyRequest extends TeaModel {
    // 应用码
    @NameInMap("appCode")
    public String appCode;

    // 请求接口名
    @NameInMap("interface")
    public String _interface;

    // 实际对象的参数json字符串
    @NameInMap("paramJson")
    public String paramJson;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    // 舆情团队HashId
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

    public ConsoleProxyRequest set_interface(String _interface) {
        this._interface = _interface;
        return this;
    }
    public String get_interface() {
        return this._interface;
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
