// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateDiagnosticRequest extends TeaModel {
    @NameInMap("DiagnosticKey")
    public String diagnosticKey;

    @NameInMap("DiagnosticType")
    public String diagnosticType;

    @NameInMap("Product")
    public String product;

    public static CreateDiagnosticRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticRequest self = new CreateDiagnosticRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticRequest setDiagnosticKey(String diagnosticKey) {
        this.diagnosticKey = diagnosticKey;
        return this;
    }
    public String getDiagnosticKey() {
        return this.diagnosticKey;
    }

    public CreateDiagnosticRequest setDiagnosticType(String diagnosticType) {
        this.diagnosticType = diagnosticType;
        return this;
    }
    public String getDiagnosticType() {
        return this.diagnosticType;
    }

    public CreateDiagnosticRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
