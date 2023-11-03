// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineEventRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("OperateTaskId")
    public String operateTaskId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Uuid")
    public String uuid;

    public static ListVirusScanMachineEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanMachineEventRequest self = new ListVirusScanMachineEventRequest();
        return TeaModel.build(map, self);
    }

    public ListVirusScanMachineEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListVirusScanMachineEventRequest setOperateTaskId(String operateTaskId) {
        this.operateTaskId = operateTaskId;
        return this;
    }
    public String getOperateTaskId() {
        return this.operateTaskId;
    }

    public ListVirusScanMachineEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVirusScanMachineEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
