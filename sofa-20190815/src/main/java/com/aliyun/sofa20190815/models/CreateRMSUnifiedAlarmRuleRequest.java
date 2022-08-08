// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateRMSUnifiedAlarmRuleRequest extends TeaModel {
    @NameInMap("AlarmNodata")
    public Long alarmNodata;

    @NameInMap("Category")
    public String category;

    @NameInMap("ChannelsRepeatList")
    public java.util.List<String> channelsRepeatList;

    @NameInMap("Emergency")
    public String emergency;

    @NameInMap("EmergencyUrl")
    public String emergencyUrl;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Name")
    public String name;

    @NameInMap("NotifyFiring")
    public Long notifyFiring;

    @NameInMap("NotifyNodata")
    public Long notifyNodata;

    @NameInMap("NotifyRecovered")
    public Long notifyRecovered;

    @NameInMap("NotifyTarget")
    public java.util.List<CreateRMSUnifiedAlarmRuleRequestNotifyTarget> notifyTarget;

    @NameInMap("NotifyTimeFilterJsonStr")
    public String notifyTimeFilterJsonStr;

    @NameInMap("PendingHit")
    public Long pendingHit;

    @NameInMap("RecoveredHit")
    public Long recoveredHit;

    @NameInMap("RuleConfig")
    public String ruleConfig;

    @NameInMap("SilenceTime")
    public Long silenceTime;

    @NameInMap("Step")
    public Long step;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static CreateRMSUnifiedAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRMSUnifiedAlarmRuleRequest self = new CreateRMSUnifiedAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRMSUnifiedAlarmRuleRequest setAlarmNodata(Long alarmNodata) {
        this.alarmNodata = alarmNodata;
        return this;
    }
    public Long getAlarmNodata() {
        return this.alarmNodata;
    }

    public CreateRMSUnifiedAlarmRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateRMSUnifiedAlarmRuleRequest setChannelsRepeatList(java.util.List<String> channelsRepeatList) {
        this.channelsRepeatList = channelsRepeatList;
        return this;
    }
    public java.util.List<String> getChannelsRepeatList() {
        return this.channelsRepeatList;
    }

    public CreateRMSUnifiedAlarmRuleRequest setEmergency(String emergency) {
        this.emergency = emergency;
        return this;
    }
    public String getEmergency() {
        return this.emergency;
    }

    public CreateRMSUnifiedAlarmRuleRequest setEmergencyUrl(String emergencyUrl) {
        this.emergencyUrl = emergencyUrl;
        return this;
    }
    public String getEmergencyUrl() {
        return this.emergencyUrl;
    }

    public CreateRMSUnifiedAlarmRuleRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public CreateRMSUnifiedAlarmRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRMSUnifiedAlarmRuleRequest setNotifyFiring(Long notifyFiring) {
        this.notifyFiring = notifyFiring;
        return this;
    }
    public Long getNotifyFiring() {
        return this.notifyFiring;
    }

    public CreateRMSUnifiedAlarmRuleRequest setNotifyNodata(Long notifyNodata) {
        this.notifyNodata = notifyNodata;
        return this;
    }
    public Long getNotifyNodata() {
        return this.notifyNodata;
    }

    public CreateRMSUnifiedAlarmRuleRequest setNotifyRecovered(Long notifyRecovered) {
        this.notifyRecovered = notifyRecovered;
        return this;
    }
    public Long getNotifyRecovered() {
        return this.notifyRecovered;
    }

    public CreateRMSUnifiedAlarmRuleRequest setNotifyTarget(java.util.List<CreateRMSUnifiedAlarmRuleRequestNotifyTarget> notifyTarget) {
        this.notifyTarget = notifyTarget;
        return this;
    }
    public java.util.List<CreateRMSUnifiedAlarmRuleRequestNotifyTarget> getNotifyTarget() {
        return this.notifyTarget;
    }

    public CreateRMSUnifiedAlarmRuleRequest setNotifyTimeFilterJsonStr(String notifyTimeFilterJsonStr) {
        this.notifyTimeFilterJsonStr = notifyTimeFilterJsonStr;
        return this;
    }
    public String getNotifyTimeFilterJsonStr() {
        return this.notifyTimeFilterJsonStr;
    }

    public CreateRMSUnifiedAlarmRuleRequest setPendingHit(Long pendingHit) {
        this.pendingHit = pendingHit;
        return this;
    }
    public Long getPendingHit() {
        return this.pendingHit;
    }

    public CreateRMSUnifiedAlarmRuleRequest setRecoveredHit(Long recoveredHit) {
        this.recoveredHit = recoveredHit;
        return this;
    }
    public Long getRecoveredHit() {
        return this.recoveredHit;
    }

    public CreateRMSUnifiedAlarmRuleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public CreateRMSUnifiedAlarmRuleRequest setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public CreateRMSUnifiedAlarmRuleRequest setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public CreateRMSUnifiedAlarmRuleRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class CreateRMSUnifiedAlarmRuleRequestNotifyTarget extends TeaModel {
        @NameInMap("Subscriber")
        public String subscriber;

        @NameInMap("SubscriberName")
        public String subscriberName;

        @NameInMap("SubscriberSource")
        public String subscriberSource;

        @NameInMap("SubscriberType")
        public String subscriberType;

        @NameInMap("SubscriberUuid")
        public String subscriberUuid;

        public static CreateRMSUnifiedAlarmRuleRequestNotifyTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateRMSUnifiedAlarmRuleRequestNotifyTarget self = new CreateRMSUnifiedAlarmRuleRequestNotifyTarget();
            return TeaModel.build(map, self);
        }

        public CreateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriber(String subscriber) {
            this.subscriber = subscriber;
            return this;
        }
        public String getSubscriber() {
            return this.subscriber;
        }

        public CreateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriberName(String subscriberName) {
            this.subscriberName = subscriberName;
            return this;
        }
        public String getSubscriberName() {
            return this.subscriberName;
        }

        public CreateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriberSource(String subscriberSource) {
            this.subscriberSource = subscriberSource;
            return this;
        }
        public String getSubscriberSource() {
            return this.subscriberSource;
        }

        public CreateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriberType(String subscriberType) {
            this.subscriberType = subscriberType;
            return this;
        }
        public String getSubscriberType() {
            return this.subscriberType;
        }

        public CreateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriberUuid(String subscriberUuid) {
            this.subscriberUuid = subscriberUuid;
            return this;
        }
        public String getSubscriberUuid() {
            return this.subscriberUuid;
        }

    }

}
