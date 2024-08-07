// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationImageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the image of the application.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationImageResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>success: If the call is successful, <strong>success</strong> is returned.</li>
     * <li>An error code: If the call fails, an error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information about the image was obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The information was obtained.</li>
     * <li><strong>false</strong>: The information failed to be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
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
        /**
         * <p>This parameter is reserved.</p>
         */
        @NameInMap("CrUrl")
        public String crUrl;

        /**
         * <p>This parameter is reserved.</p>
         */
        @NameInMap("Logo")
        public String logo;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The name of the namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The type of the repository. Only Container Registry is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ALI_HUB</p>
         */
        @NameInMap("RepoOriginType")
        public String repoOriginType;

        /**
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("RepoTag")
        public String repoTag;

        /**
         * <p>This parameter is reserved.</p>
         */
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
