// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryDmsMsgRequest extends TeaModel {
    @NameInMap("BornTimeBegin")
    public String bornTimeBegin;

    @NameInMap("BornTimeEnd")
    public String bornTimeEnd;

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

    public static BatchqueryDmsMsgRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryDmsMsgRequest self = new BatchqueryDmsMsgRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryDmsMsgRequest setBornTimeBegin(String bornTimeBegin) {
        this.bornTimeBegin = bornTimeBegin;
        return this;
    }
    public String getBornTimeBegin() {
        return this.bornTimeBegin;
    }

    public BatchqueryDmsMsgRequest setBornTimeEnd(String bornTimeEnd) {
        this.bornTimeEnd = bornTimeEnd;
        return this;
    }
    public String getBornTimeEnd() {
        return this.bornTimeEnd;
    }

    public BatchqueryDmsMsgRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public BatchqueryDmsMsgRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchqueryDmsMsgRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchqueryDmsMsgRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryDmsMsgRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
