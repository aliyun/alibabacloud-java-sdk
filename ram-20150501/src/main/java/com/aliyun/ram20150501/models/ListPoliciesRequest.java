// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesRequest extends TeaModel {
    /**
     * <p>The marker. If the response is truncated, you can use <code>Marker</code> to obtain the content that starts from the position after the truncation point.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries to return. If the response is truncated because it reaches the <code>MaxItems</code> limit, the <code>IsTruncated</code> response parameter equals <code>true</code>.</p>
     * <p>Valid values: 1 to 1000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    /**
     * <p>The type of the access policy. Valid values: <code>System</code> and <code>Custom</code>. If this parameter is not specified, all access policies are listed.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListPoliciesRequestTag> tag;

    public static ListPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesRequest self = new ListPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListPoliciesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListPoliciesRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListPoliciesRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListPoliciesRequest setTag(java.util.List<ListPoliciesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListPoliciesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListPoliciesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListPoliciesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesRequestTag self = new ListPoliciesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListPoliciesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPoliciesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
