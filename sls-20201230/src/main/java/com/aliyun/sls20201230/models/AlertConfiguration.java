// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AlertConfiguration extends TeaModel {
    @NameInMap("annotations")
    public java.util.List<AlertTag> annotations;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("autoAnnotation")
    public Boolean autoAnnotation;

    @NameInMap("conditionConfiguration")
    public ConditionConfiguration conditionConfiguration;

    @NameInMap("dashboard")
    public String dashboard;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("groupConfiguration")
    public GroupConfiguration groupConfiguration;

    @NameInMap("joinConfigurations")
    public java.util.List<JoinConfiguration> joinConfigurations;

    @NameInMap("labels")
    public java.util.List<AlertTag> labels;

    @NameInMap("muteUntil")
    public Long muteUntil;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("noDataFire")
    public Boolean noDataFire;

    @NameInMap("noDataSeverity")
    public Integer noDataSeverity;

    @NameInMap("policyConfiguration")
    public PolicyConfiguration policyConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("queryList")
    public java.util.List<AlertQuery> queryList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sendResolved")
    public Boolean sendResolved;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("severityConfigurations")
    public java.util.List<SeverityConfiguration> severityConfigurations;

    @NameInMap("sinkAlerthub")
    public SinkAlerthubConfiguration sinkAlerthub;

    @NameInMap("sinkCms")
    public SinkCmsConfiguration sinkCms;

    @NameInMap("sinkEventStore")
    public SinkEventStoreConfiguration sinkEventStore;

    @NameInMap("tags")
    public java.util.List<String> tags;

    @NameInMap("templateConfiguration")
    public TemplateConfiguration templateConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("threshold")
    public Integer threshold;

    @NameInMap("type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("version")
    public String version;

    public static AlertConfiguration build(java.util.Map<String, ?> map) throws Exception {
        AlertConfiguration self = new AlertConfiguration();
        return TeaModel.build(map, self);
    }

    public AlertConfiguration setAnnotations(java.util.List<AlertTag> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<AlertTag> getAnnotations() {
        return this.annotations;
    }

    public AlertConfiguration setAutoAnnotation(Boolean autoAnnotation) {
        this.autoAnnotation = autoAnnotation;
        return this;
    }
    public Boolean getAutoAnnotation() {
        return this.autoAnnotation;
    }

    public AlertConfiguration setConditionConfiguration(ConditionConfiguration conditionConfiguration) {
        this.conditionConfiguration = conditionConfiguration;
        return this;
    }
    public ConditionConfiguration getConditionConfiguration() {
        return this.conditionConfiguration;
    }

    public AlertConfiguration setDashboard(String dashboard) {
        this.dashboard = dashboard;
        return this;
    }
    public String getDashboard() {
        return this.dashboard;
    }

    public AlertConfiguration setGroupConfiguration(GroupConfiguration groupConfiguration) {
        this.groupConfiguration = groupConfiguration;
        return this;
    }
    public GroupConfiguration getGroupConfiguration() {
        return this.groupConfiguration;
    }

    public AlertConfiguration setJoinConfigurations(java.util.List<JoinConfiguration> joinConfigurations) {
        this.joinConfigurations = joinConfigurations;
        return this;
    }
    public java.util.List<JoinConfiguration> getJoinConfigurations() {
        return this.joinConfigurations;
    }

    public AlertConfiguration setLabels(java.util.List<AlertTag> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<AlertTag> getLabels() {
        return this.labels;
    }

    public AlertConfiguration setMuteUntil(Long muteUntil) {
        this.muteUntil = muteUntil;
        return this;
    }
    public Long getMuteUntil() {
        return this.muteUntil;
    }

    public AlertConfiguration setNoDataFire(Boolean noDataFire) {
        this.noDataFire = noDataFire;
        return this;
    }
    public Boolean getNoDataFire() {
        return this.noDataFire;
    }

    public AlertConfiguration setNoDataSeverity(Integer noDataSeverity) {
        this.noDataSeverity = noDataSeverity;
        return this;
    }
    public Integer getNoDataSeverity() {
        return this.noDataSeverity;
    }

    public AlertConfiguration setPolicyConfiguration(PolicyConfiguration policyConfiguration) {
        this.policyConfiguration = policyConfiguration;
        return this;
    }
    public PolicyConfiguration getPolicyConfiguration() {
        return this.policyConfiguration;
    }

    public AlertConfiguration setQueryList(java.util.List<AlertQuery> queryList) {
        this.queryList = queryList;
        return this;
    }
    public java.util.List<AlertQuery> getQueryList() {
        return this.queryList;
    }

    public AlertConfiguration setSendResolved(Boolean sendResolved) {
        this.sendResolved = sendResolved;
        return this;
    }
    public Boolean getSendResolved() {
        return this.sendResolved;
    }

    public AlertConfiguration setSeverityConfigurations(java.util.List<SeverityConfiguration> severityConfigurations) {
        this.severityConfigurations = severityConfigurations;
        return this;
    }
    public java.util.List<SeverityConfiguration> getSeverityConfigurations() {
        return this.severityConfigurations;
    }

    public AlertConfiguration setSinkAlerthub(SinkAlerthubConfiguration sinkAlerthub) {
        this.sinkAlerthub = sinkAlerthub;
        return this;
    }
    public SinkAlerthubConfiguration getSinkAlerthub() {
        return this.sinkAlerthub;
    }

    public AlertConfiguration setSinkCms(SinkCmsConfiguration sinkCms) {
        this.sinkCms = sinkCms;
        return this;
    }
    public SinkCmsConfiguration getSinkCms() {
        return this.sinkCms;
    }

    public AlertConfiguration setSinkEventStore(SinkEventStoreConfiguration sinkEventStore) {
        this.sinkEventStore = sinkEventStore;
        return this;
    }
    public SinkEventStoreConfiguration getSinkEventStore() {
        return this.sinkEventStore;
    }

    public AlertConfiguration setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public AlertConfiguration setTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        return this;
    }
    public TemplateConfiguration getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    public AlertConfiguration setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

    public AlertConfiguration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AlertConfiguration setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
