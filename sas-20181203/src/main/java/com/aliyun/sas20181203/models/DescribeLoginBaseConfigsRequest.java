// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginBaseConfigsRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries to return on each page. Default value: **5**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The server to which the configuration is applied. The value of this parameter is in the JSON format and contains the following fields:
    // 
    // *   **Target**: the UUID or group ID of the server to add or delete.
    // 
    // >  If targetType is set to uuid, the value of Target is the UUID of the server. If targetType is set to groupId, the value of Target is the group ID of the server. If targetType is set to global, the value of Target is a hyphen (-).
    // 
    // *   **targetType**: the type of the server to which the configuration is applied. Valid values:
    // 
    //     *   **uuid**: a server
    //     *   **groupId**: a server group
    //     *   **global**: all servers
    @NameInMap("Target")
    public String target;

    // The logon type of the configuration to query. Valid values:
    // 
    // *   **login\_common_location**: common logon location
    // *   **login\_common_ip**: common logon IP address
    // *   **login\_common_time**: common logon time range
    // *   **login\_common_account**: common logon account
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
