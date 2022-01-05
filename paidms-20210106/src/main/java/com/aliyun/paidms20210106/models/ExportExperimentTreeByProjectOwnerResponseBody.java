// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ExportExperimentTreeByProjectOwnerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // 实验树
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportExperimentTreeByProjectOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportExperimentTreeByProjectOwnerResponseBody self = new ExportExperimentTreeByProjectOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportExperimentTreeByProjectOwnerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportExperimentTreeByProjectOwnerResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public ExportExperimentTreeByProjectOwnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportExperimentTreeByProjectOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
