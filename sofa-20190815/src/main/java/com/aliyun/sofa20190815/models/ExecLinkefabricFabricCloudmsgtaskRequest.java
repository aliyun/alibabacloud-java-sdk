// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkefabricFabricCloudmsgtaskRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Count")
    public Long count;

    @NameInMap("DevStage")
    public String devStage;

    @NameInMap("Env")
    public String env;

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

    @NameInMap("EnvListRepeatList")
    public java.util.List<String> envListRepeatList;

    public static ExecLinkefabricFabricCloudmsgtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkefabricFabricCloudmsgtaskRequest self = new ExecLinkefabricFabricCloudmsgtaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setDevStage(String devStage) {
        this.devStage = devStage;
        return this;
    }
    public String getDevStage() {
        return this.devStage;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setOriginAppName(String originAppName) {
        this.originAppName = originAppName;
        return this;
    }
    public String getOriginAppName() {
        return this.originAppName;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ExecLinkefabricFabricCloudmsgtaskRequest setEnvListRepeatList(java.util.List<String> envListRepeatList) {
        this.envListRepeatList = envListRepeatList;
        return this;
    }
    public java.util.List<String> getEnvListRepeatList() {
        return this.envListRepeatList;
    }

}
