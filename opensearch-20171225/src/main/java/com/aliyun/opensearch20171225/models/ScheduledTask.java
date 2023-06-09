// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ScheduledTask extends TeaModel {
    @NameInMap("autoSwitch")
    public Boolean autoSwitch;

    @NameInMap("cron")
    public String cron;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("filter")
    public ScheduledTaskFilter filter;

    @NameInMap("forkedAppId")
    public String forkedAppId;

    @NameInMap("permanent")
    public Boolean permanent;

    @NameInMap("runNow")
    public Boolean runNow;

    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    public static ScheduledTask build(java.util.Map<String, ?> map) throws Exception {
        ScheduledTask self = new ScheduledTask();
        return TeaModel.build(map, self);
    }

    public ScheduledTask setAutoSwitch(Boolean autoSwitch) {
        this.autoSwitch = autoSwitch;
        return this;
    }
    public Boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    public ScheduledTask setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public ScheduledTask setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ScheduledTask setFilter(ScheduledTaskFilter filter) {
        this.filter = filter;
        return this;
    }
    public ScheduledTaskFilter getFilter() {
        return this.filter;
    }

    public ScheduledTask setForkedAppId(String forkedAppId) {
        this.forkedAppId = forkedAppId;
        return this;
    }
    public String getForkedAppId() {
        return this.forkedAppId;
    }

    public ScheduledTask setPermanent(Boolean permanent) {
        this.permanent = permanent;
        return this;
    }
    public Boolean getPermanent() {
        return this.permanent;
    }

    public ScheduledTask setRunNow(Boolean runNow) {
        this.runNow = runNow;
        return this;
    }
    public Boolean getRunNow() {
        return this.runNow;
    }

    public ScheduledTask setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ScheduledTask setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ScheduledTaskFilter extends TeaModel {
        @NameInMap("days")
        public Integer days;

        @NameInMap("expression")
        public String expression;

        @NameInMap("field")
        public String field;

        @NameInMap("unit")
        public String unit;

        public static ScheduledTaskFilter build(java.util.Map<String, ?> map) throws Exception {
            ScheduledTaskFilter self = new ScheduledTaskFilter();
            return TeaModel.build(map, self);
        }

        public ScheduledTaskFilter setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public ScheduledTaskFilter setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ScheduledTaskFilter setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ScheduledTaskFilter setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
