// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobGroupExportTaskProgressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FileHttpUrl")
    public String fileHttpUrl;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Progress")
    public Float progress;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeJobGroupExportTaskProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobGroupExportTaskProgressResponseBody self = new DescribeJobGroupExportTaskProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobGroupExportTaskProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeJobGroupExportTaskProgressResponseBody setFileHttpUrl(String fileHttpUrl) {
        this.fileHttpUrl = fileHttpUrl;
        return this;
    }
    public String getFileHttpUrl() {
        return this.fileHttpUrl;
    }

    public DescribeJobGroupExportTaskProgressResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeJobGroupExportTaskProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeJobGroupExportTaskProgressResponseBody setProgress(Float progress) {
        this.progress = progress;
        return this;
    }
    public Float getProgress() {
        return this.progress;
    }

    public DescribeJobGroupExportTaskProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobGroupExportTaskProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
