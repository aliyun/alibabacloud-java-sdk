// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>/data</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    @NameInMap("PolicyItems")
    public java.util.List<DescribePolarFsQuotaResponseBodyPolicyItems> policyItems;

    @NameInMap("QuotaItems")
    public java.util.List<DescribePolarFsQuotaResponseBodyQuotaItems> quotaItems;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribePolarFsQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsQuotaResponseBody self = new DescribePolarFsQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsQuotaResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarFsQuotaResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribePolarFsQuotaResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribePolarFsQuotaResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribePolarFsQuotaResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribePolarFsQuotaResponseBody setPolicyItems(java.util.List<DescribePolarFsQuotaResponseBodyPolicyItems> policyItems) {
        this.policyItems = policyItems;
        return this;
    }
    public java.util.List<DescribePolarFsQuotaResponseBodyPolicyItems> getPolicyItems() {
        return this.policyItems;
    }

    public DescribePolarFsQuotaResponseBody setQuotaItems(java.util.List<DescribePolarFsQuotaResponseBodyQuotaItems> quotaItems) {
        this.quotaItems = quotaItems;
        return this;
    }
    public java.util.List<DescribePolarFsQuotaResponseBodyQuotaItems> getQuotaItems() {
        return this.quotaItems;
    }

    public DescribePolarFsQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarFsQuotaResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribePolarFsQuotaResponseBodyPolicyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("AccessTTL")
        public Long accessTTL;

        /**
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("ChangeTTL")
        public Long changeTTL;

        /**
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <strong>example:</strong>
         * <p>77</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>/a*</p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        public static DescribePolarFsQuotaResponseBodyPolicyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsQuotaResponseBodyPolicyItems self = new DescribePolarFsQuotaResponseBodyPolicyItems();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setAccessTTL(Long accessTTL) {
            this.accessTTL = accessTTL;
            return this;
        }
        public Long getAccessTTL() {
            return this.accessTTL;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setChangeTTL(Long changeTTL) {
            this.changeTTL = changeTTL;
            return this;
        }
        public Long getChangeTTL() {
            return this.changeTTL;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribePolarFsQuotaResponseBodyPolicyItems setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class DescribePolarFsQuotaResponseBodyQuotaItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Inodes")
        public Long inodes;

        /**
         * <strong>example:</strong>
         * <p>/data</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>104857600</p>
         */
        @NameInMap("UsedCapacity")
        public Long usedCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsedInodes")
        public Long usedInodes;

        public static DescribePolarFsQuotaResponseBodyQuotaItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsQuotaResponseBodyQuotaItems self = new DescribePolarFsQuotaResponseBodyQuotaItems();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsQuotaResponseBodyQuotaItems setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribePolarFsQuotaResponseBodyQuotaItems setInodes(Long inodes) {
            this.inodes = inodes;
            return this;
        }
        public Long getInodes() {
            return this.inodes;
        }

        public DescribePolarFsQuotaResponseBodyQuotaItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePolarFsQuotaResponseBodyQuotaItems setUsedCapacity(Long usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public DescribePolarFsQuotaResponseBodyQuotaItems setUsedInodes(Long usedInodes) {
            this.usedInodes = usedInodes;
            return this;
        }
        public Long getUsedInodes() {
            return this.usedInodes;
        }

    }

}
