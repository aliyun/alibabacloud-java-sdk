// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListIdentityToBenefitPkgMappingResponseBody extends TeaModel {
    /**
     * <p>The information about the benefit packages that are associated with an entity.</p>
     */
    @NameInMap("items")
    public java.util.List<IdentityToBenefitPkgMapping> items;

    public static ListIdentityToBenefitPkgMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityToBenefitPkgMappingResponseBody self = new ListIdentityToBenefitPkgMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentityToBenefitPkgMappingResponseBody setItems(java.util.List<IdentityToBenefitPkgMapping> items) {
        this.items = items;
        return this;
    }
    public java.util.List<IdentityToBenefitPkgMapping> getItems() {
        return this.items;
    }

}
