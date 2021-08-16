// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryPreCheckDatabaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Progress")
    public Integer progress;

    @NameInMap("Result")
    public String result;

    @NameInMap("CompletedTime")
    public Long completedTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("UpdatedTime")
    public Long updatedTime;

    @NameInMap("CreatedTime")
    public Long createdTime;

    public static QueryPreCheckDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPreCheckDatabaseResponseBody self = new QueryPreCheckDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPreCheckDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPreCheckDatabaseResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public QueryPreCheckDatabaseResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryPreCheckDatabaseResponseBody setCompletedTime(Long completedTime) {
        this.completedTime = completedTime;
        return this;
    }
    public Long getCompletedTime() {
        return this.completedTime;
    }

    public QueryPreCheckDatabaseResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryPreCheckDatabaseResponseBody setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

    public QueryPreCheckDatabaseResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

}
