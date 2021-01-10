// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdsJobRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("Cron")
    public String cron;

    @NameInMap("Des")
    public String des;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ShardingCount")
    public Integer shardingCount;

    @NameInMap("Status")
    public String status;

    @NameInMap("CustomParams")
    public java.util.List<String> customParams;

    public static AddMSDdsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdsJobRequest self = new AddMSDdsJobRequest();
        return TeaModel.build(map, self);
    }

    public AddMSDdsJobRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddMSDdsJobRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public AddMSDdsJobRequest setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

    public AddMSDdsJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMSDdsJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMSDdsJobRequest setShardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
        return this;
    }
    public Integer getShardingCount() {
        return this.shardingCount;
    }

    public AddMSDdsJobRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddMSDdsJobRequest setCustomParams(java.util.List<String> customParams) {
        this.customParams = customParams;
        return this;
    }
    public java.util.List<String> getCustomParams() {
        return this.customParams;
    }

}
