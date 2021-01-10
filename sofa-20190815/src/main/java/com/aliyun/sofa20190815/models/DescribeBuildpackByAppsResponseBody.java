// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackByAppsResponseBody extends TeaModel {
    @NameInMap("Buildpackv2adapter")
    public String buildpackv2adapter;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeBuildpackByAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackByAppsResponseBody self = new DescribeBuildpackByAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackByAppsResponseBody setBuildpackv2adapter(String buildpackv2adapter) {
        this.buildpackv2adapter = buildpackv2adapter;
        return this;
    }
    public String getBuildpackv2adapter() {
        return this.buildpackv2adapter;
    }

    public DescribeBuildpackByAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBuildpackByAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeBuildpackByAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
