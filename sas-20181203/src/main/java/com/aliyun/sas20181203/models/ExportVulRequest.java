// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportVulRequest extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("AttachTypes")
    public String attachTypes;

    @NameInMap("Dealed")
    public String dealed;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Necessity")
    public String necessity;

    @NameInMap("SearchTags")
    public String searchTags;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uuids")
    public String uuids;

    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

    public static ExportVulRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportVulRequest self = new ExportVulRequest();
        return TeaModel.build(map, self);
    }

    public ExportVulRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public ExportVulRequest setAttachTypes(String attachTypes) {
        this.attachTypes = attachTypes;
        return this;
    }
    public String getAttachTypes() {
        return this.attachTypes;
    }

    public ExportVulRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public ExportVulRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExportVulRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExportVulRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public ExportVulRequest setSearchTags(String searchTags) {
        this.searchTags = searchTags;
        return this;
    }
    public String getSearchTags() {
        return this.searchTags;
    }

    public ExportVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ExportVulRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public ExportVulRequest setVpcInstanceIds(String vpcInstanceIds) {
        this.vpcInstanceIds = vpcInstanceIds;
        return this;
    }
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

}
