// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFailoverTestJobResponseBody extends TeaModel {
    /**
     * <p>The failover test.</p>
     */
    @NameInMap("FailoverTestJobModel")
    public DescribeFailoverTestJobResponseBodyFailoverTestJobModel failoverTestJobModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C44F62BE-9CE7-4277-B117-69243F3988BF</p>
     */
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
        /**
         * <p>The description of the failover test.</p>
         * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration of the failover test. Unit: minutes. Valid values: <strong>1 to 4320</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("JobDuration")
        public String jobDuration;

        /**
         * <p>The ID of the failover test.</p>
         * 
         * <strong>example:</strong>
         * <p>ftj-xxxxxxxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Indicates whether the failover test is performed immediately. Valid values:</p>
         * <ul>
         * <li><strong>StartNow</strong></li>
         * <li><strong>StartLater</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StartNow</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The name of the failover test.</p>
         * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The IDs of failover test resources.</p>
         */
        @NameInMap("ResourceId")
        public java.util.List<String> resourceId;

        /**
         * <p>The type of failover test resource. Only <strong>PHYSICALCONNECTION</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>PHYSICALCONNECTION</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The start time of the failover test. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T14:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the failover test. Valid values:</p>
         * <ul>
         * <li><strong>Init</strong></li>
         * <li><strong>Starting</strong></li>
         * <li><strong>Testing</strong></li>
         * <li><strong>Stopping</strong></li>
         * <li><strong>Stopped</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The end time of the failover test. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T15:00:00Z</p>
         */
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
