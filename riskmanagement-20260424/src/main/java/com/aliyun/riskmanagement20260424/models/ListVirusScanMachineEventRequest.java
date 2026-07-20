// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>28486737</p>
     */
    @NameInMap("OperateTaskId")
    public String operateTaskId;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>hdm_5349d5323c649e91a41784e9e1733e1e</p>
     */
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
