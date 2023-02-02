// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceInServiceListRequest extends TeaModel {
    /**
     * <p>The list of tags that are attached to the instance. A maximum of 20 tags can be included in a list.</p>
     */
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
        /**
         * <p>The key of a tag that is attached to the instances you want to query. This parameter is not required. If you configure this parameter, you must also configure the **Tag.N.Key** parameter.**** If you include the Key and Value parameters in a request, this operation queries only the instances that use the specified tags. If you do not include these parameters in a request, this operation queries all instances that you can access.</p>
         * <br>
         * <p>*   The value of this parameter cannot be an empty string.</p>
         * <p>*   The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag that is attached to the instances you want to query. This parameter is not required. If you configure this parameter, you must also configure the **Tag.N.Key** parameter.**** If you include the Key and Value parameters in a request, this operation queries only the instances that use the specified tags. If you do not include these parameters in a request, this operation queries all instances that you can access.</p>
         * <br>
         * <p>*   The value of this parameter can be an empty string.</p>
         * <p>*   The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
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
