// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartBaselineSecurityCheckRequest extends TeaModel {
    // The IDs of the check items.
    // 
    // >  To perform a check task on cloud service configurations, you must specify the IDs of the check items. You can call the  [DescribeRiskItemType ](~~DescribeRiskItemType~~)  operation to query the IDs of check items.
    @NameInMap("ItemIds")
    public java.util.List<Long> itemIds;

    // The language of the content within the request and the response. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of the check task. Valid values:
    // 
    // *   **check**
    // *   **verify**
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
