// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPoliciesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeBackupPoliciesResponseBodyPageInfo pageInfo;

    @NameInMap("Policies")
    public java.util.List<DescribeBackupPoliciesResponseBodyPolicies> policies;

    public static DescribeBackupPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPoliciesResponseBody self = new DescribeBackupPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPoliciesResponseBody setPageInfo(DescribeBackupPoliciesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeBackupPoliciesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeBackupPoliciesResponseBody setPolicies(java.util.List<DescribeBackupPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribeBackupPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public static class DescribeBackupPoliciesResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribeBackupPoliciesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPoliciesResponseBodyPageInfo self = new DescribeBackupPoliciesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPoliciesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeBackupPoliciesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBackupPoliciesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeBackupPoliciesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeBackupPoliciesResponseBodyPolicies extends TeaModel {
        @NameInMap("ClientErrorCount")
        public Integer clientErrorCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("PolicyVersion")
        public String policyVersion;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("ServiceErrorCount")
        public Integer serviceErrorCount;

        @NameInMap("PolicyRegionId")
        public String policyRegionId;

        @NameInMap("ClientStatus")
        public String clientStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("HealthClientCount")
        public Integer healthClientCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ClientErrorUuidList")
        public java.util.List<String> clientErrorUuidList;

        @NameInMap("RemarkedUuidList")
        public java.util.List<String> remarkedUuidList;

        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        @NameInMap("ServiceErrorUuidList")
        public java.util.List<String> serviceErrorUuidList;

        @NameInMap("HealthClientUuidList")
        public java.util.List<String> healthClientUuidList;

        public static DescribeBackupPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPoliciesResponseBodyPolicies self = new DescribeBackupPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPoliciesResponseBodyPolicies setClientErrorCount(Integer clientErrorCount) {
            this.clientErrorCount = clientErrorCount;
            return this;
        }
        public Integer getClientErrorCount() {
            return this.clientErrorCount;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setPolicyVersion(String policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setServiceErrorCount(Integer serviceErrorCount) {
            this.serviceErrorCount = serviceErrorCount;
            return this;
        }
        public Integer getServiceErrorCount() {
            return this.serviceErrorCount;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setPolicyRegionId(String policyRegionId) {
            this.policyRegionId = policyRegionId;
            return this;
        }
        public String getPolicyRegionId() {
            return this.policyRegionId;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setHealthClientCount(Integer healthClientCount) {
            this.healthClientCount = healthClientCount;
            return this;
        }
        public Integer getHealthClientCount() {
            return this.healthClientCount;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setClientErrorUuidList(java.util.List<String> clientErrorUuidList) {
            this.clientErrorUuidList = clientErrorUuidList;
            return this;
        }
        public java.util.List<String> getClientErrorUuidList() {
            return this.clientErrorUuidList;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setRemarkedUuidList(java.util.List<String> remarkedUuidList) {
            this.remarkedUuidList = remarkedUuidList;
            return this;
        }
        public java.util.List<String> getRemarkedUuidList() {
            return this.remarkedUuidList;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setServiceErrorUuidList(java.util.List<String> serviceErrorUuidList) {
            this.serviceErrorUuidList = serviceErrorUuidList;
            return this;
        }
        public java.util.List<String> getServiceErrorUuidList() {
            return this.serviceErrorUuidList;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setHealthClientUuidList(java.util.List<String> healthClientUuidList) {
            this.healthClientUuidList = healthClientUuidList;
            return this;
        }
        public java.util.List<String> getHealthClientUuidList() {
            return this.healthClientUuidList;
        }

    }

}
