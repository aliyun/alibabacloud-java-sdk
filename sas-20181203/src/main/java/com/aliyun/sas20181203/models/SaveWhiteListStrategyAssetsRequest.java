// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveWhiteListStrategyAssetsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;status&quot;:0,&quot;target&quot;:&quot;c98dcd24-fa57-4759-b5ec-f8a4ffeed****&quot;}]</p>
     */
    @NameInMap("Operations")
    public String operations;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RelationType")
    public Integer relationType;

    /**
     * <strong>example:</strong>
     * <p>115.193.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2730</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    public static SaveWhiteListStrategyAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWhiteListStrategyAssetsRequest self = new SaveWhiteListStrategyAssetsRequest();
        return TeaModel.build(map, self);
    }

    public SaveWhiteListStrategyAssetsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveWhiteListStrategyAssetsRequest setOperations(String operations) {
        this.operations = operations;
        return this;
    }
    public String getOperations() {
        return this.operations;
    }

    public SaveWhiteListStrategyAssetsRequest setRelationType(Integer relationType) {
        this.relationType = relationType;
        return this;
    }
    public Integer getRelationType() {
        return this.relationType;
    }

    public SaveWhiteListStrategyAssetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public SaveWhiteListStrategyAssetsRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
