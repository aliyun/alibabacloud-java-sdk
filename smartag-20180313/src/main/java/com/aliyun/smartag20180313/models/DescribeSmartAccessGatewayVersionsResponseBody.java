// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartAGVersions")
    public DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersions smartAGVersions;

    public static DescribeSmartAccessGatewayVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayVersionsResponseBody self = new DescribeSmartAccessGatewayVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartAccessGatewayVersionsResponseBody setSmartAGVersions(DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersions smartAGVersions) {
        this.smartAGVersions = smartAGVersions;
        return this;
    }
    public DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersions getSmartAGVersions() {
        return this.smartAGVersions;
    }

    public static class DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("VersionName")
        public String versionName;

        @NameInMap("VersionCode")
        public String versionCode;

        public static DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion self = new DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersions extends TeaModel {
        @NameInMap("SmartAGVersion")
        public java.util.List<DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion> smartAGVersion;

        public static DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersions self = new DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersions();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersions setSmartAGVersion(java.util.List<DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion> smartAGVersion) {
            this.smartAGVersion = smartAGVersion;
            return this;
        }
        public java.util.List<DescribeSmartAccessGatewayVersionsResponseBodySmartAGVersionsSmartAGVersion> getSmartAGVersion() {
            return this.smartAGVersion;
        }

    }

}
