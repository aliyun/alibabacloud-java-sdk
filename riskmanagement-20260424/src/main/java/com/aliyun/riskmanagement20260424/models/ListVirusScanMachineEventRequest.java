// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineEventRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OperateTaskId")
    public String operateTaskId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

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

    public ListVirusScanMachineEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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

    public ListVirusScanMachineEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVirusScanMachineEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
