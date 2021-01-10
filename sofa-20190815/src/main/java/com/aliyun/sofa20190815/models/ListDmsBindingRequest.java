// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDmsBindingRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Eventcode")
    public String eventcode;

    @NameInMap("Group")
    public String group;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Topic")
    public String topic;

    public static ListDmsBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDmsBindingRequest self = new ListDmsBindingRequest();
        return TeaModel.build(map, self);
    }

    public ListDmsBindingRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListDmsBindingRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public ListDmsBindingRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListDmsBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDmsBindingRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDmsBindingRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDmsBindingRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
