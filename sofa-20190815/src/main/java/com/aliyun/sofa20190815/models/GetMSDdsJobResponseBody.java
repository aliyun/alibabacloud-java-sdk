// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMSDdsJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Job")
    public GetMSDdsJobResponseBodyJob job;

    public static GetMSDdsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMSDdsJobResponseBody self = new GetMSDdsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMSDdsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMSDdsJobResponseBody setJob(GetMSDdsJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetMSDdsJobResponseBodyJob getJob() {
        return this.job;
    }

    public static class GetMSDdsJobResponseBodyJob extends TeaModel {
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

        public static GetMSDdsJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetMSDdsJobResponseBodyJob self = new GetMSDdsJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetMSDdsJobResponseBodyJob setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public GetMSDdsJobResponseBodyJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetMSDdsJobResponseBodyJob setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetMSDdsJobResponseBodyJob setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public GetMSDdsJobResponseBodyJob setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetMSDdsJobResponseBodyJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMSDdsJobResponseBodyJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMSDdsJobResponseBodyJob setShardingCount(Integer shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public Integer getShardingCount() {
            return this.shardingCount;
        }

        public GetMSDdsJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMSDdsJobResponseBodyJob setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetMSDdsJobResponseBodyJob setCustomParams(java.util.List<String> customParams) {
            this.customParams = customParams;
            return this;
        }
        public java.util.List<String> getCustomParams() {
            return this.customParams;
        }

    }

}
