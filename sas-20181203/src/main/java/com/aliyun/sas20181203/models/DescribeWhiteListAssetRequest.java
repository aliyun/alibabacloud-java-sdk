// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListAssetRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum asset ID of the most recent query.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("LastMaxId")
    public Long lastMaxId;

    /**
     * <p>The number of entries per page. Maximum value: <strong>500</strong>. Default value: <strong>500</strong>. This value indicates that 500 entries are displayed on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>180.119.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2730</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The policy type of the asset that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: learning policy</li>
     * <li><strong>2</strong>: application policy</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static DescribeWhiteListAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListAssetRequest self = new DescribeWhiteListAssetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListAssetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWhiteListAssetRequest setLastMaxId(Long lastMaxId) {
        this.lastMaxId = lastMaxId;
        return this;
    }
    public Long getLastMaxId() {
        return this.lastMaxId;
    }

    public DescribeWhiteListAssetRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhiteListAssetRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWhiteListAssetRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public DescribeWhiteListAssetRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
