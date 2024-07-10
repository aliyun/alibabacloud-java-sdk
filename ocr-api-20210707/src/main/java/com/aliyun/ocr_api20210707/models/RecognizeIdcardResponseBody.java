// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeIdcardResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>86B83935-DD36-195B-B6E4-D07BE370C8B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeIdcardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIdcardResponseBody self = new RecognizeIdcardResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeIdcardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeIdcardResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeIdcardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeIdcardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
