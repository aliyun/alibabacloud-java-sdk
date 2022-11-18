// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListProbeTaskRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProbeTaskId")
    public String probeTaskId;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagId")
    public String sagId;

    @NameInMap("SagName")
    public String sagName;

    @NameInMap("Sn")
    public String sn;

    @NameInMap("TaskName")
    public String taskName;

    public static ListProbeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProbeTaskRequest self = new ListProbeTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListProbeTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProbeTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProbeTaskRequest setProbeTaskId(String probeTaskId) {
        this.probeTaskId = probeTaskId;
        return this;
    }
    public String getProbeTaskId() {
        return this.probeTaskId;
    }

    public ListProbeTaskRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ListProbeTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListProbeTaskRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public ListProbeTaskRequest setSagName(String sagName) {
        this.sagName = sagName;
        return this;
    }
    public String getSagName() {
        return this.sagName;
    }

    public ListProbeTaskRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public ListProbeTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
