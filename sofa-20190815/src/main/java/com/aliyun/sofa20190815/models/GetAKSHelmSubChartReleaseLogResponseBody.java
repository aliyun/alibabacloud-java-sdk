// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmSubChartReleaseLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ReleaseLog")
    public String releaseLog;

    public static GetAKSHelmSubChartReleaseLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmSubChartReleaseLogResponseBody self = new GetAKSHelmSubChartReleaseLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmSubChartReleaseLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSHelmSubChartReleaseLogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSHelmSubChartReleaseLogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSHelmSubChartReleaseLogResponseBody setReleaseLog(String releaseLog) {
        this.releaseLog = releaseLog;
        return this;
    }
    public String getReleaseLog() {
        return this.releaseLog;
    }

}
