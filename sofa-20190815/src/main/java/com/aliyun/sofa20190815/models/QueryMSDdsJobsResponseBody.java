// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdsJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Jobs")
    public java.util.List<QueryMSDdsJobsResponseBodyJobs> jobs;

    public static QueryMSDdsJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdsJobsResponseBody self = new QueryMSDdsJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSDdsJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSDdsJobsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMSDdsJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMSDdsJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryMSDdsJobsResponseBody setJobs(java.util.List<QueryMSDdsJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<QueryMSDdsJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public static class QueryMSDdsJobsResponseBodyJobs extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Cron")
        public String cron;

        @NameInMap("Des")
        public String des;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShardingCount")
        public Integer shardingCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("CustomParams")
        public java.util.List<String> customParams;

        public static QueryMSDdsJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            QueryMSDdsJobsResponseBodyJobs self = new QueryMSDdsJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public QueryMSDdsJobsResponseBodyJobs setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryMSDdsJobsResponseBodyJobs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMSDdsJobsResponseBodyJobs setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public QueryMSDdsJobsResponseBodyJobs setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public QueryMSDdsJobsResponseBodyJobs setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryMSDdsJobsResponseBodyJobs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMSDdsJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMSDdsJobsResponseBodyJobs setShardingCount(Integer shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public Integer getShardingCount() {
            return this.shardingCount;
        }

        public QueryMSDdsJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryMSDdsJobsResponseBodyJobs setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryMSDdsJobsResponseBodyJobs setCustomParams(java.util.List<String> customParams) {
            this.customParams = customParams;
            return this;
        }
        public java.util.List<String> getCustomParams() {
            return this.customParams;
        }

    }

}
