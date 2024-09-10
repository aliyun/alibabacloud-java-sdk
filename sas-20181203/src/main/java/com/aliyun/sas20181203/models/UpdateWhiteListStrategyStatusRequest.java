// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateWhiteListStrategyStatusRequest extends TeaModel {
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
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>219.143.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the policy. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: deleted</li>
     * <li><strong>1</strong>: learning</li>
     * <li><strong>2</strong>: paused</li>
     * <li><strong>3</strong>: learning completed</li>
     * <li><strong>4</strong>: enabled</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can change the status to <strong>paused</strong> only if the policy status is <strong>learning</strong>.</p>
     * </li>
     * <li><p>You can change the status to <strong>learning</strong> only if the policy status is <strong>paused</strong>.</p>
     * </li>
     * <li><p>You can change the status to <strong>enabled</strong> only if the policy status is <strong>learning completed</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to obtain the ID.</p>
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
