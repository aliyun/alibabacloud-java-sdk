// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExcelRecordResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 返回数据
    @NameInMap("Data")
    public String data;

    // 错误提示
    @NameInMap("Message")
    public String message;

    // 请求唯一 ID
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeExcelRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExcelRecordResponseBody self = new RecognizeExcelRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeExcelRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeExcelRecordResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeExcelRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeExcelRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
