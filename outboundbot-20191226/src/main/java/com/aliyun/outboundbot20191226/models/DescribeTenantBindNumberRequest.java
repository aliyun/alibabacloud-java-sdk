// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTenantBindNumberRequest extends TeaModel {
    /**
     * <p>The bound number (required).</p>
     * <blockquote>
     * <p>Queries the binding status of the specified number across all instances. Obtain the number from the response parameters of ListAllTenantBindNumberBinding.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15005059355</p>
     */
    @NameInMap("Number")
    public String number;

    public static DescribeTenantBindNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantBindNumberRequest self = new DescribeTenantBindNumberRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantBindNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
