// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryQrCodeUploadStatusResponseBody extends TeaModel {
    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("OssUrl")
    public String ossUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Success")
    public Boolean success;

    public static QueryQrCodeUploadStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryQrCodeUploadStatusResponseBody self = new QueryQrCodeUploadStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryQrCodeUploadStatusResponseBody setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public QueryQrCodeUploadStatusResponseBody setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public QueryQrCodeUploadStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryQrCodeUploadStatusResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryQrCodeUploadStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
