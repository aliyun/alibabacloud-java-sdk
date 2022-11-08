// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class EnableDataReflowRequest extends TeaModel {
    @NameInMap("DataReflowOssPath")
    public String dataReflowOssPath;

    @NameInMap("DataReflowRate")
    public Long dataReflowRate;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static EnableDataReflowRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDataReflowRequest self = new EnableDataReflowRequest();
        return TeaModel.build(map, self);
    }

    public EnableDataReflowRequest setDataReflowOssPath(String dataReflowOssPath) {
        this.dataReflowOssPath = dataReflowOssPath;
        return this;
    }
    public String getDataReflowOssPath() {
        return this.dataReflowOssPath;
    }

    public EnableDataReflowRequest setDataReflowRate(Long dataReflowRate) {
        this.dataReflowRate = dataReflowRate;
        return this;
    }
    public Long getDataReflowRate() {
        return this.dataReflowRate;
    }

    public EnableDataReflowRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
