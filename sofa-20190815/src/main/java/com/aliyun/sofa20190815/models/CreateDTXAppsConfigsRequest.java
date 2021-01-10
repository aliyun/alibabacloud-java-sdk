// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXAppsConfigsRequest extends TeaModel {
    @NameInMap("ActivityMode")
    public Long activityMode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("InitiatorJsonStr")
    public String initiatorJsonStr;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ShardingRuleJsonStr")
    public String shardingRuleJsonStr;

    @NameInMap("Participators")
    public java.util.List<CreateDTXAppsConfigsRequestParticipators> participators;

    public static CreateDTXAppsConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXAppsConfigsRequest self = new CreateDTXAppsConfigsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDTXAppsConfigsRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateDTXAppsConfigsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDTXAppsConfigsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDTXAppsConfigsRequest setInitiatorJsonStr(String initiatorJsonStr) {
        this.initiatorJsonStr = initiatorJsonStr;
        return this;
    }
    public String getInitiatorJsonStr() {
        return this.initiatorJsonStr;
    }

    public CreateDTXAppsConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDTXAppsConfigsRequest setShardingRuleJsonStr(String shardingRuleJsonStr) {
        this.shardingRuleJsonStr = shardingRuleJsonStr;
        return this;
    }
    public String getShardingRuleJsonStr() {
        return this.shardingRuleJsonStr;
    }

    public CreateDTXAppsConfigsRequest setParticipators(java.util.List<CreateDTXAppsConfigsRequestParticipators> participators) {
        this.participators = participators;
        return this;
    }
    public java.util.List<CreateDTXAppsConfigsRequestParticipators> getParticipators() {
        return this.participators;
    }

    public static class CreateDTXAppsConfigsRequestParticipators extends TeaModel {
        @NameInMap("Used")
        public Boolean used;

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

        @NameInMap("UniqueId")
        public String uniqueId;

        @NameInMap("WsTr")
        public String wsTr;

        @NameInMap("ElasticRouteRule")
        public String elasticRouteRule;

        @NameInMap("ClassName")
        public String className;

        @NameInMap("Id")
        public Long id;

        public static CreateDTXAppsConfigsRequestParticipators build(java.util.Map<String, ?> map) throws Exception {
            CreateDTXAppsConfigsRequestParticipators self = new CreateDTXAppsConfigsRequestParticipators();
            return TeaModel.build(map, self);
        }

        public CreateDTXAppsConfigsRequestParticipators setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

        public CreateDTXAppsConfigsRequestParticipators setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public CreateDTXAppsConfigsRequestParticipators setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateDTXAppsConfigsRequestParticipators setElasticKey(String elasticKey) {
            this.elasticKey = elasticKey;
            return this;
        }
        public String getElasticKey() {
            return this.elasticKey;
        }

        public CreateDTXAppsConfigsRequestParticipators setRollbackMethodName(String rollbackMethodName) {
            this.rollbackMethodName = rollbackMethodName;
            return this;
        }
        public String getRollbackMethodName() {
            return this.rollbackMethodName;
        }

        public CreateDTXAppsConfigsRequestParticipators setIsZoneRoute(Boolean isZoneRoute) {
            this.isZoneRoute = isZoneRoute;
            return this;
        }
        public Boolean getIsZoneRoute() {
            return this.isZoneRoute;
        }

        public CreateDTXAppsConfigsRequestParticipators setCommitMethodName(String commitMethodName) {
            this.commitMethodName = commitMethodName;
            return this;
        }
        public String getCommitMethodName() {
            return this.commitMethodName;
        }

        public CreateDTXAppsConfigsRequestParticipators setTestUrl(String testUrl) {
            this.testUrl = testUrl;
            return this;
        }
        public String getTestUrl() {
            return this.testUrl;
        }

        public CreateDTXAppsConfigsRequestParticipators setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateDTXAppsConfigsRequestParticipators setRollbackMethodParamsType(Long rollbackMethodParamsType) {
            this.rollbackMethodParamsType = rollbackMethodParamsType;
            return this;
        }
        public Long getRollbackMethodParamsType() {
            return this.rollbackMethodParamsType;
        }

        public CreateDTXAppsConfigsRequestParticipators setCommitMethodParamsType(Long commitMethodParamsType) {
            this.commitMethodParamsType = commitMethodParamsType;
            return this;
        }
        public Long getCommitMethodParamsType() {
            return this.commitMethodParamsType;
        }

        public CreateDTXAppsConfigsRequestParticipators setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public CreateDTXAppsConfigsRequestParticipators setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

        public CreateDTXAppsConfigsRequestParticipators setElasticRouteRule(String elasticRouteRule) {
            this.elasticRouteRule = elasticRouteRule;
            return this;
        }
        public String getElasticRouteRule() {
            return this.elasticRouteRule;
        }

        public CreateDTXAppsConfigsRequestParticipators setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public CreateDTXAppsConfigsRequestParticipators setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
