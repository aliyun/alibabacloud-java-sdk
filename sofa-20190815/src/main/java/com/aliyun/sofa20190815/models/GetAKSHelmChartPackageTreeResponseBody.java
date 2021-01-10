// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartPackageTreeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ChartPackageTree")
    public java.util.List<String> chartPackageTree;

    public static GetAKSHelmChartPackageTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartPackageTreeResponseBody self = new GetAKSHelmChartPackageTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartPackageTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSHelmChartPackageTreeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSHelmChartPackageTreeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSHelmChartPackageTreeResponseBody setChartPackageTree(java.util.List<String> chartPackageTree) {
        this.chartPackageTree = chartPackageTree;
        return this;
    }
    public java.util.List<String> getChartPackageTree() {
        return this.chartPackageTree;
    }

}
