// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAclListEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AclId")
    @Validation(required = true)
    public String aclId;

    @NameInMap("AclEntryId")
    @Validation(required = true)
    public String aclEntryId;

    @NameInMap("AclEntryComment")
    @Validation(required = true)
    public String aclEntryComment;

    public static ModifyIPv6TranslatorAclListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAclListEntryRequest self = new ModifyIPv6TranslatorAclListEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAclListEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setAclEntryId(String aclEntryId) {
        this.aclEntryId = aclEntryId;
        return this;
    }
    public String getAclEntryId() {
        return this.aclEntryId;
    }

    public ModifyIPv6TranslatorAclListEntryRequest setAclEntryComment(String aclEntryComment) {
        this.aclEntryComment = aclEntryComment;
        return this;
    }
    public String getAclEntryComment() {
        return this.aclEntryComment;
    }

}
