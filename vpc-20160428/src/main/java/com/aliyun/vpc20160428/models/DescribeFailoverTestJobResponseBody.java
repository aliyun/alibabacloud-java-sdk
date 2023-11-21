// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFailoverTestJobResponseBody extends TeaModel {
    @NameInMap("FailoverTestJobModel")
    public DescribeFailoverTestJobResponseBodyFailoverTestJobModel failoverTestJobModel;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFailoverTestJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFailoverTestJobResponseBody self = new DescribeFailoverTestJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFailoverTestJobResponseBody setFailoverTestJobModel(DescribeFailoverTestJobResponseBodyFailoverTestJobModel failoverTestJobModel) {
        this.failoverTestJobModel = failoverTestJobModel;
        return this;
    }
    public DescribeFailoverTestJobResponseBodyFailoverTestJobModel getFailoverTestJobModel() {
        return this.failoverTestJobModel;
    }

    public DescribeFailoverTestJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFailoverTestJobResponseBodyFailoverTestJobModel extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("JobDuration")
        public String jobDuration;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceId")
        public java.util.List<String> resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StopTime")
        public String stopTime;

        public static DescribeFailoverTestJobResponseBodyFailoverTestJobModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeFailoverTestJobResponseBodyFailoverTestJobModel self = new DescribeFailoverTestJobResponseBodyFailoverTestJobModel();
            return TeaModel.build(map, self);
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setJobDuration(String jobDuration) {
            this.jobDuration = jobDuration;
            return this;
        }
        public String getJobDuration() {
            return this.jobDuration;
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setResourceId(java.util.List<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public java.util.List<String> getResourceId() {
            return this.resourceId;
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFailoverTestJobResponseBodyFailoverTestJobModel setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

}
