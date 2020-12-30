// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class CreateDatasetRecordResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DatasetRecordId")
    public java.util.Map<String, ?> datasetRecordId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDatasetRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRecordResponseBody self = new CreateDatasetRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDatasetRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDatasetRecordResponseBody setDatasetRecordId(java.util.Map<String, ?> datasetRecordId) {
        this.datasetRecordId = datasetRecordId;
        return this;
    }
    public java.util.Map<String, ?> getDatasetRecordId() {
        return this.datasetRecordId;
    }

    public CreateDatasetRecordResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateDatasetRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
