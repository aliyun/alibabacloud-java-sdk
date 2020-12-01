// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<DescribeApplicationGroupsResponseBodyData> data;

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

    public DescribeApplicationGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationGroupsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
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

    public DescribeApplicationGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationGroupsResponseBody setData(java.util.List<DescribeApplicationGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApplicationGroupsResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeApplicationGroupsResponseBodyData extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("GroupType")
        @Validation(required = true)
        public Integer groupType;

        @NameInMap("PackageType")
        @Validation(required = true)
        public String packageType;

        @NameInMap("PackageVersion")
        @Validation(required = true)
        public String packageVersion;

        @NameInMap("ImageUrl")
        @Validation(required = true)
        public String imageUrl;

        @NameInMap("PackageUrl")
        @Validation(required = true)
        public String packageUrl;

        @NameInMap("Jdk")
        @Validation(required = true)
        public String jdk;

        @NameInMap("WebContainer")
        @Validation(required = true)
        public String webContainer;

        @NameInMap("EdasContainerVersion")
        @Validation(required = true)
        public String edasContainerVersion;

        @NameInMap("Replicas")
        @Validation(required = true)
        public Integer replicas;

        @NameInMap("RunningInstances")
        @Validation(required = true)
        public Integer runningInstances;

        public static DescribeApplicationGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationGroupsResponseBodyData self = new DescribeApplicationGroupsResponseBodyData();
            return TeaModel.build(map, self);
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

        public DescribeApplicationGroupsResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeApplicationGroupsResponseBodyData setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public DescribeApplicationGroupsResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeApplicationGroupsResponseBodyData setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public DescribeApplicationGroupsResponseBodyData setJdk(String jdk) {
            this.jdk = jdk;
            return this;
        }
        public String getJdk() {
            return this.jdk;
        }

        public DescribeApplicationGroupsResponseBodyData setWebContainer(String webContainer) {
            this.webContainer = webContainer;
            return this;
        }
        public String getWebContainer() {
            return this.webContainer;
        }

        public DescribeApplicationGroupsResponseBodyData setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
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

    }

}
