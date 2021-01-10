// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDtxAppActionRequest extends TeaModel {
    @NameInMap("ActionName")
    public String actionName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ClassName")
    public String className;

    @NameInMap("CommitMethodName")
    public String commitMethodName;

    @NameInMap("CommitMethodParamsType")
    public Long commitMethodParamsType;

    @NameInMap("ElasticKey")
    public String elasticKey;

    @NameInMap("ElasticRouteRule")
    public String elasticRouteRule;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsZoneRoute")
    public Boolean isZoneRoute;

    @NameInMap("RollbackMethodName")
    public String rollbackMethodName;

    @NameInMap("RollbackMethodParamsType")
    public Long rollbackMethodParamsType;

    @NameInMap("TestUrl")
    public String testUrl;

    @NameInMap("UniqueId")
    public String uniqueId;

    @NameInMap("WsTr")
    public String wsTr;

    public static CreateDtxAppActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDtxAppActionRequest self = new CreateDtxAppActionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDtxAppActionRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public CreateDtxAppActionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDtxAppActionRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public CreateDtxAppActionRequest setCommitMethodName(String commitMethodName) {
        this.commitMethodName = commitMethodName;
        return this;
    }
    public String getCommitMethodName() {
        return this.commitMethodName;
    }

    public CreateDtxAppActionRequest setCommitMethodParamsType(Long commitMethodParamsType) {
        this.commitMethodParamsType = commitMethodParamsType;
        return this;
    }
    public Long getCommitMethodParamsType() {
        return this.commitMethodParamsType;
    }

    public CreateDtxAppActionRequest setElasticKey(String elasticKey) {
        this.elasticKey = elasticKey;
        return this;
    }
    public String getElasticKey() {
        return this.elasticKey;
    }

    public CreateDtxAppActionRequest setElasticRouteRule(String elasticRouteRule) {
        this.elasticRouteRule = elasticRouteRule;
        return this;
    }
    public String getElasticRouteRule() {
        return this.elasticRouteRule;
    }

    public CreateDtxAppActionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDtxAppActionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDtxAppActionRequest setIsZoneRoute(Boolean isZoneRoute) {
        this.isZoneRoute = isZoneRoute;
        return this;
    }
    public Boolean getIsZoneRoute() {
        return this.isZoneRoute;
    }

    public CreateDtxAppActionRequest setRollbackMethodName(String rollbackMethodName) {
        this.rollbackMethodName = rollbackMethodName;
        return this;
    }
    public String getRollbackMethodName() {
        return this.rollbackMethodName;
    }

    public CreateDtxAppActionRequest setRollbackMethodParamsType(Long rollbackMethodParamsType) {
        this.rollbackMethodParamsType = rollbackMethodParamsType;
        return this;
    }
    public Long getRollbackMethodParamsType() {
        return this.rollbackMethodParamsType;
    }

    public CreateDtxAppActionRequest setTestUrl(String testUrl) {
        this.testUrl = testUrl;
        return this;
    }
    public String getTestUrl() {
        return this.testUrl;
    }

    public CreateDtxAppActionRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CreateDtxAppActionRequest setWsTr(String wsTr) {
        this.wsTr = wsTr;
        return this;
    }
    public String getWsTr() {
        return this.wsTr;
    }

}
