// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamsResponseBody extends TeaModel {
    @NameInMap("Ipams")
    public java.util.List<ListIpamsResponseBodyIpams> ipams;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>23CA0A0B-B0F5-5495-B355-7D9A9203A46B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamsResponseBody self = new ListIpamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamsResponseBody setIpams(java.util.List<ListIpamsResponseBodyIpams> ipams) {
        this.ipams = ipams;
        return this;
    }
    public java.util.List<ListIpamsResponseBodyIpams> getIpams() {
        return this.ipams;
    }

    public ListIpamsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamsResponseBodyIpamsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIpamsResponseBodyIpamsTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamsResponseBodyIpamsTags self = new ListIpamsResponseBodyIpamsTags();
            return TeaModel.build(map, self);
        }

        public ListIpamsResponseBodyIpamsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamsResponseBodyIpamsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIpamsResponseBodyIpams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-07-01T02:05:23Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("IpamDescription")
        public String ipamDescription;

        /**
         * <strong>example:</strong>
         * <p>ipam-ccxbnsbhew0d6t****</p>
         */
        @NameInMap("IpamId")
        public String ipamId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IpamName")
        public String ipamName;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("IpamStatus")
        public String ipamStatus;

        @NameInMap("OperatingRegionList")
        public java.util.List<String> operatingRegionList;

        /**
         * <strong>example:</strong>
         * <p>1210123456******</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <strong>example:</strong>
         * <p>ipam-scope-okoerbco6unqfr****</p>
         */
        @NameInMap("PrivateDefaultScopeId")
        public String privateDefaultScopeId;

        /**
         * <strong>example:</strong>
         * <p>ipam-scope-ovb76p1g1m19dr****</p>
         */
        @NameInMap("PublicDefaultScopeId")
        public String publicDefaultScopeId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-aek2dbprgpt****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScopeCount")
        public Integer scopeCount;

        @NameInMap("Tags")
        public java.util.List<ListIpamsResponseBodyIpamsTags> tags;

        public static ListIpamsResponseBodyIpams build(java.util.Map<String, ?> map) throws Exception {
            ListIpamsResponseBodyIpams self = new ListIpamsResponseBodyIpams();
            return TeaModel.build(map, self);
        }

        public ListIpamsResponseBodyIpams setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIpamsResponseBodyIpams setIpamDescription(String ipamDescription) {
            this.ipamDescription = ipamDescription;
            return this;
        }
        public String getIpamDescription() {
            return this.ipamDescription;
        }

        public ListIpamsResponseBodyIpams setIpamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }
        public String getIpamId() {
            return this.ipamId;
        }

        public ListIpamsResponseBodyIpams setIpamName(String ipamName) {
            this.ipamName = ipamName;
            return this;
        }
        public String getIpamName() {
            return this.ipamName;
        }

        public ListIpamsResponseBodyIpams setIpamStatus(String ipamStatus) {
            this.ipamStatus = ipamStatus;
            return this;
        }
        public String getIpamStatus() {
            return this.ipamStatus;
        }

        public ListIpamsResponseBodyIpams setOperatingRegionList(java.util.List<String> operatingRegionList) {
            this.operatingRegionList = operatingRegionList;
            return this;
        }
        public java.util.List<String> getOperatingRegionList() {
            return this.operatingRegionList;
        }

        public ListIpamsResponseBodyIpams setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListIpamsResponseBodyIpams setPrivateDefaultScopeId(String privateDefaultScopeId) {
            this.privateDefaultScopeId = privateDefaultScopeId;
            return this;
        }
        public String getPrivateDefaultScopeId() {
            return this.privateDefaultScopeId;
        }

        public ListIpamsResponseBodyIpams setPublicDefaultScopeId(String publicDefaultScopeId) {
            this.publicDefaultScopeId = publicDefaultScopeId;
            return this;
        }
        public String getPublicDefaultScopeId() {
            return this.publicDefaultScopeId;
        }

        public ListIpamsResponseBodyIpams setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIpamsResponseBodyIpams setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIpamsResponseBodyIpams setScopeCount(Integer scopeCount) {
            this.scopeCount = scopeCount;
            return this;
        }
        public Integer getScopeCount() {
            return this.scopeCount;
        }

        public ListIpamsResponseBodyIpams setTags(java.util.List<ListIpamsResponseBodyIpamsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIpamsResponseBodyIpamsTags> getTags() {
            return this.tags;
        }

    }

}
