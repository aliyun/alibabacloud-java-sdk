// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateEventsAttentionRequest extends TeaModel {
    @NameInMap("body")
    public UpdateEventsAttentionRequestBody body;

    public static UpdateEventsAttentionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventsAttentionRequest self = new UpdateEventsAttentionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventsAttentionRequest setBody(UpdateEventsAttentionRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventsAttentionRequestBody getBody() {
        return this.body;
    }

    public static class UpdateEventsAttentionRequestBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("mode")
        public Integer mode;

        /**
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("range")
        public String range;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>03de78af-f49f-433d-b5b1-0f6a70c493ba</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static UpdateEventsAttentionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventsAttentionRequestBody self = new UpdateEventsAttentionRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateEventsAttentionRequestBody setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public UpdateEventsAttentionRequestBody setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public UpdateEventsAttentionRequestBody setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
