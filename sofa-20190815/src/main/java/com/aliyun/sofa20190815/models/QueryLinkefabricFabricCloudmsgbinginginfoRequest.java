// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudmsgbinginginfoRequest extends TeaModel {
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

    public static QueryLinkefabricFabricCloudmsgbinginginfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudmsgbinginginfoRequest self = new QueryLinkefabricFabricCloudmsgbinginginfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setDevStage(String devStage) {
        this.devStage = devStage;
        return this;
    }
    public String getDevStage() {
        return this.devStage;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setEnvListRepeatList(java.util.List<String> envListRepeatList) {
        this.envListRepeatList = envListRepeatList;
        return this;
    }
    public java.util.List<String> getEnvListRepeatList() {
        return this.envListRepeatList;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setOriginAppName(String originAppName) {
        this.originAppName = originAppName;
        return this;
    }
    public String getOriginAppName() {
        return this.originAppName;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
