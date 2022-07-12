// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConvertImageToGrayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignatureUrl")
    public String signatureUrl;

    public static ConvertImageToGrayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertImageToGrayResponseBody self = new ConvertImageToGrayResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertImageToGrayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertImageToGrayResponseBody setSignatureUrl(String signatureUrl) {
        this.signatureUrl = signatureUrl;
        return this;
    }
    public String getSignatureUrl() {
        return this.signatureUrl;
    }

}
