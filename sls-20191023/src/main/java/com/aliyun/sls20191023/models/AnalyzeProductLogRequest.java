// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class AnalyzeProductLogRequest extends TeaModel {
    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("CloudProduct")
    public String cloudProduct;

    @NameInMap("HotTTL")
    public Integer hotTTL;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("Project")
    public String project;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceQuota")
    public String resourceQuota;

    @NameInMap("TTL")
    public Integer TTL;

    @NameInMap("VariableMap")
    public java.util.Map<String, ?> variableMap;

    public static AnalyzeProductLogRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeProductLogRequest self = new AnalyzeProductLogRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeProductLogRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public AnalyzeProductLogRequest setCloudProduct(String cloudProduct) {
        this.cloudProduct = cloudProduct;
        return this;
    }
    public String getCloudProduct() {
        return this.cloudProduct;
    }

    public AnalyzeProductLogRequest setHotTTL(Integer hotTTL) {
        this.hotTTL = hotTTL;
        return this;
    }
    public Integer getHotTTL() {
        return this.hotTTL;
    }

    public AnalyzeProductLogRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AnalyzeProductLogRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public AnalyzeProductLogRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public AnalyzeProductLogRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public AnalyzeProductLogRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AnalyzeProductLogRequest setResourceQuota(String resourceQuota) {
        this.resourceQuota = resourceQuota;
        return this;
    }
    public String getResourceQuota() {
        return this.resourceQuota;
    }

    public AnalyzeProductLogRequest setTTL(Integer TTL) {
        this.TTL = TTL;
        return this;
    }
    public Integer getTTL() {
        return this.TTL;
    }

    public AnalyzeProductLogRequest setVariableMap(java.util.Map<String, ?> variableMap) {
        this.variableMap = variableMap;
        return this;
    }
    public java.util.Map<String, ?> getVariableMap() {
        return this.variableMap;
    }

}
