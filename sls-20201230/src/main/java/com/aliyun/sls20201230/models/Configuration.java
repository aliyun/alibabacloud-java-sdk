// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Configuration extends TeaModel {
    @NameInMap("annotations")
    public java.util.List<ConfigurationAnnotations> annotations;

    @NameInMap("autoAnnotation")
    public Boolean autoAnnotation;

    @NameInMap("dashboard")
    public String dashboard;

    @NameInMap("groupConfiguration")
    public ConfigurationGroupConfiguration groupConfiguration;

    @NameInMap("joinConfigurations")
    public java.util.List<ConfigurationJoinConfigurations> joinConfigurations;

    @NameInMap("labels")
    public java.util.List<ConfigurationLabels> labels;

    @NameInMap("noDataFire")
    public Boolean noDataFire;

    @NameInMap("noDataSeverity")
    public Long noDataSeverity;

    @NameInMap("policyConfiguration")
    public ConfigurationPolicyConfiguration policyConfiguration;

    @NameInMap("queryList")
    public ConfigurationQueryList queryList;

    @NameInMap("sendResolved")
    public Boolean sendResolved;

    @NameInMap("severityConfigurations")
    public java.util.List<ConfigurationSeverityConfigurations> severityConfigurations;

    @NameInMap("tags")
    public java.util.List<String> tags;

    @NameInMap("threshold")
    public Long threshold;

    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    public static Configuration build(java.util.Map<String, ?> map) throws Exception {
        Configuration self = new Configuration();
        return TeaModel.build(map, self);
    }

    public Configuration setAnnotations(java.util.List<ConfigurationAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<ConfigurationAnnotations> getAnnotations() {
        return this.annotations;
    }

    public Configuration setAutoAnnotation(Boolean autoAnnotation) {
        this.autoAnnotation = autoAnnotation;
        return this;
    }
    public Boolean getAutoAnnotation() {
        return this.autoAnnotation;
    }

    public Configuration setDashboard(String dashboard) {
        this.dashboard = dashboard;
        return this;
    }
    public String getDashboard() {
        return this.dashboard;
    }

    public Configuration setGroupConfiguration(ConfigurationGroupConfiguration groupConfiguration) {
        this.groupConfiguration = groupConfiguration;
        return this;
    }
    public ConfigurationGroupConfiguration getGroupConfiguration() {
        return this.groupConfiguration;
    }

    public Configuration setJoinConfigurations(java.util.List<ConfigurationJoinConfigurations> joinConfigurations) {
        this.joinConfigurations = joinConfigurations;
        return this;
    }
    public java.util.List<ConfigurationJoinConfigurations> getJoinConfigurations() {
        return this.joinConfigurations;
    }

    public Configuration setLabels(java.util.List<ConfigurationLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ConfigurationLabels> getLabels() {
        return this.labels;
    }

    public Configuration setNoDataFire(Boolean noDataFire) {
        this.noDataFire = noDataFire;
        return this;
    }
    public Boolean getNoDataFire() {
        return this.noDataFire;
    }

    public Configuration setNoDataSeverity(Long noDataSeverity) {
        this.noDataSeverity = noDataSeverity;
        return this;
    }
    public Long getNoDataSeverity() {
        return this.noDataSeverity;
    }

    public Configuration setPolicyConfiguration(ConfigurationPolicyConfiguration policyConfiguration) {
        this.policyConfiguration = policyConfiguration;
        return this;
    }
    public ConfigurationPolicyConfiguration getPolicyConfiguration() {
        return this.policyConfiguration;
    }

    public Configuration setQueryList(ConfigurationQueryList queryList) {
        this.queryList = queryList;
        return this;
    }
    public ConfigurationQueryList getQueryList() {
        return this.queryList;
    }

    public Configuration setSendResolved(Boolean sendResolved) {
        this.sendResolved = sendResolved;
        return this;
    }
    public Boolean getSendResolved() {
        return this.sendResolved;
    }

    public Configuration setSeverityConfigurations(java.util.List<ConfigurationSeverityConfigurations> severityConfigurations) {
        this.severityConfigurations = severityConfigurations;
        return this;
    }
    public java.util.List<ConfigurationSeverityConfigurations> getSeverityConfigurations() {
        return this.severityConfigurations;
    }

    public Configuration setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public Configuration setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public Configuration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Configuration setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ConfigurationAnnotations extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ConfigurationAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationAnnotations self = new ConfigurationAnnotations();
            return TeaModel.build(map, self);
        }

        public ConfigurationAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ConfigurationAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ConfigurationGroupConfiguration extends TeaModel {
        @NameInMap("fields")
        public java.util.List<String> fields;

        @NameInMap("type")
        public String type;

        public static ConfigurationGroupConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationGroupConfiguration self = new ConfigurationGroupConfiguration();
            return TeaModel.build(map, self);
        }

        public ConfigurationGroupConfiguration setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public ConfigurationGroupConfiguration setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ConfigurationJoinConfigurations extends TeaModel {
        @NameInMap("condition")
        public String condition;

        @NameInMap("type")
        public String type;

        public static ConfigurationJoinConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationJoinConfigurations self = new ConfigurationJoinConfigurations();
            return TeaModel.build(map, self);
        }

        public ConfigurationJoinConfigurations setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ConfigurationJoinConfigurations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ConfigurationLabels extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ConfigurationLabels build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationLabels self = new ConfigurationLabels();
            return TeaModel.build(map, self);
        }

        public ConfigurationLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ConfigurationLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ConfigurationPolicyConfiguration extends TeaModel {
        @NameInMap("actionPolicyId")
        public String actionPolicyId;

        @NameInMap("alertPolicyId")
        public String alertPolicyId;

        @NameInMap("repeatInterval")
        public String repeatInterval;

        @NameInMap("useDefault")
        public Boolean useDefault;

        public static ConfigurationPolicyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationPolicyConfiguration self = new ConfigurationPolicyConfiguration();
            return TeaModel.build(map, self);
        }

        public ConfigurationPolicyConfiguration setActionPolicyId(String actionPolicyId) {
            this.actionPolicyId = actionPolicyId;
            return this;
        }
        public String getActionPolicyId() {
            return this.actionPolicyId;
        }

        public ConfigurationPolicyConfiguration setAlertPolicyId(String alertPolicyId) {
            this.alertPolicyId = alertPolicyId;
            return this;
        }
        public String getAlertPolicyId() {
            return this.alertPolicyId;
        }

        public ConfigurationPolicyConfiguration setRepeatInterval(String repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public String getRepeatInterval() {
            return this.repeatInterval;
        }

        public ConfigurationPolicyConfiguration setUseDefault(Boolean useDefault) {
            this.useDefault = useDefault;
            return this;
        }
        public Boolean getUseDefault() {
            return this.useDefault;
        }

    }

    public static class ConfigurationQueryList extends TeaModel {
        @NameInMap("powerSqlMode")
        public String powerSqlMode;

        @NameInMap("project")
        public String project;

        @NameInMap("query")
        public String query;

        @NameInMap("region")
        public String region;

        @NameInMap("roleArn")
        public String roleArn;

        @NameInMap("start")
        public String start;

        @NameInMap("store")
        public String store;

        @NameInMap("storeType")
        public String storeType;

        @NameInMap("timeSpanType")
        public String timeSpanType;

        public static ConfigurationQueryList build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationQueryList self = new ConfigurationQueryList();
            return TeaModel.build(map, self);
        }

        public ConfigurationQueryList setPowerSqlMode(String powerSqlMode) {
            this.powerSqlMode = powerSqlMode;
            return this;
        }
        public String getPowerSqlMode() {
            return this.powerSqlMode;
        }

        public ConfigurationQueryList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ConfigurationQueryList setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public ConfigurationQueryList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ConfigurationQueryList setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ConfigurationQueryList setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public ConfigurationQueryList setStore(String store) {
            this.store = store;
            return this;
        }
        public String getStore() {
            return this.store;
        }

        public ConfigurationQueryList setStoreType(String storeType) {
            this.storeType = storeType;
            return this;
        }
        public String getStoreType() {
            return this.storeType;
        }

        public ConfigurationQueryList setTimeSpanType(String timeSpanType) {
            this.timeSpanType = timeSpanType;
            return this;
        }
        public String getTimeSpanType() {
            return this.timeSpanType;
        }

    }

    public static class ConfigurationSeverityConfigurationsEvalCondition extends TeaModel {
        @NameInMap("condition")
        public String condition;

        @NameInMap("countCondition")
        public String countCondition;

        public static ConfigurationSeverityConfigurationsEvalCondition build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationSeverityConfigurationsEvalCondition self = new ConfigurationSeverityConfigurationsEvalCondition();
            return TeaModel.build(map, self);
        }

        public ConfigurationSeverityConfigurationsEvalCondition setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ConfigurationSeverityConfigurationsEvalCondition setCountCondition(String countCondition) {
            this.countCondition = countCondition;
            return this;
        }
        public String getCountCondition() {
            return this.countCondition;
        }

    }

    public static class ConfigurationSeverityConfigurations extends TeaModel {
        @NameInMap("evalCondition")
        public ConfigurationSeverityConfigurationsEvalCondition evalCondition;

        @NameInMap("severity")
        public Long severity;

        public static ConfigurationSeverityConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationSeverityConfigurations self = new ConfigurationSeverityConfigurations();
            return TeaModel.build(map, self);
        }

        public ConfigurationSeverityConfigurations setEvalCondition(ConfigurationSeverityConfigurationsEvalCondition evalCondition) {
            this.evalCondition = evalCondition;
            return this;
        }
        public ConfigurationSeverityConfigurationsEvalCondition getEvalCondition() {
            return this.evalCondition;
        }

        public ConfigurationSeverityConfigurations setSeverity(Long severity) {
            this.severity = severity;
            return this;
        }
        public Long getSeverity() {
            return this.severity;
        }

    }

}
