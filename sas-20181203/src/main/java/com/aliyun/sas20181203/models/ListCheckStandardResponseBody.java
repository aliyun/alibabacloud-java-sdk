// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckStandardResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>FA91FBDA-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The standards.</p>
     */
    @NameInMap("Standards")
    public java.util.List<ListCheckStandardResponseBodyStandards> standards;

    public static ListCheckStandardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckStandardResponseBody self = new ListCheckStandardResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckStandardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCheckStandardResponseBody setStandards(java.util.List<ListCheckStandardResponseBodyStandards> standards) {
        this.standards = standards;
        return this;
    }
    public java.util.List<ListCheckStandardResponseBodyStandards> getStandards() {
        return this.standards;
    }

    public static class ListCheckStandardResponseBodyStandardsRequirements extends TeaModel {
        /**
         * <p>The ID of the requirement.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of check items in the requirement.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RiskCheckCount")
        public Long riskCheckCount;

        /**
         * <p>The display name of the search condition.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM identity authentication</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The priority for display.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShowPriorityLevel")
        public Integer showPriorityLevel;

        public static ListCheckStandardResponseBodyStandardsRequirements build(java.util.Map<String, ?> map) throws Exception {
            ListCheckStandardResponseBodyStandardsRequirements self = new ListCheckStandardResponseBodyStandardsRequirements();
            return TeaModel.build(map, self);
        }

        public ListCheckStandardResponseBodyStandardsRequirements setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCheckStandardResponseBodyStandardsRequirements setRiskCheckCount(Long riskCheckCount) {
            this.riskCheckCount = riskCheckCount;
            return this;
        }
        public Long getRiskCheckCount() {
            return this.riskCheckCount;
        }

        public ListCheckStandardResponseBodyStandardsRequirements setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListCheckStandardResponseBodyStandardsRequirements setShowPriorityLevel(Integer showPriorityLevel) {
            this.showPriorityLevel = showPriorityLevel;
            return this;
        }
        public Integer getShowPriorityLevel() {
            return this.showPriorityLevel;
        }

    }

    public static class ListCheckStandardResponseBodyStandards extends TeaModel {
        /**
         * <p>The cloud service provider that uses the standard. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud.</li>
         * <li><strong>3</strong>: Tencent Cloud.</li>
         * <li><strong>4</strong>: Huawei Cloud.</li>
         * <li><strong>5</strong>: Microsoft Azure.</li>
         * <li><strong>7</strong>: AWS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BindVendor")
        public Integer bindVendor;

        /**
         * <p>The ID of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The requirements.</p>
         */
        @NameInMap("Requirements")
        public java.util.List<ListCheckStandardResponseBodyStandardsRequirements> requirements;

        /**
         * <p>The display name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Identity and permission management</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The priority for display.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShowPriorityLevel")
        public Integer showPriorityLevel;

        /**
         * <p>The type of the standard.</p>
         * 
         * <strong>example:</strong>
         * <p>IDENTITY_PERMISSION</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCheckStandardResponseBodyStandards build(java.util.Map<String, ?> map) throws Exception {
            ListCheckStandardResponseBodyStandards self = new ListCheckStandardResponseBodyStandards();
            return TeaModel.build(map, self);
        }

        public ListCheckStandardResponseBodyStandards setBindVendor(Integer bindVendor) {
            this.bindVendor = bindVendor;
            return this;
        }
        public Integer getBindVendor() {
            return this.bindVendor;
        }

        public ListCheckStandardResponseBodyStandards setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCheckStandardResponseBodyStandards setRequirements(java.util.List<ListCheckStandardResponseBodyStandardsRequirements> requirements) {
            this.requirements = requirements;
            return this;
        }
        public java.util.List<ListCheckStandardResponseBodyStandardsRequirements> getRequirements() {
            return this.requirements;
        }

        public ListCheckStandardResponseBodyStandards setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListCheckStandardResponseBodyStandards setShowPriorityLevel(Integer showPriorityLevel) {
            this.showPriorityLevel = showPriorityLevel;
            return this;
        }
        public Integer getShowPriorityLevel() {
            return this.showPriorityLevel;
        }

        public ListCheckStandardResponseBodyStandards setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
