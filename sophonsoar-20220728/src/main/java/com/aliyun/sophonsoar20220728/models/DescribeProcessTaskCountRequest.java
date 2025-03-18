// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTaskCountRequest extends TeaModel {
    /**
     * <p>Collection of entity UUIDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityUuidList")
    public java.util.List<String> entityUuidList;

    /**
     * <p>Language type for request and response messages. Values:</p>
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
     * <p>User ID for administrators to switch to other member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>104739******259</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>View type.</p>
     * <ul>
     * <li><strong>0</strong>: Current Alibaba Cloud account view.</li>
     * <li><strong>1</strong>: View for all accounts under the enterprise.</li>
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
