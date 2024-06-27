// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleStatusRequest extends TeaModel {
    /**
     * <p>The ID of the sensitive data detection rule.</p>
     * <blockquote>
     * <p>You can query the ID of the sensitive data detection rule by calling the <strong>DescribeRules</strong> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12341</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the sensitive data detection rule. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p>You can query the ID of the sensitive data detection rule by calling the <strong>DescribeRules</strong> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,4</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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
     * <p>Specifies whether to enable or disable the sensitive data detection rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disables the sensitive data detection rule.</li>
     * <li><strong>1</strong>: enables the sensitive data detection rule.</li>
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
