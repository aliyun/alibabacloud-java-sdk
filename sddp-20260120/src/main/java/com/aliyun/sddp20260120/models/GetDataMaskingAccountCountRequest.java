// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class GetDataMaskingAccountCountRequest extends TeaModel {
    /**
     * <p>The language of the response description. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of cloud product type identifiers. Separate multiple values with commas (,). For column encryption scenarios, valid values: 5 (RDS), 8 (POLARDB), and 27 (PolarDBX2).</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductIds")
    public String productIds;

    public static GetDataMaskingAccountCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataMaskingAccountCountRequest self = new GetDataMaskingAccountCountRequest();
        return TeaModel.build(map, self);
    }

    public GetDataMaskingAccountCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetDataMaskingAccountCountRequest setProductIds(String productIds) {
        this.productIds = productIds;
        return this;
    }
    public String getProductIds() {
        return this.productIds;
    }

}
