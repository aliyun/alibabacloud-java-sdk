// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgtypeinfoRequest extends TeaModel {
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

    @NameInMap("Offset")
    public Long offset;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Topic")
    public String topic;

    public static QueryLinkefabricFabricMsgtypeinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgtypeinfoRequest self = new QueryLinkefabricFabricMsgtypeinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setDevStage(String devStage) {
        this.devStage = devStage;
        return this;
    }
    public String getDevStage() {
        return this.devStage;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setEnvListRepeatList(java.util.List<String> envListRepeatList) {
        this.envListRepeatList = envListRepeatList;
        return this;
    }
    public java.util.List<String> getEnvListRepeatList() {
        return this.envListRepeatList;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryLinkefabricFabricMsgtypeinfoRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
