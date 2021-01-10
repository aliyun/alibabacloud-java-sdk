// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateBuildpackPackageSignUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Url")
    public String url;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateBuildpackPackageSignUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackPackageSignUrlResponseBody self = new CreateBuildpackPackageSignUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackPackageSignUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBuildpackPackageSignUrlResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateBuildpackPackageSignUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateBuildpackPackageSignUrlResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
