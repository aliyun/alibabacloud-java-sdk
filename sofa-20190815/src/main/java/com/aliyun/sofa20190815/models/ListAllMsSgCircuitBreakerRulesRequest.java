// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAllMsSgCircuitBreakerRulesRequest extends TeaModel {
    @NameInMap("AppNames")
    public String appNames;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Orders")
    public String orders;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Start")
    public Long start;

    public static ListAllMsSgCircuitBreakerRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllMsSgCircuitBreakerRulesRequest self = new ListAllMsSgCircuitBreakerRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAllMsSgCircuitBreakerRulesRequest setAppNames(String appNames) {
        this.appNames = appNames;
        return this;
    }
    public String getAppNames() {
        return this.appNames;
    }

    public ListAllMsSgCircuitBreakerRulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListAllMsSgCircuitBreakerRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAllMsSgCircuitBreakerRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAllMsSgCircuitBreakerRulesRequest setOrders(String orders) {
        this.orders = orders;
        return this;
    }
    public String getOrders() {
        return this.orders;
    }

    public ListAllMsSgCircuitBreakerRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAllMsSgCircuitBreakerRulesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
