// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiVersionListResponseBody extends TeaModel {
    @NameInMap("PopCode")
    public String popCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("VersionList")
    public java.util.List<DescribePopApiVersionListResponseBodyVersionList> versionList;

    public static DescribePopApiVersionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiVersionListResponseBody self = new DescribePopApiVersionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePopApiVersionListResponseBody setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

    public DescribePopApiVersionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePopApiVersionListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribePopApiVersionListResponseBody setVersionList(java.util.List<DescribePopApiVersionListResponseBodyVersionList> versionList) {
        this.versionList = versionList;
        return this;
    }
    public java.util.List<DescribePopApiVersionListResponseBodyVersionList> getVersionList() {
        return this.versionList;
    }

    public static class DescribePopApiVersionListResponseBodyVersionList extends TeaModel {
        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("PopCode")
        public String popCode;

        @NameInMap("Version")
        public String version;

        public static DescribePopApiVersionListResponseBodyVersionList build(java.util.Map<String, ?> map) throws Exception {
            DescribePopApiVersionListResponseBodyVersionList self = new DescribePopApiVersionListResponseBodyVersionList();
            return TeaModel.build(map, self);
        }

        public DescribePopApiVersionListResponseBodyVersionList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribePopApiVersionListResponseBodyVersionList setPopCode(String popCode) {
            this.popCode = popCode;
            return this;
        }
        public String getPopCode() {
            return this.popCode;
        }

        public DescribePopApiVersionListResponseBodyVersionList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
