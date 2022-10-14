// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListEngineVersionMetadataResponseBody extends TeaModel {
    @NameInMap("data")
    public EngineVersionMetadataIndex data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("httpCode")
    public Integer httpCode;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListEngineVersionMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEngineVersionMetadataResponseBody self = new ListEngineVersionMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEngineVersionMetadataResponseBody setData(EngineVersionMetadataIndex data) {
        this.data = data;
        return this;
    }
    public EngineVersionMetadataIndex getData() {
        return this.data;
    }

    public ListEngineVersionMetadataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEngineVersionMetadataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListEngineVersionMetadataResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListEngineVersionMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEngineVersionMetadataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
