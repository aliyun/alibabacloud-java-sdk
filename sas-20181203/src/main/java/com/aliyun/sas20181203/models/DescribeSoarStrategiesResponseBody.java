// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategiesResponseBody extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4BB99533-4FDC-5B9C-A5E4-5AE3E9BE5C78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The policies.</p>
     */
    @NameInMap("SoarStrategies")
    public java.util.List<DescribeSoarStrategiesResponseBodySoarStrategies> soarStrategies;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSoarStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategiesResponseBody self = new DescribeSoarStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSoarStrategiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSoarStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSoarStrategiesResponseBody setSoarStrategies(java.util.List<DescribeSoarStrategiesResponseBodySoarStrategies> soarStrategies) {
        this.soarStrategies = soarStrategies;
        return this;
    }
    public java.util.List<DescribeSoarStrategiesResponseBodySoarStrategies> getSoarStrategies() {
        return this.soarStrategies;
    }

    public DescribeSoarStrategiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSoarStrategiesResponseBodySoarStrategies extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the creator. Default value: 0. The value indicates a system user.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>strategy_description_01</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp when the policy was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1703556715000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The timestamp when the policy was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698114242000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>16064025</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>strategy_name01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The execution mode. Valid values:</p>
         * <ul>
         * <li>runmode_TRIGGER_BY_USER: manually executed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>runmode_TRIGGER_BY_USER</p>
         */
        @NameInMap("RunMode")
        public String runMode;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li>type_vulfix: vulnerability operations</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>type_vulfix</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeSoarStrategiesResponseBodySoarStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarStrategiesResponseBodySoarStrategies self = new DescribeSoarStrategiesResponseBodySoarStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeSoarStrategiesResponseBodySoarStrategies setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeSoarStrategiesResponseBodySoarStrategies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSoarStrategiesResponseBodySoarStrategies setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSoarStrategiesResponseBodySoarStrategies setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSoarStrategiesResponseBodySoarStrategies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSoarStrategiesResponseBodySoarStrategies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSoarStrategiesResponseBodySoarStrategies setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public DescribeSoarStrategiesResponseBodySoarStrategies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
