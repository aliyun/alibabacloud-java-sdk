// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDmsMsgTypeRequest extends TeaModel {
    @NameInMap("Eventcode")
    public String eventcode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Topic")
    public String topic;

    public static ListDmsMsgTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDmsMsgTypeRequest self = new ListDmsMsgTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListDmsMsgTypeRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public ListDmsMsgTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDmsMsgTypeRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDmsMsgTypeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDmsMsgTypeRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
