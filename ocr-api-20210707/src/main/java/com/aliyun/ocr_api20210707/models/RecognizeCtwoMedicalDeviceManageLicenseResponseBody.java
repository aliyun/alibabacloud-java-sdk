// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCtwoMedicalDeviceManageLicenseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static RecognizeCtwoMedicalDeviceManageLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCtwoMedicalDeviceManageLicenseResponseBody self = new RecognizeCtwoMedicalDeviceManageLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
