// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class E2BSandbox extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sbx-xxxx.ap-southeast-1.sandbox.aliyun.com</p>
     */
    @NameInMap("accessEndpoint")
    public String accessEndpoint;

    @NameInMap("allowInternetAccess")
    public Boolean allowInternetAccess;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpuCount")
    public Integer cpuCount;

    /**
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("diskSizeMB")
    public Integer diskSizeMB;

    /**
     * <strong>example:</strong>
     * <p>ap-southeast-1.sandbox.aliyun.com</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>2026-09-04T02:03:43.826Z</p>
     */
    @NameInMap("endAt")
    public String endAt;

    @NameInMap("envVars")
    public java.util.Map<String, String> envVars;

    /**
     * <strong>example:</strong>
     * <p>4b1e9d07-****</p>
     */
    @NameInMap("envdAccessToken")
    public String envdAccessToken;

    /**
     * <strong>example:</strong>
     * <p>template-d391c80b5d1527de</p>
     */
    @NameInMap("fcFunctionName")
    public String fcFunctionName;

    /**
     * <strong>example:</strong>
     * <p>c-6a9d1501-133e6f48-b3f07782dd47</p>
     */
    @NameInMap("fcInstanceID")
    public String fcInstanceID;

    /**
     * <strong>example:</strong>
     * <p>3a7ecd09-****</p>
     */
    @NameInMap("fcSessionID")
    public String fcSessionID;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("generation")
    public Integer generation;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("memoryMB")
    public Integer memoryMB;

    @NameInMap("metadata")
    public java.util.Map<String, String> metadata;

    @NameInMap("network")
    public E2BNetwork network;

    /**
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    @NameInMap("runtime")
    public InnerSandboxRuntimeConfig runtime;

    /**
     * <strong>example:</strong>
     * <p>sbx-xxxx</p>
     */
    @NameInMap("sandboxID")
    public String sandboxID;

    /**
     * <strong>example:</strong>
     * <p>2026-09-04T02:02:43.826Z</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>eea033af-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <strong>example:</strong>
     * <p>eco</p>
     */
    @NameInMap("teamPlan")
    public String teamPlan;

    /**
     * <strong>example:</strong>
     * <p>v9vjyzw64bsu83vw0dgs</p>
     */
    @NameInMap("templateID")
    public String templateID;

    /**
     * <strong>example:</strong>
     * <p>base</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>2000****</p>
     */
    @NameInMap("userID")
    public String userID;

    @NameInMap("volumeMounts")
    public InnerSandboxVolumeMount volumeMounts;

    public static E2BSandbox build(java.util.Map<String, ?> map) throws Exception {
        E2BSandbox self = new E2BSandbox();
        return TeaModel.build(map, self);
    }

    public E2BSandbox setAccessEndpoint(String accessEndpoint) {
        this.accessEndpoint = accessEndpoint;
        return this;
    }
    public String getAccessEndpoint() {
        return this.accessEndpoint;
    }

    public E2BSandbox setAllowInternetAccess(Boolean allowInternetAccess) {
        this.allowInternetAccess = allowInternetAccess;
        return this;
    }
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
    }

    public E2BSandbox setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public E2BSandbox setDiskSizeMB(Integer diskSizeMB) {
        this.diskSizeMB = diskSizeMB;
        return this;
    }
    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    public E2BSandbox setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public E2BSandbox setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }
    public String getEndAt() {
        return this.endAt;
    }

    public E2BSandbox setEnvVars(java.util.Map<String, String> envVars) {
        this.envVars = envVars;
        return this;
    }
    public java.util.Map<String, String> getEnvVars() {
        return this.envVars;
    }

    public E2BSandbox setEnvdAccessToken(String envdAccessToken) {
        this.envdAccessToken = envdAccessToken;
        return this;
    }
    public String getEnvdAccessToken() {
        return this.envdAccessToken;
    }

    public E2BSandbox setFcFunctionName(String fcFunctionName) {
        this.fcFunctionName = fcFunctionName;
        return this;
    }
    public String getFcFunctionName() {
        return this.fcFunctionName;
    }

    public E2BSandbox setFcInstanceID(String fcInstanceID) {
        this.fcInstanceID = fcInstanceID;
        return this;
    }
    public String getFcInstanceID() {
        return this.fcInstanceID;
    }

    public E2BSandbox setFcSessionID(String fcSessionID) {
        this.fcSessionID = fcSessionID;
        return this;
    }
    public String getFcSessionID() {
        return this.fcSessionID;
    }

    public E2BSandbox setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public E2BSandbox setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public E2BSandbox setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    public E2BSandbox setNetwork(E2BNetwork network) {
        this.network = network;
        return this;
    }
    public E2BNetwork getNetwork() {
        return this.network;
    }

    public E2BSandbox setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BSandbox setRuntime(InnerSandboxRuntimeConfig runtime) {
        this.runtime = runtime;
        return this;
    }
    public InnerSandboxRuntimeConfig getRuntime() {
        return this.runtime;
    }

    public E2BSandbox setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }
    public String getSandboxID() {
        return this.sandboxID;
    }

    public E2BSandbox setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public E2BSandbox setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public E2BSandbox setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BSandbox setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public E2BSandbox setTeamPlan(String teamPlan) {
        this.teamPlan = teamPlan;
        return this;
    }
    public String getTeamPlan() {
        return this.teamPlan;
    }

    public E2BSandbox setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public E2BSandbox setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public E2BSandbox setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

    public E2BSandbox setVolumeMounts(InnerSandboxVolumeMount volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }
    public InnerSandboxVolumeMount getVolumeMounts() {
        return this.volumeMounts;
    }

}
