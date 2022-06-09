// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class ConsoleBody extends TeaModel {
    // appCode
    @NameInMap("appCode")
    public String appCode;

    // interfaceName
    @NameInMap("interfaceName")
    public String interfaceName;

    // paramJson
    @NameInMap("paramJson")
    public String paramJson;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    // teamHashId
    @NameInMap("teamHashId")
    public String teamHashId;

    public static ConsoleBody build(java.util.Map<String, ?> map) throws Exception {
        ConsoleBody self = new ConsoleBody();
        return TeaModel.build(map, self);
    }

    public ConsoleBody setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ConsoleBody setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public ConsoleBody setParamJson(String paramJson) {
        this.paramJson = paramJson;
        return this;
    }
    public String getParamJson() {
        return this.paramJson;
    }

    public ConsoleBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConsoleBody setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
