// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqWarnHistoryRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    /**
     * <p>Group ID</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("WarnId")
    public Long warnId;

    public static ListMqSofamqWarnHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqWarnHistoryRequest self = new ListMqSofamqWarnHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqWarnHistoryRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ListMqSofamqWarnHistoryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListMqSofamqWarnHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMqSofamqWarnHistoryRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListMqSofamqWarnHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMqSofamqWarnHistoryRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ListMqSofamqWarnHistoryRequest setWarnId(Long warnId) {
        this.warnId = warnId;
        return this;
    }
    public Long getWarnId() {
        return this.warnId;
    }

}
