// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeApplicationImageResponseBodyData data;

    public static DescribeApplicationImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationImageResponseBody self = new DescribeApplicationImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationImageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationImageResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DescribeApplicationImageResponseBody setData(DescribeApplicationImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationImageResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeApplicationImageResponseBodyData extends TeaModel {
        @NameInMap("CrUrl")
        @Validation(required = true)
        public String crUrl;

        @NameInMap("Logo")
        @Validation(required = true)
        public String logo;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("RepoName")
        @Validation(required = true)
        public String repoName;

        @NameInMap("RepoNamespace")
        @Validation(required = true)
        public String repoNamespace;

        @NameInMap("RepoOriginType")
        @Validation(required = true)
        public String repoOriginType;

        @NameInMap("RepoType")
        @Validation(required = true)
        public String repoType;

        @NameInMap("RepoTag")
        @Validation(required = true)
        public String repoTag;

        public static DescribeApplicationImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationImageResponseBodyData self = new DescribeApplicationImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationImageResponseBodyData setCrUrl(String crUrl) {
            this.crUrl = crUrl;
            return this;
        }
        public String getCrUrl() {
            return this.crUrl;
        }

        public DescribeApplicationImageResponseBodyData setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public DescribeApplicationImageResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApplicationImageResponseBodyData setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public DescribeApplicationImageResponseBodyData setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public DescribeApplicationImageResponseBodyData setRepoOriginType(String repoOriginType) {
            this.repoOriginType = repoOriginType;
            return this;
        }
        public String getRepoOriginType() {
            return this.repoOriginType;
        }

        public DescribeApplicationImageResponseBodyData setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public DescribeApplicationImageResponseBodyData setRepoTag(String repoTag) {
            this.repoTag = repoTag;
            return this;
        }
        public String getRepoTag() {
            return this.repoTag;
        }

    }

}
