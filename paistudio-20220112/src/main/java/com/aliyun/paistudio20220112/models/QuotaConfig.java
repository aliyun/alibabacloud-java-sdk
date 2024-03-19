// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaConfig extends TeaModel {
    @NameInMap("ACS")
    public ACS ACS;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DefaultGPUDriver")
    public String defaultGPUDriver;

    @NameInMap("ResourceSpecs")
    public java.util.List<WorkspaceSpecs> resourceSpecs;

    @NameInMap("SupportGPUDrivers")
    public java.util.List<String> supportGPUDrivers;

    @NameInMap("SupportRDMA")
    public Boolean supportRDMA;

    @NameInMap("UserVpc")
    public UserVpc userVpc;

    public static QuotaConfig build(java.util.Map<String, ?> map) throws Exception {
        QuotaConfig self = new QuotaConfig();
        return TeaModel.build(map, self);
    }

    public QuotaConfig setACS(ACS ACS) {
        this.ACS = ACS;
        return this;
    }
    public ACS getACS() {
        return this.ACS;
    }

    public QuotaConfig setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QuotaConfig setDefaultGPUDriver(String defaultGPUDriver) {
        this.defaultGPUDriver = defaultGPUDriver;
        return this;
    }
    public String getDefaultGPUDriver() {
        return this.defaultGPUDriver;
    }

    public QuotaConfig setResourceSpecs(java.util.List<WorkspaceSpecs> resourceSpecs) {
        this.resourceSpecs = resourceSpecs;
        return this;
    }
    public java.util.List<WorkspaceSpecs> getResourceSpecs() {
        return this.resourceSpecs;
    }

    public QuotaConfig setSupportGPUDrivers(java.util.List<String> supportGPUDrivers) {
        this.supportGPUDrivers = supportGPUDrivers;
        return this;
    }
    public java.util.List<String> getSupportGPUDrivers() {
        return this.supportGPUDrivers;
    }

    public QuotaConfig setSupportRDMA(Boolean supportRDMA) {
        this.supportRDMA = supportRDMA;
        return this;
    }
    public Boolean getSupportRDMA() {
        return this.supportRDMA;
    }

    public QuotaConfig setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

}
