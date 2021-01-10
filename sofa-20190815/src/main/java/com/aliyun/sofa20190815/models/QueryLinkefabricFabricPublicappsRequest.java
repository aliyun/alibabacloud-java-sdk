// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricPublicappsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Count")
    public Long count;

    @NameInMap("DevStage")
    public String devStage;

    @NameInMap("Env")
    public String env;

    @NameInMap("EnvListRepeatList")
    public java.util.List<String> envListRepeatList;

    @NameInMap("EventCode")
    public String eventCode;

    @NameInMap("Group")
    public String group;

    @NameInMap("IsPublic")
    public Boolean isPublic;

    @NameInMap("Offset")
    public Long offset;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("OriginAppName")
    public String originAppName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Topic")
    public String topic;

    public static QueryLinkefabricFabricPublicappsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricPublicappsRequest self = new QueryLinkefabricFabricPublicappsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricPublicappsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricPublicappsRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryLinkefabricFabricPublicappsRequest setDevStage(String devStage) {
        this.devStage = devStage;
        return this;
    }
    public String getDevStage() {
        return this.devStage;
    }

    public QueryLinkefabricFabricPublicappsRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryLinkefabricFabricPublicappsRequest setEnvListRepeatList(java.util.List<String> envListRepeatList) {
        this.envListRepeatList = envListRepeatList;
        return this;
    }
    public java.util.List<String> getEnvListRepeatList() {
        return this.envListRepeatList;
    }

    public QueryLinkefabricFabricPublicappsRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public QueryLinkefabricFabricPublicappsRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryLinkefabricFabricPublicappsRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public QueryLinkefabricFabricPublicappsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryLinkefabricFabricPublicappsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public QueryLinkefabricFabricPublicappsRequest setOriginAppName(String originAppName) {
        this.originAppName = originAppName;
        return this;
    }
    public String getOriginAppName() {
        return this.originAppName;
    }

    public QueryLinkefabricFabricPublicappsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkefabricFabricPublicappsRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricPublicappsRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryLinkefabricFabricPublicappsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
