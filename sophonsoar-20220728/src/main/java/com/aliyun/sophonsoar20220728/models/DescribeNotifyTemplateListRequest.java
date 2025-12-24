// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNotifyTemplateListRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
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
     * <p>137602425xxx8726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Default value: 0. Valid values:</p>
     * <ul>
     * <li>0: the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts for the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static DescribeNotifyTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotifyTemplateListRequest self = new DescribeNotifyTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNotifyTemplateListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNotifyTemplateListRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeNotifyTemplateListRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
