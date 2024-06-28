// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFailoverTestJobsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("FailoverTestJobList")
    public java.util.List<DescribeFailoverTestJobsResponseBodyFailoverTestJobList> failoverTestJobList;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeFailoverTestJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFailoverTestJobsResponseBody self = new DescribeFailoverTestJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFailoverTestJobsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeFailoverTestJobsResponseBody setFailoverTestJobList(java.util.List<DescribeFailoverTestJobsResponseBodyFailoverTestJobList> failoverTestJobList) {
        this.failoverTestJobList = failoverTestJobList;
        return this;
    }
    public java.util.List<DescribeFailoverTestJobsResponseBodyFailoverTestJobList> getFailoverTestJobList() {
        return this.failoverTestJobList;
    }

    public DescribeFailoverTestJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFailoverTestJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFailoverTestJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFailoverTestJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFailoverTestJobsResponseBodyFailoverTestJobList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("JobDuration")
        public String jobDuration;

        /**
         * <strong>example:</strong>
         * <p>ftj-xxxxxxxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>StartNow</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceId")
        public java.util.List<String> resourceId;

        /**
         * <strong>example:</strong>
         * <p>PHYSICALCONNECTION</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>2023-11-21T14:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2023-11-21T15:00:00Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        public static DescribeFailoverTestJobsResponseBodyFailoverTestJobList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFailoverTestJobsResponseBodyFailoverTestJobList self = new DescribeFailoverTestJobsResponseBodyFailoverTestJobList();
            return TeaModel.build(map, self);
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setJobDuration(String jobDuration) {
            this.jobDuration = jobDuration;
            return this;
        }
        public String getJobDuration() {
            return this.jobDuration;
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setResourceId(java.util.List<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public java.util.List<String> getResourceId() {
            return this.resourceId;
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFailoverTestJobsResponseBodyFailoverTestJobList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

}
