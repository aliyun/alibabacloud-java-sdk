// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class AndroidShortPayload extends TeaModel {
    @NameInMap("body")
    public AndroidShortPayloadBody body;

    @NameInMap("extra")
    public java.util.Map<String, ?> extra;

    public static AndroidShortPayload build(java.util.Map<String, ?> map) throws Exception {
        AndroidShortPayload self = new AndroidShortPayload();
        return TeaModel.build(map, self);
    }

    public AndroidShortPayload setBody(AndroidShortPayloadBody body) {
        this.body = body;
        return this;
    }
    public AndroidShortPayloadBody getBody() {
        return this.body;
    }

    public AndroidShortPayload setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public static class AndroidShortPayloadBody extends TeaModel {
        @NameInMap("custom")
        public String custom;

        public static AndroidShortPayloadBody build(java.util.Map<String, ?> map) throws Exception {
            AndroidShortPayloadBody self = new AndroidShortPayloadBody();
            return TeaModel.build(map, self);
        }

        public AndroidShortPayloadBody setCustom(String custom) {
            this.custom = custom;
            return this;
        }
        public String getCustom() {
            return this.custom;
        }

    }

}
