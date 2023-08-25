// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListDataSourceResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public java.util.List<ListDataSourceResponseBodyData> data;

    @NameInMap("ErrorDetail")
    public ListDataSourceResponseBodyErrorDetail errorDetail;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceResponseBody self = new ListDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public ListDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataSourceResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public ListDataSourceResponseBody setData(java.util.List<ListDataSourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataSourceResponseBodyData> getData() {
        return this.data;
    }

    public ListDataSourceResponseBody setErrorDetail(ListDataSourceResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ListDataSourceResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public ListDataSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataSourceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSourceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataSourceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataSourceResponseBodyData extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("ConnExtraAttributes")
        public Object connExtraAttributes;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperatingSystem")
        public String operatingSystem;

        @NameInMap("OracleNlsLengthSemantics")
        public String oracleNlsLengthSemantics;

        @NameInMap("OracleSid")
        public String oracleSid;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PartnerId")
        public String partnerId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceOwner")
        public String resourceOwner;

        @NameInMap("Role")
        public String role;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Version")
        public String version;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceResponseBodyData self = new ListDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataSourceResponseBodyData setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ListDataSourceResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListDataSourceResponseBodyData setConnExtraAttributes(Object connExtraAttributes) {
            this.connExtraAttributes = connExtraAttributes;
            return this;
        }
        public Object getConnExtraAttributes() {
            return this.connExtraAttributes;
        }

        public ListDataSourceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataSourceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataSourceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataSourceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataSourceResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListDataSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourceResponseBodyData setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        public ListDataSourceResponseBodyData setOracleNlsLengthSemantics(String oracleNlsLengthSemantics) {
            this.oracleNlsLengthSemantics = oracleNlsLengthSemantics;
            return this;
        }
        public String getOracleNlsLengthSemantics() {
            return this.oracleNlsLengthSemantics;
        }

        public ListDataSourceResponseBodyData setOracleSid(String oracleSid) {
            this.oracleSid = oracleSid;
            return this;
        }
        public String getOracleSid() {
            return this.oracleSid;
        }

        public ListDataSourceResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDataSourceResponseBodyData setPartnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public String getPartnerId() {
            return this.partnerId;
        }

        public ListDataSourceResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListDataSourceResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListDataSourceResponseBodyData setResourceOwner(String resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public String getResourceOwner() {
            return this.resourceOwner;
        }

        public ListDataSourceResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListDataSourceResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ListDataSourceResponseBodyData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public ListDataSourceResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListDataSourceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDataSourceResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListDataSourceResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListDataSourceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListDataSourceResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static ListDataSourceResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceResponseBodyErrorDetail self = new ListDataSourceResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public ListDataSourceResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListDataSourceResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public ListDataSourceResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListDataSourceResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListDataSourceResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public ListDataSourceResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public ListDataSourceResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public ListDataSourceResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public ListDataSourceResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public ListDataSourceResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListDataSourceResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public ListDataSourceResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public ListDataSourceResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
