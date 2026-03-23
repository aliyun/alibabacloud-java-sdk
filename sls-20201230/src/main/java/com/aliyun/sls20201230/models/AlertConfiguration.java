// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AlertConfiguration extends TeaModel {
    /**
     * <p>告警标注</p>
     */
    @NameInMap("annotations")
    public java.util.List<AlertTag> annotations;

    /**
     * <p>是否开启自动标注</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoAnnotation")
    public Boolean autoAnnotation;

    /**
     * <p>告警触发条件</p>
     */
    @NameInMap("conditionConfiguration")
    public ConditionConfiguration conditionConfiguration;

    /**
     * <p>告警绑定的dashboardId</p>
     * 
     * <strong>example:</strong>
     * <p>dasnboardExample</p>
     */
    @NameInMap("dashboard")
    public String dashboard;

    /**
     * <p>分组评估配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("groupConfiguration")
    public GroupConfiguration groupConfiguration;

    /**
     * <p>告警查询分析语句集合操作配置</p>
     */
    @NameInMap("joinConfigurations")
    public java.util.List<JoinConfiguration> joinConfigurations;

    /**
     * <p>告警标签</p>
     */
    @NameInMap("labels")
    public java.util.List<AlertTag> labels;

    /**
     * <p>临时关闭时间</p>
     * 
     * <strong>example:</strong>
     * <p>1698907508</p>
     */
    @NameInMap("muteUntil")
    public Long muteUntil;

    /**
     * <p>是否开启无数据告警</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("noDataFire")
    public Boolean noDataFire;

    /**
     * <p>无数据告警严重度</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("noDataSeverity")
    public Integer noDataSeverity;

    /**
     * <p>SLS告警通知服务配置</p>
     */
    @NameInMap("policyConfiguration")
    public PolicyConfiguration policyConfiguration;

    /**
     * <p>查询语句列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("queryList")
    public java.util.List<AlertQuery> queryList;

    /**
     * <p>是否发送恢复告警</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sendResolved")
    public Boolean sendResolved;

    /**
     * <p>告警严重度配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("severityConfigurations")
    public java.util.List<SeverityConfiguration> severityConfigurations;

    /**
     * <p>发送给SLS告警管理服务配置</p>
     */
    @NameInMap("sinkAlerthub")
    public SinkAlerthubConfiguration sinkAlerthub;

    /**
     * <p>发送给云监控配置</p>
     */
    @NameInMap("sinkCms")
    public SinkCmsConfiguration sinkCms;

    /**
     * <p>发送给EventStore配置</p>
     */
    @NameInMap("sinkEventStore")
    public SinkEventStoreConfiguration sinkEventStore;

    /**
     * <p>告警自定义标签</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    /**
     * <p>告警模板配置</p>
     */
    @NameInMap("templateConfiguration")
    public TemplateConfiguration templateConfiguration;

    /**
     * <p>连续触发阈值</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("threshold")
    public Integer threshold;

    /**
     * <p>告警规则类型</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>版本</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
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
