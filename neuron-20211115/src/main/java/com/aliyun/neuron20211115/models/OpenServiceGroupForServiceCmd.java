// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class OpenServiceGroupForServiceCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("laneId")
    public Long laneId;

    @NameInMap("serviceIds")
    public java.util.List<Long> serviceIds;

    public static OpenServiceGroupForServiceCmd build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceGroupForServiceCmd self = new OpenServiceGroupForServiceCmd();
        return TeaModel.build(map, self);
    }

    public OpenServiceGroupForServiceCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public OpenServiceGroupForServiceCmd setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

    public OpenServiceGroupForServiceCmd setServiceIds(java.util.List<Long> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<Long> getServiceIds() {
        return this.serviceIds;
    }

}
