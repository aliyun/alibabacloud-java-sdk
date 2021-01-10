// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXRecoveryParticipatorRequest extends TeaModel {
    @NameInMap("ActionMode")
    public Long actionMode;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Actions")
    public java.util.List<CreateDTXRecoveryParticipatorRequestActions> actions;

    public static CreateDTXRecoveryParticipatorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXRecoveryParticipatorRequest self = new CreateDTXRecoveryParticipatorRequest();
        return TeaModel.build(map, self);
    }

    public CreateDTXRecoveryParticipatorRequest setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public CreateDTXRecoveryParticipatorRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateDTXRecoveryParticipatorRequest setActions(java.util.List<CreateDTXRecoveryParticipatorRequestActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<CreateDTXRecoveryParticipatorRequestActions> getActions() {
        return this.actions;
    }

    public static class CreateDTXRecoveryParticipatorRequestActions extends TeaModel {
        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ElasticKey")
        public String elasticKey;

        @NameInMap("RollbackMethodName")
        public String rollbackMethodName;

        @NameInMap("IsZoneRoute")
        public Boolean isZoneRoute;

        @NameInMap("CommitMethodName")
        public String commitMethodName;

        @NameInMap("TestUrl")
        public String testUrl;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("RollbackMethodParamsType")
        public Long rollbackMethodParamsType;

        @NameInMap("CommitMethodParamsType")
        public Long commitMethodParamsType;

        @NameInMap("WsTr")
        public String wsTr;

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("ElasticRouteRule")
        public String elasticRouteRule;

        @NameInMap("ClassName")
        public String className;

        @NameInMap("Id")
        public Long id;

        public static CreateDTXRecoveryParticipatorRequestActions build(java.util.Map<String, ?> map) throws Exception {
            CreateDTXRecoveryParticipatorRequestActions self = new CreateDTXRecoveryParticipatorRequestActions();
            return TeaModel.build(map, self);
        }

        public CreateDTXRecoveryParticipatorRequestActions setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public CreateDTXRecoveryParticipatorRequestActions setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateDTXRecoveryParticipatorRequestActions setElasticKey(String elasticKey) {
            this.elasticKey = elasticKey;
            return this;
        }
        public String getElasticKey() {
            return this.elasticKey;
        }

        public CreateDTXRecoveryParticipatorRequestActions setRollbackMethodName(String rollbackMethodName) {
            this.rollbackMethodName = rollbackMethodName;
            return this;
        }
        public String getRollbackMethodName() {
            return this.rollbackMethodName;
        }

        public CreateDTXRecoveryParticipatorRequestActions setIsZoneRoute(Boolean isZoneRoute) {
            this.isZoneRoute = isZoneRoute;
            return this;
        }
        public Boolean getIsZoneRoute() {
            return this.isZoneRoute;
        }

        public CreateDTXRecoveryParticipatorRequestActions setCommitMethodName(String commitMethodName) {
            this.commitMethodName = commitMethodName;
            return this;
        }
        public String getCommitMethodName() {
            return this.commitMethodName;
        }

        public CreateDTXRecoveryParticipatorRequestActions setTestUrl(String testUrl) {
            this.testUrl = testUrl;
            return this;
        }
        public String getTestUrl() {
            return this.testUrl;
        }

        public CreateDTXRecoveryParticipatorRequestActions setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateDTXRecoveryParticipatorRequestActions setRollbackMethodParamsType(Long rollbackMethodParamsType) {
            this.rollbackMethodParamsType = rollbackMethodParamsType;
            return this;
        }
        public Long getRollbackMethodParamsType() {
            return this.rollbackMethodParamsType;
        }

        public CreateDTXRecoveryParticipatorRequestActions setCommitMethodParamsType(Long commitMethodParamsType) {
            this.commitMethodParamsType = commitMethodParamsType;
            return this;
        }
        public Long getCommitMethodParamsType() {
            return this.commitMethodParamsType;
        }

        public CreateDTXRecoveryParticipatorRequestActions setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

        public CreateDTXRecoveryParticipatorRequestActions setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public CreateDTXRecoveryParticipatorRequestActions setElasticRouteRule(String elasticRouteRule) {
            this.elasticRouteRule = elasticRouteRule;
            return this;
        }
        public String getElasticRouteRule() {
            return this.elasticRouteRule;
        }

        public CreateDTXRecoveryParticipatorRequestActions setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public CreateDTXRecoveryParticipatorRequestActions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
