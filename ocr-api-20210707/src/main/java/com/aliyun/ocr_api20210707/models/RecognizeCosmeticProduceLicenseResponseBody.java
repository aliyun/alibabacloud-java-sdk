// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCosmeticProduceLicenseResponseBody extends TeaModel {
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
     * <p>AA91C84E-7DB9-1951-B8FE-D830076A0473</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeCosmeticProduceLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCosmeticProduceLicenseResponseBody self = new RecognizeCosmeticProduceLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeCosmeticProduceLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeCosmeticProduceLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeCosmeticProduceLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeCosmeticProduceLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
