// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceInServiceListRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<OnsInstanceInServiceListRequestTag> tag;

    public static OnsInstanceInServiceListRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceInServiceListRequest self = new OnsInstanceInServiceListRequest();
        return TeaModel.build(map, self);
    }

    public OnsInstanceInServiceListRequest setTag(java.util.List<OnsInstanceInServiceListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<OnsInstanceInServiceListRequestTag> getTag() {
        return this.tag;
    }

    public static class OnsInstanceInServiceListRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static OnsInstanceInServiceListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceInServiceListRequestTag self = new OnsInstanceInServiceListRequestTag();
            return TeaModel.build(map, self);
        }

        public OnsInstanceInServiceListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsInstanceInServiceListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
