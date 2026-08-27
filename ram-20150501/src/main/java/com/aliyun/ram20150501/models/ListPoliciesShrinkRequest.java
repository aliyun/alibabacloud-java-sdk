// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesShrinkRequest extends TeaModel {
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
    public String tagShrink;

    public static ListPoliciesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesShrinkRequest self = new ListPoliciesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPoliciesShrinkRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListPoliciesShrinkRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListPoliciesShrinkRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListPoliciesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
