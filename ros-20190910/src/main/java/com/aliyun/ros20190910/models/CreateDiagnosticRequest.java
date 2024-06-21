// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateDiagnosticRequest extends TeaModel {
    /**
     * <p>The keyword in the diagnosis.</p>
     * <p>You can specify the ID of the stack that you want to diagnose.</p>
     * 
     * <strong>example:</strong>
     * <p>37A5679B-8488-5A5D-8D5C-90E66A577A5D</p>
     */
    @NameInMap("DiagnosticKey")
    public String diagnosticKey;

    /**
     * <p>The type of the item that is diagnosed. Set the value to Stack, which specifies that the stack is diagnosed.</p>
     * 
     * <strong>example:</strong>
     * <p>Stack</p>
     */
    @NameInMap("DiagnosticType")
    public String diagnosticType;

    /**
     * <p>The language of the diagnostic report to be generated. Only Chinese and English are supported.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>zh-cn</li>
     * <li>en</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the product that is diagonosed.</p>
     * 
     * <strong>example:</strong>
     * <p>ros</p>
     */
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

    public CreateDiagnosticRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDiagnosticRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
