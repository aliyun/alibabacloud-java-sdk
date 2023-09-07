// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListPageResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeVulListPageResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVulListPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListPageResponseBody self = new DescribeVulListPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulListPageResponseBody setData(java.util.List<DescribeVulListPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeVulListPageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeVulListPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulListPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVulListPageResponseBodyData extends TeaModel {
        /**
         * <p>The common vulnerabilities and exposures (CVE) ID of the vulnerability.</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The extended field for Server Guard.</p>
         */
        @NameInMap("ExtAegis")
        public String extAegis;

        /**
         * <p>The primary key ID of the database.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the vulnerability was detected based on version comparison. Valid values:</p>
         * <br>
         * <p>*   1: The vulnerability was detected based on version comparison.</p>
         * <p>*   0: The vulnerability was not detected based on version comparison.</p>
         */
        @NameInMap("IsAegis")
        public Integer isAegis;

        /**
         * <p>Indicates whether the vulnerability was detected based on proof of concept (POC) verification. Valid values:</p>
         * <br>
         * <p>*   1: The vulnerability was detected based on POC verification.</p>
         * <p>*   0: The vulnerability was not detected based on POC verification.</p>
         */
        @NameInMap("IsSas")
        public Integer isSas;

        /**
         * <p>The ID of the vulnerability.</p>
         */
        @NameInMap("OtherId")
        public String otherId;

        /**
         * <p>The time when the vulnerability was disclosed.</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribeVulListPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListPageResponseBodyData self = new DescribeVulListPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVulListPageResponseBodyData setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeVulListPageResponseBodyData setExtAegis(String extAegis) {
            this.extAegis = extAegis;
            return this;
        }
        public String getExtAegis() {
            return this.extAegis;
        }

        public DescribeVulListPageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeVulListPageResponseBodyData setIsAegis(Integer isAegis) {
            this.isAegis = isAegis;
            return this;
        }
        public Integer getIsAegis() {
            return this.isAegis;
        }

        public DescribeVulListPageResponseBodyData setIsSas(Integer isSas) {
            this.isSas = isSas;
            return this;
        }
        public Integer getIsSas() {
            return this.isSas;
        }

        public DescribeVulListPageResponseBodyData setOtherId(String otherId) {
            this.otherId = otherId;
            return this;
        }
        public String getOtherId() {
            return this.otherId;
        }

        public DescribeVulListPageResponseBodyData setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeVulListPageResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
