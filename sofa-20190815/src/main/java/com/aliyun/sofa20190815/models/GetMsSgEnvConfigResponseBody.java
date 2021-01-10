// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgEnvConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ConfigMap")
    public String configMap;

    public static GetMsSgEnvConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgEnvConfigResponseBody self = new GetMsSgEnvConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsSgEnvConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsSgEnvConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsSgEnvConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMsSgEnvConfigResponseBody setConfigMap(String configMap) {
        this.configMap = configMap;
        return this;
    }
    public String getConfigMap() {
        return this.configMap;
    }

}
