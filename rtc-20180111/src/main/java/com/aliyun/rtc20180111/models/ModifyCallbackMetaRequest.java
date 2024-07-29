// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyCallbackMetaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>223***JQb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Callback")
    public ModifyCallbackMetaRequestCallback callback;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static ModifyCallbackMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCallbackMetaRequest self = new ModifyCallbackMetaRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCallbackMetaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyCallbackMetaRequest setCallback(ModifyCallbackMetaRequestCallback callback) {
        this.callback = callback;
        return this;
    }
    public ModifyCallbackMetaRequestCallback getCallback() {
        return this.callback;
    }

    public ModifyCallbackMetaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static class ModifyCallbackMetaRequestCallback extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RecordEvent</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Conf")
        public String conf;

        @NameInMap("SubEvent")
        public java.util.List<Integer> subEvent;

        public static ModifyCallbackMetaRequestCallback build(java.util.Map<String, ?> map) throws Exception {
            ModifyCallbackMetaRequestCallback self = new ModifyCallbackMetaRequestCallback();
            return TeaModel.build(map, self);
        }

        public ModifyCallbackMetaRequestCallback setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyCallbackMetaRequestCallback setConf(String conf) {
            this.conf = conf;
            return this;
        }
        public String getConf() {
            return this.conf;
        }

        public ModifyCallbackMetaRequestCallback setSubEvent(java.util.List<Integer> subEvent) {
            this.subEvent = subEvent;
            return this;
        }
        public java.util.List<Integer> getSubEvent() {
            return this.subEvent;
        }

    }

}
