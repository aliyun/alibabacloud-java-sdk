// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupsResponseBody extends TeaModel {
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
     * <p>The information about the instance groups of the application.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApplicationGroupsResponseBodyData> data;

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
     * <p>Indicates whether the instance groups of an application were obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance groups were obtained.</li>
     * <li><strong>false</strong>: The instance groups failed to be obtained.</li>
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
         * <p>The version of the container, such as Ali-Tomcat, in which an application that is developed based on High-speed Service Framework (HSF) is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3</p>
         */
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        /**
         * <p>The ID of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>_DEFAULT_GROUP</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GroupType")
        public Integer groupType;

        /**
         * <p>The URL of the image. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The version of the JDK on which the deployment package of the application depends. This parameter is not returned if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <p>The type of the deployment package. Valid values:</p>
         * <ul>
         * <li><p>If you deploy a Java application, the value of this parameter can be <strong>FatJar</strong>, <strong>War</strong>, or <strong>Image</strong>.</p>
         * </li>
         * <li><p>If you deploy a PHP application, the value of this parameter can be one of the following values:</p>
         * <ul>
         * <li><strong>PhpZip</strong></li>
         * <li><strong>IMAGE_PHP_5_4</strong></li>
         * <li><strong>IMAGE_PHP_5_4_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_5_5</strong></li>
         * <li><strong>IMAGE_PHP_5_5_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_5_6</strong></li>
         * <li><strong>IMAGE_PHP_5_6_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_0</strong></li>
         * <li><strong>IMAGE_PHP_7_0_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_1</strong></li>
         * <li><strong>IMAGE_PHP_7_1_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_2</strong></li>
         * <li><strong>IMAGE_PHP_7_2_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_3</strong></li>
         * <li><strong>IMAGE_PHP_7_3_ALPINE</strong></li>
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
         * <p>The URL of the deployment package. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PhpZip</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The version of the deployment package. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PhpZip</strong>. The value of this parameter is automatically generated only if the <strong>ImageUrl</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

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
         * <p>The version of the Tomcat container on which the deployment package depends. This parameter is not returned if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
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
