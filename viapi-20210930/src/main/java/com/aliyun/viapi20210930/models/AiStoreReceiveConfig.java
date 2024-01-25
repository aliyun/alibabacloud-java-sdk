// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class AiStoreReceiveConfig extends TeaModel {
    @NameInMap("Custom")
    public String custom;

    @NameInMap("DingTalk")
    public AiStoreReceiveConfigDingTalk dingTalk;

    @NameInMap("EventBridge")
    public AiStoreReceiveConfigEventBridge eventBridge;

    @NameInMap("Http")
    public AiStoreReceiveConfigHttp http;

    @NameInMap("Https")
    public AiStoreReceiveConfigHttps https;

    @NameInMap("Mns")
    public AiStoreReceiveConfigMns mns;

    @NameInMap("RocketMQ")
    public AiStoreReceiveConfigRocketMQ rocketMQ;

    public static AiStoreReceiveConfig build(java.util.Map<String, ?> map) throws Exception {
        AiStoreReceiveConfig self = new AiStoreReceiveConfig();
        return TeaModel.build(map, self);
    }

    public AiStoreReceiveConfig setCustom(String custom) {
        this.custom = custom;
        return this;
    }
    public String getCustom() {
        return this.custom;
    }

    public AiStoreReceiveConfig setDingTalk(AiStoreReceiveConfigDingTalk dingTalk) {
        this.dingTalk = dingTalk;
        return this;
    }
    public AiStoreReceiveConfigDingTalk getDingTalk() {
        return this.dingTalk;
    }

    public AiStoreReceiveConfig setEventBridge(AiStoreReceiveConfigEventBridge eventBridge) {
        this.eventBridge = eventBridge;
        return this;
    }
    public AiStoreReceiveConfigEventBridge getEventBridge() {
        return this.eventBridge;
    }

    public AiStoreReceiveConfig setHttp(AiStoreReceiveConfigHttp http) {
        this.http = http;
        return this;
    }
    public AiStoreReceiveConfigHttp getHttp() {
        return this.http;
    }

    public AiStoreReceiveConfig setHttps(AiStoreReceiveConfigHttps https) {
        this.https = https;
        return this;
    }
    public AiStoreReceiveConfigHttps getHttps() {
        return this.https;
    }

    public AiStoreReceiveConfig setMns(AiStoreReceiveConfigMns mns) {
        this.mns = mns;
        return this;
    }
    public AiStoreReceiveConfigMns getMns() {
        return this.mns;
    }

    public AiStoreReceiveConfig setRocketMQ(AiStoreReceiveConfigRocketMQ rocketMQ) {
        this.rocketMQ = rocketMQ;
        return this;
    }
    public AiStoreReceiveConfigRocketMQ getRocketMQ() {
        return this.rocketMQ;
    }

    public static class AiStoreReceiveConfigDingTalk extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Secret")
        public String secret;

        public static AiStoreReceiveConfigDingTalk build(java.util.Map<String, ?> map) throws Exception {
            AiStoreReceiveConfigDingTalk self = new AiStoreReceiveConfigDingTalk();
            return TeaModel.build(map, self);
        }

        public AiStoreReceiveConfigDingTalk setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public AiStoreReceiveConfigDingTalk setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

    }

    public static class AiStoreReceiveConfigEventBridge extends TeaModel {
        @NameInMap("EventBus")
        public String eventBus;

        @NameInMap("EventRule")
        public String eventRule;

        public static AiStoreReceiveConfigEventBridge build(java.util.Map<String, ?> map) throws Exception {
            AiStoreReceiveConfigEventBridge self = new AiStoreReceiveConfigEventBridge();
            return TeaModel.build(map, self);
        }

        public AiStoreReceiveConfigEventBridge setEventBus(String eventBus) {
            this.eventBus = eventBus;
            return this;
        }
        public String getEventBus() {
            return this.eventBus;
        }

        public AiStoreReceiveConfigEventBridge setEventRule(String eventRule) {
            this.eventRule = eventRule;
            return this;
        }
        public String getEventRule() {
            return this.eventRule;
        }

    }

    public static class AiStoreReceiveConfigHttp extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static AiStoreReceiveConfigHttp build(java.util.Map<String, ?> map) throws Exception {
            AiStoreReceiveConfigHttp self = new AiStoreReceiveConfigHttp();
            return TeaModel.build(map, self);
        }

        public AiStoreReceiveConfigHttp setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class AiStoreReceiveConfigHttps extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static AiStoreReceiveConfigHttps build(java.util.Map<String, ?> map) throws Exception {
            AiStoreReceiveConfigHttps self = new AiStoreReceiveConfigHttps();
            return TeaModel.build(map, self);
        }

        public AiStoreReceiveConfigHttps setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class AiStoreReceiveConfigMns extends TeaModel {
        @NameInMap("Queue")
        public String queue;

        public static AiStoreReceiveConfigMns build(java.util.Map<String, ?> map) throws Exception {
            AiStoreReceiveConfigMns self = new AiStoreReceiveConfigMns();
            return TeaModel.build(map, self);
        }

        public AiStoreReceiveConfigMns setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class AiStoreReceiveConfigRocketMQ extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TopicName")
        public String topicName;

        public static AiStoreReceiveConfigRocketMQ build(java.util.Map<String, ?> map) throws Exception {
            AiStoreReceiveConfigRocketMQ self = new AiStoreReceiveConfigRocketMQ();
            return TeaModel.build(map, self);
        }

        public AiStoreReceiveConfigRocketMQ setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AiStoreReceiveConfigRocketMQ setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
