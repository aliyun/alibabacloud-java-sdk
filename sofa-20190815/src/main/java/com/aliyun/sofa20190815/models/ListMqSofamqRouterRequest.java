// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqRouterRequest extends TeaModel {
    @NameInMap("DestinationCell")
    public String destinationCell;

    @NameInMap("DestinationInstanceId")
    public String destinationInstanceId;

    @NameInMap("DestinationTopic")
    public String destinationTopic;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SourceCell")
    public String sourceCell;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("SourceTopic")
    public String sourceTopic;

    public static ListMqSofamqRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqRouterRequest self = new ListMqSofamqRouterRequest();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqRouterRequest setDestinationCell(String destinationCell) {
        this.destinationCell = destinationCell;
        return this;
    }
    public String getDestinationCell() {
        return this.destinationCell;
    }

    public ListMqSofamqRouterRequest setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    public ListMqSofamqRouterRequest setDestinationTopic(String destinationTopic) {
        this.destinationTopic = destinationTopic;
        return this;
    }
    public String getDestinationTopic() {
        return this.destinationTopic;
    }

    public ListMqSofamqRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMqSofamqRouterRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListMqSofamqRouterRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMqSofamqRouterRequest setSourceCell(String sourceCell) {
        this.sourceCell = sourceCell;
        return this;
    }
    public String getSourceCell() {
        return this.sourceCell;
    }

    public ListMqSofamqRouterRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ListMqSofamqRouterRequest setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
        return this;
    }
    public String getSourceTopic() {
        return this.sourceTopic;
    }

}
