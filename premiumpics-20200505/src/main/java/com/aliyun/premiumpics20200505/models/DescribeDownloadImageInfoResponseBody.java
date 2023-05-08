// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeDownloadImageInfoResponseBody extends TeaModel {
    @NameInMap("AuthorizationUrl")
    public String authorizationUrl;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>errorMsg</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDownloadImageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadImageInfoResponseBody self = new DescribeDownloadImageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadImageInfoResponseBody setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
        return this;
    }
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public DescribeDownloadImageInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDownloadImageInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DescribeDownloadImageInfoResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DescribeDownloadImageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadImageInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
