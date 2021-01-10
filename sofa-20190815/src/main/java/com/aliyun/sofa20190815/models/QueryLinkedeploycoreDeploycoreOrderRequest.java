// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreOrderRequest extends TeaModel {
    @NameInMap("EnvName")
    public String envName;

    @NameInMap("GmtEnd")
    public String gmtEnd;

    @NameInMap("GmtStart")
    public String gmtStart;

    @NameInMap("Name")
    public String name;

    @NameInMap("OrderStatus")
    public String orderStatus;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("TenantName")
    public String tenantName;

    public static QueryLinkedeploycoreDeploycoreOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreOrderRequest self = new QueryLinkedeploycoreDeploycoreOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setGmtEnd(String gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public String getGmtEnd() {
        return this.gmtEnd;
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setGmtStart(String gmtStart) {
        this.gmtStart = gmtStart;
        return this;
    }
    public String getGmtStart() {
        return this.gmtStart;
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public QueryLinkedeploycoreDeploycoreOrderRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
