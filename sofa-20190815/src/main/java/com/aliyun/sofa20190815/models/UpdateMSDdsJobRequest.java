// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdsJobRequest extends TeaModel {
    @NameInMap("Cron")
    public String cron;

    @NameInMap("CustomParams")
    public java.util.List<String> customParams;

    @NameInMap("Des")
    public String des;

    @NameInMap("Id")
    public Integer id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ShardingCount")
    public Integer shardingCount;

    public static UpdateMSDdsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdsJobRequest self = new UpdateMSDdsJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdsJobRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public UpdateMSDdsJobRequest setCustomParams(java.util.List<String> customParams) {
        this.customParams = customParams;
        return this;
    }
    public java.util.List<String> getCustomParams() {
        return this.customParams;
    }

    public UpdateMSDdsJobRequest setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

    public UpdateMSDdsJobRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public UpdateMSDdsJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMSDdsJobRequest setShardingCount(Integer shardingCount) {
        this.shardingCount = shardingCount;
        return this;
    }
    public Integer getShardingCount() {
        return this.shardingCount;
    }

}
