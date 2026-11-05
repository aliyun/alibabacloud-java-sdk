// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOperatorPermissionResponseBody extends TeaModel {
    /**
     * <p>The effective period of the authorization. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12T02:27:04Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The time when the authorization expires. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2030-01-01T11:58:17Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The types of permissions that are granted. Valid values:</p>
     * <ul>
     * <li><strong>Control</strong>: configuration permissions. Allows you to view and modify instance configurations.</li>
     * <li><strong>Data</strong>: database permissions. Allows you to view table schemas, indexes, and SQL statements.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Control,Data</p>
     */
    @NameInMap("Privileges")
    public String privileges;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4C3535DC-743E-505A-B4F6-ABC***75C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOperatorPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorPermissionResponseBody self = new DescribeOperatorPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorPermissionResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeOperatorPermissionResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeOperatorPermissionResponseBody setPrivileges(String privileges) {
        this.privileges = privileges;
        return this;
    }
    public String getPrivileges() {
        return this.privileges;
    }

    public DescribeOperatorPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
