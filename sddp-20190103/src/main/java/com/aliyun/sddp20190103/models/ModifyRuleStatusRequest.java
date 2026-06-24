// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleStatusRequest extends TeaModel {
    /**
     * <p>The unique ID of the sensitive data detection rule.</p>
     * <blockquote>
     * <p>To enable or disable the detection feature for a sensitive data detection rule, provide the unique ID of the rule. Call the <strong>DescribeRules</strong> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12341</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The unique IDs of the sensitive data detection rules. Separate multiple IDs with commas.</p>
     * <blockquote>
     * <p>To enable or disable the detection feature for sensitive data detection rules, provide the unique IDs of the rules. Call the <strong>DescribeRules</strong> operation to obtain the IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,4</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to enable or disable the detection feature for the sensitive data detection rules. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disable.</p>
     * </li>
     * <li><p><strong>1</strong>: Enable.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ModifyRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleStatusRequest self = new ModifyRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRuleStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyRuleStatusRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyRuleStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyRuleStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
