// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginBaseConfigsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Settings for paged query. The number of logon configuration entries to display on each page when paging is used. Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The selection mode for the assets on which the policy takes effect. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>Target</strong>: The UUID of the server to add or delete, or the ID of the server group.</li>
     * </ul>
     * <blockquote>
     * <p>If the targetType parameter is set to uuid, this parameter specifies the UUID of the server. If the targetType parameter is set to groupId, this parameter specifies the ID of the server group. If the targetType parameter is set to global, set this parameter to a hyphen (-).</p>
     * </blockquote>
     * <ul>
     * <li><strong>targetType</strong>: The selection mode for the assets on which the policy takes effect. Valid values:<ul>
     * <li><strong>uuid</strong>: queries by individual server.</li>
     * <li><strong>groupId</strong>: queries by server group.</li>
     * <li><strong>global</strong>: queries all servers.</li>
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
     * <p>The type of logon configuration to query. Valid values:</p>
     * <ul>
     * <li><strong>login_common_location</strong>: common logon location.</li>
     * <li><strong>login_common_ip</strong>: common logon IP address.</li>
     * <li><strong>login_common_time</strong>: common logon time.</li>
     * <li><strong>login_common_account</strong>: common logon account.</li>
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
