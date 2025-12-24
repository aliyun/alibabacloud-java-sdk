// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeGroupProductionsRequest extends TeaModel {
    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default)</li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the user who switches from the current view to the destination view by using the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>118******150980</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>  (default): the view of the current Alibaba Cloud account.</li>
     * <li><strong>1</strong>: the view of all accounts for the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static DescribeGroupProductionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupProductionsRequest self = new DescribeGroupProductionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupProductionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupProductionsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeGroupProductionsRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
