// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteCollectionPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>access_log</p>
     */
    @NameInMap("dataCode")
    public String dataCode;

    /**
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("productCode")
    public String productCode;

    public static DeleteCollectionPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectionPolicyRequest self = new DeleteCollectionPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCollectionPolicyRequest setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

    public DeleteCollectionPolicyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
