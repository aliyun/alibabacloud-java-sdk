// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginBaseConfigsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The server to which the configuration is applied. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>Target</strong>: the UUID or group ID of the server to add or delete.</li>
     * </ul>
     * <blockquote>
     * <p>If targetType is set to uuid, the value of Target is the UUID of the server. If targetType is set to groupId, the value of Target is the group ID of the server. If targetType is set to global, the value of Target is a hyphen (-).</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>targetType</strong>: the type of the server to which the configuration is applied. Valid values:</p>
     * <ul>
     * <li><strong>uuid</strong>: a server</li>
     * <li><strong>groupId</strong>: a server group</li>
     * <li><strong>global</strong>: all servers</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[ {&quot;target&quot;: &quot;inet-7c676676-06fa-442e-90fb-b802e5d6****&quot;, &quot;targetType&quot;: &quot;uuid&quot; } ]</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The logon type of the configuration to query. Valid values:</p>
     * <ul>
     * <li><strong>login_common_location</strong>: common logon location</li>
     * <li><strong>login_common_ip</strong>: common logon IP address</li>
     * <li><strong>login_common_time</strong>: common logon time range</li>
     * <li><strong>login_common_account</strong>: common logon account</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>login_common_location</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeLoginBaseConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginBaseConfigsRequest self = new DescribeLoginBaseConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoginBaseConfigsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeLoginBaseConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoginBaseConfigsRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public DescribeLoginBaseConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
