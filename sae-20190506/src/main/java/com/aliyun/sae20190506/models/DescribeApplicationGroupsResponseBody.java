// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeApplicationGroupsResponseBodyData> data;

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
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public Integer groupType;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("Jdk")
        public String jdk;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("PackageUrl")
        public String packageUrl;

        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("Replicas")
        public Integer replicas;

        @NameInMap("RunningInstances")
        public Integer runningInstances;

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
