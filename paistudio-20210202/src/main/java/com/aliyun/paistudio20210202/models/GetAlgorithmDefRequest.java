// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("AlgoVersion")
    public String algoVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logisticregression_binary</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <strong>example:</strong>
     * <p>5vqe4Sgtzw8E6opyK3HkK+nzYlY=</p>
     */
    @NameInMap("Signature")
    public String signature;

    public static GetAlgorithmDefRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefRequest self = new GetAlgorithmDefRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefRequest setAlgoVersion(String algoVersion) {
        this.algoVersion = algoVersion;
        return this;
    }
    public String getAlgoVersion() {
        return this.algoVersion;
    }

    public GetAlgorithmDefRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public GetAlgorithmDefRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GetAlgorithmDefRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
