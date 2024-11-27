// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceInServiceListRequest extends TeaModel {
    /**
     * <p>Specifies whether you want the resource information to be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedResourceInfo")
    public Boolean needResourceInfo;

    /**
     * <p>The tags that you want to attach to the instance. You can attach up to 20 tags to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<OnsInstanceInServiceListRequestTag> tag;

    public static OnsInstanceInServiceListRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceInServiceListRequest self = new OnsInstanceInServiceListRequest();
        return TeaModel.build(map, self);
    }

    public OnsInstanceInServiceListRequest setNeedResourceInfo(Boolean needResourceInfo) {
        this.needResourceInfo = needResourceInfo;
        return this;
    }
    public Boolean getNeedResourceInfo() {
        return this.needResourceInfo;
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
         * <p>The tag key. This parameter is not required. If you configure this parameter, you must also configure <strong>Value</strong>.**** If you configure Key and Value in a request, this operation queries only the instances that use the specified tags. If you do not configure these parameters in a request, this operation queries all instances that you can access.</p>
         * <ul>
         * <li>The value of this parameter cannot be an empty string.</li>
         * <li>The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CartService</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. This parameter is not required. If you configure this parameter, you must also configure <strong>Key</strong>.**** If you configure Key and Value in a request, this operation queries only the instances that use the specified tags. If you do not configure these parameters in a request, this operation queries all instances that you can access.</p>
         * <ul>
         * <li>The value of this parameter can be an empty string.</li>
         * <li>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SericeA</p>
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
