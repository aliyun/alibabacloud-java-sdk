// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VersionInfo")
    public java.util.List<DescribeVersionsResponseBodyVersionInfo> versionInfo;

    public static DescribeVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionsResponseBody self = new DescribeVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVersionsResponseBody setVersionInfo(java.util.List<DescribeVersionsResponseBodyVersionInfo> versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }
    public java.util.List<DescribeVersionsResponseBodyVersionInfo> getVersionInfo() {
        return this.versionInfo;
    }

    public static class DescribeVersionsResponseBodyVersionInfo extends TeaModel {
        @NameInMap("Edition")
        public String edition;

        @NameInMap("Versions")
        public java.util.List<String> versions;

        public static DescribeVersionsResponseBodyVersionInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionsResponseBodyVersionInfo self = new DescribeVersionsResponseBodyVersionInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVersionsResponseBodyVersionInfo setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public DescribeVersionsResponseBodyVersionInfo setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

}
