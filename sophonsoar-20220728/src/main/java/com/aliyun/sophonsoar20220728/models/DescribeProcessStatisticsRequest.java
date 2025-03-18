// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1709821xxxxx3093</p>
     */
    @NameInMap("RoleFor")
    public String roleFor;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static DescribeProcessStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessStatisticsRequest self = new DescribeProcessStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeProcessStatisticsRequest setRoleFor(String roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public String getRoleFor() {
        return this.roleFor;
    }

    public DescribeProcessStatisticsRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
