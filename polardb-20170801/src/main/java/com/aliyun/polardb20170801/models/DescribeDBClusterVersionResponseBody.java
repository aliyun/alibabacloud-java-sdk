// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterVersionResponseBody extends TeaModel {
    @NameInMap("IsLatestVersion")
    public String isLatestVersion;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("DBRevisionVersion")
    public String DBRevisionVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DBMinorVersion")
    public String DBMinorVersion;

    public static DescribeDBClusterVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterVersionResponseBody self = new DescribeDBClusterVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterVersionResponseBody setIsLatestVersion(String isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public String getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeDBClusterVersionResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterVersionResponseBody setDBRevisionVersion(String DBRevisionVersion) {
        this.DBRevisionVersion = DBRevisionVersion;
        return this;
    }
    public String getDBRevisionVersion() {
        return this.DBRevisionVersion;
    }

    public DescribeDBClusterVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterVersionResponseBody setDBVersionStatus(String DBVersionStatus) {
        this.DBVersionStatus = DBVersionStatus;
        return this;
    }
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    public DescribeDBClusterVersionResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterVersionResponseBody setDBMinorVersion(String DBMinorVersion) {
        this.DBMinorVersion = DBMinorVersion;
        return this;
    }
    public String getDBMinorVersion() {
        return this.DBMinorVersion;
    }

}
