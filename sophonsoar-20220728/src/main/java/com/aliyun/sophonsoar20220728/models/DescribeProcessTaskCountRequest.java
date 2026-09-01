// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTaskCountRequest extends TeaModel {
    /**
     * <p>The UUIDs of the entities.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityUuidList")
    public java.util.List<String> entityUuidList;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
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
     * <p>The UID of the member whose permissions you want to use to call the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>104739******259</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p><strong>0</strong>: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p><strong>1</strong>: The view of all accounts that belong to the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static DescribeProcessTaskCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessTaskCountRequest self = new DescribeProcessTaskCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessTaskCountRequest setEntityUuidList(java.util.List<String> entityUuidList) {
        this.entityUuidList = entityUuidList;
        return this;
    }
    public java.util.List<String> getEntityUuidList() {
        return this.entityUuidList;
    }

    public DescribeProcessTaskCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeProcessTaskCountRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeProcessTaskCountRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
