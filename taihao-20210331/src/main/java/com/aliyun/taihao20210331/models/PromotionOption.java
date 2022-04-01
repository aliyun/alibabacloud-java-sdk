// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class PromotionOption extends TeaModel {
    // productCode
    @NameInMap("productCode")
    public String productCode;

    // promotionOptionCode
    @NameInMap("promotionOptionCode")
    public String promotionOptionCode;

    // promotionOptionNo
    @NameInMap("promotionOptionNo")
    public String promotionOptionNo;

    public static PromotionOption build(java.util.Map<String, ?> map) throws Exception {
        PromotionOption self = new PromotionOption();
        return TeaModel.build(map, self);
    }

    public PromotionOption setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PromotionOption setPromotionOptionCode(String promotionOptionCode) {
        this.promotionOptionCode = promotionOptionCode;
        return this;
    }
    public String getPromotionOptionCode() {
        return this.promotionOptionCode;
    }

    public PromotionOption setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

}
