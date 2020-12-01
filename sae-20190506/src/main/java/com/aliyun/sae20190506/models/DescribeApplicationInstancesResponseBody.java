// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationInstancesResponseBody extends TeaModel {
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
    public DescribeApplicationInstancesResponseBodyData data;

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

    public DescribeApplicationInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationInstancesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
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

    public DescribeApplicationInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationInstancesResponseBody setData(DescribeApplicationInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationInstancesResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeApplicationInstancesResponseBodyDataInstances extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceContainerStatus")
        @Validation(required = true)
        public String instanceContainerStatus;

        @NameInMap("InstanceContainerIp")
        @Validation(required = true)
        public String instanceContainerIp;

        @NameInMap("CreateTimeStamp")
        @Validation(required = true)
        public Long createTimeStamp;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("InstanceContainerRestarts")
        @Validation(required = true)
        public Long instanceContainerRestarts;

        public static DescribeApplicationInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationInstancesResponseBodyDataInstances self = new DescribeApplicationInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceContainerStatus(String instanceContainerStatus) {
            this.instanceContainerStatus = instanceContainerStatus;
            return this;
        }
        public String getInstanceContainerStatus() {
            return this.instanceContainerStatus;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceContainerIp(String instanceContainerIp) {
            this.instanceContainerIp = instanceContainerIp;
            return this;
        }
        public String getInstanceContainerIp() {
            return this.instanceContainerIp;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeApplicationInstancesResponseBodyDataInstances setInstanceContainerRestarts(Long instanceContainerRestarts) {
            this.instanceContainerRestarts = instanceContainerRestarts;
            return this;
        }
        public Long getInstanceContainerRestarts() {
            return this.instanceContainerRestarts;
        }

    }

    public static class DescribeApplicationInstancesResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public Integer totalSize;

        @NameInMap("Instances")
        @Validation(required = true)
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstances> instances;

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

        public DescribeApplicationInstancesResponseBodyData setInstances(java.util.List<DescribeApplicationInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeApplicationInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

    }

}
