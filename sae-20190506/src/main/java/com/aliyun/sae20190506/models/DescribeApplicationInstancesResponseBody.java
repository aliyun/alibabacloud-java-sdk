// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeApplicationInstancesResponseBodyData data;

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

    public static DescribeApplicationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationInstancesResponseBody self = new DescribeApplicationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationInstancesResponseBody setData(DescribeApplicationInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationInstancesResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationInstancesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationInstancesResponseBodyDataInstances extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        @NameInMap("Eip")
        public String eip;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("InstanceContainerIp")
        public String instanceContainerIp;

        @NameInMap("InstanceContainerRestarts")
        public Long instanceContainerRestarts;

        @NameInMap("InstanceContainerStatus")
        public String instanceContainerStatus;

        @NameInMap("InstanceHealthStatus")
        public String instanceHealthStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeApplicationInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationInstancesResponseBodyDataInstances self = new DescribeApplicationInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceContainerIp(String instanceContainerIp) {
            this.instanceContainerIp = instanceContainerIp;
            return this;
        }
        public String getInstanceContainerIp() {
            return this.instanceContainerIp;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceContainerRestarts(Long instanceContainerRestarts) {
            this.instanceContainerRestarts = instanceContainerRestarts;
            return this;
        }
        public Long getInstanceContainerRestarts() {
            return this.instanceContainerRestarts;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceContainerStatus(String instanceContainerStatus) {
            this.instanceContainerStatus = instanceContainerStatus;
            return this;
        }
        public String getInstanceContainerStatus() {
            return this.instanceContainerStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceHealthStatus(String instanceHealthStatus) {
            this.instanceHealthStatus = instanceHealthStatus;
            return this;
        }
        public String getInstanceHealthStatus() {
            return this.instanceHealthStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeApplicationInstancesResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Instances")
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstances> instances;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static DescribeApplicationInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationInstancesResponseBodyData self = new DescribeApplicationInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationInstancesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeApplicationInstancesResponseBodyData setInstances(java.util.List<DescribeApplicationInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public DescribeApplicationInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeApplicationInstancesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
