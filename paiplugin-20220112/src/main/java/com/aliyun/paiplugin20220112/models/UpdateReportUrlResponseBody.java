// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class UpdateReportUrlResponseBody extends TeaModel {
    // 返回数据。
    @NameInMap("Data")
    public String data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateReportUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportUrlResponseBody self = new UpdateReportUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateReportUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateReportUrlResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public UpdateReportUrlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateReportUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
