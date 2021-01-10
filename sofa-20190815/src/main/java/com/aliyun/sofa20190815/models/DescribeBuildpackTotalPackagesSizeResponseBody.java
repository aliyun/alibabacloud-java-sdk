// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackTotalPackagesSizeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public String result;

    public static DescribeBuildpackTotalPackagesSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackTotalPackagesSizeResponseBody self = new DescribeBuildpackTotalPackagesSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackTotalPackagesSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBuildpackTotalPackagesSizeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeBuildpackTotalPackagesSizeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeBuildpackTotalPackagesSizeResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
