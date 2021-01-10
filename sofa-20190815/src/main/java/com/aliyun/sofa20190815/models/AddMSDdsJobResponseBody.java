// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdsJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Job")
    public AddMSDdsJobResponseBodyJob job;

    public static AddMSDdsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdsJobResponseBody self = new AddMSDdsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMSDdsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMSDdsJobResponseBody setJob(AddMSDdsJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public AddMSDdsJobResponseBodyJob getJob() {
        return this.job;
    }

    public static class AddMSDdsJobResponseBodyJob extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("App")
        public String app;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Cron")
        public String cron;

        @NameInMap("CustomParams")
        public java.util.List<String> customParams;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ShardingCount")
        public Integer shardingCount;

        @NameInMap("Des")
        public String des;

        public static AddMSDdsJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            AddMSDdsJobResponseBodyJob self = new AddMSDdsJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public AddMSDdsJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AddMSDdsJobResponseBodyJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public AddMSDdsJobResponseBodyJob setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public AddMSDdsJobResponseBodyJob setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public AddMSDdsJobResponseBodyJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddMSDdsJobResponseBodyJob setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public AddMSDdsJobResponseBodyJob setCustomParams(java.util.List<String> customParams) {
            this.customParams = customParams;
            return this;
        }
        public java.util.List<String> getCustomParams() {
            return this.customParams;
        }

        public AddMSDdsJobResponseBodyJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddMSDdsJobResponseBodyJob setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public AddMSDdsJobResponseBodyJob setShardingCount(Integer shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public Integer getShardingCount() {
            return this.shardingCount;
        }

        public AddMSDdsJobResponseBodyJob setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

    }

}
