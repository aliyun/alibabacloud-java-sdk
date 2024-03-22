// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiVersionListResponseBody extends TeaModel {
    /**
     * <p>The POP code of the Alibaba Cloud service.</p>
     */
    @NameInMap("PopCode")
    public String popCode;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>The information about the versions of API operations.</p>
     */
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
        /**
         * <p>The name of the API operation.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The POP code of the Alibaba Cloud service.</p>
         */
        @NameInMap("PopCode")
        public String popCode;

        /**
         * <p>The version number of the API for the Alibaba Cloud service.</p>
         */
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
