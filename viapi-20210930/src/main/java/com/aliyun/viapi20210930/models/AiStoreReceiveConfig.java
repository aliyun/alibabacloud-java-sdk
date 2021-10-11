// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class AiStoreReceiveConfig extends TeaModel {
    // 事件总线
    @NameInMap("EventBridge")
    public AiStoreReceiveConfigEventBridge eventBridge;

    // MNS消息
    @NameInMap("Mns")
    public AiStoreReceiveConfigMns mns;

    public static AiStoreReceiveConfig build(java.util.Map<String, ?> map) throws Exception {
        AiStoreReceiveConfig self = new AiStoreReceiveConfig();
        return TeaModel.build(map, self);
    }

    public AiStoreReceiveConfig setEventBridge(AiStoreReceiveConfigEventBridge eventBridge) {
        this.eventBridge = eventBridge;
        return this;
    }
    public AiStoreReceiveConfigEventBridge getEventBridge() {
        return this.eventBridge;
    }

    public AiStoreReceiveConfig setMns(AiStoreReceiveConfigMns mns) {
        this.mns = mns;
        return this;
    }
    public AiStoreReceiveConfigMns getMns() {
        return this.mns;
    }

    public static class AiStoreReceiveConfigEventBridge extends TeaModel {
        // 事件总线
        @NameInMap("EventBus")
        public String eventBus;

        // 事件规则
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

    public static class AiStoreReceiveConfigMns extends TeaModel {
        // 消息队列
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

}
