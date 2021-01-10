// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdsJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Job")
    public UpdateMSDdsJobResponseBodyJob job;

    public static UpdateMSDdsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdsJobResponseBody self = new UpdateMSDdsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMSDdsJobResponseBody setJob(UpdateMSDdsJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public UpdateMSDdsJobResponseBodyJob getJob() {
        return this.job;
    }

    public static class UpdateMSDdsJobResponseBodyJob extends TeaModel {
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

        public static UpdateMSDdsJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            UpdateMSDdsJobResponseBodyJob self = new UpdateMSDdsJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public UpdateMSDdsJobResponseBodyJob setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public UpdateMSDdsJobResponseBodyJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public UpdateMSDdsJobResponseBodyJob setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateMSDdsJobResponseBodyJob setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public UpdateMSDdsJobResponseBodyJob setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public UpdateMSDdsJobResponseBodyJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateMSDdsJobResponseBodyJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMSDdsJobResponseBodyJob setShardingCount(Integer shardingCount) {
            this.shardingCount = shardingCount;
            return this;
        }
        public Integer getShardingCount() {
            return this.shardingCount;
        }

        public UpdateMSDdsJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateMSDdsJobResponseBodyJob setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateMSDdsJobResponseBodyJob setCustomParams(java.util.List<String> customParams) {
            this.customParams = customParams;
            return this;
        }
        public java.util.List<String> getCustomParams() {
            return this.customParams;
        }

    }

}
