// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRMSUnifiedAlarmRuleRequest extends TeaModel {
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

    @NameInMap("Id")
    public Long id;

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
    public java.util.List<UpdateRMSUnifiedAlarmRuleRequestNotifyTarget> notifyTarget;

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

    @NameInMap("Status")
    public String status;

    @NameInMap("Step")
    public Long step;

    @NameInMap("SuspendedEndTime")
    public Long suspendedEndTime;

    @NameInMap("SuspendedReason")
    public String suspendedReason;

    @NameInMap("SuspendedStartTime")
    public Long suspendedStartTime;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static UpdateRMSUnifiedAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRMSUnifiedAlarmRuleRequest self = new UpdateRMSUnifiedAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRMSUnifiedAlarmRuleRequest setAlarmNodata(Long alarmNodata) {
        this.alarmNodata = alarmNodata;
        return this;
    }
    public Long getAlarmNodata() {
        return this.alarmNodata;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setChannelsRepeatList(java.util.List<String> channelsRepeatList) {
        this.channelsRepeatList = channelsRepeatList;
        return this;
    }
    public java.util.List<String> getChannelsRepeatList() {
        return this.channelsRepeatList;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setEmergency(String emergency) {
        this.emergency = emergency;
        return this;
    }
    public String getEmergency() {
        return this.emergency;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setEmergencyUrl(String emergencyUrl) {
        this.emergencyUrl = emergencyUrl;
        return this;
    }
    public String getEmergencyUrl() {
        return this.emergencyUrl;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setNotifyFiring(Long notifyFiring) {
        this.notifyFiring = notifyFiring;
        return this;
    }
    public Long getNotifyFiring() {
        return this.notifyFiring;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setNotifyNodata(Long notifyNodata) {
        this.notifyNodata = notifyNodata;
        return this;
    }
    public Long getNotifyNodata() {
        return this.notifyNodata;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setNotifyRecovered(Long notifyRecovered) {
        this.notifyRecovered = notifyRecovered;
        return this;
    }
    public Long getNotifyRecovered() {
        return this.notifyRecovered;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setNotifyTarget(java.util.List<UpdateRMSUnifiedAlarmRuleRequestNotifyTarget> notifyTarget) {
        this.notifyTarget = notifyTarget;
        return this;
    }
    public java.util.List<UpdateRMSUnifiedAlarmRuleRequestNotifyTarget> getNotifyTarget() {
        return this.notifyTarget;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setNotifyTimeFilterJsonStr(String notifyTimeFilterJsonStr) {
        this.notifyTimeFilterJsonStr = notifyTimeFilterJsonStr;
        return this;
    }
    public String getNotifyTimeFilterJsonStr() {
        return this.notifyTimeFilterJsonStr;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setPendingHit(Long pendingHit) {
        this.pendingHit = pendingHit;
        return this;
    }
    public Long getPendingHit() {
        return this.pendingHit;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setRecoveredHit(Long recoveredHit) {
        this.recoveredHit = recoveredHit;
        return this;
    }
    public Long getRecoveredHit() {
        return this.recoveredHit;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setSuspendedEndTime(Long suspendedEndTime) {
        this.suspendedEndTime = suspendedEndTime;
        return this;
    }
    public Long getSuspendedEndTime() {
        return this.suspendedEndTime;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setSuspendedReason(String suspendedReason) {
        this.suspendedReason = suspendedReason;
        return this;
    }
    public String getSuspendedReason() {
        return this.suspendedReason;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setSuspendedStartTime(Long suspendedStartTime) {
        this.suspendedStartTime = suspendedStartTime;
        return this;
    }
    public Long getSuspendedStartTime() {
        return this.suspendedStartTime;
    }

    public UpdateRMSUnifiedAlarmRuleRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class UpdateRMSUnifiedAlarmRuleRequestNotifyTarget extends TeaModel {
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

        public static UpdateRMSUnifiedAlarmRuleRequestNotifyTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateRMSUnifiedAlarmRuleRequestNotifyTarget self = new UpdateRMSUnifiedAlarmRuleRequestNotifyTarget();
            return TeaModel.build(map, self);
        }

        public UpdateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriber(String subscriber) {
            this.subscriber = subscriber;
            return this;
        }
        public String getSubscriber() {
            return this.subscriber;
        }

        public UpdateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriberName(String subscriberName) {
            this.subscriberName = subscriberName;
            return this;
        }
        public String getSubscriberName() {
            return this.subscriberName;
        }

        public UpdateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriberSource(String subscriberSource) {
            this.subscriberSource = subscriberSource;
            return this;
        }
        public String getSubscriberSource() {
            return this.subscriberSource;
        }

        public UpdateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriberType(String subscriberType) {
            this.subscriberType = subscriberType;
            return this;
        }
        public String getSubscriberType() {
            return this.subscriberType;
        }

        public UpdateRMSUnifiedAlarmRuleRequestNotifyTarget setSubscriberUuid(String subscriberUuid) {
            this.subscriberUuid = subscriberUuid;
            return this;
        }
        public String getSubscriberUuid() {
            return this.subscriberUuid;
        }

    }

}
