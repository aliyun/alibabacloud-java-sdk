// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or the POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request is redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: The request is invalid.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A list of application groups.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApplicationGroupsResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>error codes</strong> section.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
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
     * <p>Indicates whether the application groups were successfully retrieved. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The application groups were retrieved.</p>
     * </li>
     * <li><p><strong>false</strong>: The application groups were not retrieved.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationGroupsResponseBody self = new DescribeApplicationGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationGroupsResponseBody setData(java.util.List<DescribeApplicationGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApplicationGroupsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApplicationGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationGroupsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationGroupsResponseBodyData extends TeaModel {
        /**
         * <p>The version of the application runtime environment in the High-Speed Service Framework (HSF), such as an Ali-Tomcat container.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3</p>
         */
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>_DEFAULT_GROUP</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GroupType")
        public Integer groupType;

        /**
         * <p>The image URL. This parameter is required when <strong>package type</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The JDK version required by the deployment package. This parameter is not supported when <strong>package type</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <p>The type of the deployment package. Valid values:</p>
         * <ul>
         * <li><p>For Java applications, the supported types are <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</p>
         * </li>
         * <li><p>For PHP applications, the supported types are:</p>
         * <ul>
         * <li><p><strong>PhpZip</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_4</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_4_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_5</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_5_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_6</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_6_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_0</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_0_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_1</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_1_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_2</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_2_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_3</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_3_ALPINE</strong></p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The URL of the deployment package. This parameter is required when <strong>package type</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PhpZip</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The deployment package version. This parameter is required when <strong>package type</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PhpZip</strong>. This parameter is automatically generated if you deploy the application by using an <strong>image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>The ID of the deployment package version.</p>
         */
        @NameInMap("PackageVersionId")
        public String packageVersionId;

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        /**
         * <p>The number of running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>The Tomcat container version required by the deployment package. This parameter is not supported when <strong>package type</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Apache Tomcat 7</p>
         */
        @NameInMap("WebContainer")
        public String webContainer;

        public static DescribeApplicationGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationGroupsResponseBodyData self = new DescribeApplicationGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationGroupsResponseBodyData setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        public DescribeApplicationGroupsResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApplicationGroupsResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApplicationGroupsResponseBodyData setGroupType(Integer groupType) {
            this.groupType = groupType;
            return this;
        }
        public Integer getGroupType() {
            return this.groupType;
        }

        public DescribeApplicationGroupsResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeApplicationGroupsResponseBodyData setJdk(String jdk) {
            this.jdk = jdk;
            return this;
        }
        public String getJdk() {
            return this.jdk;
        }

        public DescribeApplicationGroupsResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeApplicationGroupsResponseBodyData setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public DescribeApplicationGroupsResponseBodyData setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public DescribeApplicationGroupsResponseBodyData setPackageVersionId(String packageVersionId) {
            this.packageVersionId = packageVersionId;
            return this;
        }
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        public DescribeApplicationGroupsResponseBodyData setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

        public DescribeApplicationGroupsResponseBodyData setRunningInstances(Integer runningInstances) {
            this.runningInstances = runningInstances;
            return this;
        }
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        public DescribeApplicationGroupsResponseBodyData setWebContainer(String webContainer) {
            this.webContainer = webContainer;
            return this;
        }
        public String getWebContainer() {
            return this.webContainer;
        }

    }

}
