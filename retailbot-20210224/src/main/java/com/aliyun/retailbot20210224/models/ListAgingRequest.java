// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListAgingRequest extends TeaModel {
    @NameInMap("AfterStartTime")
    public String afterStartTime;

    @NameInMap("AgingId")
    public String agingId;

    @NameInMap("AgingName")
    public String agingName;

    @NameInMap("BeforeEndTime")
    public String beforeEndTime;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("Type")
    public String type;

    public static ListAgingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgingRequest self = new ListAgingRequest();
        return TeaModel.build(map, self);
    }

    public ListAgingRequest setAfterStartTime(String afterStartTime) {
        this.afterStartTime = afterStartTime;
        return this;
    }
    public String getAfterStartTime() {
        return this.afterStartTime;
    }

    public ListAgingRequest setAgingId(String agingId) {
        this.agingId = agingId;
        return this;
    }
    public String getAgingId() {
        return this.agingId;
    }

    public ListAgingRequest setAgingName(String agingName) {
        this.agingName = agingName;
        return this;
    }
    public String getAgingName() {
        return this.agingName;
    }

    public ListAgingRequest setBeforeEndTime(String beforeEndTime) {
        this.beforeEndTime = beforeEndTime;
        return this;
    }
    public String getBeforeEndTime() {
        return this.beforeEndTime;
    }

    public ListAgingRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAgingRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListAgingRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgingRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public ListAgingRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
