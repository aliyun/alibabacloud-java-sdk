// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetMessageConfigResponseBody extends TeaModel {
    // 返回数据。
    @NameInMap("Data")
    public GetMessageConfigResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static GetMessageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageConfigResponseBody self = new GetMessageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageConfigResponseBody setData(GetMessageConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMessageConfigResponseBodyData getData() {
        return this.data;
    }

    public GetMessageConfigResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetMessageConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMessageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMessageConfigResponseBodyData extends TeaModel {
        // 短信发送状态回执接收服务地址。
        @NameInMap("SmsReportUrl")
        public String smsReportUrl;

        // 上行短信消息接收服务地址。
        @NameInMap("SmsUpUrl")
        public String smsUpUrl;

        public static GetMessageConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMessageConfigResponseBodyData self = new GetMessageConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMessageConfigResponseBodyData setSmsReportUrl(String smsReportUrl) {
            this.smsReportUrl = smsReportUrl;
            return this;
        }
        public String getSmsReportUrl() {
            return this.smsReportUrl;
        }

        public GetMessageConfigResponseBodyData setSmsUpUrl(String smsUpUrl) {
            this.smsUpUrl = smsUpUrl;
            return this;
        }
        public String getSmsUpUrl() {
            return this.smsUpUrl;
        }

    }

}
