// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAppArchivesResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 应用快照列表
    @NameInMap("Data")
    public java.util.List<DAppArchive> data;

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

    public static GetAppArchivesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppArchivesResponseBody self = new GetAppArchivesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppArchivesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppArchivesResponseBody setData(java.util.List<DAppArchive> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DAppArchive> getData() {
        return this.data;
    }

    public GetAppArchivesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAppArchivesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppArchivesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppArchivesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
