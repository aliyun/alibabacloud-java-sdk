// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class AnalyzeProductLogShrinkRequest extends TeaModel {
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
    public String variableMapShrink;

    public static AnalyzeProductLogShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeProductLogShrinkRequest self = new AnalyzeProductLogShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeProductLogShrinkRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public AnalyzeProductLogShrinkRequest setCloudProduct(String cloudProduct) {
        this.cloudProduct = cloudProduct;
        return this;
    }
    public String getCloudProduct() {
        return this.cloudProduct;
    }

    public AnalyzeProductLogShrinkRequest setHotTTL(Integer hotTTL) {
        this.hotTTL = hotTTL;
        return this;
    }
    public Integer getHotTTL() {
        return this.hotTTL;
    }

    public AnalyzeProductLogShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AnalyzeProductLogShrinkRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public AnalyzeProductLogShrinkRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public AnalyzeProductLogShrinkRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public AnalyzeProductLogShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AnalyzeProductLogShrinkRequest setResourceQuota(String resourceQuota) {
        this.resourceQuota = resourceQuota;
        return this;
    }
    public String getResourceQuota() {
        return this.resourceQuota;
    }

    public AnalyzeProductLogShrinkRequest setTTL(Integer TTL) {
        this.TTL = TTL;
        return this;
    }
    public Integer getTTL() {
        return this.TTL;
    }

    public AnalyzeProductLogShrinkRequest setVariableMapShrink(String variableMapShrink) {
        this.variableMapShrink = variableMapShrink;
        return this;
    }
    public String getVariableMapShrink() {
        return this.variableMapShrink;
    }

}
