// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeFoodProduceLicenseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeFoodProduceLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFoodProduceLicenseResponseBody self = new RecognizeFoodProduceLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeFoodProduceLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeFoodProduceLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeFoodProduceLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeFoodProduceLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
