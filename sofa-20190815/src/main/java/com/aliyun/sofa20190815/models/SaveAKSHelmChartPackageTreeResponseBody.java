// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveAKSHelmChartPackageTreeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static SaveAKSHelmChartPackageTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveAKSHelmChartPackageTreeResponseBody self = new SaveAKSHelmChartPackageTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveAKSHelmChartPackageTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveAKSHelmChartPackageTreeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveAKSHelmChartPackageTreeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
