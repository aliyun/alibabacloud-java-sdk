// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryDeploymentArchiveResponseBody extends TeaModel {
    // totalCount
    @NameInMap("TotalCount")
    public Long totalCount;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 部署快照列表
    @NameInMap("Data")
    public java.util.List<DDeploymentArchive> data;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeploymentArchiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeploymentArchiveResponseBody self = new QueryDeploymentArchiveResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeploymentArchiveResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryDeploymentArchiveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDeploymentArchiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeploymentArchiveResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryDeploymentArchiveResponseBody setData(java.util.List<DDeploymentArchive> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DDeploymentArchive> getData() {
        return this.data;
    }

    public QueryDeploymentArchiveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeploymentArchiveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
