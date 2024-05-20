// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the instance groups of the application.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApplicationGroupsResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information about instance groups of an application was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the information was obtained.</p>
     * <p>*   **false**: indicates that the information could not be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
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
         * <p>The version of the container, such as Ali-Tomcat, in which a High-speed Service Framework (HSF) application runs.</p>
         */
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        /**
         * <p>The ID of the group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the group.</p>
         */
        @NameInMap("GroupType")
        public Integer groupType;

        /**
         * <p>The address of the image. This parameter is required when the **PackageType** parameter is set to **Image**.</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The version of the Java development kit (JDK) on which the deployment package of the application depends. This parameter is invalid when the **PackageType** parameter is set to **Image**.</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <p>The type of the application deployment package. Valid values:</p>
         * <br>
         * <p>*   When you use a Java package, set this value to **FatJar**, **War**, or **Image**.</p>
         * <br>
         * <p>*   When you use a PHP package, the following values are valid:</p>
         * <br>
         * <p>    *   **PhpZip**</p>
         * <p>    *   **IMAGE_PHP_5_4**</p>
         * <p>    *   **IMAGE_PHP_5_4_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_5_5**</p>
         * <p>    *   **IMAGE_PHP_5_5_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_5_6**</p>
         * <p>    *   **IMAGE_PHP_5_6_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_7_0**</p>
         * <p>    *   **IMAGE_PHP_7_0_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_7_1**</p>
         * <p>    *   **IMAGE_PHP_7_1_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_7_2**</p>
         * <p>    *   **IMAGE_PHP_7_2_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_7_3**</p>
         * <p>    *   **IMAGE_PHP_7_3_ALPINE**</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The address of the deployment package. This parameter is required when the **PackageType** parameter is set to **FatJar**, **War**, or **PhpZip**.</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The version of the deployment package. This parameter is required when the **PackageType** parameter is set to **FatJar**, **War**, or **PhpZip**. The parameter value will be automatically generated when you use an image to deploy the application and specify the **ImageUrl** parameter.</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>The total number of instances.</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        /**
         * <p>The number of running instances.</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>The version of the Apache Tomcat container on which the deployment package of the application depends. This parameter is invalid when the **PackageType** parameter is set to **Image**.</p>
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
