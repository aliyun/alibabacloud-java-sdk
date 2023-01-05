// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeNumberDistrictInfoStatusResponseBody extends TeaModel {
    @NameInMap("AppliedVersion")
    public DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion appliedVersion;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("ParsingVersion")
    public DescribeNumberDistrictInfoStatusResponseBodyParsingVersion parsingVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeNumberDistrictInfoStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNumberDistrictInfoStatusResponseBody self = new DescribeNumberDistrictInfoStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNumberDistrictInfoStatusResponseBody setAppliedVersion(DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion appliedVersion) {
        this.appliedVersion = appliedVersion;
        return this;
    }
    public DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion getAppliedVersion() {
        return this.appliedVersion;
    }

    public DescribeNumberDistrictInfoStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNumberDistrictInfoStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeNumberDistrictInfoStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNumberDistrictInfoStatusResponseBody setParsingVersion(DescribeNumberDistrictInfoStatusResponseBodyParsingVersion parsingVersion) {
        this.parsingVersion = parsingVersion;
        return this;
    }
    public DescribeNumberDistrictInfoStatusResponseBodyParsingVersion getParsingVersion() {
        return this.parsingVersion;
    }

    public DescribeNumberDistrictInfoStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNumberDistrictInfoStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNumberDistrictInfoStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("VersionId")
        public String versionId;

        public static DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion self = new DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion();
            return TeaModel.build(map, self);
        }

        public DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeNumberDistrictInfoStatusResponseBodyAppliedVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class DescribeNumberDistrictInfoStatusResponseBodyParsingVersion extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("ParseProgress")
        public Long parseProgress;

        @NameInMap("VersionId")
        public String versionId;

        public static DescribeNumberDistrictInfoStatusResponseBodyParsingVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeNumberDistrictInfoStatusResponseBodyParsingVersion self = new DescribeNumberDistrictInfoStatusResponseBodyParsingVersion();
            return TeaModel.build(map, self);
        }

        public DescribeNumberDistrictInfoStatusResponseBodyParsingVersion setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeNumberDistrictInfoStatusResponseBodyParsingVersion setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeNumberDistrictInfoStatusResponseBodyParsingVersion setParseProgress(Long parseProgress) {
            this.parseProgress = parseProgress;
            return this;
        }
        public Long getParseProgress() {
            return this.parseProgress;
        }

        public DescribeNumberDistrictInfoStatusResponseBodyParsingVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
