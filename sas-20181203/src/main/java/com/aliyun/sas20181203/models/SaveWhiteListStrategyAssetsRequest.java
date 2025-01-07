// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveWhiteListStrategyAssetsRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operation that you want to perform. This parameter is in the JSON format. The value is case-sensitive. The value contains the following fields:</p>
     * <ul>
     * <li><p><strong>status</strong>: the operation. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the delete operation.</li>
     * <li><strong>1</strong>: the add operation.</li>
     * </ul>
     * </li>
     * <li><p><strong>target</strong>: the UUID of the server.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the value of <strong>target</strong> from the response parameter Uuid.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;status&quot;:0,&quot;target&quot;:&quot;c98dcd24-fa57-4759-b5ec-f8a4ffeed****&quot;}]</p>
     */
    @NameInMap("Operations")
    public String operations;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: learning policy.</li>
     * <li><strong>2</strong>: application policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RelationType")
    public Integer relationType;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>115.193.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to query the ID.</p>
     * </blockquote>
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
