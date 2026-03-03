// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LaneMqGroupInfo extends TeaModel {
    @NameInMap("allowClean")
    public Boolean allowClean;

    @NameInMap("laneId")
    public Long laneId;

    @NameInMap("laneName")
    public String laneName;

    @NameInMap("mqGroups")
    public MqGroup mqGroups;

    public static LaneMqGroupInfo build(java.util.Map<String, ?> map) throws Exception {
        LaneMqGroupInfo self = new LaneMqGroupInfo();
        return TeaModel.build(map, self);
    }

    public LaneMqGroupInfo setAllowClean(Boolean allowClean) {
        this.allowClean = allowClean;
        return this;
    }
    public Boolean getAllowClean() {
        return this.allowClean;
    }

    public LaneMqGroupInfo setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

    public LaneMqGroupInfo setLaneName(String laneName) {
        this.laneName = laneName;
        return this;
    }
    public String getLaneName() {
        return this.laneName;
    }

    public LaneMqGroupInfo setMqGroups(MqGroup mqGroups) {
        this.mqGroups = mqGroups;
        return this;
    }
    public MqGroup getMqGroups() {
        return this.mqGroups;
    }

}
