// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRiskLevelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskLevelList")
    public java.util.List<DescribeRiskLevelsResponseBodyRiskLevelList> riskLevelList;

    public static DescribeRiskLevelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskLevelsResponseBody self = new DescribeRiskLevelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskLevelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskLevelsResponseBody setRiskLevelList(java.util.List<DescribeRiskLevelsResponseBodyRiskLevelList> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<DescribeRiskLevelsResponseBodyRiskLevelList> getRiskLevelList() {
        return this.riskLevelList;
    }

    public static class DescribeRiskLevelsResponseBodyRiskLevelList extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReferenceNum")
        public Integer referenceNum;

        public static DescribeRiskLevelsResponseBodyRiskLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskLevelsResponseBodyRiskLevelList self = new DescribeRiskLevelsResponseBodyRiskLevelList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskLevelsResponseBodyRiskLevelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRiskLevelsResponseBodyRiskLevelList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRiskLevelsResponseBodyRiskLevelList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRiskLevelsResponseBodyRiskLevelList setReferenceNum(Integer referenceNum) {
            this.referenceNum = referenceNum;
            return this;
        }
        public Integer getReferenceNum() {
            return this.referenceNum;
        }

    }

}
