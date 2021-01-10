// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudmsgtypeinfoRequest extends TeaModel {
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

    public static QueryLinkefabricFabricCloudmsgtypeinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudmsgtypeinfoRequest self = new QueryLinkefabricFabricCloudmsgtypeinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setDevStage(String devStage) {
        this.devStage = devStage;
        return this;
    }
    public String getDevStage() {
        return this.devStage;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setEnvListRepeatList(java.util.List<String> envListRepeatList) {
        this.envListRepeatList = envListRepeatList;
        return this;
    }
    public java.util.List<String> getEnvListRepeatList() {
        return this.envListRepeatList;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setOriginAppName(String originAppName) {
        this.originAppName = originAppName;
        return this;
    }
    public String getOriginAppName() {
        return this.originAppName;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
