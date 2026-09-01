// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessStatisticsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
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
     * <p>The end time of the query for response tasks. The value is a 13-digit UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>17561XXX77435</p>
     */
    @NameInMap("ProcessActionEnd")
    public Long processActionEnd;

    /**
     * <p>The start time of the query for response tasks. The value is a 13-digit UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>17000XXX83572</p>
     */
    @NameInMap("ProcessActionStart")
    public Long processActionStart;

    /**
     * <p>The user ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>1709821xxxxx3093</p>
     */
    @NameInMap("RoleFor")
    public String roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0 (default): the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
     * </ul>
     * 
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

    public DescribeProcessStatisticsRequest setProcessActionEnd(Long processActionEnd) {
        this.processActionEnd = processActionEnd;
        return this;
    }
    public Long getProcessActionEnd() {
        return this.processActionEnd;
    }

    public DescribeProcessStatisticsRequest setProcessActionStart(Long processActionStart) {
        this.processActionStart = processActionStart;
        return this;
    }
    public Long getProcessActionStart() {
        return this.processActionStart;
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
