// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeGroupProductionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeGroupProductionsResponseBodyData> data;

    @NameInMap("Page")
    public DescribeGroupProductionsResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>358E012F-B516-599D-9ED0-A1A361CDE615</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupProductionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupProductionsResponseBody self = new DescribeGroupProductionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupProductionsResponseBody setData(java.util.List<DescribeGroupProductionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeGroupProductionsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeGroupProductionsResponseBody setPage(DescribeGroupProductionsResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeGroupProductionsResponseBodyPage getPage() {
        return this.page;
    }

    public DescribeGroupProductionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGroupProductionsResponseBodyDataProductionsPolicyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AliyunRAMReadOnlyAccess</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("Type")
        public String type;

        public static DescribeGroupProductionsResponseBodyDataProductionsPolicyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupProductionsResponseBodyDataProductionsPolicyList self = new DescribeGroupProductionsResponseBodyDataProductionsPolicyList();
            return TeaModel.build(map, self);
        }

        public DescribeGroupProductionsResponseBodyDataProductionsPolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeGroupProductionsResponseBodyDataProductionsPolicyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeGroupProductionsResponseBodyDataProductions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Rds</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>rds.aliyuncs.com</p>
         */
        @NameInMap("DefaultDomain")
        public String defaultDomain;

        /**
         * <strong>example:</strong>
         * <p>2014-08-15</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("FullDomains")
        public java.util.List<String> fullDomains;

        @NameInMap("Group")
        public String group;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyList")
        public java.util.List<DescribeGroupProductionsResponseBodyDataProductionsPolicyList> policyList;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("RamCode")
        public String ramCode;

        /**
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ShortName")
        public String shortName;

        /**
         * <strong>example:</strong>
         * <p>next</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("Versions")
        public java.util.List<String> versions;

        public static DescribeGroupProductionsResponseBodyDataProductions build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupProductionsResponseBodyDataProductions self = new DescribeGroupProductionsResponseBodyDataProductions();
            return TeaModel.build(map, self);
        }

        public DescribeGroupProductionsResponseBodyDataProductions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setDefaultDomain(String defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }
        public String getDefaultDomain() {
            return this.defaultDomain;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setFullDomains(java.util.List<String> fullDomains) {
            this.fullDomains = fullDomains;
            return this;
        }
        public java.util.List<String> getFullDomains() {
            return this.fullDomains;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setPolicyList(java.util.List<DescribeGroupProductionsResponseBodyDataProductionsPolicyList> policyList) {
            this.policyList = policyList;
            return this;
        }
        public java.util.List<DescribeGroupProductionsResponseBodyDataProductionsPolicyList> getPolicyList() {
            return this.policyList;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setRamCode(String ramCode) {
            this.ramCode = ramCode;
            return this;
        }
        public String getRamCode() {
            return this.ramCode;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeGroupProductionsResponseBodyDataProductions setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

    public static class DescribeGroupProductionsResponseBodyData extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Productions")
        public java.util.List<DescribeGroupProductionsResponseBodyDataProductions> productions;

        public static DescribeGroupProductionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupProductionsResponseBodyData self = new DescribeGroupProductionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeGroupProductionsResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGroupProductionsResponseBodyData setProductions(java.util.List<DescribeGroupProductionsResponseBodyDataProductions> productions) {
            this.productions = productions;
            return this;
        }
        public java.util.List<DescribeGroupProductionsResponseBodyDataProductions> getProductions() {
            return this.productions;
        }

    }

    public static class DescribeGroupProductionsResponseBodyPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeGroupProductionsResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupProductionsResponseBodyPage self = new DescribeGroupProductionsResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeGroupProductionsResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeGroupProductionsResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeGroupProductionsResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
