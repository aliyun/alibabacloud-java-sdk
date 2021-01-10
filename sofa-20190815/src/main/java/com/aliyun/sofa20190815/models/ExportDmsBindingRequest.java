// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportDmsBindingRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Eventcode")
    public String eventcode;

    @NameInMap("Groupid")
    public String groupid;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Topic")
    public String topic;

    public static ExportDmsBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDmsBindingRequest self = new ExportDmsBindingRequest();
        return TeaModel.build(map, self);
    }

    public ExportDmsBindingRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExportDmsBindingRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public ExportDmsBindingRequest setGroupid(String groupid) {
        this.groupid = groupid;
        return this;
    }
    public String getGroupid() {
        return this.groupid;
    }

    public ExportDmsBindingRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExportDmsBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportDmsBindingRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
