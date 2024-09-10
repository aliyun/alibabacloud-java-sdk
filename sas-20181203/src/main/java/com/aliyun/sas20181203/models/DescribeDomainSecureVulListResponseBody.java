// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureVulListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VulList")
    public java.util.List<DescribeDomainSecureVulListResponseBodyVulList> vulList;

    public static DescribeDomainSecureVulListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureVulListResponseBody self = new DescribeDomainSecureVulListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSecureVulListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDomainSecureVulListResponseBody setVulList(java.util.List<DescribeDomainSecureVulListResponseBodyVulList> vulList) {
        this.vulList = vulList;
        return this;
    }
    public java.util.List<DescribeDomainSecureVulListResponseBodyVulList> getVulList() {
        return this.vulList;
    }

    public static class DescribeDomainSecureVulListResponseBodyVulList extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("AsapCount")
        public Integer asapCount;

        /**
         * <strong>example:</strong>
         * <p>1639371446000</p>
         */
        @NameInMap("GmtLast")
        public Long gmtLast;

        /**
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("HandledCount")
        public Integer handledCount;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LaterCount")
        public Integer laterCount;

        /**
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:20170574</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NntfCount")
        public Integer nntfCount;

        /**
         * <strong>example:</strong>
         * <p>Code Execution</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDomainSecureVulListResponseBodyVulList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSecureVulListResponseBodyVulList self = new DescribeDomainSecureVulListResponseBodyVulList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSecureVulListResponseBodyVulList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeDomainSecureVulListResponseBodyVulList setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public DescribeDomainSecureVulListResponseBodyVulList setGmtLast(Long gmtLast) {
            this.gmtLast = gmtLast;
            return this;
        }
        public Long getGmtLast() {
            return this.gmtLast;
        }

        public DescribeDomainSecureVulListResponseBodyVulList setHandledCount(Integer handledCount) {
            this.handledCount = handledCount;
            return this;
        }
        public Integer getHandledCount() {
            return this.handledCount;
        }

        public DescribeDomainSecureVulListResponseBodyVulList setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeDomainSecureVulListResponseBodyVulList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDomainSecureVulListResponseBodyVulList setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeDomainSecureVulListResponseBodyVulList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeDomainSecureVulListResponseBodyVulList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
