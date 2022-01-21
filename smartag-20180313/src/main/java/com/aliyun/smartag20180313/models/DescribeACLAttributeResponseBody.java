// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeACLAttributeResponseBody extends TeaModel {
    @NameInMap("Acrs")
    public DescribeACLAttributeResponseBodyAcrs acrs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeACLAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeACLAttributeResponseBody self = new DescribeACLAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeACLAttributeResponseBody setAcrs(DescribeACLAttributeResponseBodyAcrs acrs) {
        this.acrs = acrs;
        return this;
    }
    public DescribeACLAttributeResponseBodyAcrs getAcrs() {
        return this.acrs;
    }

    public DescribeACLAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeACLAttributeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeACLAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeACLAttributeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeACLAttributeResponseBodyAcrsAcrDpiGroupIds extends TeaModel {
        @NameInMap("DpiGroupId")
        public java.util.List<String> dpiGroupId;

        public static DescribeACLAttributeResponseBodyAcrsAcrDpiGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeACLAttributeResponseBodyAcrsAcrDpiGroupIds self = new DescribeACLAttributeResponseBodyAcrsAcrDpiGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeACLAttributeResponseBodyAcrsAcrDpiGroupIds setDpiGroupId(java.util.List<String> dpiGroupId) {
            this.dpiGroupId = dpiGroupId;
            return this;
        }
        public java.util.List<String> getDpiGroupId() {
            return this.dpiGroupId;
        }

    }

    public static class DescribeACLAttributeResponseBodyAcrsAcrDpiSignatureIds extends TeaModel {
        @NameInMap("DpiSignatureId")
        public java.util.List<String> dpiSignatureId;

        public static DescribeACLAttributeResponseBodyAcrsAcrDpiSignatureIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeACLAttributeResponseBodyAcrsAcrDpiSignatureIds self = new DescribeACLAttributeResponseBodyAcrsAcrDpiSignatureIds();
            return TeaModel.build(map, self);
        }

        public DescribeACLAttributeResponseBodyAcrsAcrDpiSignatureIds setDpiSignatureId(java.util.List<String> dpiSignatureId) {
            this.dpiSignatureId = dpiSignatureId;
            return this;
        }
        public java.util.List<String> getDpiSignatureId() {
            return this.dpiSignatureId;
        }

    }

    public static class DescribeACLAttributeResponseBodyAcrsAcr extends TeaModel {
        @NameInMap("AclId")
        public String aclId;

        @NameInMap("AcrId")
        public String acrId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidr")
        public String destCidr;

        @NameInMap("DestPortRange")
        public String destPortRange;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("DpiGroupIds")
        public DescribeACLAttributeResponseBodyAcrsAcrDpiGroupIds dpiGroupIds;

        @NameInMap("DpiSignatureIds")
        public DescribeACLAttributeResponseBodyAcrsAcrDpiSignatureIds dpiSignatureIds;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Name")
        public String name;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("SourceCidr")
        public String sourceCidr;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        @NameInMap("Type")
        public String type;

        public static DescribeACLAttributeResponseBodyAcrsAcr build(java.util.Map<String, ?> map) throws Exception {
            DescribeACLAttributeResponseBodyAcrsAcr self = new DescribeACLAttributeResponseBodyAcrsAcr();
            return TeaModel.build(map, self);
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setAcrId(String acrId) {
            this.acrId = acrId;
            return this;
        }
        public String getAcrId() {
            return this.acrId;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setDestCidr(String destCidr) {
            this.destCidr = destCidr;
            return this;
        }
        public String getDestCidr() {
            return this.destCidr;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setDestPortRange(String destPortRange) {
            this.destPortRange = destPortRange;
            return this;
        }
        public String getDestPortRange() {
            return this.destPortRange;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setDpiGroupIds(DescribeACLAttributeResponseBodyAcrsAcrDpiGroupIds dpiGroupIds) {
            this.dpiGroupIds = dpiGroupIds;
            return this;
        }
        public DescribeACLAttributeResponseBodyAcrsAcrDpiGroupIds getDpiGroupIds() {
            return this.dpiGroupIds;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setDpiSignatureIds(DescribeACLAttributeResponseBodyAcrsAcrDpiSignatureIds dpiSignatureIds) {
            this.dpiSignatureIds = dpiSignatureIds;
            return this;
        }
        public DescribeACLAttributeResponseBodyAcrsAcrDpiSignatureIds getDpiSignatureIds() {
            return this.dpiSignatureIds;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public DescribeACLAttributeResponseBodyAcrsAcr setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeACLAttributeResponseBodyAcrs extends TeaModel {
        @NameInMap("Acr")
        public java.util.List<DescribeACLAttributeResponseBodyAcrsAcr> acr;

        public static DescribeACLAttributeResponseBodyAcrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeACLAttributeResponseBodyAcrs self = new DescribeACLAttributeResponseBodyAcrs();
            return TeaModel.build(map, self);
        }

        public DescribeACLAttributeResponseBodyAcrs setAcr(java.util.List<DescribeACLAttributeResponseBodyAcrsAcr> acr) {
            this.acr = acr;
            return this;
        }
        public java.util.List<DescribeACLAttributeResponseBodyAcrsAcr> getAcr() {
            return this.acr;
        }

    }

}
