// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMonitorNotifyObjectsRequest extends TeaModel {
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public Integer type;

    @NameInMap("webhookType")
    public String webhookType;

    public static ListMonitorNotifyObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorNotifyObjectsRequest self = new ListMonitorNotifyObjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListMonitorNotifyObjectsRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ListMonitorNotifyObjectsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMonitorNotifyObjectsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ListMonitorNotifyObjectsRequest setWebhookType(String webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    public String getWebhookType() {
        return this.webhookType;
    }

}
