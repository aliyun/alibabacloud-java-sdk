// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeApplicationImageResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationImageResponseBody self = new DescribeApplicationImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationImageResponseBody setData(DescribeApplicationImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationImageResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationImageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationImageResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationImageResponseBodyData extends TeaModel {
        @NameInMap("CrUrl")
        public String crUrl;

        @NameInMap("Logo")
        public String logo;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        @NameInMap("RepoOriginType")
        public String repoOriginType;

        @NameInMap("RepoTag")
        public String repoTag;

        @NameInMap("RepoType")
        public String repoType;

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

        public DescribeApplicationImageResponseBodyData setRepoTag(String repoTag) {
            this.repoTag = repoTag;
            return this;
        }
        public String getRepoTag() {
            return this.repoTag;
        }

        public DescribeApplicationImageResponseBodyData setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

    }

}
