// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetDeploymentArchiveResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 部署快照
    @NameInMap("Data")
    public DDeploymentArchive data;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static GetDeploymentArchiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentArchiveResponseBody self = new GetDeploymentArchiveResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentArchiveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeploymentArchiveResponseBody setData(DDeploymentArchive data) {
        this.data = data;
        return this;
    }
    public DDeploymentArchive getData() {
        return this.data;
    }

    public GetDeploymentArchiveResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDeploymentArchiveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeploymentArchiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeploymentArchiveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
