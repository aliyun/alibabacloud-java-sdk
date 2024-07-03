// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class GetPredictDocRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DocId")
    public Long docId;

    @NameInMap("Product")
    public String product;

    public static GetPredictDocRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPredictDocRequest self = new GetPredictDocRequest();
        return TeaModel.build(map, self);
    }

    public GetPredictDocRequest setDocId(Long docId) {
        this.docId = docId;
        return this;
    }
    public Long getDocId() {
        return this.docId;
    }

    public GetPredictDocRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
