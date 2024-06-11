// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesRequest extends TeaModel {
    /**
     * <p>The `Marker`. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries to return. If a response is truncated because it reaches the value of `MaxItems`, the value of `IsTruncated` will be `true`.</p>
     * <br>
     * <p>Valid values: 1 to 1000. Default value: 100.</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    /**
     * <p>The type of the `Policy`. Valid values: `System` and `Custom`. If you do not specify the parameter, all policies are returned.</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

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

}
