// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ABTestExperiment extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("online")
    public Boolean online;

    @NameInMap("params")
    public java.util.Map<String, String> params;

    @NameInMap("serialNumber")
    public Integer serialNumber;

    @NameInMap("traffic")
    public Integer traffic;

    public static ABTestExperiment build(java.util.Map<String, ?> map) throws Exception {
        ABTestExperiment self = new ABTestExperiment();
        return TeaModel.build(map, self);
    }

    public ABTestExperiment setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ABTestExperiment setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public ABTestExperiment setParams(java.util.Map<String, String> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, String> getParams() {
        return this.params;
    }

    public ABTestExperiment setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    public ABTestExperiment setTraffic(Integer traffic) {
        this.traffic = traffic;
        return this;
    }
    public Integer getTraffic() {
        return this.traffic;
    }

}
