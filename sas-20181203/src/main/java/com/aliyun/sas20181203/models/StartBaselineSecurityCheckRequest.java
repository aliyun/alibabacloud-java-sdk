// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartBaselineSecurityCheckRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Type")
    public String type;

    @NameInMap("ItemIds")
    public java.util.List<Integer> itemIds;

    public static StartBaselineSecurityCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaselineSecurityCheckRequest self = new StartBaselineSecurityCheckRequest();
        return TeaModel.build(map, self);
    }

    public StartBaselineSecurityCheckRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public StartBaselineSecurityCheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public StartBaselineSecurityCheckRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public StartBaselineSecurityCheckRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public StartBaselineSecurityCheckRequest setItemIds(java.util.List<Integer> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<Integer> getItemIds() {
        return this.itemIds;
    }

}
