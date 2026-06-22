// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateWhiteListStrategyStatusRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. The system automatically obtains this value.</p>
     * 
     * <strong>example:</strong>
     * <p>219.143.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The policy status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Deleted.</li>
     * <li><strong>1</strong>: Learning.</li>
     * <li><strong>2</strong>: Paused.</li>
     * <li><strong>3</strong>: Learning complete.</li>
     * <li><strong>4</strong>: Active.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Only a policy in the <strong>Learning</strong> state can be changed to the <strong>Paused</strong> state.</li>
     * <li>Only a policy in the <strong>Paused</strong> state can be changed to the <strong>Learning</strong> state.</li>
     * <li>Only a policy in the <strong>Learning complete</strong> state can be changed to the <strong>Active</strong> state.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The policy ID.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8516</p>
     */
    @NameInMap("StrategyIds")
    public String strategyIds;

    public static UpdateWhiteListStrategyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteListStrategyStatusRequest self = new UpdateWhiteListStrategyStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteListStrategyStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateWhiteListStrategyStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateWhiteListStrategyStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public UpdateWhiteListStrategyStatusRequest setStrategyIds(String strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }
    public String getStrategyIds() {
        return this.strategyIds;
    }

}
