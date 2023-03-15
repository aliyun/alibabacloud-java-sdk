// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorWebhookUpdateCmd extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("method")
    public String method;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    @NameInMap("url")
    public String url;

    public static MonitorWebhookUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        MonitorWebhookUpdateCmd self = new MonitorWebhookUpdateCmd();
        return TeaModel.build(map, self);
    }

    public MonitorWebhookUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorWebhookUpdateCmd setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public MonitorWebhookUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorWebhookUpdateCmd setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MonitorWebhookUpdateCmd setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
