// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarSubscribedStrategyResponseBody extends TeaModel {
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
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The policies.</p>
     */
    @NameInMap("SoarStrategies")
    public java.util.List<DescribeSoarSubscribedStrategyResponseBodySoarStrategies> soarStrategies;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSoarSubscribedStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarSubscribedStrategyResponseBody self = new DescribeSoarSubscribedStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarSubscribedStrategyResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSoarSubscribedStrategyResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSoarSubscribedStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSoarSubscribedStrategyResponseBody setSoarStrategies(java.util.List<DescribeSoarSubscribedStrategyResponseBodySoarStrategies> soarStrategies) {
        this.soarStrategies = soarStrategies;
        return this;
    }
    public java.util.List<DescribeSoarSubscribedStrategyResponseBodySoarStrategies> getSoarStrategies() {
        return this.soarStrategies;
    }

    public DescribeSoarSubscribedStrategyResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSoarSubscribedStrategyResponseBodySoarStrategies extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1276085*****4392</p>
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
         * <p>The total number of times that the policy is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ExecuteNum")
        public String executeNum;

        /**
         * <p>The timestamp when the policy was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1716344106000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The timestamp when the policy was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652672104000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>300063</p>
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

        public static DescribeSoarSubscribedStrategyResponseBodySoarStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarSubscribedStrategyResponseBodySoarStrategies self = new DescribeSoarSubscribedStrategyResponseBodySoarStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeSoarSubscribedStrategyResponseBodySoarStrategies setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeSoarSubscribedStrategyResponseBodySoarStrategies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSoarSubscribedStrategyResponseBodySoarStrategies setExecuteNum(String executeNum) {
            this.executeNum = executeNum;
            return this;
        }
        public String getExecuteNum() {
            return this.executeNum;
        }

        public DescribeSoarSubscribedStrategyResponseBodySoarStrategies setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSoarSubscribedStrategyResponseBodySoarStrategies setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSoarSubscribedStrategyResponseBodySoarStrategies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSoarSubscribedStrategyResponseBodySoarStrategies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSoarSubscribedStrategyResponseBodySoarStrategies setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public DescribeSoarSubscribedStrategyResponseBodySoarStrategies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
