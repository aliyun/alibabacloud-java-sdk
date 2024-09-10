// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartBaselineSecurityCheckRequest extends TeaModel {
    /**
     * <p>The IDs of the check items.</p>
     * <blockquote>
     * <p>To perform a check task on cloud service configurations, you must specify the ID of the check item. You can call the <a href="~~DescribeRiskItemType~~">DescribeRiskItemType</a> operation to query the IDs of check items.</p>
     * </blockquote>
     */
    @NameInMap("ItemIds")
    public java.util.List<Long> itemIds;

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

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>106.11.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the check task. Valid values:</p>
     * <ul>
     * <li><strong>check</strong></li>
     * <li><strong>verify</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>verify</p>
     */
    @NameInMap("Type")
    public String type;

    public static StartBaselineSecurityCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaselineSecurityCheckRequest self = new StartBaselineSecurityCheckRequest();
        return TeaModel.build(map, self);
    }

    public StartBaselineSecurityCheckRequest setItemIds(java.util.List<Long> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<Long> getItemIds() {
        return this.itemIds;
    }

    public StartBaselineSecurityCheckRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public StartBaselineSecurityCheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public StartBaselineSecurityCheckRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public StartBaselineSecurityCheckRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
